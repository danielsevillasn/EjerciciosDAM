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
                FrmPadre.listaClientes.Add(txtBoxCorreo.Text, new Cliente(txtBoxNombre.Text, txtBoxApellidos.Text, txtBoxCiudad.Text, txtBoxComentario.Text, chBoxVip.Checked));
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
                lsBoxClientes.Items.Add(cliente.Nombre + " " + cliente.Apellido);
            }
        }



        private void strBtnGuardar_Click(object sender, EventArgs e)
        {
            if (lsBoxClientes.SelectedItem != null)
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
                    String correoItemSeleccionado = "";
                    String[] itemSeleccionado = lsBoxClientes.SelectedItem.ToString().Split(" ");
                    for (int i = 0; i < FrmPadre.listaClientes.Values.Count; i++)
                    {
                        if (FrmPadre.listaClientes.Values[i].Nombre.Equals(itemSeleccionado[0]))
                        {
                            correoItemSeleccionado = FrmPadre.listaClientes.GetKeyAtIndex(i);
                        }
                    }
                    MessageBox.Show("Cliente actualizado correctamente");
                    FrmPadre.listaClientes[correoItemSeleccionado] = new Cliente(txtBoxNombre.Text, txtBoxApellidos.Text, txtBoxCiudad.Text, txtBoxComentario.Text, chBoxVip.Checked);
                    txtBoxNombre.Text = "";
                    txtBoxApellidos.Text = "";
                    txtBoxCiudad.Text = "";
                    txtBoxCorreo.Text = "";
                    txtBoxComentario.Text = "";
                    cargarLista();
                }
            }
            else
            {
                MessageBox.Show("No puedes actualizar ya que no hay ningún cliente seleccionado");
            }
        }

        private void introducirCliente()
        {

        }

        private void lsBoxClientes_DoubleClick(object sender, EventArgs e)
        {
            if (lsBoxClientes.SelectedItem != null)
            {
                String correoItemSeleccionado = "";
                int indexItemSeleccionado = 0;
                String[] itemSeleccionado = lsBoxClientes.SelectedItem.ToString().Split(" ");
                for (int i = 0; i < FrmPadre.listaClientes.Values.Count; i++)
                {
                    if (FrmPadre.listaClientes.Values[i].Nombre.Equals(itemSeleccionado[0]))
                    {
                        correoItemSeleccionado = FrmPadre.listaClientes.GetKeyAtIndex(i);
                        indexItemSeleccionado = i;
                    }
                }
                txtBoxApellidos.Text = FrmPadre.listaClientes[correoItemSeleccionado].Apellido;
                txtBoxCiudad.Text = FrmPadre.listaClientes[correoItemSeleccionado].Ciudad;
                txtBoxCorreo.Text = FrmPadre.listaClientes.GetKeyAtIndex(indexItemSeleccionado);
                txtBoxComentario.Text = FrmPadre.listaClientes[correoItemSeleccionado].Comentario;
                txtBoxNombre.Text = FrmPadre.listaClientes[correoItemSeleccionado].Nombre;
                chBoxVip.Checked = FrmPadre.listaClientes[correoItemSeleccionado].Vip;

            }
            else
            {
                txtBoxNombre.Text = "";
                txtBoxApellidos.Text = "";
                txtBoxCiudad.Text = "";
                txtBoxCorreo.Text = "";
                txtBoxComentario.Text = "";
                cargarLista();
            }
        }

        private void FrmAlta_Load(object sender, EventArgs e)
        {
            cargarLista();
        }
    }
}
