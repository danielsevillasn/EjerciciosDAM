namespace FormulariosHeredados
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
            components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FrmConsultaList));
            lsvClientes = new ListView();
            Nombre = new ColumnHeader();
            Apellidos = new ColumnHeader();
            Email = new ColumnHeader();
            Comentarios = new ColumnHeader();
            imgListLsv = new ImageList(components);
            imgFondoClientes = new PictureBox();
            lblClientes = new Label();
            label1 = new Label();
            cmbCiudad = new ComboBox();
            cmbVista = new ComboBox();
            ((System.ComponentModel.ISupportInitialize)imgFondoClientes).BeginInit();
            SuspendLayout();
            // 
            // lsvClientes
            // 
            lsvClientes.Columns.AddRange(new ColumnHeader[] { Nombre, Apellidos, Email, Comentarios });
            lsvClientes.Location = new Point(37, 202);
            lsvClientes.Name = "lsvClientes";
            lsvClientes.Size = new Size(717, 217);
            lsvClientes.SmallImageList = imgListLsv;
            lsvClientes.TabIndex = 1;
            lsvClientes.UseCompatibleStateImageBehavior = false;
            lsvClientes.View = View.Details;
            // 
            // Nombre
            // 
            Nombre.Text = "Nombre";
            Nombre.Width = 100;
            // 
            // Apellidos
            // 
            Apellidos.Text = "Apellidos";
            Apellidos.Width = 90;
            // 
            // Email
            // 
            Email.Text = "Email";
            Email.Width = 200;
            // 
            // Comentarios
            // 
            Comentarios.Text = "Comentarios";
            Comentarios.Width = 325;
            // 
            // imgListLsv
            // 
            imgListLsv.ColorDepth = ColorDepth.Depth32Bit;
            imgListLsv.ImageStream = (ImageListStreamer)resources.GetObject("imgListLsv.ImageStream");
            imgListLsv.TransparentColor = Color.Transparent;
            imgListLsv.Images.SetKeyName(0, "user.png");
            imgListLsv.Images.SetKeyName(1, "home.png");
            // 
            // imgFondoClientes
            // 
            imgFondoClientes.Image = (Image)resources.GetObject("imgFondoClientes.Image");
            imgFondoClientes.InitialImage = (Image)resources.GetObject("imgFondoClientes.InitialImage");
            imgFondoClientes.Location = new Point(37, 42);
            imgFondoClientes.Name = "imgFondoClientes";
            imgFondoClientes.Size = new Size(277, 137);
            imgFondoClientes.SizeMode = PictureBoxSizeMode.StretchImage;
            imgFondoClientes.TabIndex = 8;
            imgFondoClientes.TabStop = false;
            // 
            // lblClientes
            // 
            lblClientes.AutoSize = true;
            lblClientes.Font = new Font("Arial", 15.75F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblClientes.Location = new Point(360, 58);
            lblClientes.Name = "lblClientes";
            lblClientes.Size = new Size(88, 24);
            lblClientes.TabIndex = 9;
            lblClientes.Text = "Ciudad:";
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Arial", 15.75F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label1.Location = new Point(626, 58);
            label1.Name = "label1";
            label1.Size = new Size(66, 24);
            label1.TabIndex = 10;
            label1.Text = "Vista:";
            // 
            // cmbCiudad
            // 
            cmbCiudad.FormattingEnabled = true;
            cmbCiudad.Location = new Point(360, 109);
            cmbCiudad.Name = "cmbCiudad";
            cmbCiudad.Size = new Size(202, 23);
            cmbCiudad.TabIndex = 12;
            // 
            // cmbVista
            // 
            cmbVista.FormattingEnabled = true;
            cmbVista.Location = new Point(626, 109);
            cmbVista.Name = "cmbVista";
            cmbVista.Size = new Size(124, 23);
            cmbVista.TabIndex = 13;
            cmbVista.SelectedIndexChanged += cmbVista_SelectedIndexChanged;
            // 
            // FrmConsultaList
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(cmbVista);
            Controls.Add(cmbCiudad);
            Controls.Add(label1);
            Controls.Add(lblClientes);
            Controls.Add(imgFondoClientes);
            Controls.Add(lsvClientes);
            Name = "FrmConsultaList";
            Text = "FrmConsultaList";
            Load += FrmConsultaList_Load;
            Controls.SetChildIndex(lsvClientes, 0);
            Controls.SetChildIndex(imgFondoClientes, 0);
            Controls.SetChildIndex(lblClientes, 0);
            Controls.SetChildIndex(label1, 0);
            Controls.SetChildIndex(cmbCiudad, 0);
            Controls.SetChildIndex(cmbVista, 0);
            ((System.ComponentModel.ISupportInitialize)imgFondoClientes).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private ListView lsvClientes;
        private ImageList imgListLsv;
        private PictureBox imgFondoClientes;
        private ListBox listBox1;
        private ColumnHeader Nombre;
        private ColumnHeader Apellidos;
        private ColumnHeader Email;
        private ColumnHeader Comentarios;
        private Label lblClientes;
        private Label label1;
        private ComboBox cmbCiudad;
        private ComboBox cmbVista;
    }
}