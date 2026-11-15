using System;
using System.Collections.Generic;
using System.IO;
using System.Windows.Forms;

namespace ModeloExamenA
{
    /// <summary>
    /// Formulario base que define el diseño y comportamiento común para todos los formularios.
    /// Implementa el patrón de Herencia Visual de Formularios en C#.
    /// </summary>
    public partial class FrmPadre : Form
    {
        // Colección centralizada de datos (Estructura propia de C# ordenada por matrícula)
        public static SortedList<string, Vehiculo> ListaVehiculos = new SortedList<string, Vehiculo>();

        // Rutas y carpetas para operaciones de System.IO
        public static string CarpetaDatos = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "DatosExamen");
        public static string ArchivoDatos = Path.Combine(CarpetaDatos, "vehiculos.txt");

        public FrmPadre()
        {
            InitializeComponent();
        }

        private void FrmPadre_Load(object sender, EventArgs e)
        {
            // Inicializar el reloj digital
            relojTimer.Start();
            lblReloj.Text = "Hora: " + DateTime.Now.ToString("HH:mm:ss");

            // Cargar datos de prueba iniciales si la lista está vacía
            if (ListaVehiculos.Count == 0)
            {
                ListaVehiculos.Add("1234-BBB", new Vehiculo("1234-BBB", "Toyota", "Corolla", "Turismo", true, "Vehículo híbrido en perfecto estado", ""));
                ListaVehiculos.Add("5678-CCC", new Vehiculo("5678-CCC", "Yamaha", "MT-07", "Motocicleta", false, "Revisión técnica pasada recientemente", ""));
                ListaVehiculos.Add("9012-DDD", new Vehiculo("9012-DDD", "Renault", "Kangoo", "Furgoneta", false, "Vehículo comercial con carga ligera", ""));
                ListaVehiculos.Add("3456-EEE", new Vehiculo("3456-EEE", "Tesla", "Model 3", "Turismo", true, "100% eléctrico con batería de alta capacidad", ""));
            }

        }

        /// <summary>
        /// Evento del Timer para refrescar el reloj en tiempo real cada 1000 ms.
        /// </summary>
        private void relojTimer_Tick(object sender, EventArgs e)
        {
            lblReloj.Text = "Hora: " + DateTime.Now.ToString("HH:mm:ss");
        }

        /// <summary>
        /// Método de navegación que implementa la reutilización de formularios abiertos en Application.OpenForms.
        /// </summary>
        protected void AbrirFormulario(Form formDestino)
        {
            foreach (Form f in Application.OpenForms)
            {
                if (f.GetType() == formDestino.GetType())
                {
                    f.Show();
                    f.BringToFront();
                    this.Hide();
                    return;
                }
            }

            formDestino.Show();
            this.Hide();
        }

        #region Eventos del Menú Principal

        private void MnuAlta_Click(object sender, EventArgs e)
        {
            AbrirFormulario(new FrmAlta());
        }

        private void MnuConsultaList_Click(object sender, EventArgs e)
        {
            AbrirFormulario(new FrmConsultaList());
        }

        private void MnuConsultaTree_Click(object sender, EventArgs e)
        {
            AbrirFormulario(new FrmConsultaTree());
        }

        /// <summary>
        /// Demostración de System.IO: Exportación de datos utilizando Directory, Path y StreamWriter en bloque using.
        /// </summary>
        private void MnuExportar_Click(object sender, EventArgs e)
        {
            try
            {
                // Crear directorio si no existe físicamente
                if (!Directory.Exists(CarpetaDatos))
                {
                    Directory.CreateDirectory(CarpetaDatos);
                }

                // Uso de la sentencia using para asegurar la liberación automática del recurso E/S
                using (StreamWriter sw = File.CreateText(ArchivoDatos))
                {
                    foreach (Vehiculo v in ListaVehiculos.Values)
                    {
                        // Formato delimitado: Matricula|Marca|Modelo|Categoria|EsElectrico|Observaciones|RutaFoto
                        string linea = $"{v.Matricula}|{v.Marca}|{v.Modelo}|{v.Categoria}|{v.EsElectrico}|{v.Observaciones}|{v.RutaFoto}";
                        sw.WriteLine(linea);
                    }
                }

                MessageBox.Show($"Datos exportados exitosamente ({ListaVehiculos.Count} registros) en:\n{ArchivoDatos}",
                    "Exportación Correcta", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            catch (UnauthorizedAccessException ex)
            {
                MessageBox.Show("Permisos insuficientes para escribir en la ruta: " + ex.Message, "Error de Permisos", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            catch (IOException ex)
            {
                MessageBox.Show("Error de E/S al escribir el archivo: " + ex.Message, "Error de Archivo", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error inesperado: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        /// <summary>
        /// Demostración de System.IO: Importación de datos utilizando File.Exists y File.ReadAllLines.
        /// </summary>
        private void MnuImportar_Click(object sender, EventArgs e)
        {
            if (!File.Exists(ArchivoDatos))
            {
                MessageBox.Show("No se encontró ningún archivo de respaldo en:\n" + ArchivoDatos, "Archivo no encontrado", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return;
            }

            try
            {
                string[] lineas = File.ReadAllLines(ArchivoDatos);
                int importados = 0;

                foreach (string linea in lineas)
                {
                    if (string.IsNullOrWhiteSpace(linea)) continue;

                    string[] partes = linea.Split('|');
                    if (partes.Length >= 6)
                    {
                        string matricula = partes[0].Trim();
                        string marca = partes[1].Trim();
                        string modelo = partes[2].Trim();
                        string categoria = partes[3].Trim();
                        bool esElectrico = bool.Parse(partes[4].Trim());
                        string observaciones = partes[5].Trim();
                        string rutaFoto = "";
                        if (partes.Length > 6)
                        {
                            rutaFoto = partes[6].Trim();
                        }

                        Vehiculo vehiculo = new Vehiculo(matricula, marca, modelo, categoria, esElectrico, observaciones, rutaFoto);

                        if (ListaVehiculos.ContainsKey(matricula))
                        {
                            ListaVehiculos[matricula] = vehiculo;
                        }
                        else
                        {
                            ListaVehiculos.Add(matricula, vehiculo);
                        }
                        importados++;
                    }
                }

                MessageBox.Show($"Se han importado/actualizado {importados} vehículos correctamente.", "Importación Exitosa", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            catch (IOException ex)
            {
                MessageBox.Show("No se pudo leer el archivo: " + ex.Message, "Error E/S", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error durante la importación: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void MnuSalir_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void FrmPadre_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }

        #endregion
    }
}
