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
        private Label lblReloj;


        public FrmPadre()
        {
            InitializeComponent();
            ConfigurarReloj();

            //Instanciacion del formulario alta
            fAlta = new FrmAlta();
            fAlta.MdiParent = this;
            fAlta.WindowState = FormWindowState.Maximized;

            //Instanciacion del formulario consulta
            fConsulta = new FrmConsulta();
            fConsulta.MdiParent = this;
            fConsulta.WindowState = FormWindowState.Maximized;

            //Lista libros predeterminados
            listaLibros.Add(new Libro("Don Quijote", "Miguel de Cervantes", "Juan de la Cuesta", false, new Bitmap("..\\..\\..\\Imagenes\\DonQuijote.jpg")));
            listaLibros.Add(new Libro("Lazarillo de Tormes", "Anónimo", "Cátedra", true, new Bitmap("..\\..\\..\\Imagenes\\Lazarillo de tormes.jpg")));

        }
        /**
         * Método que configura el reloj mediante un label y un objeto timer, 
         * configurandolo con la hora actual y con un delay de 1 segundo
         */
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

        /**
         * Método asignado al evento click del menu strip alta,
         * el cual muestra el formulario alta
         */
        private void MStrAlta_Click(object sender, EventArgs e)
        {
            if (!fAlta.IsDisposed)
            {
                fAlta.Visible = true;
            }
            else
            {
                fAlta = new FrmAlta();
                fAlta.MdiParent = this;
                fAlta.Show();
                fAlta.WindowState = FormWindowState.Maximized;
            }
            if (fConsulta.Visible)
                fConsulta.Visible = false;
        }

        /**
         * Método asignado al evento click del menu strip consulta,
         * el cual muestra el formulario consulta
         */
        private void MStrConsulta_Click(object sender, EventArgs e)
        {
            if (!fConsulta.IsDisposed)
            {
                fConsulta.Visible = true;
            }
            else
            {
                fConsulta = new FrmConsulta();
                fConsulta.MdiParent = this;
                fConsulta.Show();
                fConsulta.WindowState = FormWindowState.Maximized;
            }

            if (fAlta.Visible)
                fAlta.Visible = false;
        }

        /**
         * Método asignado al evento click del menu strip salir,
         * el cual cierra el programa con verificación previa
         */
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
