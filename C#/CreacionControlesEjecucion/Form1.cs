using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CreacionControlesEjecucion
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void manejadorBotones(object sender, EventArgs e)
        {
            MessageBox.Show("Hola soy " + sender.ToString());
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            Button miBoton = new Button();
            miBoton.Text = "Soy boton 2";
            miBoton.Left = 10;
            miBoton.Top = 10;
            this.Controls.Add(miBoton);
            miBoton.Click += new System.EventHandler(this.manejadorBotones);
        }   
    }
}
