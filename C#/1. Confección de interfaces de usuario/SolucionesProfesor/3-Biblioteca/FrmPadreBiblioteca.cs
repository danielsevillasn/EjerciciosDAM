using System;
using System.Collections;
using System.Windows.Forms;

namespace Biblioteca
{
    public partial class FrmPadreBiblioteca : Form
    {
        /* Objeto. */
        // Atributos.
        private ArrayList AlLibros;

        // Constructores.
        /**
         * Constructor vacío.
         * 
         */
        public FrmPadreBiblioteca()
        {
            InitializeComponent();
            AlLibros = new ArrayList();
            // InicializacionDinamicaLibros();
        }

        // Métodos.
        /*private void InicializacionDinamicaLibros()
        {
            AlLibros.Add(new Libro("La comunidad del anillo", "J. R. R. Tolkien", "Minotauro",
                "C:\\Users\\aaesa\\Downloads\\descarga.jpg", true));
            AlLibros.Add(new Libro("Las dos torres", "J. R. R. Tolkien", "Minotauro",
                "C:\\Users\\aaesa\\Downloads\\descarga1.jpg", true));
            AlLibros.Add(new Libro("El retorno del rey", "J. R. R. Tolkien", "Minotauro",
                "C:\\Users\\aaesa\\Downloads\\descarga2.jpg", true));
            AlLibros.Add(new Libro("Harry Potter y la piedra filosofal", "J. K. Rowling", "Salamandra",
                "C:\\Users\\aaesa\\Downloads\\descarga3.jpg", true));
            AlLibros.Add(new Libro("Harry Potter y la cámara de los secretos", "J. K. Rowling", "Salamandra",
                "C:\\Users\\aaesa\\Downloads\\descarga4.jpg", true));
        }*/

        private void FrmPadreBiblioteca_Load(object sender, EventArgs e)
        {
            FrmHijoPpal frmHijoPpal = new FrmHijoPpal();
            frmHijoPpal.MdiParent = this;
            frmHijoPpal.Dock = DockStyle.Fill;
            frmHijoPpal.Show();
        }

        private void MnuFicheroAlta_Click(object sender, EventArgs e)
        {
            FrmHijoAlta frmHijoAlta = null;

            for (int cont = 0; cont < MdiChildren.Length; cont++)
            {
                if (!MdiChildren[cont].Name.Equals("FrmHijoAlta"))
                {
                    MdiChildren[cont].Close();
                } else
                {
                    frmHijoAlta = (FrmHijoAlta)MdiChildren[cont];
                }
            }

            if (frmHijoAlta == null)
            {
                frmHijoAlta = new FrmHijoAlta(AlLibros);
                frmHijoAlta.MdiParent = this;
                frmHijoAlta.Dock = DockStyle.Fill;
            }

            frmHijoAlta.Limpiar();
            frmHijoAlta.Show();

            Text = "Alta de libros";
        }

        private void MnuFicheroConsulta_Click(object sender, EventArgs e)
        {
            FrmHijoConsulta frmHijoConsulta = null;

            for (int cont = 0; cont < MdiChildren.Length; cont++)
            {
                if (!MdiChildren[cont].Name.Equals("FrmHijoConsulta"))
                {
                    MdiChildren[cont].Close();
                }
                else
                {
                    frmHijoConsulta = (FrmHijoConsulta)MdiChildren[cont];
                }
            }

            if (frmHijoConsulta == null)
            {
                frmHijoConsulta = new FrmHijoConsulta(AlLibros);
                frmHijoConsulta.MdiParent = this;
                frmHijoConsulta.Dock = DockStyle.Fill;
            }

            frmHijoConsulta.Limpiar();
            frmHijoConsulta.Show();

            Text = "Consulta de libros";
        }

        private void FrmPadreBiblioteca_FormClosing(object sender, FormClosingEventArgs e)
        {
            DialogResult resultado = MessageBox.Show("¿Desea salir?", "Confirmación",
                MessageBoxButtons.YesNo, MessageBoxIcon.Information);

            if (resultado.Equals(DialogResult.No))
            {
                if (e != null)
                {
                    e.Cancel = true;
                }
            } else
            {
                Environment.Exit(0);
            }
        }

        private void SalirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FrmPadreBiblioteca_FormClosing(null, null);
        }
    }
}