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
                    ListViewItem lvi = lsvFicheros.Items.Add(Path.GetFileName(fichero));
                    lvi.Tag = fichero;
                    lvi.SubItems.Add(File.GetCreationTime(fichero).ToString());
                    lvi.SubItems.Add(File.GetLastWriteTime(fichero).ToString());
                    lvi.SubItems.Add(File.GetLastAccessTime(fichero).ToString());
                }
            }
        }

        private void Explorador_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }

        private void lsvFicheros_DoubleClick(object sender, EventArgs e)
        {
            if (lsvFicheros.SelectedItems == null)
            {
                MessageBox.Show("No has seleccionado ningun item");
                return;
            }
            String unidad = Path.GetExtension(lsvFicheros.SelectedItems[0].Tag.ToString());
            if (Path.GetExtension(unidad).Equals(".txt"))
            {
                String contenidoTxt = File.ReadAllText(lsvFicheros.SelectedItems[0].Tag.ToString());
                BlocDeNotas bloc = new BlocDeNotas(contenidoTxt);
                bloc.ShowDialog();
            }
        }
    }
}
