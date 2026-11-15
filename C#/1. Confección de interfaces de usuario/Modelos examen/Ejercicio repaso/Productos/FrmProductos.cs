using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Productos
{
    public partial class FrmProductos : Form
    {
        private SortedList<int, Producto> productos;
        public FrmProductos()
        {
            InitializeComponent();
        }

        private void FrmProductos_Load(object sender, EventArgs e)
        {
            productos = new SortedList<int, Producto>();
            lecturaFicheroProductos();

            foreach (Producto producto in productos.Values)
            {
                if (!lbCategorias.Items.Contains(producto.Categoria))
                {
                    lbCategorias.Items.Add(producto.Categoria);
                }
            }
            limpiarContenido();
        }

        private void lecturaFicheroProductos()
        {
            string[] lineas = File.ReadAllLines("Productos.txt", Encoding.Default);
            foreach (string linea in lineas)
            {
                if (string.IsNullOrEmpty(linea))
                {
                    continue;
                }
                String[] partesProducto = linea.Split(';');
                if (partesProducto.Length >= 4)
                {
                    try
                    {
                        int id = int.Parse(partesProducto[0].Trim());
                        string nombre = partesProducto[1].Trim();
                        int stock = int.Parse(partesProducto[2].Trim());
                        string categoria = partesProducto[3].Trim();
                        Producto producto = new Producto(id, nombre, stock, categoria);
                        if (productos.ContainsKey(id))
                        {
                            productos[id] = producto;
                        }
                        else
                        {
                            productos.Add(id, producto);
                        }
                    }
                    catch (FormatException)
                    {
                        Console.WriteLine("El texto ingresado no es un número válido.");
                    }
                    catch (OverflowException)
                    {
                        Console.WriteLine("El número es demasiado grande o muy pequeño.");
                    }
                    catch (ArgumentNullException)
                    {
                        Console.WriteLine("El valor no puede ser nulo.");
                    }
                }
            }
        }

        private void cargarContenido(object sender, EventArgs e)
        {
            string categoriaSeleccionada = lbCategorias.SelectedItem.ToString();
            if (string.IsNullOrWhiteSpace(categoriaSeleccionada))
            {
                return;
            }
            limpiarContenido();

            foreach (Producto producto in productos.Values)
            {
                if (producto.Categoria.Equals(categoriaSeleccionada, StringComparison.OrdinalIgnoreCase))
                {
                    ListViewItem item = lvProductos.Items.Add(producto.Id.ToString());
                    item.SubItems.Add(producto.Nombre);
                    item.SubItems.Add(producto.Stock.ToString());
                    item.SubItems.Add(producto.Categoria);
                }

            }
        }

        private void limpiarContenido()
        {
            lvProductos.Items.Clear();
        }

        private void FrmProductos_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }
    }
}
