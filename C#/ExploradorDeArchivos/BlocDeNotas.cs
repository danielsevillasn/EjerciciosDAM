using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ExploradorDeArchivos
{
    public partial class BlocDeNotas : Form
    {
        String contenido = null;
        String ruta = null;
        public BlocDeNotas(String contenido, String ruta)
        {
            InitializeComponent();
            this.contenido = contenido;
            this.ruta = ruta;
        }

        private void Bloc_de_notas_Load(object sender, EventArgs e)
        {
            txtContenido.Text = contenido;
        }

        private void BlocDeNotas_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (txtContenido.Text != contenido)
            {
                DialogResult resultado = MessageBox.Show("¿Deseas guardar las modificaciones que has hecho?", "Confirmar guardado", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
                if (resultado == DialogResult.Yes)
                {
                    try
                    {
                        File.WriteAllText(ruta, txtContenido.Text);
                    }
                    catch (Exception ex)
                    {
                        MessageBox.Show("No se pudo guardar el archivo: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                }
            }


        }
    }
}
