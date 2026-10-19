using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FormulariosHeredados
{
    public partial class FrmAlta : FrmPadre
    {
        public FrmAlta()
        {
            InitializeComponent();
        }

        private void strBtnNuevo_Click(object sender, EventArgs e)
        {
            if (txtBoxNombre.Text.Equals(""))
                MessageBox.Show("Has dejado vacio el nombre");
            else if (txtBoxApellidos.Text.Equals(""))
                MessageBox.Show("Has dejado vacio el apellido");
            else if (txtBoxCiudad.Text.Equals(""))
                MessageBox.Show("Has dejado vacio el ciudad");
            else if (txtBoxCorreo.Text.Equals(""))
                MessageBox.Show("Has dejado vacio el correo");
            else if (txtBoxComentario.Text.Equals(""))
                MessageBox.Show("Has dejado vacio el comentario");
            else
            {
                MessageBox.Show("Cliente guardado correctamente");
                FrmPadre.listaClientes.Add(txtBoxCorreo.Text, new Cliente(txtBoxNombre.Text, txtBoxApellidos.Text, txtBoxCiudad.Text, txtBoxCorreo.Text, txtBoxComentario.Text, chBoxVip.Checked));
                txtBoxNombre.Text = "";
                txtBoxApellidos.Text = "";
                txtBoxCiudad.Text = "";
                txtBoxCorreo.Text = "";
                txtBoxComentario.Text = "";
                cargarLista();
            }
        }
        private void cargarLista()
        {
            lsBoxClientes.Items.Clear();
            foreach (Cliente cliente in FrmPadre.listaClientes.Values)
            {
                lsBoxClientes.Items.Add(cliente.Nombre+" "+cliente.Apellido);
            }
        }



        private void strBtnGuardar_Click(object sender, EventArgs e)
        {
            if (lsBoxClientes.SelectedItem != null)
            {

            }
        }

        private void introducirCliente()
        {

        }

        private void lsBoxClientes_DoubleClick(object sender, EventArgs e)
        {
            if (lsBoxClientes.SelectedItem != null)
            {
                txtBoxApellidos.Text = "";
                txtBoxCiudad.Text = "";
                txtBoxCorreo.Text = "";
                txtBoxComentario.Text = "";
            }
        }
    }
}
