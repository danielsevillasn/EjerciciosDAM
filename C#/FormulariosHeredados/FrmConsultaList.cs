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
            ListViewItem l = lsvClientes.Items.Add("Pepe", 0);
            l.SubItems.Add("Federico");
            l.SubItems.Add("pepe@gmail.com");
            l.SubItems.Add("Cliente leal");
            cmbVista.Items.Clear();
            cmbVista.Items.Add("Iconos grandes");
            cmbVista.Items.Add("Detalles");
            cmbVista.Items.Add("Iconos pequeños");
            cmbVista.Items.Add("Lista");
            cmbVista.Items.Add("Mosaico");
        }

        private void cmbVista_SelectedIndexChanged(object sender, EventArgs e)
        {
            if(cmbVista.SelectedItem.ToString() != null)
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
    }
}
