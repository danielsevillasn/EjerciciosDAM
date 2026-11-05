using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica4_ClientesBicicletas
{
    public partial class FrmAlta : FrmClientes
    {
        private Cliente ClienteActual;

        public FrmAlta()
        {
            InitializeComponent();
        }

        void LimpiarTexto() {
            //Limpiar campos de cliente.
            TxtNombre.Text = "";
            TxtApellidos.Text = "";
            TxtCiudad.Text = "";
            TxtComentario.Text = "";
            TxtEmail.Text = "";
            ChkVip.Checked = false;

            LsbClientes.SelectedIndex = -1;
        }

        private void TstNuevo_Click(object sender, EventArgs e)
        {
            //Comprobar que los campos necesarios han sido introducidos.
            if (TxtEmail.Text != "" || TxtNombre.Text != "" || TxtApellidos.Text != ""
                || TxtCiudad.Text != "" )
            {
                //Comprobar si el email del nuevo cliente no existe ya para poder añadirlo.
                if (ListadoClientes.ContainsKey(TxtEmail.Text)) {
                    MessageBox.Show("El email ya existe.",
                    "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    return;
                }

                //Añadir cliente.
                Cliente cli = new Cliente(TxtNombre.Text, TxtApellidos.Text, TxtCiudad.Text,
                        TxtEmail.Text, TxtComentario.Text, ChkVip.Checked);
                LsbClientes.Items.Add(cli);
                ListadoClientes.Add(TxtEmail.Text, cli);

                //Limpiar texto para facilitar añadir uno nuevo.
                LimpiarTexto();
            }
            else
            {
                MessageBox.Show("No se puede guardar si los campos nombre, apellidos, ciudad y email no están rellenos.",
                    "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void TstGuardar_Click(object sender, EventArgs e)
        {
            if (LsbClientes.SelectedIndex != -1)
            {
                Cliente cli = new Cliente(TxtNombre.Text, TxtApellidos.Text, TxtCiudad.Text,
                            TxtEmail.Text, TxtComentario.Text, ChkVip.Checked);
                if (ListadoClientes.ContainsKey(TxtEmail.Text))
                {
                    //Si el email (clave) ya existe, editar sus valores
                    ClienteActual = cli;
                    LsbClientes.Items[LsbClientes.SelectedIndex] = cli;
                }
                else
                {
                    //Si no es nuevo, quitar cliente con datos antiguos para reañadir con nueva clave / valor.
                    ListadoClientes.Remove(ClienteActual.Email);
                    ListadoClientes.Add(TxtEmail.Text, cli);

                    LsbClientes.Items.RemoveAt(LsbClientes.SelectedIndex);
                    LsbClientes.Items.Add(cli);
                }

                LimpiarTexto();
            }
        }

        private void FrmAlta_Activated(object sender, EventArgs e)
        {
            //Si se ha cambiado de ventana, limpiar lista de clientes y añadir de nuevo
            if (CambioVentana)
            {

                LsbClientes.Items.Clear();

                foreach (KeyValuePair<String, Cliente> cl in ListadoClientes)
                {
                    LsbClientes.Items.Add(cl.Value);
                }
                CambioVentana = false;
            }
        }

        private void LsbClientes_SelectedIndexChanged(object sender, EventArgs e)
        {
            //Cargar info de cliente al seleccionar un elemento
            if (LsbClientes.SelectedIndex != -1)
            {
                ClienteActual = (Cliente)LsbClientes.SelectedItem;

                TxtNombre.Text = ClienteActual.Nombre;
                TxtApellidos.Text = ClienteActual.Apellidos;
                TxtCiudad.Text = ClienteActual.Ciudad;
                TxtEmail.Text = ClienteActual.Email;
                TxtComentario.Text = ClienteActual.Comentario;
                ChkVip.Checked = ClienteActual.Vip;
            }
        }

        private void TstBorrar_Click(object sender, EventArgs e)
        {
            //Borrar cliente seleccionado de la lista
            if (LsbClientes.SelectedIndex != -1)
            {
                ListadoClientes.Remove(ClienteActual.Email);
                LsbClientes.Items.RemoveAt(LsbClientes.SelectedIndex);
                LimpiarTexto();
            }
        }

        private void FrmAlta_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }
    }
}
