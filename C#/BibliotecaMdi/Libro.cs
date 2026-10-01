using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BibliotecaMdi
{
    public class Libro
    {
        private String titulo;
        private String autor;
        private String editorial;
        private Boolean nuevo;
        private string foto;
        public Libro(string titulo, string autor, string editorial, Boolean nuevo, string foto)
        {
            this.titulo = titulo;
            this.autor = autor;
            this.editorial = editorial;
            this.nuevo = nuevo;
            this.foto = foto;
        }
        public string Foto { get => foto; set => foto = value; }
        public string Autor { get => autor; set => autor = value; }
        public string Editorial { get => editorial; set => editorial = value; }
        public bool Nuevo { get => nuevo; set => nuevo = value; }
        public string Titulo { get => titulo; set => titulo = value; }
    }
}
