using System;
using System.Collections;
using System.Drawing;
using System.Windows.Forms;

namespace Biblioteca
{
    public partial class FrmHijoConsulta : Form
    {
        /* Objeto. */
        // Atributos.
        private ArrayList AlLibros;

        // Constructores.
        /*
         * Constructor vacío.
         * 
         */
        public FrmHijoConsulta()
        {
            InitializeComponent();
        }

        /**
         * Constructor a partir del ArrayList de libros.
         * 
         */
        public FrmHijoConsulta(ArrayList pAlLibros)
        {
            InitializeComponent();
            AlLibros = pAlLibros;
        }

        // Métodos.
        public void Limpiar()
        {
            RdoBtnAutor.Checked = false;
            RdoBtnEditorial.Checked = false;
            LstBoxTitulo.Items.Clear();
            LstBoxAutorEditorial.Items.Clear();
            PctBox.Image = null;

        }

        private void RdoBtnAutor_CheckedChanged(object sender, EventArgs e)
        {
            LstBoxAutorEditorial.Items.Clear();
            PctBox.Image = null;
            LstBoxTitulo.Items.Clear();

            foreach (Libro fLibro in AlLibros)
            {
                if (!LstBoxAutorEditorial.Items.Contains(fLibro.GetAutor()))
                {
                    LstBoxAutorEditorial.Items.Add(fLibro.GetAutor());
                }
            }

            LstBoxAutorEditorial.Sorted = true;
        }

        private void RdoBtnEditorial_CheckedChanged(object sender, EventArgs e)
        {
            LstBoxAutorEditorial.Items.Clear();
            PctBox.Image = null;
            LstBoxTitulo.Items.Clear();

            foreach (Libro fLibro in AlLibros)
            {
                if (!LstBoxAutorEditorial.Items.Contains(fLibro.GetEditorial()))
                {
                    LstBoxAutorEditorial.Items.Add(fLibro.GetEditorial());
                }
            }

            LstBoxAutorEditorial.Sorted = true;
        }

        private void LstBoxAutorEditorial_SelectedIndexChanged(object sender, EventArgs e)
        {
            LstBoxTitulo.Items.Clear();
            PctBox.Image = null;

            string seleccion = (string)((ListBox)sender).SelectedItem;

            if (RdoBtnAutor.Checked)
            {
                foreach(Libro fLibro in AlLibros)
                {
                    if (fLibro.GetAutor().Equals(seleccion))
                    {
                        if (!LstBoxTitulo.Items.Contains(fLibro.GetTitulo())) {
                            LstBoxTitulo.Items.Add(fLibro.GetTitulo());
                        }
                    }
                }
            } else
            {
                foreach (Libro fLibro in AlLibros)
                {
                    if (fLibro.GetEditorial().Equals(seleccion))
                    {
                        if (!LstBoxTitulo.Items.Contains(fLibro.GetTitulo()))
                        {
                            LstBoxTitulo.Items.Add(fLibro.GetTitulo());
                        }
                    }
                }
            }

            LstBoxTitulo.Sorted = true;
        }

        private void LstBoxTitulo_DoubleClick(object sender, EventArgs e)
        {
            string titulo = (string)((ListBox)sender).SelectedItem;

            foreach (Libro fLibro in AlLibros)
            {
                if (fLibro.GetTitulo().Equals(titulo))
                {
                    PctBox.Image = new Bitmap(fLibro.GetRutaImagen());
                    break;
                }
            }
        }

        private void LstBoxTitulo_SelectedIndexChanged(object sender, EventArgs e)
        {
            PctBox.Image = null;
        }
    }
}