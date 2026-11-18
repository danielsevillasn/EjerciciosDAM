using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Productos
{
    public class Producto
    {
        // Atributos privados inicializados para evitar advertencias de nulabilidad
        private int id = 0;
        private string nombre = "";
        private int stock = 0;
        private string categoria = "";

        // Constructor sin parámetros por defecto
        public Producto()
        {
            id = 0;
            nombre = "";
            stock = 0;
            categoria = "";
        }

        public Producto(int id, string nombre, int stock, string categoria)
        {
            this.id = id;
            this.nombre = nombre;
            this.stock = stock;
            this.categoria = categoria;
        }

        public string Nombre { get => nombre; set => nombre = value; }
        public int Stock { get => stock; set => stock = value; }
        public string Categoria { get => categoria; set => categoria = value; }
        public int Id { get => id; set => id = value; }


        // Sobrescritura polimórfica del método ToString() heredado de System.Object
        public override string ToString()
        {
            return $"{this.id} - {this.nombre} {this.stock} ({this.categoria})";
        }
    }
}
