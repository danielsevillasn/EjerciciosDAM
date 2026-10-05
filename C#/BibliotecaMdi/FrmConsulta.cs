using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BibliotecaMdi
{
    public partial class FrmConsulta : Form
    {
        public FrmConsulta()
        {
            InitializeComponent();
        }

        private void rdBtnEditorial_CheckedChanged(object sender, EventArgs e)
        {
            if (FrmPadre.listaLibros == null)
            {
                ltBoxTitulos.Items.Clear();
            }
            else
            {
                ltBoxTitulos.Items.Clear();
                ltBoxAutorEditorial.Items.Clear(); ;
                foreach (Libro l in FrmPadre.listaLibros)
                {
                    ltBoxTitulos.Items.Add(l.Titulo);
                    if (rdBtnAutor.Checked)
                    {
                        ltBoxAutorEditorial.Items.Add(l.Autor);
                    }
                    if (rdBtnEditorial.Checked)
                    {
                        ltBoxAutorEditorial.Items.Add(l.Editorial);
                    }
                }
            }
        }
    }
}
