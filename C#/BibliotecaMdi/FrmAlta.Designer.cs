namespace FrmPadre
{
    partial class FrmAlta
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
            LblTitulo = new Label();
            LblAutor = new Label();
            LblEditorial = new Label();
            label4 = new Label();
            SuspendLayout();
            // 
            // LblTitulo
            // 
            LblTitulo.AutoSize = true;
            LblTitulo.Location = new Point(381, 118);
            LblTitulo.Name = "LblTitulo";
            LblTitulo.Size = new Size(38, 15);
            LblTitulo.TabIndex = 0;
            LblTitulo.Text = "Título";
            // 
            // LblAutor
            // 
            LblAutor.AutoSize = true;
            LblAutor.Location = new Point(130, 161);
            LblAutor.Name = "LblAutor";
            LblAutor.Size = new Size(37, 15);
            LblAutor.TabIndex = 1;
            LblAutor.Text = "Autor";
            // 
            // LblEditorial
            // 
            LblEditorial.AutoSize = true;
            LblEditorial.Location = new Point(142, 215);
            LblEditorial.Name = "LblEditorial";
            LblEditorial.Size = new Size(50, 15);
            LblEditorial.TabIndex = 2;
            LblEditorial.Text = "Editorial";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(142, 253);
            label4.Name = "label4";
            label4.Size = new Size(38, 15);
            label4.TabIndex = 3;
            label4.Text = "label4";
            // 
            // FrmAlta
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(label4);
            Controls.Add(LblEditorial);
            Controls.Add(LblAutor);
            Controls.Add(LblTitulo);
            Name = "FrmAlta";
            Text = "FrmAlta";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label LblTitulo;
        private Label LblAutor;
        private Label LblEditorial;
        private Label label4;
    }
}