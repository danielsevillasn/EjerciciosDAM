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
    public partial class FrmConsultaTree : FrmPadre
    {
        public FrmConsultaTree()
        {
            InitializeComponent();
        }

        private void FrmConsultaTree_Load(object sender, EventArgs e)
        {
            for (int i = 0; i < listaClientes.Count; i++)
            {
                Cliente c = listaClientes.GetValueAtIndex(i);
                trvClientes.Nodes.Add(c.Ciudad, c.Ciudad, 0, 0).Tag = listaClientes.GetKeyAtIndex(i);
            }
        }

        private void trvClientes_AfterSelect(object sender, TreeViewEventArgs e)
        {
            bool esCiudad = false;
            int vip;

            for (int i = 0; i < listaClientes.Count; i++)
            {
                Cliente c = listaClientes.GetValueAtIndex(i);
                if (trvClientes.SelectedNode.Text == c.Ciudad)
                {
                    esCiudad = true;
                }
            }

            if (esCiudad)
            {
                trvClientes.SelectedNode.Nodes.Clear();
                for (int i = 0; i < listaClientes.Count; i++)
                {
                    Cliente c = listaClientes.GetValueAtIndex(i);
                    if (listaClientes.GetKeyAtIndex(i).Equals(trvClientes.SelectedNode.Tag))
                    {
                        vip = 1;
                        if (c.Vip)
                        {
                            vip = 2;
                        }
                        trvClientes.SelectedNode.Nodes.Add(c.Nombre, c.Nombre, vip, vip).Tag = listaClientes.GetKeyAtIndex(i);

                    }
                }
            }
            else
            {
                for (int i = 0; i < listaClientes.Count; i++)
                {
                    Cliente c = listaClientes[trvClientes.SelectedNode.Tag.ToString()];
                    txtBoxNombre.Text = c.Nombre;
                    txtBoxApellidos.Text = c.Apellido;
                    txtBoxCiudad.Text = c.Ciudad;
                    txtBoxCorreo.Text = listaClientes.GetKeyAtIndex(i);
                    txtBoxComentario.Text = c.Comentario;

                }
            }
        }
    }
}
