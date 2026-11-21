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
    public partial class FrmBorrar : Form
    {
        public string PaisSeleccionado { get; private set; }

        public FrmBorrar(List<string> paisesActuales)
        {
            InitializeComponent();
            cmbPaises.DataSource = paisesActuales;
        }

        private void btnAceptar_Click(object sender, EventArgs e)
        {
            if (cmbPaises.SelectedItem == null) return;

            PaisSeleccionado = cmbPaises.SelectedItem.ToString();
            this.DialogResult = DialogResult.OK;
            this.Close();
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.Cancel;
            this.Close();
        }
    }
}
