namespace ModeloExamenA
{
    partial class FrmPadre
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
            this.components = new System.ComponentModel.Container();
            this.MstrPrincipal = new System.Windows.Forms.MenuStrip();
            this.MnuAlta = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuConsultaList = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuConsultaTree = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuArchivos = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuExportar = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuImportar = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuSalir = new System.Windows.Forms.ToolStripMenuItem();
            this.lblReloj = new System.Windows.Forms.ToolStripLabel();
            this.relojTimer = new System.Windows.Forms.Timer(this.components);
            this.MstrPrincipal.SuspendLayout();
            this.SuspendLayout();
            // 
            // MstrPrincipal
            // 
            this.MstrPrincipal.ImageScalingSize = new System.Drawing.Size(20, 20);
            this.MstrPrincipal.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.MnuAlta,
            this.MnuConsultaList,
            this.MnuConsultaTree,
            this.MnuArchivos,
            this.MnuSalir,
            this.lblReloj});
            this.MstrPrincipal.Location = new System.Drawing.Point(0, 0);
            this.MstrPrincipal.Name = "MstrPrincipal";
            this.MstrPrincipal.Padding = new System.Windows.Forms.Padding(4, 1, 0, 1);
            this.MstrPrincipal.Size = new System.Drawing.Size(663, 24);
            this.MstrPrincipal.TabIndex = 0;
            this.MstrPrincipal.Text = "menuStripPrincipal";
            // 
            // MnuAlta
            // 
            this.MnuAlta.Name = "MnuAlta";
            this.MnuAlta.Size = new System.Drawing.Size(104, 22);
            this.MnuAlta.Text = "Alta de Vehículo";
            this.MnuAlta.Click += new System.EventHandler(this.MnuAlta_Click);
            // 
            // MnuConsultaList
            // 
            this.MnuConsultaList.Name = "MnuConsultaList";
            this.MnuConsultaList.Size = new System.Drawing.Size(109, 22);
            this.MnuConsultaList.Text = "Consulta en Lista";
            this.MnuConsultaList.Click += new System.EventHandler(this.MnuConsultaList_Click);
            // 
            // MnuConsultaTree
            // 
            this.MnuConsultaTree.Name = "MnuConsultaTree";
            this.MnuConsultaTree.Size = new System.Drawing.Size(114, 22);
            this.MnuConsultaTree.Text = "Consulta en Árbol";
            this.MnuConsultaTree.Click += new System.EventHandler(this.MnuConsultaTree_Click);
            // 
            // MnuArchivos
            // 
            this.MnuArchivos.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.MnuExportar,
            this.MnuImportar});
            this.MnuArchivos.Name = "MnuArchivos";
            this.MnuArchivos.Size = new System.Drawing.Size(86, 22);
            this.MnuArchivos.Text = "Ficheros (IO)";
            // 
            // MnuExportar
            // 
            this.MnuExportar.Name = "MnuExportar";
            this.MnuExportar.Size = new System.Drawing.Size(192, 22);
            this.MnuExportar.Text = "Exportar datos a TXT";
            this.MnuExportar.Click += new System.EventHandler(this.MnuExportar_Click);
            // 
            // MnuImportar
            // 
            this.MnuImportar.Name = "MnuImportar";
            this.MnuImportar.Size = new System.Drawing.Size(192, 22);
            this.MnuImportar.Text = "Importar datos de TXT";
            this.MnuImportar.Click += new System.EventHandler(this.MnuImportar_Click);
            // 
            // MnuSalir
            // 
            this.MnuSalir.Name = "MnuSalir";
            this.MnuSalir.Size = new System.Drawing.Size(41, 22);
            this.MnuSalir.Text = "Salir";
            this.MnuSalir.Click += new System.EventHandler(this.MnuSalir_Click);
            // 
            // lblReloj
            // 
            this.lblReloj.Font = new System.Drawing.Font("Segoe UI", 9F, System.Drawing.FontStyle.Bold);
            this.lblReloj.Name = "lblReloj";
            this.lblReloj.Size = new System.Drawing.Size(88, 17);
            this.lblReloj.Text = "Hora: 00:00:00";
            this.lblReloj.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // relojTimer
            // 
            this.relojTimer.Interval = 1000;
            this.relojTimer.Tick += new System.EventHandler(this.relojTimer_Tick);
            // 
            // FrmPadre
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(663, 365);
            this.Controls.Add(this.MstrPrincipal);
            this.MainMenuStrip = this.MstrPrincipal;
            this.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.Name = "FrmPadre";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Gestión de Vehículos - Modelo A (Formulario Base)";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.FrmPadre_FormClosing);
            this.Load += new System.EventHandler(this.FrmPadre_Load);
            this.MstrPrincipal.ResumeLayout(false);
            this.MstrPrincipal.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        protected System.Windows.Forms.MenuStrip MstrPrincipal;
        protected System.Windows.Forms.ToolStripMenuItem MnuAlta;
        protected System.Windows.Forms.ToolStripMenuItem MnuConsultaList;
        protected System.Windows.Forms.ToolStripMenuItem MnuConsultaTree;
        protected System.Windows.Forms.ToolStripMenuItem MnuArchivos;
        protected System.Windows.Forms.ToolStripMenuItem MnuExportar;
        protected System.Windows.Forms.ToolStripMenuItem MnuImportar;
        protected System.Windows.Forms.ToolStripMenuItem MnuSalir;
        protected System.Windows.Forms.ToolStripLabel lblReloj;
        protected System.Windows.Forms.Timer relojTimer;
    }
}
