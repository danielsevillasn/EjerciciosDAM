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
    public partial class FrmConsultaTree : FrmClientes
    {
        public FrmConsultaTree()
        {
            InitializeComponent();
        }

        private void FrmConsultaTree_Activated(object sender, EventArgs e)
        {
            //Si se cambia de ventana, limpiar árbol y rellenar de nuevo.
            if (CambioVentana)
            {
                TrvClientes.Nodes.Clear();

                foreach (Cliente cl in ListadoClientes.Values)
                {
                    int esVip = cl.Vip ? 1 : 0;

                    //Si la ciudad no existe en el árbol, añadir ciudad como nodo
                    //y cliente actual como nodo hijo
                    if (!TrvClientes.Nodes.Cast<TreeNode>().Any(p => p.Text == cl.Ciudad))
                    {
                        TreeNode tn = TrvClientes.Nodes.Add(cl.Ciudad, cl.Ciudad, 2, 2);
                        tn.Nodes.Add(cl.Email, cl.ToString(), esVip, esVip);
                    }
                    //Si existe el Nodo ciudad, añadir solo el cliente como nodo hijo.
                    else
                    {
                        TreeNode tn = TrvClientes.Nodes.Cast<TreeNode>().First(p => p.Text == cl.Ciudad);
                        tn.Nodes.Add(cl.Email, cl.ToString(), esVip, esVip);
                    }
                }
                
                CambioVentana = false;
            }
        }

        private void FrmConsultaTree_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }

        private void TrvClientes_AfterSelect(object sender, TreeViewEventArgs e)
        {
            //Capturar nodo seleccionado
            TreeNode tn = (sender as TreeView).SelectedNode;

            //Si un nodo es seleccionado (no null) y su icono no es indice 2 (icono de ciudad)
            if (tn != null && tn.ImageIndex != 2)
            {
                Cliente refCliente;

                //Sacar cliente por la clave.
                ListadoClientes.TryGetValue(tn.Name, out refCliente);

                //Mostrar datos
                TxtNombre.Text = refCliente.Nombre;
                TxtApellidos.Text = refCliente.Apellidos;
                TxtCiudad.Text = refCliente.Ciudad;
                TxtComentario.Text = refCliente.Comentario;
                TxtEmail.Text = refCliente.Email;
            }
        }
    }
}
