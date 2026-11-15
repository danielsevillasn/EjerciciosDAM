using System;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Windows.Forms;

namespace ModeloExamenA
{
    /// <summary>
    /// Formulario de Consulta Jerárquica con TreeView.
    /// Hereda visualmente de FrmPadre y agrupa vehículos dinámicamente por categoría.
    /// </summary>
    public partial class FrmConsultaTree : FrmPadre
    {
        public FrmConsultaTree()
        {
            InitializeComponent();
        }

        private void FrmConsultaTree_Load(object sender, EventArgs e)
        {
            CargarArbol();
        }

        private void FrmConsultaTree_Activated(object sender, EventArgs e)
        {
            CargarArbol();
        }

        /// <summary>
        /// Genera la estructura en árbol clasificando los vehículos por categoría.
        /// </summary>
        private void CargarArbol()
        {
            trvVehiculos.BeginUpdate();
            trvVehiculos.Nodes.Clear();

            // Categorías base o dinámicas obtenidas mediante LINQ
            string[] categoriasBase = { "Turismo", "Motocicleta", "Furgoneta" };

            foreach (string categoria in categoriasBase)
            {
                // Crear nodo raíz de nivel superior para la categoría
                TreeNode nodoCategoria = trvVehiculos.Nodes.Add(categoria, $"📁 {categoria}");

                // Filtrar vehículos de esta categoría mediante LINQ
                var vehiculosCategoria = ListaVehiculos.Values.Where(v => v.Categoria.Equals(categoria, StringComparison.OrdinalIgnoreCase));

                foreach (Vehiculo v in vehiculosCategoria)
                {
                    string iconoMotor;
                    if (v.EsElectrico)
                    {
                        iconoMotor = "⚡";
                    }
                    else
                    {
                        iconoMotor = "🚗";
                    }
                    TreeNode nodoVehiculo = nodoCategoria.Nodes.Add(v.Matricula, $"{iconoMotor} {v.Matricula} ({v.Marca} {v.Modelo})");

                    // Almacenar la clave del vehículo en la propiedad Tag para recuperación inmediata
                    nodoVehiculo.Tag = v.Matricula;
                }
            }

            // Desplegar todos los nodos para visualización completa
            trvVehiculos.ExpandAll();
            trvVehiculos.EndUpdate();

        }

        /// <summary>
        /// Limpia los campos del panel de detalles.
        /// </summary>
        private void LimpiarDetalles()
        {
            txtDetMatricula.Clear();
            txtDetMarca.Clear();
            txtDetModelo.Clear();
            txtDetCategoria.Clear();
            txtDetMotor.Clear();
            txtDetFecha.Clear();
            txtDetObservaciones.Clear();

            if (picDetalleFoto.Image != null)
            {
                picDetalleFoto.Image.Dispose();
                picDetalleFoto.Image = null;
            }
        }

        /// <summary>
        /// Evento que se dispara al seleccionar cualquier nodo en el TreeView.
        /// </summary>
        private void trvVehiculos_AfterSelect(object sender, TreeViewEventArgs e)
        {
            // Comprobar si el nodo seleccionado corresponde a un vehículo (nodo hijo con Tag)
            if (e.Node != null && e.Node.Tag != null)
            {
                string matricula = null;
                if (e.Node.Tag != null)
                {
                    matricula = e.Node.Tag.ToString();
                }

                if (!string.IsNullOrEmpty(matricula) && ListaVehiculos.ContainsKey(matricula))
                {
                    Vehiculo v = ListaVehiculos[matricula];

                    txtDetMatricula.Text = v.Matricula;
                    txtDetMarca.Text = v.Marca;
                    txtDetModelo.Text = v.Modelo;
                    txtDetCategoria.Text = v.Categoria;
                    string textoMotor;
                    if (v.EsElectrico)
                    {
                        textoMotor = "⚡ 100% Eléctrico / Híbrido";
                    }
                    else
                    {
                        textoMotor = "⛽ Combustión Tradicional";
                    }
                    txtDetMotor.Text = textoMotor;
                    txtDetFecha.Text = v.FechaRegistro.ToString("dd/MM/yyyy HH:mm:ss");
                    txtDetObservaciones.Text = v.Observaciones;

                    // Comprobación y carga de imagen con System.IO.File
                    if (!string.IsNullOrEmpty(v.RutaFoto) && File.Exists(v.RutaFoto))
                    {
                        try
                        {
                            if (picDetalleFoto.Image != null) picDetalleFoto.Image.Dispose();
                            picDetalleFoto.Image = new Bitmap(v.RutaFoto);
                        }
                        catch
                        {
                            picDetalleFoto.Image = null;
                        }
                    }
                    else
                    {
                        if (picDetalleFoto.Image != null) picDetalleFoto.Image.Dispose();
                        picDetalleFoto.Image = null;
                    }
                }
            }
            else
            {
                // Si se selecciona un nodo raíz de categoría, se limpian los detalles
                LimpiarDetalles();
            }
        }
    }
}
