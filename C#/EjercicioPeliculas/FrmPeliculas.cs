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

namespace EjercicioPeliculas
{
    public partial class FrmPeliculas : Form
    {
        private SortedList<string,List<Pelicula>> listaPeliculas;
        public FrmPeliculas()
        {
            InitializeComponent();
            listaPeliculas = new SortedList<string, List<Pelicula>>();
        }

        private void FrmPeliculas_Load(object sender, EventArgs e)
        {
            leerFichero();
        }

        private void leerFichero()
        {
            string[] lineas = File.ReadAllLines("Peliculas.txt");

            foreach (string linea in lineas)
            {
                string[] pelicula = linea.Split('#');
                string titulo = pelicula[0].Trim();
                string actores = pelicula[1].Trim();
                string director = pelicula[2].Trim();
                string clasificacion = pelicula[3].Trim();

                bool clasificacionRepetida = false;

                foreach (string clasificacionEscogida in listaPeliculas.Keys)
                {
                    if (clasificacionEscogida.Equals(clasificacion, StringComparison.OrdinalIgnoreCase))
                    {
                        clasificacionRepetida = true;
                    }
                }



                if (clasificacionRepetida)
                {
                    listaPeliculas[clasificacion].Add();
                }
            }
        }
    }
}
