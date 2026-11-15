using System;
using System.Drawing;
using System.IO;
using System.Windows.Forms;

namespace Misiones_Espaciales
{
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

        // Generar el arbol jerarquico sin LINQ
        private void CargarArbol()
        {
            trvMisiones.Nodes.Clear();

            // Crear nodos raiz para cada destino
            TreeNode nodoLuna = trvMisiones.Nodes.Add("Luna");
            TreeNode nodoMarte = trvMisiones.Nodes.Add("Marte");
            TreeNode nodoJupiter = trvMisiones.Nodes.Add("Júpiter");
            TreeNode nodoSaturno = trvMisiones.Nodes.Add("Saturno");
            TreeNode nodoEspacio = trvMisiones.Nodes.Add("Espacio Profundo");

            // Recorrer las misiones y añadir como nodos hijos
            foreach (Mision mision in FrmPadre.ListaMisiones.Values)
            {
                string textoNodo = mision.Codigo + " - " + mision.Nombre;

                if (mision.Destino == "Luna")
                {
                    TreeNode hijo = nodoLuna.Nodes.Add(textoNodo);
                    hijo.Tag = mision.Codigo;
                }
                else if (mision.Destino == "Marte")
                {
                    TreeNode hijo = nodoMarte.Nodes.Add(textoNodo);
                    hijo.Tag = mision.Codigo;
                }
                else if (mision.Destino == "Júpiter")
                {
                    TreeNode hijo = nodoJupiter.Nodes.Add(textoNodo);
                    hijo.Tag = mision.Codigo;
                }
                else if (mision.Destino == "Saturno")
                {
                    TreeNode hijo = nodoSaturno.Nodes.Add(textoNodo);
                    hijo.Tag = mision.Codigo;
                }
                else if (mision.Destino == "Espacio Profundo")
                {
                    TreeNode hijo = nodoEspacio.Nodes.Add(textoNodo);
                    hijo.Tag = mision.Codigo;
                }
            }

            // Expandir todos los nodos
            trvMisiones.ExpandAll();
        }

        // Evento AfterSelect - mostrar detalles
        private void trvMisiones_AfterSelect(object sender, TreeViewEventArgs e)
        {
            // Si el nodo hijo tiene Tag, es una mision
            if (e.Node.Tag != null)
            {
                string codigo = (string)e.Node.Tag;

                if (FrmPadre.ListaMisiones.ContainsKey(codigo))
                {
                    Mision mision = FrmPadre.ListaMisiones[codigo];

                    txtCodigo.Text = mision.Codigo;
                    txtNombre.Text = mision.Nombre;
                    txtDestino.Text = mision.Destino;
                    txtTipo.Text = mision.TipoNave;

                    if (mision.Tripulada)
                    {
                        txtTripulacion.Text = "Si - Misión tripulada";
                    }
                    else
                    {
                        txtTripulacion.Text = "No - Misión autónoma";
                    }

                    txtFecha.Text = mision.FechaRegistro.ToString("dd/MM/yyyy HH:mm:ss");

                    // Cargar imagen si existe
                    if (!string.IsNullOrEmpty(mision.RutaInsignia) && File.Exists(mision.RutaInsignia))
                    {
                        picDetalle.Image = Image.FromFile(mision.RutaInsignia);
                    }
                    else
                    {
                        picDetalle.Image = null;
                    }
                }
            }
            else
            {
                // Nodo raiz de destino - limpiar detalles
                LimpiarDetalles();
            }
        }

        // Limpiar los controles de detalle
        private void LimpiarDetalles()
        {
            txtCodigo.Text = "";
            txtNombre.Text = "";
            txtDestino.Text = "";
            txtTipo.Text = "";
            txtTripulacion.Text = "";
            txtFecha.Text = "";
            picDetalle.Image = null;
        }
    }
}
