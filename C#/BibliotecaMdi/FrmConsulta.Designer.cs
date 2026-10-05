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
            gpBoxTipoConsulta.SuspendLayout();
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
            gpBoxTipoConsulta.Location = new Point(87, 46);
            gpBoxTipoConsulta.Name = "gpBoxTipoConsulta";
            gpBoxTipoConsulta.Size = new Size(504, 74);
            gpBoxTipoConsulta.TabIndex = 2;
            gpBoxTipoConsulta.TabStop = false;
            gpBoxTipoConsulta.Text = "Tipo Consulta";
            // 
            // lblTitulo
            // 
            lblTitulo.AutoSize = true;
            lblTitulo.Location = new Point(85, 224);
            lblTitulo.Name = "lblTitulo";
            lblTitulo.Size = new Size(38, 15);
            lblTitulo.TabIndex = 3;
            lblTitulo.Text = "Título";
            // 
            // ltBoxTitulos
            // 
            ltBoxTitulos.FormattingEnabled = true;
            ltBoxTitulos.ItemHeight = 15;
            ltBoxTitulos.Location = new Point(85, 251);
            ltBoxTitulos.Name = "ltBoxTitulos";
            ltBoxTitulos.Size = new Size(120, 94);
            ltBoxTitulos.TabIndex = 4;
            // 
            // ltBoxAutorEditorial
            // 
            ltBoxAutorEditorial.FormattingEnabled = true;
            ltBoxAutorEditorial.ItemHeight = 15;
            ltBoxAutorEditorial.Location = new Point(266, 251);
            ltBoxAutorEditorial.Name = "ltBoxAutorEditorial";
            ltBoxAutorEditorial.Size = new Size(120, 94);
            ltBoxAutorEditorial.TabIndex = 5;
            // 
            // FrmConsulta
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(ltBoxAutorEditorial);
            Controls.Add(ltBoxTitulos);
            Controls.Add(lblTitulo);
            Controls.Add(gpBoxTipoConsulta);
            Name = "FrmConsulta";
            Text = "Consulta de libros";
            gpBoxTipoConsulta.ResumeLayout(false);
            gpBoxTipoConsulta.PerformLayout();
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
    }
}