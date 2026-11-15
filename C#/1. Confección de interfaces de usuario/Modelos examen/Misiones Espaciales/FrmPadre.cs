using System;
using System.Collections.Generic;
using System.IO;
using System.Windows.Forms;

namespace Misiones_Espaciales
{
    public partial class FrmPadre : Form
    {
        // Colección estática compartida
        public static SortedList<string, Mision> ListaMisiones = new SortedList<string, Mision>();

        public FrmPadre()
        {
            InitializeComponent();
        }

        private void FrmPadre_Load(object sender, EventArgs e)
        {
            // Precargar misiones de prueba si la lista está vacía
            if (ListaMisiones.Count == 0)
            {
                ListaMisiones.Add("MSN-201", new Mision("MSN-201", "Apolo Lunar", "Luna", "Sonda Orbital", true, "Primera misión de exploración lunar", ""));
                ListaMisiones.Add("MSN-202", new Mision("MSN-202", "Perseverance", "Marte", "Rover de Superficie", false, "Rover autónomo para búsqueda de vida", ""));
                ListaMisiones.Add("MSN-203", new Mision("MSN-203", "James Webb", "Espacio Profundo", "Telescopio Espacial", false, "Telescopio infrarrojo de última generación", ""));
            }
            ActualizarEstado();
        }

        private void FrmPadre_FormClosing(object sender, FormClosingEventArgs e)
        {
            DialogResult resultado = MessageBox.Show("¿Desea cerrar la aplicación?", "Confirmar cierre", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (resultado == DialogResult.No)
            {
                e.Cancel = true;
            }
            else
            {
                timerReloj.Stop();
                Application.ExitThread();
            }
        }

        // Actualizar la etiqueta de estado con el total de misiones
        protected void ActualizarEstado()
        {
            if (lblTotalMisiones != null)
            {
                lblTotalMisiones.Text = "Total misiones: " + ListaMisiones.Count;
            }
        }

        // Actualizar el reloj digital
        private void ActualizarReloj()
        {
            if (lblReloj != null)
            {
                lblReloj.Text = DateTime.Now.ToString("dd/MM/yyyy HH:mm:ss");
            }
        }

        private void timerReloj_Tick(object sender, EventArgs e)
        {
            ActualizarReloj();
        }

        // Método de navegación centralizada
        protected void MostrarVentana(Form ventanaDestino)
        {
            foreach (Form form in Application.OpenForms)
            {
                if (form.GetType() == ventanaDestino.GetType())
                {
                    form.Show();
                    this.Hide();
                    return;
                }
            }
            ventanaDestino.Show();
            this.Hide();
        }

        // --- Menú: Misiones -> Alta y Mantenimiento ---
        private void altaMantenimientoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MostrarVentana(new FrmAlta());
        }

        // --- Menú: Consultas -> Listado de Expediciones ---
        private void listadoExpedicionesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MostrarVentana(new FrmConsultaList());
        }

        // --- Menú: Consultas -> Clasificación por Destino ---
        private void clasificacionDestinoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MostrarVentana(new FrmConsultaTree());
        }

        // --- Menú: Ficheros -> Guardar Respaldo en Disco ---
        private void guardarRespaldoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                string carpeta = Path.Combine(Application.StartupPath, "RespaldoMisiones");

                if (!Directory.Exists(carpeta))
                {
                    Directory.CreateDirectory(carpeta);
                }

                string ruta = Path.Combine(carpeta, "misiones.txt");
                string texto = "";

                foreach (Mision mision in ListaMisiones.Values)
                {
                    texto += mision.Codigo + "|" + mision.Nombre + "|" + mision.Destino + "|" + mision.TipoNave + "|" + mision.Tripulada + "|" + mision.Observaciones + "|" + mision.RutaInsignia + "|" + mision.FechaRegistro.ToString("yyyy-MM-dd HH:mm:ss") + Environment.NewLine;
                }

                File.WriteAllText(ruta, texto);
                MessageBox.Show("Respaldo guardado correctamente en: " + ruta, "Guardar Respaldo", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            catch (UnauthorizedAccessException ex)
            {
                MessageBox.Show("Error de acceso: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            catch (IOException ex)
            {
                MessageBox.Show("Error de E/S: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error inesperado: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        // --- Menú: Ficheros -> Restaurar Respaldo desde Disco ---
        private void restaurarRespaldoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                string carpeta = Path.Combine(Application.StartupPath, "RespaldoMisiones");
                string ruta = Path.Combine(carpeta, "misiones.txt");

                if (!File.Exists(ruta))
                {
                    MessageBox.Show("No se encontró el archivo de respaldo.", "Restaurar Respaldo", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                    return;
                }

                string[] lineas = File.ReadAllLines(ruta);
                ListaMisiones.Clear();

                foreach (string linea in lineas)
                {
                    if (linea.Trim() == "")
                        continue;

                    string[] partes = linea.Split('|');

                    if (partes.Length >= 8)
                    {
                        Mision mision = new Mision();
                        mision.Codigo = partes[0];
                        mision.Nombre = partes[1];
                        mision.Destino = partes[2];
                        mision.TipoNave = partes[3];
                        mision.Tripulada = bool.Parse(partes[4]);
                        mision.Observaciones = partes[5];
                        mision.RutaInsignia = partes[6];
                        mision.FechaRegistro = DateTime.Parse(partes[7]);

                        ListaMisiones.Add(mision.Codigo, mision);
                    }
                }

                ActualizarEstado();
                MessageBox.Show("Respaldo restaurado correctamente. Se cargaron " + ListaMisiones.Count + " misiones.", "Restaurar Respaldo", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            catch (UnauthorizedAccessException ex)
            {
                MessageBox.Show("Error de acceso: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            catch (IOException ex)
            {
                MessageBox.Show("Error de E/S: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error inesperado: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        // --- Menú: Salir ---
        private void salirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
