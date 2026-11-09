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

        private void trvArchivos_AfterSelect(object sender, TreeViewEventArgs e)
        {
            TreeNode nodoSeleccionado = e.Node;
            if (nodoSeleccionado.Tag == null)
            {
                return;
            }
            lsvFicheros.Items.Clear();
            String unidad = trvArchivos.SelectedNode.Tag.ToString();
            if (Path.GetExtension(unidad).Equals(".txt"))
            {
                String contenidoTxt = File.ReadAllText(unidad);
            }else if (Directory.Exists(unidad))
            {
                String[] directorios = Directory.GetDirectories(unidad);
                nodoSeleccionado.Nodes.Clear();

                foreach (String directorio in directorios)
                {
                    TreeNode nodo = trvArchivos.SelectedNode.Nodes.Add(directorio);
                    nodo.Tag = directorio;
                    nodo.Text = Path.GetFileName(directorio);

                }

                String[] ficheros = Directory.GetFiles(unidad);
                foreach (String fichero in ficheros)
                {
                    if (Path.GetExtension(fichero).Equals(".txt")){
                        ListViewItem lvi = lsvFicheros.Items.Add(Path.GetFileName(fichero), 0);
                        lvi.Tag = fichero;
                        lvi.SubItems.Add(File.GetCreationTime(fichero).ToString());
                        lvi.SubItems.Add(File.GetLastWriteTime(fichero).ToString());
                        lvi.SubItems.Add(File.GetLastAccessTime(fichero).ToString());
                    }
                    else
                    {
                        ListViewItem lvi = lsvFicheros.Items.Add(Path.GetFileName(fichero),1);
                        lvi.Tag = fichero;
                        lvi.SubItems.Add(File.GetCreationTime(fichero).ToString());
                        lvi.SubItems.Add(File.GetLastWriteTime(fichero).ToString());
                        lvi.SubItems.Add(File.GetLastAccessTime(fichero).ToString());
                    }
                }
            }
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
            String unidad = Path.GetExtension(rutaArchivo);
            if (Path.GetExtension(unidad).Equals(".txt"))
            {
                String contenidoTxt = File.ReadAllText(rutaArchivo);
                BlocDeNotas bloc = new BlocDeNotas(contenidoTxt, rutaArchivo);
                bloc.ShowDialog();
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
            Nuevo_Carpeta_Archivo carpeta = new Nuevo_Carpeta_Archivo(false, true, trvArchivos.SelectedNode.Tag.ToString());
            carpeta.ShowDialog();
        }

        private void strBtnFichero_Click(object sender, EventArgs e)
        {
            Nuevo_Carpeta_Archivo fichero = new Nuevo_Carpeta_Archivo(true, false, trvArchivos.SelectedNode.Tag.ToString());
            fichero.ShowDialog();
        }
    }
}
