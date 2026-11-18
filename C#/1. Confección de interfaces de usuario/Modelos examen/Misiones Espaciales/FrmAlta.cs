using System;
using System.Drawing;
using System.IO;
using System.Windows.Forms;

namespace Misiones_Espaciales
{
    public partial class FrmAlta : FrmPadre
    {
        public FrmAlta()
        {
            InitializeComponent();
            CargarListBox();
        }

        private void FrmAlta_Load(object sender, EventArgs e)
        {
            // Poblar ComboBox de destinos
            cmbDestino.Items.Add("Luna");
            cmbDestino.Items.Add("Marte");
            cmbDestino.Items.Add("Júpiter");
            cmbDestino.Items.Add("Saturno");
            cmbDestino.Items.Add("Espacio Profundo");
            cmbDestino.SelectedIndex = 0;

            CargarListBox();
        }

        // Cargar las misiones en el ListBox
        private void CargarListBox()
        {
            lsbMisiones.Items.Clear();
            foreach (Mision mision in FrmPadre.ListaMisiones.Values)
            {
                lsbMisiones.Items.Add(mision);
            }
        }

        // Selección en el ListBox - volcar datos en los campos
        private void lsbMisiones_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (lsbMisiones.SelectedItem != null)
            {
                Mision mision = (Mision)lsbMisiones.SelectedItem;

                txtCodigo.Text = mision.Codigo;
                txtNombre.Text = mision.Nombre;
                cmbDestino.Text = mision.Destino;
                txtObservaciones.Text = mision.Observaciones;
                chkTripulada.Checked = mision.Tripulada;

                // Determinar qué RadioButton marcar
                if (mision.TipoNave == "Sonda Orbital")
                {
                    rdbOrbital.Checked = true;
                }
                else if (mision.TipoNave == "Rover de Superficie")
                {
                    rdbRover.Checked = true;
                }
                else if (mision.TipoNave == "Telescopio Espacial")
                {
                    rdbTelescopio.Checked = true;
                }

                // Cargar imagen si existe
                if (!string.IsNullOrEmpty(mision.RutaInsignia) && File.Exists(mision.RutaInsignia))
                {
                    picInsignia.Image = Image.FromFile(mision.RutaInsignia);
                }
                else
                {
                    picInsignia.Image = null;
                }
            }
        }

        // Botón para cargar imagen
        private void btnCargarImagen_Click(object sender, EventArgs e)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog();
            openFileDialog.Filter = "Imágenes|*.jpg;*.jpeg;*.png|Todos los archivos|*.*";
            openFileDialog.Title = "Seleccionar insignia de misión";

            if (openFileDialog.ShowDialog() == DialogResult.OK)
            {
                picInsignia.ImageLocation = openFileDialog.FileName;
            }
        }

        // --- ToolStrip: Nuevo ---
        private void tsbNuevo_Click(object sender, EventArgs e)
        {
            LimpiarCampos();
        }

        // --- ToolStrip: Guardar ---
        private void tsbGuardar_Click(object sender, EventArgs e)
        {
            // Validaciones
            if (txtCodigo.Text.Trim() == "")
            {
                MessageBox.Show("El código de misión es obligatorio.", "Validación", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                txtCodigo.Focus();
                return;
            }

            if (txtNombre.Text.Trim() == "")
            {
                MessageBox.Show("El nombre de la misión es obligatorio.", "Validación", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                txtNombre.Focus();
                return;
            }

            if (cmbDestino.SelectedIndex == -1)
            {
                MessageBox.Show("Debe seleccionar un destino.", "Validación", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                cmbDestino.Focus();
                return;
            }

            // Determinar tipo de nave
            string tipoNave = "";
            if (rdbOrbital.Checked)
            {
                tipoNave = "Sonda Orbital";
            }
            else if (rdbRover.Checked)
            {
                tipoNave = "Rover de Superficie";
            }
            else if (rdbTelescopio.Checked)
            {
                tipoNave = "Telescopio Espacial";
            }

            string codigo = txtCodigo.Text.Trim();
            string nombre = txtNombre.Text.Trim();
            string destino = cmbDestino.Text;
            bool tripulada = chkTripulada.Checked;
            string observaciones = txtObservaciones.Text;
            string rutaInsignia = "";

            if (picInsignia.ImageLocation != null)
            {
                rutaInsignia = picInsignia.ImageLocation;
            }

            if (FrmPadre.ListaMisiones.ContainsKey(codigo))
            {
                // Ya existe - pedir confirmación para modificar
                DialogResult resultado = MessageBox.Show("La misión ya existe. ¿Desea modificar sus datos?", "Confirmar modificación", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
                if (resultado == DialogResult.Yes)
                {
                    Mision misionExistente = FrmPadre.ListaMisiones[codigo];
                    misionExistente.Nombre = nombre;
                    misionExistente.Destino = destino;
                    misionExistente.TipoNave = tipoNave;
                    misionExistente.Tripulada = tripulada;
                    misionExistente.Observaciones = observaciones;
                    misionExistente.RutaInsignia = rutaInsignia;

                    MessageBox.Show("Misión modificada correctamente.", "Guardar", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
            }
            else
            {
                // Nueva misión
                Mision nuevaMision = new Mision(codigo, nombre, destino, tipoNave, tripulada, observaciones, rutaInsignia);
                FrmPadre.ListaMisiones.Add(codigo, nuevaMision);
                MessageBox.Show("Misión dada de alta correctamente.", "Guardar", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }

            LimpiarCampos();
            CargarListBox();
            ActualizarEstado();
        }

        // --- ToolStrip: Eliminar ---
        private void tsbEliminar_Click(object sender, EventArgs e)
        {
            if (lsbMisiones.SelectedItem == null)
            {
                MessageBox.Show("Debe seleccionar una misión para eliminar.", "Eliminar", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return;
            }

            Mision misionSeleccionada = (Mision)lsbMisiones.SelectedItem;
            DialogResult resultado = MessageBox.Show("¿Desea eliminar la misión " + misionSeleccionada.Codigo + "?", "Confirmar eliminación", MessageBoxButtons.YesNo, MessageBoxIcon.Question);

            if (resultado == DialogResult.Yes)
            {
                FrmPadre.ListaMisiones.Remove(misionSeleccionada.Codigo);
                MessageBox.Show("Misión eliminada correctamente.", "Eliminar", MessageBoxButtons.OK, MessageBoxIcon.Information);
                CargarListBox();
                LimpiarCampos();
                ActualizarEstado();
            }
        }

        // --- ToolStrip: Limpiar ---
        private void tsbLimpiar_Click(object sender, EventArgs e)
        {
            LimpiarCampos();
        }

        // Limpiar todos los campos
        private void LimpiarCampos()
        {
            txtCodigo.Text = "";
            txtNombre.Text = "";
            cmbDestino.SelectedIndex = 0;
            txtObservaciones.Text = "";
            chkTripulada.Checked = false;
            rdbOrbital.Checked = true;
            rdbRover.Checked = false;
            rdbTelescopio.Checked = false;
            picInsignia.Image = null;
            picInsignia.ImageLocation = null;
            lsbMisiones.SelectedIndex = -1;
            txtCodigo.Focus();
        }
    }
}
