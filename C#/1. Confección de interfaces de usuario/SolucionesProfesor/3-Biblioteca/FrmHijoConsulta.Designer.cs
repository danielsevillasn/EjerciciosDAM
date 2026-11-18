namespace Biblioteca
{
    partial class FrmHijoConsulta
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
            this.LblTitulo = new System.Windows.Forms.Label();
            this.LblAutorEditorial = new System.Windows.Forms.Label();
            this.LblFotoPortada = new System.Windows.Forms.Label();
            this.PctBox = new System.Windows.Forms.PictureBox();
            this.LstBoxTitulo = new System.Windows.Forms.ListBox();
            this.LstBoxAutorEditorial = new System.Windows.Forms.ListBox();
            this.GrpBoxTipoConsulta = new System.Windows.Forms.GroupBox();
            this.RdoBtnEditorial = new System.Windows.Forms.RadioButton();
            this.RdoBtnAutor = new System.Windows.Forms.RadioButton();
            ((System.ComponentModel.ISupportInitialize)(this.PctBox)).BeginInit();
            this.GrpBoxTipoConsulta.SuspendLayout();
            this.SuspendLayout();
            // 
            // LblTitulo
            // 
            this.LblTitulo.AutoSize = true;
            this.LblTitulo.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LblTitulo.Location = new System.Drawing.Point(55, 149);
            this.LblTitulo.Name = "LblTitulo";
            this.LblTitulo.Size = new System.Drawing.Size(62, 24);
            this.LblTitulo.TabIndex = 0;
            this.LblTitulo.Text = "Título";
            // 
            // LblAutorEditorial
            // 
            this.LblAutorEditorial.AutoSize = true;
            this.LblAutorEditorial.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LblAutorEditorial.Location = new System.Drawing.Point(311, 149);
            this.LblAutorEditorial.Name = "LblAutorEditorial";
            this.LblAutorEditorial.Size = new System.Drawing.Size(154, 24);
            this.LblAutorEditorial.TabIndex = 1;
            this.LblAutorEditorial.Text = "Autor / Editorial";
            // 
            // LblFotoPortada
            // 
            this.LblFotoPortada.AutoSize = true;
            this.LblFotoPortada.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LblFotoPortada.Location = new System.Drawing.Point(577, 149);
            this.LblFotoPortada.Name = "LblFotoPortada";
            this.LblFotoPortada.Size = new System.Drawing.Size(129, 24);
            this.LblFotoPortada.TabIndex = 2;
            this.LblFotoPortada.Text = "Foto Portada";
            // 
            // PctBox
            // 
            this.PctBox.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.PctBox.Location = new System.Drawing.Point(581, 176);
            this.PctBox.Name = "PctBox";
            this.PctBox.Size = new System.Drawing.Size(150, 207);
            this.PctBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.PctBox.TabIndex = 10;
            this.PctBox.TabStop = false;
            // 
            // LstBoxTitulo
            // 
            this.LstBoxTitulo.FormattingEnabled = true;
            this.LstBoxTitulo.Location = new System.Drawing.Point(59, 176);
            this.LstBoxTitulo.Name = "LstBoxTitulo";
            this.LstBoxTitulo.Size = new System.Drawing.Size(178, 212);
            this.LstBoxTitulo.Sorted = true;
            this.LstBoxTitulo.TabIndex = 11;
            this.LstBoxTitulo.SelectedIndexChanged += new System.EventHandler(this.LstBoxTitulo_SelectedIndexChanged);
            this.LstBoxTitulo.DoubleClick += new System.EventHandler(this.LstBoxTitulo_DoubleClick);
            // 
            // LstBoxAutorEditorial
            // 
            this.LstBoxAutorEditorial.FormattingEnabled = true;
            this.LstBoxAutorEditorial.Location = new System.Drawing.Point(315, 176);
            this.LstBoxAutorEditorial.Name = "LstBoxAutorEditorial";
            this.LstBoxAutorEditorial.Size = new System.Drawing.Size(178, 212);
            this.LstBoxAutorEditorial.Sorted = true;
            this.LstBoxAutorEditorial.TabIndex = 12;
            this.LstBoxAutorEditorial.SelectedIndexChanged += new System.EventHandler(this.LstBoxAutorEditorial_SelectedIndexChanged);
            // 
            // GrpBoxTipoConsulta
            // 
            this.GrpBoxTipoConsulta.Controls.Add(this.RdoBtnEditorial);
            this.GrpBoxTipoConsulta.Controls.Add(this.RdoBtnAutor);
            this.GrpBoxTipoConsulta.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.GrpBoxTipoConsulta.Location = new System.Drawing.Point(59, 12);
            this.GrpBoxTipoConsulta.Name = "GrpBoxTipoConsulta";
            this.GrpBoxTipoConsulta.Size = new System.Drawing.Size(434, 100);
            this.GrpBoxTipoConsulta.TabIndex = 13;
            this.GrpBoxTipoConsulta.TabStop = false;
            this.GrpBoxTipoConsulta.Text = "Tipo Consulta";
            // 
            // RdoBtnEditorial
            // 
            this.RdoBtnEditorial.AutoSize = true;
            this.RdoBtnEditorial.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.RdoBtnEditorial.Location = new System.Drawing.Point(6, 62);
            this.RdoBtnEditorial.Name = "RdoBtnEditorial";
            this.RdoBtnEditorial.Size = new System.Drawing.Size(93, 24);
            this.RdoBtnEditorial.TabIndex = 1;
            this.RdoBtnEditorial.TabStop = true;
            this.RdoBtnEditorial.Text = "Editorial";
            this.RdoBtnEditorial.UseVisualStyleBackColor = true;
            this.RdoBtnEditorial.CheckedChanged += new System.EventHandler(this.RdoBtnEditorial_CheckedChanged);
            // 
            // RdoBtnAutor
            // 
            this.RdoBtnAutor.AutoSize = true;
            this.RdoBtnAutor.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.RdoBtnAutor.Location = new System.Drawing.Point(6, 32);
            this.RdoBtnAutor.Name = "RdoBtnAutor";
            this.RdoBtnAutor.Size = new System.Drawing.Size(71, 24);
            this.RdoBtnAutor.TabIndex = 0;
            this.RdoBtnAutor.TabStop = true;
            this.RdoBtnAutor.Text = "Autor";
            this.RdoBtnAutor.UseVisualStyleBackColor = true;
            this.RdoBtnAutor.CheckedChanged += new System.EventHandler(this.RdoBtnAutor_CheckedChanged);
            // 
            // FrmHijoConsulta
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.GrpBoxTipoConsulta);
            this.Controls.Add(this.LstBoxAutorEditorial);
            this.Controls.Add(this.LstBoxTitulo);
            this.Controls.Add(this.PctBox);
            this.Controls.Add(this.LblFotoPortada);
            this.Controls.Add(this.LblAutorEditorial);
            this.Controls.Add(this.LblTitulo);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "FrmHijoConsulta";
            this.Text = "FrmHijoConsulta";
            ((System.ComponentModel.ISupportInitialize)(this.PctBox)).EndInit();
            this.GrpBoxTipoConsulta.ResumeLayout(false);
            this.GrpBoxTipoConsulta.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label LblTitulo;
        private System.Windows.Forms.Label LblAutorEditorial;
        private System.Windows.Forms.Label LblFotoPortada;
        private System.Windows.Forms.PictureBox PctBox;
        private System.Windows.Forms.ListBox LstBoxTitulo;
        private System.Windows.Forms.ListBox LstBoxAutorEditorial;
        private System.Windows.Forms.GroupBox GrpBoxTipoConsulta;
        private System.Windows.Forms.RadioButton RdoBtnEditorial;
        private System.Windows.Forms.RadioButton RdoBtnAutor;
    }
}