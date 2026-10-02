namespace BibliotecaMdi
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
            lblNuevo = new Label();
            pcbPortada = new PictureBox();
            label1 = new Label();
            ofdFoto = new OpenFileDialog();
            btnCargarFoto = new Button();
            btnLimpiar = new Button();
            btnGuardar = new Button();
            txtboxTitulo = new TextBox();
            txtboxAutor = new TextBox();
            txtEditorial = new TextBox();
            chboxNuevo = new CheckBox();
            ((System.ComponentModel.ISupportInitialize)pcbPortada).BeginInit();
            SuspendLayout();
            // 
            // LblTitulo
            // 
            LblTitulo.AutoSize = true;
            LblTitulo.Font = new Font("Segoe UI", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            LblTitulo.Location = new Point(110, 100);
            LblTitulo.Name = "LblTitulo";
            LblTitulo.Size = new Size(93, 37);
            LblTitulo.TabIndex = 0;
            LblTitulo.Text = "Título";
            // 
            // LblAutor
            // 
            LblAutor.AutoSize = true;
            LblAutor.Font = new Font("Segoe UI", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            LblAutor.Location = new Point(110, 160);
            LblAutor.Name = "LblAutor";
            LblAutor.Size = new Size(91, 37);
            LblAutor.TabIndex = 1;
            LblAutor.Text = "Autor";
            // 
            // LblEditorial
            // 
            LblEditorial.AutoSize = true;
            LblEditorial.Font = new Font("Segoe UI", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            LblEditorial.Location = new Point(110, 220);
            LblEditorial.Name = "LblEditorial";
            LblEditorial.Size = new Size(126, 37);
            LblEditorial.TabIndex = 2;
            LblEditorial.Text = "Editorial";
            // 
            // lblNuevo
            // 
            lblNuevo.AutoSize = true;
            lblNuevo.Font = new Font("Segoe UI", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblNuevo.Location = new Point(110, 280);
            lblNuevo.Name = "lblNuevo";
            lblNuevo.Size = new Size(101, 37);
            lblNuevo.TabIndex = 3;
            lblNuevo.Text = "Nuevo";
            // 
            // pcbPortada
            // 
            pcbPortada.Location = new Point(551, 87);
            pcbPortada.Name = "pcbPortada";
            pcbPortada.Size = new Size(167, 243);
            pcbPortada.SizeMode = PictureBoxSizeMode.StretchImage;
            pcbPortada.TabIndex = 4;
            pcbPortada.TabStop = false;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Segoe UI Semibold", 20.25F, FontStyle.Bold | FontStyle.Italic, GraphicsUnit.Point, 0);
            label1.Location = new Point(549, 37);
            label1.Name = "label1";
            label1.Size = new Size(172, 37);
            label1.TabIndex = 5;
            label1.Text = "Foto Portada";
            // 
            // ofdFoto
            // 
            ofdFoto.FileName = "ofdFoto";
            // 
            // btnCargarFoto
            // 
            btnCargarFoto.AutoSize = true;
            btnCargarFoto.Location = new Point(594, 339);
            btnCargarFoto.Name = "btnCargarFoto";
            btnCargarFoto.Size = new Size(79, 25);
            btnCargarFoto.TabIndex = 6;
            btnCargarFoto.Text = "Cargar Foto";
            btnCargarFoto.UseVisualStyleBackColor = true;
            btnCargarFoto.Click += btnCargarFoto_Click;
            // 
            // btnLimpiar
            // 
            btnLimpiar.AutoSize = true;
            btnLimpiar.Location = new Point(400, 350);
            btnLimpiar.Name = "btnLimpiar";
            btnLimpiar.Size = new Size(79, 25);
            btnLimpiar.TabIndex = 7;
            btnLimpiar.Text = "Limpiar";
            btnLimpiar.UseVisualStyleBackColor = true;
            btnLimpiar.Click += btnLimpiar_Click;
            // 
            // btnGuardar
            // 
            btnGuardar.AutoSize = true;
            btnGuardar.Location = new Point(300, 350);
            btnGuardar.Name = "btnGuardar";
            btnGuardar.Size = new Size(79, 25);
            btnGuardar.TabIndex = 8;
            btnGuardar.Text = "Guardar";
            btnGuardar.UseVisualStyleBackColor = true;
            btnGuardar.Click += btnGuardar_Click;
            // 
            // txtboxTitulo
            // 
            txtboxTitulo.Location = new Point(250, 110);
            txtboxTitulo.Name = "txtboxTitulo";
            txtboxTitulo.Size = new Size(226, 23);
            txtboxTitulo.TabIndex = 9;
            // 
            // txtboxAutor
            // 
            txtboxAutor.Location = new Point(250, 170);
            txtboxAutor.Name = "txtboxAutor";
            txtboxAutor.Size = new Size(226, 23);
            txtboxAutor.TabIndex = 10;
            // 
            // txtEditorial
            // 
            txtEditorial.Location = new Point(250, 230);
            txtEditorial.Name = "txtEditorial";
            txtEditorial.Size = new Size(226, 23);
            txtEditorial.TabIndex = 11;
            // 
            // chboxNuevo
            // 
            chboxNuevo.AutoSize = true;
            chboxNuevo.Location = new Point(250, 295);
            chboxNuevo.Name = "chboxNuevo";
            chboxNuevo.Size = new Size(15, 14);
            chboxNuevo.TabIndex = 13;
            chboxNuevo.UseVisualStyleBackColor = true;
            // 
            // FrmAlta
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(chboxNuevo);
            Controls.Add(txtEditorial);
            Controls.Add(txtboxAutor);
            Controls.Add(txtboxTitulo);
            Controls.Add(btnGuardar);
            Controls.Add(btnLimpiar);
            Controls.Add(btnCargarFoto);
            Controls.Add(label1);
            Controls.Add(pcbPortada);
            Controls.Add(lblNuevo);
            Controls.Add(LblEditorial);
            Controls.Add(LblAutor);
            Controls.Add(LblTitulo);
            Name = "FrmAlta";
            Text = "FrmAlta";
            ((System.ComponentModel.ISupportInitialize)pcbPortada).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label LblTitulo;
        private Label LblAutor;
        private Label LblEditorial;
        private Label lblNuevo;
        private PictureBox pcbPortada;
        private Label label1;
        private OpenFileDialog ofdFoto;
        private Button btnCargarFoto;
        private Button btnLimpiar;
        private Button btnGuardar;
        private TextBox txtboxTitulo;
        private TextBox txtboxAutor;
        private TextBox txtEditorial;
        private CheckBox chboxNuevo;
    }
}