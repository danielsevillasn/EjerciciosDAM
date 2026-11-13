using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace ExploradorDeArchivos
{
    public partial class Explorador : Form
    {
        public Explorador()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            String[] unidadesLogicas = Directory.GetLogicalDrives();
            foreach (String unidad in unidadesLogicas)
            {
                trvArchivos.Nodes.Add(unidad).Tag = unidad;
            }
        }

        private void cargarContenidoNodo(TreeNode nodoSeleccionado)
        {
            if (nodoSeleccionado == null || nodoSeleccionado.Tag == null)
            {
                return;
            }

            lsvFicheros.Items.Clear();
            String ruta = nodoSeleccionado.Tag.ToString();

            if (Directory.Exists(ruta))
            {
                try
                {
                    String[] directorios = Directory.GetDirectories(ruta);
                    nodoSeleccionado.Nodes.Clear();

                    foreach (String directorio in directorios)
                    {
                        TreeNode nodo = nodoSeleccionado.Nodes.Add(directorio);
                        nodo.Tag = directorio;
                        nodo.Text = Path.GetFileName(directorio);
                    }

                    String[] ficheros = Directory.GetFiles(ruta);
                    foreach (String fichero in ficheros)
                    {
                        int indiceIcono = Path.GetExtension(fichero).Equals(".txt", StringComparison.OrdinalIgnoreCase) ? 0 : 1;
                        ListViewItem lvi = lsvFicheros.Items.Add(Path.GetFileName(fichero), indiceIcono);
                        lvi.Tag = fichero;
                        lvi.SubItems.Add(File.GetCreationTime(fichero).ToString());
                        lvi.SubItems.Add(File.GetLastWriteTime(fichero).ToString());
                        lvi.SubItems.Add(File.GetLastAccessTime(fichero).ToString());
                    }
                }
                catch (UnauthorizedAccessException)
                {
                    MessageBox.Show("Acceso denegado a esta carpeta del sistema.", "Permisos insuficientes", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                }
                catch (IOException ex)
                {
                    MessageBox.Show("No se pudo leer la unidad o carpeta: " + ex.Message, "Error de lectura", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }

        }

        private void trvArchivos_AfterSelect(object sender, TreeViewEventArgs e)
        {
            cargarContenidoNodo(e.Node);

        }

        private void Explorador_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }

        private void lsvFicheros_DoubleClick(object sender, EventArgs e)
        {
            if (lsvFicheros.SelectedItems.Count == 0)
            {
                MessageBox.Show("No has seleccionado ningun item");
                return;
            }

            String rutaArchivo = lsvFicheros.SelectedItems[0].Tag.ToString();
            String extension = Path.GetExtension(rutaArchivo);

            if (extension.Equals(".txt", StringComparison.OrdinalIgnoreCase))
            {
                try
                {
                    String contenidoFichero = File.ReadAllText(rutaArchivo);
                    BlocDeNotas bloc = new BlocDeNotas(contenidoFichero, rutaArchivo);
                    bloc.ShowDialog();
                    cargarContenidoNodo(trvArchivos.SelectedNode);

                }
                catch (Exception ex)
                {
                    MessageBox.Show("No se pudo abrir el archivo: "+ ex.Message,"Error",MessageBoxButtons.OK,MessageBoxIcon.Error);
                }
            }
        }

        private void strBtnIconosGrandes_Click(object sender, EventArgs e)
        {
            lsvFicheros.View = View.LargeIcon;
        }

        private void strBtnDetalles_Click(object sender, EventArgs e)
        {
            lsvFicheros.View = View.Details;
        }

        private void strBtnIconosPequeños_Click(object sender, EventArgs e)
        {
            lsvFicheros.View = View.SmallIcon;
        }

        private void strBtnLista_Click(object sender, EventArgs e)
        {
            lsvFicheros.View = View.List;
        }

        private void strBtnMosaico_Click(object sender, EventArgs e)
        {
            lsvFicheros.View = View.Tile;
        }

        private void strBtnCarpeta_Click(object sender, EventArgs e)
        {
            if (trvArchivos.SelectedNode == null)
            {
                MessageBox.Show("Selecciona primero una unidad o carpeta en el árbol izquierdo.", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            Nuevo_Carpeta_Archivo carpeta = new Nuevo_Carpeta_Archivo(false, true, trvArchivos.SelectedNode.Tag.ToString());
            carpeta.ShowDialog();
            cargarContenidoNodo(trvArchivos.SelectedNode);
        }

        private void strBtnFichero_Click(object sender, EventArgs e)
        {
            if (trvArchivos.SelectedNode == null)
            {
                MessageBox.Show("Selecciona primero una unidad o carpeta en el árbol izquierdo.", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            Nuevo_Carpeta_Archivo fichero = new Nuevo_Carpeta_Archivo(true, false, trvArchivos.SelectedNode.Tag.ToString());
            fichero.ShowDialog();
            cargarContenidoNodo(trvArchivos.SelectedNode);
        }
    }
}
