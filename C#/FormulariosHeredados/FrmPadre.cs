namespace FormulariosHeredados
{
    public partial class FrmPadre : Form
    {
        FrmAlta frmAlta;
        FrmConsultaList frmConsultaList;
        FrmConsultaTree frmConsultaTree;

        public FrmPadre()
        {
            InitializeComponent();
        }

        public void MstrAlta_Click(object sender, EventArgs e)
        {
            Hide();
            if (frmAlta == null || !frmAlta.IsDisposed)
            {
                frmAlta = new FrmAlta();
                frmAlta.WindowState = FormWindowState.Normal;
                frmAlta.Show();
            }
            if((frmConsultaList != null && frmConsultaTree != null))
            {
                 if (frmConsultaList.Visible || frmConsultaTree.Visible)
                {
                    frmConsultaList.Visible = false;
                    frmConsultaTree.Visible = false;
                }
            }

        }

        private void MstrConsultaList_Click(object sender, EventArgs e)
        {
            Hide();
            if (frmConsultaList == null || !frmConsultaList.IsDisposed)
            {
                frmConsultaList = new FrmConsultaList();
                frmConsultaList.WindowState = FormWindowState.Normal;
                frmConsultaList.Show();
            }
            if ((frmAlta != null && frmConsultaTree != null))
            {
                if (frmAlta.Visible || frmConsultaTree.Visible)
                {
                    frmAlta.Visible = false;
                    frmConsultaTree.Visible = false;
                }
            }
        }

        private void MstrConsultaTree_Click(object sender, EventArgs e)
        {
            Hide();
            if (frmAlta == null || !frmAlta.IsDisposed)
            {
                frmAlta = new FrmAlta();
                frmAlta.WindowState = FormWindowState.Normal;
                frmAlta.Show();
            }
            if ((frmConsultaList != null && frmConsultaTree != null))
            {
                if (frmConsultaList.Visible || frmConsultaTree.Visible)
                {
                    frmConsultaList.Visible = false;
                    frmConsultaTree.Visible = false;
                }
            }
        }

        private void MstrSalir_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
