namespace Biblioteca
{
    partial class FrmHijoPpal
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.StaTrpHora = new System.Windows.Forms.StatusStrip();
            this.Tiempo = new System.Windows.Forms.Timer(this.components);
            this.StaTrpHoraLbl = new System.Windows.Forms.ToolStripStatusLabel();
            this.StaTrpHora.SuspendLayout();
            this.SuspendLayout();
            // 
            // StaTrpHora
            // 
            this.StaTrpHora.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.StaTrpHora.Dock = System.Windows.Forms.DockStyle.None;
            this.StaTrpHora.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.StaTrpHoraLbl});
            this.StaTrpHora.Location = new System.Drawing.Point(774, 419);
            this.StaTrpHora.Name = "StaTrpHora";
            this.StaTrpHora.Size = new System.Drawing.Size(17, 22);
            this.StaTrpHora.TabIndex = 3;
            // 
            // Tiempo
            // 
            this.Tiempo.Enabled = true;
            this.Tiempo.Interval = 1000;
            this.Tiempo.Tick += new System.EventHandler(this.Tiempo_Tick);
            // 
            // StaTrpHoraLbl
            // 
            this.StaTrpHoraLbl.Name = "StaTrpHoraLbl";
            this.StaTrpHoraLbl.Size = new System.Drawing.Size(0, 17);
            // 
            // FrmHijoPpal
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.StaTrpHora);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "FrmHijoPpal";
            this.Text = "FrmHijoPpal";
            this.StaTrpHora.ResumeLayout(false);
            this.StaTrpHora.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.StatusStrip StaTrpHora;
        private System.Windows.Forms.Timer Tiempo;
        private System.Windows.Forms.ToolStripStatusLabel StaTrpHoraLbl;
    }
}