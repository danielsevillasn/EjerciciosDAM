using System.Collections;

namespace BibliotecaMdi
{
    public partial class FrmPadre : Form
    {
        FrmAlta fAlta;
        FrmConsulta fConsulta;
        public static List<Libro> listaLibros = new List<Libro>();


        public FrmPadre()
        {
            InitializeComponent();
            fAlta = new FrmAlta();
            fConsulta = new FrmConsulta();
            fAlta.MdiParent = this;
            fConsulta.MdiParent = this;
            listaLibros.Add(new Libro("Don Quijote", "Miguel de Cervantes", "Juan de la Cuesta", false, new Bitmap("Z:\\BibliotecaMdi\\Imagenes\\DonQuijote.jpg")));
            listaLibros.Add(new Libro("Lazarillo de Tormes", "Anónimo", "Cátedra", true, new Bitmap("Z:\\BibliotecaMdi\\Imagenes\\Lazarillo de tormes.jpg")));

        }

        private void MStrAlta_Click(object sender, EventArgs e)
        {
            fAlta.WindowState = FormWindowState.Maximized;
            fAlta.Visible = true;
            if (fConsulta.Visible)
                fConsulta.Visible = false;
        }

        private void MStrConsulta_Click(object sender, EventArgs e)
        {
            fConsulta.WindowState = FormWindowState.Maximized;
            fConsulta.Visible = true;
            if (fAlta.Visible)
                fAlta.Visible = false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            foreach (Form f in MdiChildren)
            {
                MessageBox.Show(f.GetType().ToString());
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.TileVertical);
        }

        private void MStrSalir_Click(object sender, EventArgs e)
        {
            string mensaje = "¿Deseas cerrar el programa?";
            string título = "Salir del programa";
            DialogResult result;

            result = MessageBox.Show(mensaje, título, MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (result == System.Windows.Forms.DialogResult.Yes)
            {
                Application.Exit();
            }
        }
    }
}
