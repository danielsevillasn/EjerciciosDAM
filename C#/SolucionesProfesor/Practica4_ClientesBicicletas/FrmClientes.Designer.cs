namespace Practica4_ClientesBicicletas
{
    partial class FrmClientes
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
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.MnuAlta = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuConsultaList = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuConsultaTree = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuSalir = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.MnuAlta,
            this.MnuConsultaList,
            this.MnuConsultaTree,
            this.MnuSalir});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 24);
            this.menuStrip1.TabIndex = 1;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // MnuAlta
            // 
            this.MnuAlta.Name = "MnuAlta";
            this.MnuAlta.Size = new System.Drawing.Size(40, 20);
            this.MnuAlta.Text = "Alta";
            this.MnuAlta.Click += new System.EventHandler(this.MnuAlta_Click);
            // 
            // MnuConsultaList
            // 
            this.MnuConsultaList.Name = "MnuConsultaList";
            this.MnuConsultaList.Size = new System.Drawing.Size(84, 20);
            this.MnuConsultaList.Text = "Consulta list";
            this.MnuConsultaList.Click += new System.EventHandler(this.MnuConsultaList_Click);
            // 
            // MnuConsultaTree
            // 
            this.MnuConsultaTree.Name = "MnuConsultaTree";
            this.MnuConsultaTree.Size = new System.Drawing.Size(89, 20);
            this.MnuConsultaTree.Text = "Consulta tree";
            this.MnuConsultaTree.Click += new System.EventHandler(this.MnuConsultaTree_Click);
            // 
            // MnuSalir
            // 
            this.MnuSalir.Name = "MnuSalir";
            this.MnuSalir.Size = new System.Drawing.Size(41, 20);
            this.MnuSalir.Text = "Salir";
            this.MnuSalir.Click += new System.EventHandler(this.MnuSalir_Click);
            // 
            // FrmClientes
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "FrmClientes";
            this.Text = "Clientes";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem MnuAlta;
        private System.Windows.Forms.ToolStripMenuItem MnuConsultaList;
        private System.Windows.Forms.ToolStripMenuItem MnuConsultaTree;
        private System.Windows.Forms.ToolStripMenuItem MnuSalir;
    }
}

