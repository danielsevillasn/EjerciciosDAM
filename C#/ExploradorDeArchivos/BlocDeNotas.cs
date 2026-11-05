using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ExploradorDeArchivos
{
    public partial class BlocDeNotas : Form
    {
        String contenido = null;
        public BlocDeNotas(String texto)
        {
            InitializeComponent();
            contenido = texto;
        }

        private void Bloc_de_notas_Load(object sender, EventArgs e)
        {
            txtContenido.Text = contenido;
        }
    }
}
