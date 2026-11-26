using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjercicioPeliculas
{
    internal class Pelicula
    {
        private string titulo;
        private string actores;
        private string director;
        private string clasificacion;

        public Pelicula(string titulo, string autores, string director, string clasificacion)
        {
            this.titulo = titulo;
            this.actores = autores;
            this.director = director;
            this.clasificacion = clasificacion;
        }

        public string Titulo { get => titulo; set => titulo = value; }
        public string Autores { get => actores; set => actores = value; }
        public string Director { get => director; set => director = value; }
        public string Clasificacion { get => clasificacion; set => clasificacion = value; }

        public override string ToString()
        {
            string resultado = titulo + " # "+actores+" # "+director+" # "+clasificacion;

            return resultado;
        }
    }
}
