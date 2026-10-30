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
    public partial class FrmConsultaList : FrmPadre
    {
        public FrmConsultaList()
        {
            InitializeComponent();
        }

        private void FrmConsultaList_Load(object sender, EventArgs e)
        {
            cargarClientes("");

            cmbVista.Items.Clear();
            cmbVista.Items.Add("Iconos grandes");
            cmbVista.Items.Add("Detalles");
            cmbVista.Items.Add("Iconos pequeños");
            cmbVista.Items.Add("Lista");
            cmbVista.Items.Add("Mosaico");
            cmbVista.SelectedIndex = 0;

            cmbCiudad.Items.Clear();
            cmbCiudad.Items.Add("Todos");
            foreach (Cliente c in listaClientes.Values)
            {
                if (!cmbCiudad.Items.Contains(c.Ciudad))
                {
                    cmbCiudad.Items.Add(c.Ciudad);
                }
            }
        }

        private void cargarClientes(String ciudad)
        {
            int vip;
            for (int i = 0; i < listaClientes.Count; i++)
            {
                Cliente c = listaClientes.GetValueAtIndex(i);
                if(ciudad.Equals("") || ciudad.Equals(c.Ciudad))
                {
                    vip = 0;
                    if (c.Vip)
                    {
                        vip = 1;
                    }
                    ListViewItem l = lsvClientes.Items.Add(c.Nombre, vip);
                    l.SubItems.Add(c.Apellido);
                    l.SubItems.Add(listaClientes.GetKeyAtIndex(i).ToString());
                    l.SubItems.Add(c.Comentario);
                }

            }
        }

        private void cmbVista_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (cmbVista.SelectedItem != null)
            {
                switch (cmbVista.SelectedItem.ToString())
                {
                    case "Detalles":
                        lsvClientes.View = View.Details;
                        break;
                    case "Iconos grandes":
                        lsvClientes.View = View.LargeIcon;
                        break;
                    case "Iconos pequeños":
                        lsvClientes.View = View.SmallIcon;
                        break;
                    case "Lista":
                        lsvClientes.View = View.List;
                        break;
                    case "Mosaico":
                        lsvClientes.View = View.Tile;
                        break;

                }
            }
        }

        private void cmbCiudad_SelectedIndexChanged(object sender, EventArgs e)
        {
            lsvClientes.Items.Clear();
            if(cmbCiudad.SelectedIndex != null)
            {
                if (cmbCiudad.SelectedItem.ToString().ToLower().Equals("todos"))
                {
                    cargarClientes("");
                }
                else
                {
                    cargarClientes(cmbCiudad.SelectedItem.ToString());
                }
            }
        }
    }
}
