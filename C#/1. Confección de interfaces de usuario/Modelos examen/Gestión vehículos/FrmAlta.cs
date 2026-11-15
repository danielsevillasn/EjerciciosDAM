using System;
using System.Drawing;
using System.IO;
using System.Windows.Forms;

namespace ModeloExamenA
{
    /// <summary>
    /// Formulario de Alta y Mantenimiento de Vehículos.
    /// Hereda visualmente de FrmPadre (hereda menú principal, barra de estado y reloj).
    /// </summary>
    public partial class FrmAlta : FrmPadre
    {
        private string rutaFotoActual = "";

        public FrmAlta()
        {
            InitializeComponent();
        }

        private void FrmAlta_Load(object sender, EventArgs e)
        {
            CargarListado();
        }

        private void FrmAlta_Activated(object sender, EventArgs e)
        {
            CargarListado();
        }

        /// <summary>
        /// Recarga el ListBox vinculando los objetos Vehiculo de la colección central.
        /// </summary>
        private void CargarListado()
        {
            lsbVehiculos.Items.Clear();
            foreach (Vehiculo v in ListaVehiculos.Values)
            {
                // El ListBox invoca automáticamente el método ToString() del objeto
                lsbVehiculos.Items.Add(v);
            }
        }

        /// <summary>
        /// Obtiene el texto de la categoría seleccionada en los RadioButtons.
        /// </summary>
        private string ObtenerCategoriaSeleccionada()
        {
            if (rdbMotocicleta.Checked) return "Motocicleta";
            if (rdbFurgoneta.Checked) return "Furgoneta";
            return "Turismo";
        }

        /// <summary>
        /// Marca el RadioButton correspondiente según la cadena de categoría.
        /// </summary>
        private void EstablecerCategoria(string categoria)
        {
            switch (categoria)
            {
                case "Motocicleta":
                    rdbMotocicleta.Checked = true;
                    break;
                case "Furgoneta":
                    rdbFurgoneta.Checked = true;
                    break;
                default:
                    rdbTurismo.Checked = true;
                    break;
            }
        }

        /// <summary>
        /// Limpia los campos de entrada de la interfaz.
        /// </summary>
        private void LimpiarFormulario()
        {
            txtMatricula.Clear();
            txtMarca.Clear();
            txtModelo.Clear();
            txtObservaciones.Clear();
            rdbTurismo.Checked = true;
            chkElectrico.Checked = false;
            rutaFotoActual = "";

            if (picFoto.Image != null)
            {
                picFoto.Image.Dispose();
                picFoto.Image = null;
            }

            lsbVehiculos.SelectedIndex = -1;
            txtMatricula.Focus();
        }

        private void lsbVehiculos_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (lsbVehiculos.SelectedItem is Vehiculo v)
            {
                txtMatricula.Text = v.Matricula;
                txtMarca.Text = v.Marca;
                txtModelo.Text = v.Modelo;
                txtObservaciones.Text = v.Observaciones;
                chkElectrico.Checked = v.EsElectrico;
                EstablecerCategoria(v.Categoria);
                rutaFotoActual = v.RutaFoto;

                // Carga segura de imagen usando System.IO.File
                if (!string.IsNullOrEmpty(v.RutaFoto) && File.Exists(v.RutaFoto))
                {
                    try
                    {
                        if (picFoto.Image != null) picFoto.Image.Dispose();
                        picFoto.Image = new Bitmap(v.RutaFoto);
                    }
                    catch
                    {
                        picFoto.Image = null;
                    }
                }
                else
                {
                    if (picFoto.Image != null) picFoto.Image.Dispose();
                    picFoto.Image = null;
                }
            }
        }

        private void btnCargarFoto_Click(object sender, EventArgs e)
        {
            if (ofdFoto.ShowDialog() == DialogResult.OK)
            {
                try
                {
                    rutaFotoActual = ofdFoto.FileName;
                    if (picFoto.Image != null) picFoto.Image.Dispose();
                    picFoto.Image = new Bitmap(rutaFotoActual);
                }
                catch (Exception ex)
                {
                    MessageBox.Show("No se pudo cargar la imagen seleccionada: " + ex.Message, "Error de Imagen", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        private void btnNuevo_Click(object sender, EventArgs e)
        {
            LimpiarFormulario();
        }

        private void btnLimpiar_Click(object sender, EventArgs e)
        {
            LimpiarFormulario();
        }

        private void btnGuardar_Click(object sender, EventArgs e)
        {
            string matricula = txtMatricula.Text.Trim().ToUpper();
            string marca = txtMarca.Text.Trim();
            string modelo = txtModelo.Text.Trim();

            // Validación de campos obligatorios
            if (string.IsNullOrEmpty(matricula) || string.IsNullOrEmpty(marca) || string.IsNullOrEmpty(modelo))
            {
                MessageBox.Show("Los campos Matrícula, Marca y Modelo son de cumplimentación obligatoria.",
                    "Validación de Campos", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return;
            }

            string categoria = ObtenerCategoriaSeleccionada();
            bool esElectrico = chkElectrico.Checked;
            string observaciones = txtObservaciones.Text.Trim();

            Vehiculo vehiculo = new Vehiculo(matricula, marca, modelo, categoria, esElectrico, observaciones, rutaFotoActual);

            // Estructura C#: Comprobación en SortedList por clave
            if (ListaVehiculos.ContainsKey(matricula))
            {
                DialogResult respuesta = MessageBox.Show($"El vehículo con matrícula '{matricula}' ya existe. ¿Deseas actualizar sus datos?",
                    "Confirmar Modificación", MessageBoxButtons.YesNo, MessageBoxIcon.Question);

                if (respuesta == DialogResult.Yes)
                {
                    ListaVehiculos[matricula] = vehiculo;
                    MessageBox.Show("Datos del vehículo actualizados correctamente.", "Actualizado", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    return;
                }
            }
            else
            {
                ListaVehiculos.Add(matricula, vehiculo);
                MessageBox.Show("Vehículo registrado con éxito en la flota.", "Guardado", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }

            CargarListado();
            LimpiarFormulario();
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            if (lsbVehiculos.SelectedItem is Vehiculo v)
            {
                DialogResult confirmacion = MessageBox.Show($"¿Estás seguro de eliminar el vehículo {v.Matricula} ({v.Marca} {v.Modelo})?",
                    "Confirmar Eliminación", MessageBoxButtons.YesNo, MessageBoxIcon.Warning);

                if (confirmacion == DialogResult.Yes)
                {
                    ListaVehiculos.Remove(v.Matricula);
                    CargarListado();
                    LimpiarFormulario();
                    MessageBox.Show("Vehículo eliminado correctamente.", "Eliminado", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
            }
            else
            {
                MessageBox.Show("Selecciona primero un vehículo de la lista para eliminar.", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
        }
    }
}
