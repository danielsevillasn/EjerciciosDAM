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
            trvClientes.Nodes.Add("León", "León",1, 1);
            trvClientes.Nodes.Add("Alcalá de henares", "Alcalá de Henares",1,1);
        }

        private void trvClientes_AfterSelect(object sender, TreeViewEventArgs e)
        {
            trvClientes.SelectedNode.Nodes.Add("Juan Sanz", "Juan Sanz", 0, 0);
            trvClientes.SelectedNode.Nodes.Add("Ana Tascón");
        }
    }
}
