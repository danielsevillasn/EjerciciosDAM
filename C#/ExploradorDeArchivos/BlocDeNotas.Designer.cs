using System.Windows.Forms;

namespace ExploradorDeArchivos
{
    partial class BlocDeNotas
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
            this.txtContenido = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // txtContenido
            // 
            this.txtContenido.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtContenido.Location = new System.Drawing.Point(0, 0);
            this.txtContenido.Multiline = true;
            this.txtContenido.ScrollBars = ScrollBars.Both;
            this.txtContenido.Name = "txtContenido";
            this.txtContenido.Size = new System.Drawing.Size(800, 449);
            this.txtContenido.TabIndex = 0;
            // 
            // BlocDeNotas
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.txtContenido);
            this.Name = "BlocDeNotas";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Bloc_de_notas";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.BlocDeNotas_FormClosing);
            this.Load += new System.EventHandler(this.Bloc_de_notas_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtContenido;
    }
}