namespace FormulariosHeredados
{
    partial class FrmPadre
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            MstrPrincipal = new MenuStrip();
            MstrAlta = new ToolStripMenuItem();
            MstrConsultaList = new ToolStripMenuItem();
            MstrConsultaTree = new ToolStripMenuItem();
            MstrSalir = new ToolStripMenuItem();
            MstrPrincipal.SuspendLayout();
            SuspendLayout();
            // 
            // MstrPrincipal
            // 
            MstrPrincipal.Items.AddRange(new ToolStripItem[] { MstrAlta, MstrConsultaList, MstrConsultaTree, MstrSalir });
            MstrPrincipal.Location = new Point(0, 0);
            MstrPrincipal.Name = "MstrPrincipal";
            MstrPrincipal.Size = new Size(800, 24);
            MstrPrincipal.TabIndex = 0;
            MstrPrincipal.Text = "menuStrip1";
            // 
            // MstrAlta
            // 
            MstrAlta.Name = "MstrAlta";
            MstrAlta.Size = new Size(40, 20);
            MstrAlta.Text = "Alta";
            MstrAlta.Click += MstrAlta_Click;
            // 
            // MstrConsultaList
            // 
            MstrConsultaList.Name = "MstrConsultaList";
            MstrConsultaList.Size = new Size(87, 20);
            MstrConsultaList.Text = "Consulta List";
            MstrConsultaList.Click += MstrConsultaList_Click;
            // 
            // MstrConsultaTree
            // 
            MstrConsultaTree.Name = "MstrConsultaTree";
            MstrConsultaTree.Size = new Size(91, 20);
            MstrConsultaTree.Text = "Consulta Tree";
            MstrConsultaTree.Click += MstrConsultaTree_Click;
            // 
            // MstrSalir
            // 
            MstrSalir.Name = "MstrSalir";
            MstrSalir.Size = new Size(41, 20);
            MstrSalir.Text = "Salir";
            MstrSalir.Click += MstrSalir_Click;
            // 
            // FrmPadre
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(MstrPrincipal);
            MainMenuStrip = MstrPrincipal;
            Name = "FrmPadre";
            Text = "FrmPadre";
            MstrPrincipal.ResumeLayout(false);
            MstrPrincipal.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private MenuStrip MstrPrincipal;
        private ToolStripMenuItem MstrAlta;
        private ToolStripMenuItem MstrConsultaList;
        private ToolStripMenuItem MstrConsultaTree;
        private ToolStripMenuItem MstrSalir;
    }
}
