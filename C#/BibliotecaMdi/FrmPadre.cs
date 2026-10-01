using FrmPadre;

namespace BibliotecaMdi
{
    public partial class FrmPadre : Form
    {
        FrmAlta fAlta;
        FrmConsulta fConsulta;
        public FrmPadre()
        {
            InitializeComponent();
            fAlta = new FrmAlta();
            fConsulta = new FrmConsulta();
            fAlta.MdiParent = this;
            fConsulta.MdiParent = this;
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
            Application.Exit();
        }
    }
}
