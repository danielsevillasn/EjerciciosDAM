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

        /**
         * Método asignado al evento click del boton cargar foto,
         * el cual muestra los archivos jpg de la carpeta raiz para cargar una imagen
         */
        private void btnCargarFoto_Click(object sender, EventArgs e)
        {
            ofdFoto.FileName = "";
            ofdFoto.Filter = "Archivos JPG (*.jpg)|*.jpg";
            ofdFoto.InitialDirectory = "C:\\";
            ofdFoto.ShowDialog();
            Bitmap imagen = new Bitmap(ofdFoto.FileName);
            pcbPortada.Image = imagen;
        }

        /**
         * Método asignado al evento click del boton guardar,
         * el cual guarda en la lista de libros con verificación previa
         * las especificaciones del libro indicadas en los elementos
         */
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

        /**
         * Método asignado al evento click del boton limpiar,
         * el cual pone a null todos los txt box y la imagen
         */
        private void btnLimpiar_Click(object sender, EventArgs e)
        {
            txtboxAutor.Text = null;
            txtboxTitulo.Text = null;
            txtEditorial.Text = null;
            pcbPortada.Image = null;
        }
    }
}
