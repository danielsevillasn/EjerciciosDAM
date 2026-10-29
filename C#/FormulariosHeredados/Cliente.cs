using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FormulariosHeredados
{
    public class Cliente
    {
        private string nombre;
        private string apellido;
        private String ciudad;
        private string correo;
        private string comentario;
        private Boolean vip;

        public Cliente(string nombre, string apellido, string ciudad, string comentario, bool vip)
        {
            this.nombre = nombre;
            this.apellido = apellido;
            this.ciudad = ciudad;
            this.comentario = comentario;
            this.vip = vip;
        }

        public string Nombre { get => nombre; set => nombre = value; }
        public string Apellido { get => apellido; set => apellido = value; }
        public string Ciudad { get => ciudad; set => ciudad = value; }
        public string Comentario { get => comentario; set => comentario = value; }
        public bool Vip { get => vip; set => vip = value; }
    }
}
