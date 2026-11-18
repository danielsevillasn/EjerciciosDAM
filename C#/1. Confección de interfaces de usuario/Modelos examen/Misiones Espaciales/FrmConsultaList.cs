using System;
using System.Windows.Forms;

namespace Misiones_Espaciales
{
    public partial class FrmConsultaList : FrmPadre
    {
        public FrmConsultaList()
        {
            InitializeComponent();
        }

        private void FrmConsultaList_Load(object sender, EventArgs e)
        {
            // Poblar ComboBox de filtro por destino
            cmbFiltroDestino.Items.Add("Todos");
            cmbFiltroDestino.Items.Add("Luna");
            cmbFiltroDestino.Items.Add("Marte");
            cmbFiltroDestino.Items.Add("Júpiter");
            cmbFiltroDestino.Items.Add("Saturno");
            cmbFiltroDestino.Items.Add("Espacio Profundo");
            cmbFiltroDestino.SelectedIndex = 0;

            // Poblar ComboBox de estilo de vista
            cmbEstiloVista.Items.Add("Detalles");
            cmbEstiloVista.Items.Add("Iconos grandes");
            cmbEstiloVista.Items.Add("Iconos pequeños");
            cmbEstiloVista.Items.Add("Lista");
            cmbEstiloVista.Items.Add("Mosaico");
            cmbEstiloVista.SelectedIndex = 0;

            CargarListView();
        }

        // Cargar y filtrar el ListView
        private void CargarListView()
        {
            lsvMisiones.Items.Clear();

            string filtro = cmbFiltroDestino.Text;

            foreach (Mision mision in FrmPadre.ListaMisiones.Values)
            {
                // Filtrado clasico sin LINQ
                if (filtro == "Todos" || mision.Destino == filtro)
                {
                    ListViewItem item = new ListViewItem(mision.Codigo);
                    item.SubItems.Add(mision.Nombre);
                    item.SubItems.Add(mision.Destino);
                    item.SubItems.Add(mision.TipoNave);

                    if (mision.Tripulada)
                    {
                        item.SubItems.Add("Si");
                    }
                    else
                    {
                        item.SubItems.Add("No");
                    }

                    item.SubItems.Add(mision.Observaciones);
                    item.Tag = mision.Codigo;
                    lsvMisiones.Items.Add(item);
                }
            }
        }

        // Filtrar al cambiar el destino
        private void cmbFiltroDestino_SelectedIndexChanged(object sender, EventArgs e)
        {
            CargarListView();
        }

        // Cambiar vista con switch-case
        private void cmbEstiloVista_SelectedIndexChanged(object sender, EventArgs e)
        {
            switch (cmbEstiloVista.Text)
            {
                case "Detalles":
                    lsvMisiones.View = View.Details;
                    break;
                case "Iconos grandes":
                    lsvMisiones.View = View.LargeIcon;
                    break;
                case "Iconos pequeños":
                    lsvMisiones.View = View.SmallIcon;
                    break;
                case "Lista":
                    lsvMisiones.View = View.List;
                    break;
                case "Mosaico":
                    lsvMisiones.View = View.Tile;
                    break;
            }
        }

        // Doble clic para mostrar ficha tecnica
        private void lsvMisiones_DoubleClick(object sender, EventArgs e)
        {
            if (lsvMisiones.SelectedItems.Count > 0)
            {
                ListViewItem itemSeleccionado = lsvMisiones.SelectedItems[0];
                string codigo = (string)itemSeleccionado.Tag;

                if (FrmPadre.ListaMisiones.ContainsKey(codigo))
                {
                    Mision mision = FrmPadre.ListaMisiones[codigo];

                    string ficha = "";
                    ficha += "=== FICHA TECNICA DE MISION ===" + Environment.NewLine;
                    ficha += Environment.NewLine;
                    ficha += "Codigo: " + mision.Codigo + Environment.NewLine;
                    ficha += "Nombre: " + mision.Nombre + Environment.NewLine;
                    ficha += "Destino: " + mision.Destino + Environment.NewLine;
                    ficha += "Tipo de Nave: " + mision.TipoNave + Environment.NewLine;

                    if (mision.Tripulada)
                    {
                        ficha += "Tripulacion: Si - Misión tripulada" + Environment.NewLine;
                    }
                    else
                    {
                        ficha += "Tripulacion: No - Misión autónoma" + Environment.NewLine;
                    }

                    ficha += "Observaciones: " + mision.Observaciones + Environment.NewLine;
                    ficha += "Fecha de Registro: " + mision.FechaRegistro.ToString("dd/MM/yyyy HH:mm:ss") + Environment.NewLine;

                    MessageBox.Show(ficha, "Ficha Técnica - " + mision.Nombre, MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
            }
        }
    }
}
