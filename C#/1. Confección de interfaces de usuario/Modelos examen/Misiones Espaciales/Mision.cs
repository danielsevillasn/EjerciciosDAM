using System;

namespace Misiones_Espaciales
{
    public class Mision
    {
        // Atributos privados
        private string codigo;
        private string nombre;
        private string destino;
        private string tipoNave;
        private bool tripulada;
        private string observaciones;
        private string rutaInsignia;
        private DateTime fechaRegistro;

        // Constructor por defecto
        public Mision()
        {
            this.fechaRegistro = DateTime.Now;
        }

        // Constructor parametrizado
        public Mision(string codigo, string nombre, string destino, string tipoNave, bool tripulada, string observaciones, string rutaInsignia)
        {
            this.codigo = codigo;
            this.nombre = nombre;
            this.destino = destino;
            this.tipoNave = tipoNave;
            this.tripulada = tripulada;
            this.observaciones = observaciones;
            this.rutaInsignia = rutaInsignia;
            this.fechaRegistro = DateTime.Now;
        }

        // Propiedades públicas
        public string Codigo
        {
            get { return codigo; }
            set { codigo = value; }
        }

        public string Nombre
        {
            get { return nombre; }
            set { nombre = value; }
        }

        public string Destino
        {
            get { return destino; }
            set { destino = value; }
        }

        public string TipoNave
        {
            get { return tipoNave; }
            set { tipoNave = value; }
        }

        public bool Tripulada
        {
            get { return tripulada; }
            set { tripulada = value; }
        }

        public string Observaciones
        {
            get { return observaciones; }
            set { observaciones = value; }
        }

        public string RutaInsignia
        {
            get { return rutaInsignia; }
            set { rutaInsignia = value; }
        }

        public DateTime FechaRegistro
        {
            get { return fechaRegistro; }
            set { fechaRegistro = value; }
        }

        // Sobrescritura de ToString()
        public override string ToString()
        {
            return string.Format("{0} - {1} [{2}]", codigo, nombre, destino);
        }
    }
}
