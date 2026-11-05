using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practica4_ClientesBicicletas
{
    public class Cliente
    {
        private string nombre, apellidos, ciudad, email, comentario;
        private bool vip;

        public Cliente()
        {
        }

        public Cliente(string nombre, string apellidos, string ciudad, string email, string comentario, bool vip)
        {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.ciudad = ciudad;
            this.email = email;
            this.comentario = comentario;
            this.vip = vip;
        }

        public string Nombre { get => nombre; set => nombre = value; }
        public string Apellidos { get => apellidos; set => apellidos = value; }
        public string Ciudad { get => ciudad; set => ciudad = value; }
        public string Email { get => email; set => email = value; }
        public string Comentario { get => comentario; set => comentario = value; }
        public bool Vip { get => vip; set => vip = value; }

        public override string ToString()
        {
            return this.apellidos + ", " + this.nombre;
        }
    }
}
