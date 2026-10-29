namespace FormulariosHeredados
{
    partial class FrmConsultaTree
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FrmConsultaTree));
            trvClientes = new TreeView();
            imgListLsv = new ImageList(components);
            txtBoxComentario = new TextBox();
            txtBoxCorreo = new TextBox();
            txtBoxCiudad = new TextBox();
            txtBoxApellidos = new TextBox();
            txtBoxNombre = new TextBox();
            lblComentario = new Label();
            lblCorreo = new Label();
            lblCiudad = new Label();
            lblApellidos = new Label();
            label1 = new Label();
            picBoxImagenFondo = new PictureBox();
            ((System.ComponentModel.ISupportInitialize)picBoxImagenFondo).BeginInit();
            SuspendLayout();
            // 
            // trvClientes
            // 
            trvClientes.ImageIndex = 0;
            trvClientes.ImageList = imgListLsv;
            trvClientes.Location = new Point(48, 191);
            trvClientes.Name = "trvClientes";
            trvClientes.SelectedImageIndex = 0;
            trvClientes.Size = new Size(310, 229);
            trvClientes.TabIndex = 1;
            trvClientes.AfterSelect += trvClientes_AfterSelect;
            // 
            // imgListLsv
            // 
            imgListLsv.ColorDepth = ColorDepth.Depth32Bit;
            imgListLsv.ImageStream = (ImageListStreamer)resources.GetObject("imgListLsv.ImageStream");
            imgListLsv.TransparentColor = Color.Transparent;
            imgListLsv.Images.SetKeyName(0, "home.png");
            imgListLsv.Images.SetKeyName(1, "user.png");
            imgListLsv.Images.SetKeyName(2, "vip.png");
            // 
            // txtBoxComentario
            // 
            txtBoxComentario.Location = new Point(488, 358);
            txtBoxComentario.Multiline = true;
            txtBoxComentario.Name = "txtBoxComentario";
            txtBoxComentario.Size = new Size(277, 49);
            txtBoxComentario.TabIndex = 25;
            // 
            // txtBoxCorreo
            // 
            txtBoxCorreo.Location = new Point(488, 321);
            txtBoxCorreo.Name = "txtBoxCorreo";
            txtBoxCorreo.Size = new Size(277, 23);
            txtBoxCorreo.TabIndex = 24;
            // 
            // txtBoxCiudad
            // 
            txtBoxCiudad.Location = new Point(488, 280);
            txtBoxCiudad.Name = "txtBoxCiudad";
            txtBoxCiudad.Size = new Size(277, 23);
            txtBoxCiudad.TabIndex = 23;
            // 
            // txtBoxApellidos
            // 
            txtBoxApellidos.Location = new Point(488, 243);
            txtBoxApellidos.Name = "txtBoxApellidos";
            txtBoxApellidos.Size = new Size(277, 23);
            txtBoxApellidos.TabIndex = 22;
            // 
            // txtBoxNombre
            // 
            txtBoxNombre.Location = new Point(488, 204);
            txtBoxNombre.Name = "txtBoxNombre";
            txtBoxNombre.Size = new Size(277, 23);
            txtBoxNombre.TabIndex = 21;
            // 
            // lblComentario
            // 
            lblComentario.AutoSize = true;
            lblComentario.Font = new Font("Arial", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblComentario.Location = new Point(376, 360);
            lblComentario.Name = "lblComentario";
            lblComentario.Size = new Size(104, 19);
            lblComentario.TabIndex = 20;
            lblComentario.Text = "Comentario:";
            // 
            // lblCorreo
            // 
            lblCorreo.AutoSize = true;
            lblCorreo.Font = new Font("Arial", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblCorreo.Location = new Point(397, 323);
            lblCorreo.Name = "lblCorreo";
            lblCorreo.Size = new Size(62, 19);
            lblCorreo.TabIndex = 19;
            lblCorreo.Text = "E-mail:";
            // 
            // lblCiudad
            // 
            lblCiudad.AutoSize = true;
            lblCiudad.Font = new Font("Arial", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblCiudad.Location = new Point(393, 282);
            lblCiudad.Name = "lblCiudad";
            lblCiudad.Size = new Size(70, 19);
            lblCiudad.TabIndex = 18;
            lblCiudad.Text = "Ciudad:";
            // 
            // lblApellidos
            // 
            lblApellidos.AutoSize = true;
            lblApellidos.Font = new Font("Arial", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblApellidos.Location = new Point(385, 245);
            lblApellidos.Name = "lblApellidos";
            lblApellidos.Size = new Size(86, 19);
            lblApellidos.TabIndex = 17;
            lblApellidos.Text = "Apellidos:";
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Arial", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label1.Location = new Point(390, 206);
            label1.Name = "label1";
            label1.Size = new Size(76, 19);
            label1.TabIndex = 16;
            label1.Text = "Nombre:";
            // 
            // picBoxImagenFondo
            // 
            picBoxImagenFondo.Image = (Image)resources.GetObject("picBoxImagenFondo.Image");
            picBoxImagenFondo.InitialImage = (Image)resources.GetObject("picBoxImagenFondo.InitialImage");
            picBoxImagenFondo.Location = new Point(48, 27);
            picBoxImagenFondo.Name = "picBoxImagenFondo";
            picBoxImagenFondo.Size = new Size(310, 137);
            picBoxImagenFondo.SizeMode = PictureBoxSizeMode.StretchImage;
            picBoxImagenFondo.TabIndex = 26;
            picBoxImagenFondo.TabStop = false;
            // 
            // FrmConsultaTree
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(picBoxImagenFondo);
            Controls.Add(txtBoxComentario);
            Controls.Add(txtBoxCorreo);
            Controls.Add(txtBoxCiudad);
            Controls.Add(txtBoxApellidos);
            Controls.Add(txtBoxNombre);
            Controls.Add(lblComentario);
            Controls.Add(lblCorreo);
            Controls.Add(lblCiudad);
            Controls.Add(lblApellidos);
            Controls.Add(label1);
            Controls.Add(trvClientes);
            Name = "FrmConsultaTree";
            Text = "FrmConsultaTree";
            Load += FrmConsultaTree_Load;
            Controls.SetChildIndex(trvClientes, 0);
            Controls.SetChildIndex(label1, 0);
            Controls.SetChildIndex(lblApellidos, 0);
            Controls.SetChildIndex(lblCiudad, 0);
            Controls.SetChildIndex(lblCorreo, 0);
            Controls.SetChildIndex(lblComentario, 0);
            Controls.SetChildIndex(txtBoxNombre, 0);
            Controls.SetChildIndex(txtBoxApellidos, 0);
            Controls.SetChildIndex(txtBoxCiudad, 0);
            Controls.SetChildIndex(txtBoxCorreo, 0);
            Controls.SetChildIndex(txtBoxComentario, 0);
            Controls.SetChildIndex(picBoxImagenFondo, 0);
            ((System.ComponentModel.ISupportInitialize)picBoxImagenFondo).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TreeView trvClientes;
        private ImageList imgListLsv;
        private TextBox txtBoxComentario;
        private TextBox txtBoxCorreo;
        private TextBox txtBoxCiudad;
        private TextBox txtBoxApellidos;
        private TextBox txtBoxNombre;
        private Label lblComentario;
        private Label lblCorreo;
        private Label lblCiudad;
        private Label lblApellidos;
        private Label label1;
        private PictureBox picBoxImagenFondo;
    }
}