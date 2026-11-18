using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace ModeloExamenA
{
    /// <summary>
    /// Formulario de Consulta en formato ListView.
    /// Hereda visualmente de FrmPadre y demuestra filtrado con LINQ y conmutación de vistas.
    /// </summary>
    public partial class FrmConsultaList : FrmPadre
    {
        public FrmConsultaList()
        {
            InitializeComponent();
        }

        private void FrmConsultaList_Load(object sender, EventArgs e)
        {
            if (cmbCategoria.SelectedIndex == -1) cmbCategoria.SelectedIndex = 0;
            if (cmbVistas.SelectedIndex == -1) cmbVistas.SelectedIndex = 0;
            CargarListView();
        }

        private void FrmConsultaList_Activated(object sender, EventArgs e)
        {
            CargarListView();
        }

        /// <summary>
        /// Filtra y carga la colección de vehículos en el ListView utilizando LINQ.
        /// </summary>
        private void CargarListView()
        {
            lsvVehiculos.Items.Clear();

            string categoriaFiltro = "Todos";
            if (cmbCategoria.SelectedItem != null)
            {
                string valor = cmbCategoria.SelectedItem.ToString();
                if (valor != null)
                {
                    categoriaFiltro = valor;
                }
            }

            // Uso de LINQ para filtrado condicional sobre la colección
            IEnumerable<Vehiculo> datosFiltrados;
            if (categoriaFiltro.Equals("Todos", StringComparison.OrdinalIgnoreCase))
            {
                datosFiltrados = ListaVehiculos.Values;
            }
            else
            {
                datosFiltrados = ListaVehiculos.Values.Where(v => v.Categoria.Equals(categoriaFiltro, StringComparison.OrdinalIgnoreCase));
            }

            foreach (Vehiculo v in datosFiltrados)
            {
                // Creación del elemento principal del ListView
                ListViewItem item = new ListViewItem(v.Matricula);

                // Sub-elementos correspondientes a las columnas
                item.SubItems.Add(v.Marca);
                item.SubItems.Add(v.Modelo);
                item.SubItems.Add(v.Categoria);
                string tipoMotor;
                if (v.EsElectrico)
                {
                    tipoMotor = "⚡ Eléctrico / Híbrido";
                }
                else
                {
                    tipoMotor = "⛽ Combustión";
                }
                item.SubItems.Add(tipoMotor);
                item.SubItems.Add(v.Observaciones);

                // Asignar clave en el Tag para recuperación directa
                item.Tag = v.Matricula;

                lsvVehiculos.Items.Add(item);
            }

        }

        /// <summary>
        /// Cambia dinámicamente el estilo de presentación del ListView mediante switch-case.
        /// </summary>
        private void cmbVistas_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (cmbVistas.SelectedItem == null) return;

            switch (cmbVistas.SelectedItem.ToString())
            {
                case "Detalles":
                    lsvVehiculos.View = View.Details;
                    break;
                case "Iconos grandes":
                    lsvVehiculos.View = View.LargeIcon;
                    break;
                case "Iconos pequeños":
                    lsvVehiculos.View = View.SmallIcon;
                    break;
                case "Lista":
                    lsvVehiculos.View = View.List;
                    break;
                case "Mosaico":
                    lsvVehiculos.View = View.Tile;
                    break;
                default:
                    lsvVehiculos.View = View.Details;
                    break;
            }
        }

        private void cmbCategoria_SelectedIndexChanged(object sender, EventArgs e)
        {
            CargarListView();
        }

        private void btnRefrescar_Click(object sender, EventArgs e)
        {
            CargarListView();
        }

        private void lsvVehiculos_DoubleClick(object sender, EventArgs e)
        {
            if (lsvVehiculos.SelectedItems.Count > 0)
            {
                string matricula = null;
                if (lsvVehiculos.SelectedItems[0].Tag != null)
                {
                    matricula = lsvVehiculos.SelectedItems[0].Tag.ToString();
                }
                if (!string.IsNullOrEmpty(matricula) && ListaVehiculos.ContainsKey(matricula))
                {
                    Vehiculo v = ListaVehiculos[matricula];
                    string tipoMotor;
                    if (v.EsElectrico)
                    {
                        tipoMotor = "Eléctrico / Híbrido";
                    }
                    else
                    {
                        tipoMotor = "Combustión";
                    }
                    string ficha = $"Ficha Técnica del Vehículo:\n\n" +
                                   $"• Matrícula: {v.Matricula}\n" +
                                   $"• Marca: {v.Marca}\n" +
                                   $"• Modelo: {v.Modelo}\n" +
                                   $"• Categoría: {v.Categoria}\n" +
                                   $"• Motor: {tipoMotor}\n" +
                                   $"• Fecha de Registro: {v.FechaRegistro:dd/MM/yyyy HH:mm}\n" +
                                   $"• Observaciones: {v.Observaciones}";

                    MessageBox.Show(ficha, "Detalles del Vehículo", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
            }
        }
    }
}
