namespace Biblioteca
{
    partial class FrmPadreBiblioteca
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.Mnu = new System.Windows.Forms.MenuStrip();
            this.MnuFichero = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuFicheroAlta = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuFicheroConsulta = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.MnuFicheroSalir = new System.Windows.Forms.ToolStripMenuItem();
            this.Mnu.SuspendLayout();
            this.SuspendLayout();
            // 
            // Mnu
            // 
            this.Mnu.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.MnuFichero});
            this.Mnu.Location = new System.Drawing.Point(0, 0);
            this.Mnu.Name = "Mnu";
            this.Mnu.Size = new System.Drawing.Size(800, 24);
            this.Mnu.TabIndex = 0;
            // 
            // MnuFichero
            // 
            this.MnuFichero.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.MnuFicheroAlta,
            this.MnuFicheroConsulta,
            this.toolStripSeparator1,
            this.MnuFicheroSalir});
            this.MnuFichero.Name = "MnuFichero";
            this.MnuFichero.Size = new System.Drawing.Size(58, 20);
            this.MnuFichero.Text = "Fichero";
            // 
            // MnuFicheroAlta
            // 
            this.MnuFicheroAlta.Name = "MnuFicheroAlta";
            this.MnuFicheroAlta.Size = new System.Drawing.Size(180, 22);
            this.MnuFicheroAlta.Text = "Alta";
            this.MnuFicheroAlta.Click += new System.EventHandler(this.MnuFicheroAlta_Click);
            // 
            // MnuFicheroConsulta
            // 
            this.MnuFicheroConsulta.Name = "MnuFicheroConsulta";
            this.MnuFicheroConsulta.Size = new System.Drawing.Size(180, 22);
            this.MnuFicheroConsulta.Text = "Consulta";
            this.MnuFicheroConsulta.Click += new System.EventHandler(this.MnuFicheroConsulta_Click);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(177, 6);
            // 
            // MnuFicheroSalir
            // 
            this.MnuFicheroSalir.Name = "MnuFicheroSalir";
            this.MnuFicheroSalir.Size = new System.Drawing.Size(180, 22);
            this.MnuFicheroSalir.Text = "Salir";
            this.MnuFicheroSalir.Click += new System.EventHandler(this.SalirToolStripMenuItem_Click);
            // 
            // FrmPadreBiblioteca
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.Mnu);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.IsMdiContainer = true;
            this.MainMenuStrip = this.Mnu;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "FrmPadreBiblioteca";
            this.Text = "Gestión Biblioteca";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.FrmPadreBiblioteca_FormClosing);
            this.Load += new System.EventHandler(this.FrmPadreBiblioteca_Load);
            this.Mnu.ResumeLayout(false);
            this.Mnu.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip Mnu;
        private System.Windows.Forms.ToolStripMenuItem MnuFichero;
        private System.Windows.Forms.ToolStripMenuItem MnuFicheroAlta;
        private System.Windows.Forms.ToolStripMenuItem MnuFicheroConsulta;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripMenuItem MnuFicheroSalir;
    }
}

