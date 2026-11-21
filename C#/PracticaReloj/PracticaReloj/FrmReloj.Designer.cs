namespace PracticaReloj
{
    partial class FrmReloj
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
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.mstrPaís = new System.Windows.Forms.ToolStripMenuItem();
            this.mstrAñadir = new System.Windows.Forms.ToolStripMenuItem();
            this.mstrBorrar = new System.Windows.Forms.ToolStripMenuItem();
            this.lblHoraActual = new System.Windows.Forms.Label();
            this.txtBoxHoraActual = new System.Windows.Forms.TextBox();
            this.txtBoxHoraPaís = new System.Windows.Forms.TextBox();
            this.lblHoraPaís = new System.Windows.Forms.Label();
            this.timerEspaña = new System.Windows.Forms.Timer(this.components);
            this.mstrSeparador = new System.Windows.Forms.ToolStripSeparator();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.mstrPaís});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(522, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // mstrPaís
            // 
            this.mstrPaís.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.mstrAñadir,
            this.mstrBorrar,
            this.mstrSeparador});
            this.mstrPaís.Name = "mstrPaís";
            this.mstrPaís.Size = new System.Drawing.Size(40, 20);
            this.mstrPaís.Text = "País";
            // 
            // mstrAñadir
            // 
            this.mstrAñadir.Name = "mstrAñadir";
            this.mstrAñadir.Size = new System.Drawing.Size(180, 22);
            this.mstrAñadir.Text = "Añadir";
            this.mstrAñadir.Click += new System.EventHandler(this.mstrAñadir_Click);
            // 
            // mstrBorrar
            // 
            this.mstrBorrar.Name = "mstrBorrar";
            this.mstrBorrar.Size = new System.Drawing.Size(180, 22);
            this.mstrBorrar.Text = "Borrar";
            this.mstrBorrar.Click += new System.EventHandler(this.mstrBorrar_Click);
            // 
            // lblHoraActual
            // 
            this.lblHoraActual.AutoSize = true;
            this.lblHoraActual.Location = new System.Drawing.Point(245, 55);
            this.lblHoraActual.Name = "lblHoraActual";
            this.lblHoraActual.Size = new System.Drawing.Size(33, 13);
            this.lblHoraActual.TabIndex = 1;
            this.lblHoraActual.Text = "Hora:";
            // 
            // txtBoxHoraActual
            // 
            this.txtBoxHoraActual.Font = new System.Drawing.Font("Agency FB", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtBoxHoraActual.Location = new System.Drawing.Point(186, 71);
            this.txtBoxHoraActual.Name = "txtBoxHoraActual";
            this.txtBoxHoraActual.Size = new System.Drawing.Size(150, 27);
            this.txtBoxHoraActual.TabIndex = 2;
            this.txtBoxHoraActual.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtBoxHoraPaís
            // 
            this.txtBoxHoraPaís.Font = new System.Drawing.Font("Agency FB", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtBoxHoraPaís.Location = new System.Drawing.Point(186, 178);
            this.txtBoxHoraPaís.Name = "txtBoxHoraPaís";
            this.txtBoxHoraPaís.Size = new System.Drawing.Size(150, 27);
            this.txtBoxHoraPaís.TabIndex = 3;
            this.txtBoxHoraPaís.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // lblHoraPaís
            // 
            this.lblHoraPaís.AutoSize = true;
            this.lblHoraPaís.Location = new System.Drawing.Point(237, 162);
            this.lblHoraPaís.Name = "lblHoraPaís";
            this.lblHoraPaís.Size = new System.Drawing.Size(48, 13);
            this.lblHoraPaís.TabIndex = 4;
            this.lblHoraPaís.Text = "Hora en:";
            // 
            // timerEspaña
            // 
            this.timerEspaña.Tick += new System.EventHandler(this.timerEspaña_Tick);
            // 
            // mstrSeparador
            // 
            this.mstrSeparador.Name = "mstrSeparador";
            this.mstrSeparador.Size = new System.Drawing.Size(177, 6);
            // 
            // FrmReloj
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(522, 302);
            this.Controls.Add(this.lblHoraPaís);
            this.Controls.Add(this.txtBoxHoraPaís);
            this.Controls.Add(this.txtBoxHoraActual);
            this.Controls.Add(this.lblHoraActual);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "FrmReloj";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "FrmReloj";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem mstrPaís;
        private System.Windows.Forms.ToolStripMenuItem mstrAñadir;
        private System.Windows.Forms.ToolStripMenuItem mstrBorrar;
        private System.Windows.Forms.Label lblHoraActual;
        private System.Windows.Forms.TextBox txtBoxHoraActual;
        private System.Windows.Forms.TextBox txtBoxHoraPaís;
        private System.Windows.Forms.Label lblHoraPaís;
        private System.Windows.Forms.Timer timerEspaña;
        private System.Windows.Forms.ToolStripSeparator mstrSeparador;
    }
}

