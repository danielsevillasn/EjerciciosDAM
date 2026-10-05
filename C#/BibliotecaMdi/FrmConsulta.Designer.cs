namespace BibliotecaMdi
{
    partial class FrmConsulta
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
            rdBtnAutor = new RadioButton();
            rdBtnEditorial = new RadioButton();
            gpBoxTipoConsulta = new GroupBox();
            lblTitulo = new Label();
            ltBoxTitulos = new ListBox();
            ltBoxAutorEditorial = new ListBox();
            lblAutorEditorial = new Label();
            label1 = new Label();
            pcbPortada = new PictureBox();
            gpBoxTipoConsulta.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)pcbPortada).BeginInit();
            SuspendLayout();
            // 
            // rdBtnAutor
            // 
            rdBtnAutor.AutoSize = true;
            rdBtnAutor.Location = new Point(21, 47);
            rdBtnAutor.Name = "rdBtnAutor";
            rdBtnAutor.Size = new Size(55, 19);
            rdBtnAutor.TabIndex = 0;
            rdBtnAutor.TabStop = true;
            rdBtnAutor.Text = "Autor";
            rdBtnAutor.UseVisualStyleBackColor = true;
            // 
            // rdBtnEditorial
            // 
            rdBtnEditorial.AutoSize = true;
            rdBtnEditorial.Location = new Point(21, 22);
            rdBtnEditorial.Name = "rdBtnEditorial";
            rdBtnEditorial.Size = new Size(68, 19);
            rdBtnEditorial.TabIndex = 1;
            rdBtnEditorial.TabStop = true;
            rdBtnEditorial.Text = "Editorial";
            rdBtnEditorial.UseVisualStyleBackColor = true;
            rdBtnEditorial.CheckedChanged += rdBtnEditorial_CheckedChanged;
            // 
            // gpBoxTipoConsulta
            // 
            gpBoxTipoConsulta.Controls.Add(rdBtnEditorial);
            gpBoxTipoConsulta.Controls.Add(rdBtnAutor);
            gpBoxTipoConsulta.Location = new Point(43, 12);
            gpBoxTipoConsulta.Name = "gpBoxTipoConsulta";
            gpBoxTipoConsulta.Size = new Size(449, 99);
            gpBoxTipoConsulta.TabIndex = 2;
            gpBoxTipoConsulta.TabStop = false;
            gpBoxTipoConsulta.Text = "Tipo Consulta";
            // 
            // lblTitulo
            // 
            lblTitulo.AutoSize = true;
            lblTitulo.Font = new Font("Arial", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblTitulo.Location = new Point(97, 215);
            lblTitulo.Name = "lblTitulo";
            lblTitulo.Size = new Size(91, 32);
            lblTitulo.TabIndex = 3;
            lblTitulo.Text = "Título";
            // 
            // ltBoxTitulos
            // 
            ltBoxTitulos.FormattingEnabled = true;
            ltBoxTitulos.ItemHeight = 15;
            ltBoxTitulos.Location = new Point(43, 251);
            ltBoxTitulos.Name = "ltBoxTitulos";
            ltBoxTitulos.Size = new Size(200, 169);
            ltBoxTitulos.TabIndex = 4;
            ltBoxTitulos.DoubleClick += ltBoxTitulos_DoubleClick;
            // 
            // ltBoxAutorEditorial
            // 
            ltBoxAutorEditorial.FormattingEnabled = true;
            ltBoxAutorEditorial.ItemHeight = 15;
            ltBoxAutorEditorial.Location = new Point(266, 251);
            ltBoxAutorEditorial.Name = "ltBoxAutorEditorial";
            ltBoxAutorEditorial.Size = new Size(226, 169);
            ltBoxAutorEditorial.TabIndex = 5;
            // 
            // lblAutorEditorial
            // 
            lblAutorEditorial.AutoSize = true;
            lblAutorEditorial.Font = new Font("Arial", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblAutorEditorial.Location = new Point(270, 215);
            lblAutorEditorial.Name = "lblAutorEditorial";
            lblAutorEditorial.Size = new Size(222, 32);
            lblAutorEditorial.TabIndex = 6;
            lblAutorEditorial.Text = "Autor / Editorial";
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Arial", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label1.Location = new Point(546, 136);
            label1.Name = "label1";
            label1.Size = new Size(183, 32);
            label1.TabIndex = 7;
            label1.Text = "Foto portada";
            // 
            // pcbPortada
            // 
            pcbPortada.Location = new Point(553, 171);
            pcbPortada.Name = "pcbPortada";
            pcbPortada.Size = new Size(167, 243);
            pcbPortada.SizeMode = PictureBoxSizeMode.StretchImage;
            pcbPortada.TabIndex = 8;
            pcbPortada.TabStop = false;
            // 
            // FrmConsulta
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(pcbPortada);
            Controls.Add(label1);
            Controls.Add(lblAutorEditorial);
            Controls.Add(ltBoxAutorEditorial);
            Controls.Add(ltBoxTitulos);
            Controls.Add(lblTitulo);
            Controls.Add(gpBoxTipoConsulta);
            Name = "FrmConsulta";
            Text = "Consulta de libros";
            Load += FrmConsulta_Load;
            gpBoxTipoConsulta.ResumeLayout(false);
            gpBoxTipoConsulta.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)pcbPortada).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private RadioButton rdBtnAutor;
        private RadioButton rdBtnEditorial;
        private GroupBox gpBoxTipoConsulta;
        private Label lblTitulo;
        private ListBox ltBoxTitulos;
        private ListBox ltBoxAutorEditorial;
        private Label lblAutorEditorial;
        private Label label1;
        private PictureBox pcbPortada;
    }
}