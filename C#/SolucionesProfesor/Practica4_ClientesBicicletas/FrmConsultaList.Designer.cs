namespace Practica4_ClientesBicicletas
{
    partial class FrmConsultaList
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FrmConsultaList));
            this.LsvClientes = new System.Windows.Forms.ListView();
            this.LvcNombre = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.LvcApellidos = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.LvcEmail = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.LvcComentario = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.ImlImagenesGrandes = new System.Windows.Forms.ImageList(this.components);
            this.ImlImagenes = new System.Windows.Forms.ImageList(this.components);
            this.CmbCiudad = new System.Windows.Forms.ComboBox();
            this.CmbVista = new System.Windows.Forms.ComboBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // LsvClientes
            // 
            this.LsvClientes.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.LvcNombre,
            this.LvcApellidos,
            this.LvcEmail,
            this.LvcComentario});
            this.LsvClientes.LargeImageList = this.ImlImagenesGrandes;
            this.LsvClientes.Location = new System.Drawing.Point(21, 198);
            this.LsvClientes.Name = "LsvClientes";
            this.LsvClientes.Size = new System.Drawing.Size(756, 240);
            this.LsvClientes.SmallImageList = this.ImlImagenes;
            this.LsvClientes.TabIndex = 2;
            this.LsvClientes.UseCompatibleStateImageBehavior = false;
            this.LsvClientes.View = System.Windows.Forms.View.Details;
            // 
            // LvcNombre
            // 
            this.LvcNombre.Text = "Nombre";
            this.LvcNombre.Width = 121;
            // 
            // LvcApellidos
            // 
            this.LvcApellidos.Text = "Apellidos";
            this.LvcApellidos.Width = 144;
            // 
            // LvcEmail
            // 
            this.LvcEmail.Text = "Email";
            this.LvcEmail.Width = 177;
            // 
            // LvcComentario
            // 
            this.LvcComentario.Text = "Comentario";
            this.LvcComentario.Width = 350;
            // 
            // ImlImagenesGrandes
            // 
            this.ImlImagenesGrandes.ImageStream = ((System.Windows.Forms.ImageListStreamer)(resources.GetObject("ImlImagenesGrandes.ImageStream")));
            this.ImlImagenesGrandes.TransparentColor = System.Drawing.Color.Transparent;
            this.ImlImagenesGrandes.Images.SetKeyName(0, "usuario.png");
            this.ImlImagenesGrandes.Images.SetKeyName(1, "vip.png");
            // 
            // ImlImagenes
            // 
            this.ImlImagenes.ImageStream = ((System.Windows.Forms.ImageListStreamer)(resources.GetObject("ImlImagenes.ImageStream")));
            this.ImlImagenes.TransparentColor = System.Drawing.Color.Transparent;
            this.ImlImagenes.Images.SetKeyName(0, "usuario.png");
            this.ImlImagenes.Images.SetKeyName(1, "vip.png");
            // 
            // CmbCiudad
            // 
            this.CmbCiudad.FormattingEnabled = true;
            this.CmbCiudad.Location = new System.Drawing.Point(201, 103);
            this.CmbCiudad.Name = "CmbCiudad";
            this.CmbCiudad.Size = new System.Drawing.Size(372, 21);
            this.CmbCiudad.TabIndex = 3;
            this.CmbCiudad.SelectedIndexChanged += new System.EventHandler(this.CmbCiudad_SelectedIndexChanged);
            // 
            // CmbVista
            // 
            this.CmbVista.FormattingEnabled = true;
            this.CmbVista.Items.AddRange(new object[] {
            "Detalles",
            "Iconos Grandes"});
            this.CmbVista.Location = new System.Drawing.Point(619, 103);
            this.CmbVista.Name = "CmbVista";
            this.CmbVista.Size = new System.Drawing.Size(158, 21);
            this.CmbVista.TabIndex = 4;
            this.CmbVista.SelectedIndexChanged += new System.EventHandler(this.CmbVista_SelectedIndexChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Constantia", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(321, 61);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(75, 23);
            this.label1.TabIndex = 5;
            this.label1.Text = "Ciudad";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Constantia", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(658, 61);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(55, 23);
            this.label2.TabIndex = 6;
            this.label2.Text = "Vista";
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::Practica4_ClientesBicicletas.Properties.Resources.unnamed;
            this.pictureBox1.Location = new System.Drawing.Point(21, 48);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(174, 125);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 7;
            this.pictureBox1.TabStop = false;
            // 
            // FrmConsultaList
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.CmbVista);
            this.Controls.Add(this.CmbCiudad);
            this.Controls.Add(this.LsvClientes);
            this.Name = "FrmConsultaList";
            this.Text = "FrmConsultaList";
            this.Activated += new System.EventHandler(this.FrmConsultaList_Activated);
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.FrmConsultaList_FormClosing);
            this.Controls.SetChildIndex(this.LsvClientes, 0);
            this.Controls.SetChildIndex(this.CmbCiudad, 0);
            this.Controls.SetChildIndex(this.CmbVista, 0);
            this.Controls.SetChildIndex(this.label1, 0);
            this.Controls.SetChildIndex(this.label2, 0);
            this.Controls.SetChildIndex(this.pictureBox1, 0);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListView LsvClientes;
        private System.Windows.Forms.ColumnHeader LvcNombre;
        private System.Windows.Forms.ColumnHeader LvcApellidos;
        private System.Windows.Forms.ColumnHeader LvcEmail;
        private System.Windows.Forms.ColumnHeader LvcComentario;
        private System.Windows.Forms.ImageList ImlImagenes;
        private System.Windows.Forms.ComboBox CmbCiudad;
        private System.Windows.Forms.ComboBox CmbVista;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ImageList ImlImagenesGrandes;
        private System.Windows.Forms.PictureBox pictureBox1;
    }
}