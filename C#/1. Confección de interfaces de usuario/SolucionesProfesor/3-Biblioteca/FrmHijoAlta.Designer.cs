namespace Biblioteca
{
    partial class FrmHijoAlta
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
            this.LblAutor = new System.Windows.Forms.Label();
            this.LblEditorial = new System.Windows.Forms.Label();
            this.LblNuevo = new System.Windows.Forms.Label();
            this.TxtBoxTitulo = new System.Windows.Forms.TextBox();
            this.TxtBoxAutor = new System.Windows.Forms.TextBox();
            this.TxtBoxEditorial = new System.Windows.Forms.TextBox();
            this.ChkBoxNuevo = new System.Windows.Forms.CheckBox();
            this.PctBox = new System.Windows.Forms.PictureBox();
            this.LblFotoPortada = new System.Windows.Forms.Label();
            this.BtnGuardar = new System.Windows.Forms.Button();
            this.BtnLimpiar = new System.Windows.Forms.Button();
            this.BtnCargarFoto = new System.Windows.Forms.Button();
            this.OpnFleDlgFoto = new System.Windows.Forms.OpenFileDialog();
            ((System.ComponentModel.ISupportInitialize)(this.PctBox)).BeginInit();
            this.SuspendLayout();
            // 
            // LblTitulo
            // 
            this.LblTitulo.AutoSize = true;
            this.LblTitulo.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LblTitulo.Location = new System.Drawing.Point(124, 77);
            this.LblTitulo.Name = "LblTitulo";
            this.LblTitulo.Size = new System.Drawing.Size(62, 24);
            this.LblTitulo.TabIndex = 1;
            this.LblTitulo.Text = "Título";
            // 
            // LblAutor
            // 
            this.LblAutor.AutoSize = true;
            this.LblAutor.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LblAutor.Location = new System.Drawing.Point(124, 138);
            this.LblAutor.Name = "LblAutor";
            this.LblAutor.Size = new System.Drawing.Size(60, 24);
            this.LblAutor.TabIndex = 2;
            this.LblAutor.Text = "Autor";
            // 
            // LblEditorial
            // 
            this.LblEditorial.AutoSize = true;
            this.LblEditorial.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LblEditorial.Location = new System.Drawing.Point(124, 197);
            this.LblEditorial.Name = "LblEditorial";
            this.LblEditorial.Size = new System.Drawing.Size(86, 24);
            this.LblEditorial.TabIndex = 3;
            this.LblEditorial.Text = "Editorial";
            // 
            // LblNuevo
            // 
            this.LblNuevo.AutoSize = true;
            this.LblNuevo.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LblNuevo.Location = new System.Drawing.Point(124, 260);
            this.LblNuevo.Name = "LblNuevo";
            this.LblNuevo.Size = new System.Drawing.Size(71, 24);
            this.LblNuevo.TabIndex = 4;
            this.LblNuevo.Text = "Nuevo";
            // 
            // TxtBoxTitulo
            // 
            this.TxtBoxTitulo.Location = new System.Drawing.Point(264, 77);
            this.TxtBoxTitulo.Name = "TxtBoxTitulo";
            this.TxtBoxTitulo.Size = new System.Drawing.Size(196, 20);
            this.TxtBoxTitulo.TabIndex = 5;
            // 
            // TxtBoxAutor
            // 
            this.TxtBoxAutor.Location = new System.Drawing.Point(264, 139);
            this.TxtBoxAutor.Name = "TxtBoxAutor";
            this.TxtBoxAutor.Size = new System.Drawing.Size(196, 20);
            this.TxtBoxAutor.TabIndex = 6;
            // 
            // TxtBoxEditorial
            // 
            this.TxtBoxEditorial.Location = new System.Drawing.Point(264, 198);
            this.TxtBoxEditorial.Name = "TxtBoxEditorial";
            this.TxtBoxEditorial.Size = new System.Drawing.Size(196, 20);
            this.TxtBoxEditorial.TabIndex = 7;
            // 
            // ChkBoxNuevo
            // 
            this.ChkBoxNuevo.AutoSize = true;
            this.ChkBoxNuevo.Location = new System.Drawing.Point(264, 270);
            this.ChkBoxNuevo.Name = "ChkBoxNuevo";
            this.ChkBoxNuevo.Size = new System.Drawing.Size(15, 14);
            this.ChkBoxNuevo.TabIndex = 8;
            this.ChkBoxNuevo.UseVisualStyleBackColor = true;
            // 
            // PctBox
            // 
            this.PctBox.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.PctBox.Location = new System.Drawing.Point(524, 77);
            this.PctBox.Name = "PctBox";
            this.PctBox.Size = new System.Drawing.Size(150, 207);
            this.PctBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.PctBox.TabIndex = 9;
            this.PctBox.TabStop = false;
            // 
            // LblFotoPortada
            // 
            this.LblFotoPortada.AutoSize = true;
            this.LblFotoPortada.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LblFotoPortada.Location = new System.Drawing.Point(520, 37);
            this.LblFotoPortada.Name = "LblFotoPortada";
            this.LblFotoPortada.Size = new System.Drawing.Size(129, 24);
            this.LblFotoPortada.TabIndex = 10;
            this.LblFotoPortada.Text = "Foto Portada";
            // 
            // BtnGuardar
            // 
            this.BtnGuardar.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnGuardar.Location = new System.Drawing.Point(128, 344);
            this.BtnGuardar.Name = "BtnGuardar";
            this.BtnGuardar.Size = new System.Drawing.Size(82, 34);
            this.BtnGuardar.TabIndex = 11;
            this.BtnGuardar.Text = "Guardar";
            this.BtnGuardar.UseVisualStyleBackColor = true;
            this.BtnGuardar.Click += new System.EventHandler(this.BtnGuardar_Click);
            // 
            // BtnLimpiar
            // 
            this.BtnLimpiar.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnLimpiar.Location = new System.Drawing.Point(318, 344);
            this.BtnLimpiar.Name = "BtnLimpiar";
            this.BtnLimpiar.Size = new System.Drawing.Size(100, 34);
            this.BtnLimpiar.TabIndex = 12;
            this.BtnLimpiar.Text = "Limpiar";
            this.BtnLimpiar.UseVisualStyleBackColor = true;
            this.BtnLimpiar.Click += new System.EventHandler(this.BtnLimpiar_Click);
            // 
            // BtnCargarFoto
            // 
            this.BtnCargarFoto.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnCargarFoto.Location = new System.Drawing.Point(524, 344);
            this.BtnCargarFoto.Name = "BtnCargarFoto";
            this.BtnCargarFoto.Size = new System.Drawing.Size(125, 34);
            this.BtnCargarFoto.TabIndex = 13;
            this.BtnCargarFoto.Text = "Cargar Foto";
            this.BtnCargarFoto.UseVisualStyleBackColor = true;
            this.BtnCargarFoto.Click += new System.EventHandler(this.BtnCargarFoto_Click);
            // 
            // OpnFleDlgFoto
            // 
            this.OpnFleDlgFoto.Filter = "Solo jpg | *.jpg";
            this.OpnFleDlgFoto.InitialDirectory = "C:\\Users\\alumno\\Pictures";
            // 
            // FrmHijoAlta
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.BtnCargarFoto);
            this.Controls.Add(this.BtnLimpiar);
            this.Controls.Add(this.BtnGuardar);
            this.Controls.Add(this.LblFotoPortada);
            this.Controls.Add(this.PctBox);
            this.Controls.Add(this.ChkBoxNuevo);
            this.Controls.Add(this.TxtBoxEditorial);
            this.Controls.Add(this.TxtBoxAutor);
            this.Controls.Add(this.TxtBoxTitulo);
            this.Controls.Add(this.LblNuevo);
            this.Controls.Add(this.LblEditorial);
            this.Controls.Add(this.LblAutor);
            this.Controls.Add(this.LblTitulo);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "FrmHijoAlta";
            this.Text = "FrmHijoAlta";
            ((System.ComponentModel.ISupportInitialize)(this.PctBox)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label LblTitulo;
        private System.Windows.Forms.Label LblAutor;
        private System.Windows.Forms.Label LblEditorial;
        private System.Windows.Forms.Label LblNuevo;
        private System.Windows.Forms.TextBox TxtBoxTitulo;
        private System.Windows.Forms.TextBox TxtBoxAutor;
        private System.Windows.Forms.TextBox TxtBoxEditorial;
        private System.Windows.Forms.CheckBox ChkBoxNuevo;
        private System.Windows.Forms.PictureBox PctBox;
        private System.Windows.Forms.Label LblFotoPortada;
        private System.Windows.Forms.Button BtnGuardar;
        private System.Windows.Forms.Button BtnLimpiar;
        private System.Windows.Forms.Button BtnCargarFoto;
        private System.Windows.Forms.OpenFileDialog OpnFleDlgFoto;
    }
}