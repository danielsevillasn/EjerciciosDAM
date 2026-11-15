using System;

namespace ModeloExamenA
{
    /// <summary>
    /// Clase de modelo que representa la entidad del ejercicio de examen.
    /// Implementa encapsulamiento mediante propiedades C# y sobrescritura de ToString().
    /// </summary>
    public class Vehiculo
    {
        // Atributos privados inicializados para evitar advertencias de nulabilidad
        private string matricula = "";
        private string marca = "";
        private string modelo = "";
        private string categoria = "Turismo"; // "Turismo", "Motocicleta", "Furgoneta"
        private bool esElectrico = false;
        private string observaciones = "";
        private string rutaFoto = "";
        private DateTime fechaRegistro = DateTime.Now;

        // Constructor sin parámetros por defecto
        public Vehiculo()
        {
            this.fechaRegistro = DateTime.Now;
        }

        // Constructor parametrizado para inicialización completa
        public Vehiculo(string matricula, string marca, string modelo, string categoria, bool esElectrico, string observaciones, string rutaFoto)
        {
            this.matricula = matricula;
            this.marca = marca;
            this.modelo = modelo;
            this.categoria = categoria;
            this.esElectrico = esElectrico;
            this.observaciones = observaciones;
            this.rutaFoto = rutaFoto;
            this.fechaRegistro = DateTime.Now;
        }

        // Propiedades públicas con sintaxis expression-bodied (get => ...; set => ...;)
        public string Matricula { get => matricula; set => matricula = value; }
        public string Marca { get => marca; set => marca = value; }
        public string Modelo { get => modelo; set => modelo = value; }
        public string Categoria { get => categoria; set => categoria = value; }
        public bool EsElectrico { get => esElectrico; set => esElectrico = value; }
        public string Observaciones { get => observaciones; set => observaciones = value; }
        public string RutaFoto { get => rutaFoto; set => rutaFoto = value; }
        public DateTime FechaRegistro { get => fechaRegistro; set => fechaRegistro = value; }

        // Sobrescritura polimórfica del método ToString() heredado de System.Object
        public override string ToString()
        {
            return $"{this.matricula} - {this.marca} {this.modelo} ({this.categoria})";
        }
    }
}
