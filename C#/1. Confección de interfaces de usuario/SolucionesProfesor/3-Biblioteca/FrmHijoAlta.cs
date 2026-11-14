using System;
using System.Collections;
using System.Drawing;
using System.Windows.Forms;

namespace Biblioteca
{
    public partial class FrmHijoAlta : Form
    {
        /* Objeto. */
        // Atributos.
        private string RutaImagen;
        private ArrayList AlLibros;

        // Constructores.
        /**
         * Constructor vacío.
         * 
         */
        public FrmHijoAlta()
        {
            InitializeComponent();
            RutaImagen = "";
        }

        /**
         * Constructor a partir del ArrayList de libros.
         *
         */
        public FrmHijoAlta(ArrayList pAlLibros)
        {
            InitializeComponent();
            RutaImagen = "";
            AlLibros = pAlLibros;
        }

        // Métodos.
        public void Limpiar()
        {
            TxtBoxTitulo.Clear();
            TxtBoxAutor.Clear();
            TxtBoxEditorial.Clear();
            PctBox.Image = null;
            RutaImagen = "";
            ChkBoxNuevo.Checked = false;
        }

        private void BtnGuardar_Click(object sender, EventArgs e)
        {
            if (!(TxtBoxAutor.Text.Equals("") || TxtBoxAutor.Text.Equals("")
                || TxtBoxEditorial.Text.Equals("") || RutaImagen.Equals("")))
            {
                AlLibros.Add(new Libro(TxtBoxTitulo.Text,
                    TxtBoxAutor.Text, TxtBoxEditorial.Text,
                    RutaImagen, ChkBoxNuevo.Checked));

                Limpiar();
            }
        }

        private void BtnLimpiar_Click(object sender, EventArgs e)
        {
            Limpiar();
        }

        private void BtnCargarFoto_Click(object sender, EventArgs e)
        {
            if (!OpnFleDlgFoto.ShowDialog().Equals(DialogResult.Cancel))
            {
                RutaImagen = OpnFleDlgFoto.FileName;
                Bitmap imagen = new Bitmap(RutaImagen);
                PctBox.Image = imagen;
            }
        }
    }
}