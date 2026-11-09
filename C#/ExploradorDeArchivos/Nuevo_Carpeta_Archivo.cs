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
    public partial class Nuevo_Carpeta_Archivo : Form
    {
        bool esArchivo = false;
        bool esDirectorio = false;
        String ruta = null;
        public Nuevo_Carpeta_Archivo(bool esArchivo, bool esDirectorio, string ruta)
        {
            InitializeComponent();
            this.esArchivo = esArchivo;
            this.esDirectorio = esDirectorio;
            this.ruta = ruta;
        }

        private void Nuevo_Carpeta_Archivo_Load(object sender, EventArgs e)
        {
            if (esArchivo)
            {
                lblTitulo.Text = "Crear nuevo archivo en+"+ruta+":";
                lblExtension.Visible = true;
                txtBoxExtension.Visible = true;
            }
            if (esDirectorio)
            {
                lblTitulo.Text = "Crear nuevo directorio en+" + ruta + ":";
                lblExtension.Visible = false;
                txtBoxExtension.Visible = false;
            }
            lblTitulo.Left = (this.ClientSize.Width - lblTitulo.Width) / 2;
        }

        private void btnAceptar_Click(object sender, EventArgs e)
        {
            if (txtBoxNombre.Text == null)
            {
                return;
            }

            if (esArchivo)
            {
                ruta += txtBoxNombre.Text.Trim() + txtBoxExtension.Text.Trim();
                File.CreateText(ruta);
            }

            if (esDirectorio)
            {
                ruta += txtBoxNombre.Text.Trim();
                Directory.CreateDirectory(ruta);
            }

            this.Close();
        }

        private void btnSalir_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
