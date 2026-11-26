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
            listaPeliculas = new SortedList<string, List<Pelicula>>(StringComparer.OrdinalIgnoreCase);
        }

        private void FrmPeliculas_Load(object sender, EventArgs e)
        {
            leerFichero();

            int altura = 65;
            foreach (string clasificacion in listaPeliculas.Keys)
            {
                RadioButton radioButton = new RadioButton();
                radioButton.Text = clasificacion;
                radioButton.Tag = clasificacion;
                radioButton.AutoSize = true;
                radioButton.Location = new Point(105, altura);
                altura += 25;

                radioButton.Click += new EventHandler(this.clickRadioButton);
                this.Controls.Add(radioButton);
            }
        }

        private void clickRadioButton(object sender, EventArgs e)
        {
            lsvPeliculas.Items.Clear();
            RadioButton botonClickado = (RadioButton)sender;
            string clasificacion = botonClickado.Tag.ToString();

            if (listaPeliculas.ContainsKey(clasificacion))
            {
                foreach (Pelicula p in listaPeliculas[clasificacion])
                {
                    ListViewItem item = lsvPeliculas.Items.Add(p.Titulo);
                    item.SubItems.Add(p.Autores);
                    item.SubItems.Add(p.Director);
                }
            }
        }

        private void leerFichero()
        {
            if (!File.Exists("Peliculas.txt"))
            {
                MessageBox.Show("No se encuentra el archivo Peliculas.txt");
                return;
            }

            string[] lineas = File.ReadAllLines("Peliculas.txt");

            foreach (string linea in lineas)
            {
                if (string.IsNullOrWhiteSpace(linea)) continue;

                string[] pelicula = linea.Split('#');
                string titulo = pelicula[0].Trim();
                string actores = pelicula[1].Trim();
                string director = pelicula[2].Trim();
                string clasificacion = pelicula[3].Trim();

                Pelicula peliculaEscogida = new Pelicula(titulo, actores, director, clasificacion);

                if (!listaPeliculas.ContainsKey(clasificacion))
                {
                    listaPeliculas.Add(clasificacion, new List<Pelicula>());
                }

                listaPeliculas[clasificacion].Add(peliculaEscogida);
            }
        }
    }
}
