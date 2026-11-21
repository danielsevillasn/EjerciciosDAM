using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PracticaReloj
{
    public partial class FrmAñadir : Form
    {
        public string NombrePais { get; private set; }
        public int DiferenciaHoraria { get; private set; }

        public FrmAñadir()
        {
            InitializeComponent();
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.Cancel;
            this.Close();
        }

        private void btnAceptar_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrWhiteSpace(txtBoxPaís.Text))
            {
                MessageBox.Show("No has ingresado ningún país", "Por favor, ingresa uno", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                txtBoxPaís.Focus();
                return;
            }

            if (!int.TryParse(txtBoxDiferenciaHoraria.Text.Trim(), out int diff))
            {
                MessageBox.Show("La diferencia horaria debe ser un número entero.", "Por favor, ingresa un número", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                txtBoxDiferenciaHoraria.Focus();
                return;
            }

            NombrePais = txtBoxPaís.Text.Trim();
            DiferenciaHoraria = diff;

            this.DialogResult = DialogResult.OK;
            this.Close();
        }
    }
}
