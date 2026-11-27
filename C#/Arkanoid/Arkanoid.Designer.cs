namespace Arkanoid
{
    partial class Arkanoid
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Arkanoid));
            this.pcbPelota = new System.Windows.Forms.PictureBox();
            this.timerDireccionBola = new System.Windows.Forms.Timer(this.components);
            this.pcbBarra = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.pcbPelota)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pcbBarra)).BeginInit();
            this.SuspendLayout();
            // 
            // pcbPelota
            // 
            this.pcbPelota.Cursor = System.Windows.Forms.Cursors.Default;
            this.pcbPelota.Image = ((System.Drawing.Image)(resources.GetObject("pcbPelota.Image")));
            this.pcbPelota.Location = new System.Drawing.Point(333, 269);
            this.pcbPelota.Name = "pcbPelota";
            this.pcbPelota.Size = new System.Drawing.Size(77, 70);
            this.pcbPelota.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pcbPelota.TabIndex = 0;
            this.pcbPelota.TabStop = false;
            // 
            // timerDireccionBola
            // 
            this.timerDireccionBola.Enabled = true;
            this.timerDireccionBola.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // pcbBarra
            // 
            this.pcbBarra.Image = ((System.Drawing.Image)(resources.GetObject("pcbBarra.Image")));
            this.pcbBarra.Location = new System.Drawing.Point(292, 360);
            this.pcbBarra.Name = "pcbBarra";
            this.pcbBarra.Size = new System.Drawing.Size(156, 26);
            this.pcbBarra.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pcbBarra.TabIndex = 1;
            this.pcbBarra.TabStop = false;
            // 
            // Arkanoid
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(734, 411);
            this.ControlBox = false;
            this.Controls.Add(this.pcbBarra);
            this.Controls.Add(this.pcbPelota);
            this.Name = "Arkanoid";
            this.Text = "Arkanoid";
            this.Load += new System.EventHandler(this.Arkanoid_Load);
            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.Arkanoid_KeyDown);
            ((System.ComponentModel.ISupportInitialize)(this.pcbPelota)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pcbBarra)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.PictureBox pcbPelota;
        private System.Windows.Forms.Timer timerDireccionBola;
        private System.Windows.Forms.PictureBox pcbBarra;
    }
}

