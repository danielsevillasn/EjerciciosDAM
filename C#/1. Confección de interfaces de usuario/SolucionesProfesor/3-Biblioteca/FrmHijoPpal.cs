using System;
using System.Windows.Forms;

namespace Biblioteca
{
    public partial class FrmHijoPpal : Form
    {
        /* Objeto. */
        // Constructores.
        /*
         * Constructor vacío.
         * 
         */
        public FrmHijoPpal()
        {
            InitializeComponent();
        }

        // Métodos.
        private void Tiempo_Tick(object sender, EventArgs e)
        {
            StaTrpHoraLbl.Text = "Hora actual: " + DateTime.Now.ToString("hh:mm:ss");
        }
    }
}