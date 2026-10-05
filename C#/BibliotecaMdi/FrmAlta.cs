using BibliotecaMdi;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BibliotecaMdi
{
    public partial class FrmAlta : Form
    {
        public FrmAlta()
        {
            InitializeComponent();
        }

        private void btnCargarFoto_Click(object sender, EventArgs e)
        {
            ofdFoto.FileName = "";
            ofdFoto.Filter = "Archivos JPG (*.jpg)|*.jpg";
            ofdFoto.InitialDirectory = "C:\\";
            ofdFoto.ShowDialog();
            if (pcbPortada.Image == null)
            {
                MessageBox.Show("No has seleccionado ninguna imagen");
            }
            else
            {
                Bitmap imagen = new Bitmap(ofdFoto.FileName);
                pcbPortada.Image = imagen;
            }

        }

        private void btnGuardar_Click(object sender, EventArgs e)
        {
            if (txtboxAutor.Text.Equals(""))
                MessageBox.Show("Has dejado vacío el autor");
            else if (txtboxTitulo.Text.Equals(""))
                MessageBox.Show("Has dejado vacío el titulo");
            else if (txtEditorial.Text.Equals(""))
                MessageBox.Show("Has dejado vacío el editorial");
            else if (pcbPortada.Image == null)
            {
                MessageBox.Show("No has ingresado ninguna imagen");
            }
            else
            {
                Libro l = new Libro(txtboxTitulo.Text, txtboxAutor.Text, txtEditorial.Text, chboxNuevo.Checked, new Bitmap(ofdFoto.FileName));
                FrmPadre.listaLibros.Add(l);
                txtboxAutor.Text = null;
                txtboxTitulo.Text = null;
                txtEditorial.Text = null;
                chboxNuevo.Checked = false;
                pcbPortada.Image = null;
                MessageBox.Show("Libro guardado correctamente");
            }
        }

        private void btnLimpiar_Click(object sender, EventArgs e)
        {
            txtboxAutor.Text = null;
            txtboxTitulo.Text = null;
            txtEditorial.Text = null;
        }
    }
}
