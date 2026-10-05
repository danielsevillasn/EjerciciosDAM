using System.Collections;
using System.Windows.Forms;

namespace BibliotecaMdi
{
    public partial class FrmPadre : Form
    {
        FrmAlta fAlta;
        FrmConsulta fConsulta;
        public static List<Libro> listaLibros = new List<Libro>();
        private System.Windows.Forms.Timer relojTimer; 
        private Label lblReloj;   // Añadir etiqueta para el reloj


        public FrmPadre()
        {
            InitializeComponent();
            ConfigurarReloj();
            fAlta = new FrmAlta();
            fConsulta = new FrmConsulta();
            fAlta.MdiParent = this;
            fConsulta.MdiParent = this;
            listaLibros.Add(new Libro("Don Quijote", "Miguel de Cervantes", "Juan de la Cuesta", false, new Bitmap("..\\..\\..\\Imagenes\\DonQuijote.jpg")));
            listaLibros.Add(new Libro("Lazarillo de Tormes", "Anónimo", "Cátedra", true, new Bitmap("..\\..\\..\\Imagenes\\Lazarillo de tormes.jpg")));

        }
        private void ConfigurarReloj()
        {
            lblReloj = new Label();
            lblReloj.Dock = DockStyle.Bottom;
            lblReloj.TextAlign = ContentAlignment.BottomRight;
            lblReloj.Font = new Font("Arial", 12, FontStyle.Bold);
            this.Controls.Add(lblReloj);

            relojTimer = new System.Windows.Forms.Timer(); 
            relojTimer.Interval = 1000; // Actualizar cada segundo
            relojTimer.Tick += (s, e) => { lblReloj.Text = "Hora Actual: " + DateTime.Now.ToString("HH:mm:ss"); };
            relojTimer.Start();
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

        private void MStrSalir_Click(object sender, EventArgs e)
        {
            string mensaje = "¿Deseas cerrar el programa?";
            string título = "Salir del programa";
            DialogResult result;

            result = MessageBox.Show(mensaje, título, MessageBoxButtons.YesNo, MessageBoxIcon.Information);
            if (result == System.Windows.Forms.DialogResult.Yes)
            {
                Application.Exit();
            }
        }
    }
}
