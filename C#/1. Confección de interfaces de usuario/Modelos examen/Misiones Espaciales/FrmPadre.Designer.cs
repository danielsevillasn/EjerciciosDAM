namespace Misiones_Espaciales
{
    partial class FrmPadre
    {
        private System.ComponentModel.IContainer components = null;

        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador

        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.misionesToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.altaMantenimientoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.consultasToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.listadoExpedicionesToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.clasificacionDestinoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.ficherosToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.guardarRespaldoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.restaurarRespaldoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuItem1 = new System.Windows.Forms.ToolStripSeparator();
            this.salirToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.statusStrip1 = new System.Windows.Forms.StatusStrip();
            this.lblTotalMisiones = new System.Windows.Forms.ToolStripStatusLabel();
            this.lblReloj = new System.Windows.Forms.ToolStripStatusLabel();
            this.timerReloj = new System.Windows.Forms.Timer(this.components);
            this.menuStrip1.SuspendLayout();
            this.statusStrip1.SuspendLayout();
            this.SuspendLayout();

            // menuStrip1
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.misionesToolStripMenuItem,
            this.consultasToolStripMenuItem,
            this.ficherosToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";

            // misionesToolStripMenuItem
            this.misionesToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.altaMantenimientoToolStripMenuItem});
            this.misionesToolStripMenuItem.Name = "misionesToolStripMenuItem";
            this.misionesToolStripMenuItem.Size = new System.Drawing.Size(59, 20);
            this.misionesToolStripMenuItem.Text = "Misiones";

            // altaMantenimientoToolStripMenuItem
            this.altaMantenimientoToolStripMenuItem.Name = "altaMantenimientoToolStripMenuItem";
            this.altaMantenimientoToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.altaMantenimientoToolStripMenuItem.Text = "Alta y Mantenimiento";
            this.altaMantenimientoToolStripMenuItem.Click += new System.EventHandler(this.altaMantenimientoToolStripMenuItem_Click);

            // consultasToolStripMenuItem
            this.consultasToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.listadoExpedicionesToolStripMenuItem,
            this.clasificacionDestinoToolStripMenuItem});
            this.consultasToolStripMenuItem.Name = "consultasToolStripMenuItem";
            this.consultasToolStripMenuItem.Size = new System.Drawing.Size(66, 20);
            this.consultasToolStripMenuItem.Text = "Consultas";

            // listadoExpedicionesToolStripMenuItem
            this.listadoExpedicionesToolStripMenuItem.Name = "listadoExpedicionesToolStripMenuItem";
            this.listadoExpedicionesToolStripMenuItem.Size = new System.Drawing.Size(220, 22);
            this.listadoExpedicionesToolStripMenuItem.Text = "Listado de Expediciones";
            this.listadoExpedicionesToolStripMenuItem.Click += new System.EventHandler(this.listadoExpedicionesToolStripMenuItem_Click);

            // clasificacionDestinoToolStripMenuItem
            this.clasificacionDestinoToolStripMenuItem.Name = "clasificacionDestinoToolStripMenuItem";
            this.clasificacionDestinoToolStripMenuItem.Size = new System.Drawing.Size(220, 22);
            this.clasificacionDestinoToolStripMenuItem.Text = "Clasificación por Destino";
            this.clasificacionDestinoToolStripMenuItem.Click += new System.EventHandler(this.clasificacionDestinoToolStripMenuItem_Click);

            // ficherosToolStripMenuItem
            this.ficherosToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.guardarRespaldoToolStripMenuItem,
            this.restaurarRespaldoToolStripMenuItem,
            this.toolStripMenuItem1,
            this.salirToolStripMenuItem});
            this.ficherosToolStripMenuItem.Name = "ficherosToolStripMenuItem";
            this.ficherosToolStripMenuItem.Size = new System.Drawing.Size(61, 20);
            this.ficherosToolStripMenuItem.Text = "Ficheros";

            // guardarRespaldoToolStripMenuItem
            this.guardarRespaldoToolStripMenuItem.Name = "guardarRespaldoToolStripMenuItem";
            this.guardarRespaldoToolStripMenuItem.Size = new System.Drawing.Size(230, 22);
            this.guardarRespaldoToolStripMenuItem.Text = "Guardar Respaldo en Disco";
            this.guardarRespaldoToolStripMenuItem.Click += new System.EventHandler(this.guardarRespaldoToolStripMenuItem_Click);

            // restaurarRespaldoToolStripMenuItem
            this.restaurarRespaldoToolStripMenuItem.Name = "restaurarRespaldoToolStripMenuItem";
            this.restaurarRespaldoToolStripMenuItem.Size = new System.Drawing.Size(230, 22);
            this.restaurarRespaldoToolStripMenuItem.Text = "Restaurar Respaldo desde Disco";
            this.restaurarRespaldoToolStripMenuItem.Click += new System.EventHandler(this.restaurarRespaldoToolStripMenuItem_Click);

            // toolStripMenuItem1
            this.toolStripMenuItem1.Name = "toolStripMenuItem1";
            this.toolStripMenuItem1.Size = new System.Drawing.Size(226, 6);

            // salirToolStripMenuItem
            this.salirToolStripMenuItem.Name = "salirToolStripMenuItem";
            this.salirToolStripMenuItem.Size = new System.Drawing.Size(230, 22);
            this.salirToolStripMenuItem.Text = "Salir";
            this.salirToolStripMenuItem.Click += new System.EventHandler(this.salirToolStripMenuItem_Click);

            // statusStrip1
            this.statusStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.lblTotalMisiones,
            this.lblReloj});
            this.statusStrip1.Location = new System.Drawing.Point(0, 428);
            this.statusStrip1.Name = "statusStrip1";
            this.statusStrip1.Size = new System.Drawing.Size(800, 22);
            this.statusStrip1.TabIndex = 1;
            this.statusStrip1.Text = "statusStrip1";

            // lblTotalMisiones
            this.lblTotalMisiones.Name = "lblTotalMisiones";
            this.lblTotalMisiones.Size = new System.Drawing.Size(90, 17);
            this.lblTotalMisiones.Text = "Total misiones: 0";

            // lblReloj
            this.lblReloj.Name = "lblReloj";
            this.lblReloj.Size = new System.Drawing.Size(0, 17);
            this.lblReloj.Spring = true;
            this.lblReloj.TextAlign = System.Drawing.ContentAlignment.MiddleRight;

            // timerReloj
            this.timerReloj.Interval = 1000;
            this.timerReloj.Tick += new System.EventHandler(this.timerReloj_Tick);

            // FrmPadre
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.statusStrip1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "FrmPadre";
            this.Text = "Sistema de Gestión de Misiones Espaciales";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.FrmPadre_Load);
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.FrmPadre_FormClosing);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.statusStrip1.ResumeLayout(false);
            this.statusStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

            // Iniciar el timer
            this.timerReloj.Start();
        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem misionesToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem altaMantenimientoToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem consultasToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem listadoExpedicionesToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem clasificacionDestinoToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem ficherosToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem guardarRespaldoToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem restaurarRespaldoToolStripMenuItem;
        private System.Windows.Forms.ToolStripSeparator toolStripMenuItem1;
        private System.Windows.Forms.ToolStripMenuItem salirToolStripMenuItem;
        private System.Windows.Forms.StatusStrip statusStrip1;
        private System.Windows.Forms.ToolStripStatusLabel lblTotalMisiones;
        private System.Windows.Forms.ToolStripStatusLabel lblReloj;
        private System.Windows.Forms.Timer timerReloj;
    }
}
