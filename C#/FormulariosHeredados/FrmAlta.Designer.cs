namespace FormulariosHeredados
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FrmAlta));
            lblClientes = new Label();
            label1 = new Label();
            lsBoxClientes = new ListBox();
            lblApellidos = new Label();
            lblCiudad = new Label();
            toolStrip1 = new ToolStrip();
            strBtnNuevo = new ToolStripButton();
            strBtnGuardar = new ToolStripButton();
            strBtnEliminar = new ToolStripButton();
            picBoxImagenFondo = new PictureBox();
            lblCorreo = new Label();
            lblComentario = new Label();
            lblVip = new Label();
            txtBoxNombre = new TextBox();
            txtBoxApellidos = new TextBox();
            txtBoxCiudad = new TextBox();
            txtBoxCorreo = new TextBox();
            txtBoxComentario = new TextBox();
            chBoxVip = new CheckBox();
            toolStrip1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)picBoxImagenFondo).BeginInit();
            SuspendLayout();
            // 
            // lblClientes
            // 
            lblClientes.AutoSize = true;
            lblClientes.Font = new Font("Arial", 15.75F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblClientes.Location = new Point(105, 98);
            lblClientes.Name = "lblClientes";
            lblClientes.Size = new Size(98, 24);
            lblClientes.TabIndex = 1;
            lblClientes.Text = "Clientes:";
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Arial", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label1.Location = new Point(362, 224);
            label1.Name = "label1";
            label1.Size = new Size(76, 19);
            label1.TabIndex = 2;
            label1.Text = "Nombre:";
            // 
            // lsBoxClientes
            // 
            lsBoxClientes.FormattingEnabled = true;
            lsBoxClientes.ItemHeight = 15;
            lsBoxClientes.Location = new Point(30, 139);
            lsBoxClientes.Name = "lsBoxClientes";
            lsBoxClientes.Size = new Size(258, 289);
            lsBoxClientes.TabIndex = 3;
            lsBoxClientes.DoubleClick += lsBoxClientes_DoubleClick;
            // 
            // lblApellidos
            // 
            lblApellidos.AutoSize = true;
            lblApellidos.Font = new Font("Arial", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblApellidos.Location = new Point(357, 263);
            lblApellidos.Name = "lblApellidos";
            lblApellidos.Size = new Size(86, 19);
            lblApellidos.TabIndex = 4;
            lblApellidos.Text = "Apellidos:";
            // 
            // lblCiudad
            // 
            lblCiudad.AutoSize = true;
            lblCiudad.Font = new Font("Arial", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblCiudad.Location = new Point(365, 300);
            lblCiudad.Name = "lblCiudad";
            lblCiudad.Size = new Size(70, 19);
            lblCiudad.TabIndex = 5;
            lblCiudad.Text = "Ciudad:";
            // 
            // toolStrip1
            // 
            toolStrip1.Items.AddRange(new ToolStripItem[] { strBtnNuevo, strBtnGuardar, strBtnEliminar });
            toolStrip1.Location = new Point(0, 24);
            toolStrip1.Name = "toolStrip1";
            toolStrip1.Size = new Size(800, 25);
            toolStrip1.TabIndex = 6;
            toolStrip1.Text = "toolStrip1";
            // 
            // strBtnNuevo
            // 
            strBtnNuevo.Image = (Image)resources.GetObject("strBtnNuevo.Image");
            strBtnNuevo.ImageTransparentColor = Color.Magenta;
            strBtnNuevo.Name = "strBtnNuevo";
            strBtnNuevo.Size = new Size(62, 22);
            strBtnNuevo.Text = "Nuevo";
            strBtnNuevo.Click += strBtnNuevo_Click;
            // 
            // strBtnGuardar
            // 
            strBtnGuardar.Image = (Image)resources.GetObject("strBtnGuardar.Image");
            strBtnGuardar.ImageTransparentColor = Color.Magenta;
            strBtnGuardar.Name = "strBtnGuardar";
            strBtnGuardar.Size = new Size(69, 22);
            strBtnGuardar.Text = "Guardar";
            strBtnGuardar.Click += strBtnGuardar_Click;
            // 
            // strBtnEliminar
            // 
            strBtnEliminar.Image = (Image)resources.GetObject("strBtnEliminar.Image");
            strBtnEliminar.ImageTransparentColor = Color.Magenta;
            strBtnEliminar.Name = "strBtnEliminar";
            strBtnEliminar.Size = new Size(70, 22);
            strBtnEliminar.Text = "Eliminar";
            // 
            // picBoxImagenFondo
            // 
            picBoxImagenFondo.Image = (Image)resources.GetObject("picBoxImagenFondo.Image");
            picBoxImagenFondo.InitialImage = (Image)resources.GetObject("picBoxImagenFondo.InitialImage");
            picBoxImagenFondo.Location = new Point(460, 52);
            picBoxImagenFondo.Name = "picBoxImagenFondo";
            picBoxImagenFondo.Size = new Size(277, 137);
            picBoxImagenFondo.SizeMode = PictureBoxSizeMode.StretchImage;
            picBoxImagenFondo.TabIndex = 7;
            picBoxImagenFondo.TabStop = false;
            // 
            // lblCorreo
            // 
            lblCorreo.AutoSize = true;
            lblCorreo.Font = new Font("Arial", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblCorreo.Location = new Point(369, 341);
            lblCorreo.Name = "lblCorreo";
            lblCorreo.Size = new Size(62, 19);
            lblCorreo.TabIndex = 8;
            lblCorreo.Text = "E-mail:";
            // 
            // lblComentario
            // 
            lblComentario.AutoSize = true;
            lblComentario.Font = new Font("Arial", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblComentario.Location = new Point(348, 378);
            lblComentario.Name = "lblComentario";
            lblComentario.Size = new Size(104, 19);
            lblComentario.TabIndex = 9;
            lblComentario.Text = "Comentario:";
            // 
            // lblVip
            // 
            lblVip.AutoSize = true;
            lblVip.Font = new Font("Arial", 12F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblVip.Location = new Point(380, 414);
            lblVip.Name = "lblVip";
            lblVip.Size = new Size(40, 19);
            lblVip.TabIndex = 10;
            lblVip.Text = "Vip:";
            // 
            // txtBoxNombre
            // 
            txtBoxNombre.Location = new Point(460, 222);
            txtBoxNombre.Name = "txtBoxNombre";
            txtBoxNombre.Size = new Size(277, 23);
            txtBoxNombre.TabIndex = 11;
            // 
            // txtBoxApellidos
            // 
            txtBoxApellidos.Location = new Point(460, 261);
            txtBoxApellidos.Name = "txtBoxApellidos";
            txtBoxApellidos.Size = new Size(277, 23);
            txtBoxApellidos.TabIndex = 12;
            // 
            // txtBoxCiudad
            // 
            txtBoxCiudad.Location = new Point(460, 298);
            txtBoxCiudad.Name = "txtBoxCiudad";
            txtBoxCiudad.Size = new Size(277, 23);
            txtBoxCiudad.TabIndex = 13;
            // 
            // txtBoxCorreo
            // 
            txtBoxCorreo.Location = new Point(460, 339);
            txtBoxCorreo.Name = "txtBoxCorreo";
            txtBoxCorreo.Size = new Size(277, 23);
            txtBoxCorreo.TabIndex = 14;
            // 
            // txtBoxComentario
            // 
            txtBoxComentario.Location = new Point(460, 376);
            txtBoxComentario.Name = "txtBoxComentario";
            txtBoxComentario.Size = new Size(277, 23);
            txtBoxComentario.TabIndex = 15;
            // 
            // chBoxVip
            // 
            chBoxVip.AutoSize = true;
            chBoxVip.Location = new Point(460, 414);
            chBoxVip.Name = "chBoxVip";
            chBoxVip.Size = new Size(15, 14);
            chBoxVip.TabIndex = 16;
            chBoxVip.UseVisualStyleBackColor = true;
            // 
            // FrmAlta
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(chBoxVip);
            Controls.Add(txtBoxComentario);
            Controls.Add(txtBoxCorreo);
            Controls.Add(txtBoxCiudad);
            Controls.Add(txtBoxApellidos);
            Controls.Add(txtBoxNombre);
            Controls.Add(lblVip);
            Controls.Add(lblComentario);
            Controls.Add(lblCorreo);
            Controls.Add(picBoxImagenFondo);
            Controls.Add(toolStrip1);
            Controls.Add(lblCiudad);
            Controls.Add(lblApellidos);
            Controls.Add(lsBoxClientes);
            Controls.Add(label1);
            Controls.Add(lblClientes);
            Name = "FrmAlta";
            Text = "FormAlta";
            Load += FrmAlta_Load;
            Controls.SetChildIndex(lblClientes, 0);
            Controls.SetChildIndex(label1, 0);
            Controls.SetChildIndex(lsBoxClientes, 0);
            Controls.SetChildIndex(lblApellidos, 0);
            Controls.SetChildIndex(lblCiudad, 0);
            Controls.SetChildIndex(toolStrip1, 0);
            Controls.SetChildIndex(picBoxImagenFondo, 0);
            Controls.SetChildIndex(lblCorreo, 0);
            Controls.SetChildIndex(lblComentario, 0);
            Controls.SetChildIndex(lblVip, 0);
            Controls.SetChildIndex(txtBoxNombre, 0);
            Controls.SetChildIndex(txtBoxApellidos, 0);
            Controls.SetChildIndex(txtBoxCiudad, 0);
            Controls.SetChildIndex(txtBoxCorreo, 0);
            Controls.SetChildIndex(txtBoxComentario, 0);
            Controls.SetChildIndex(chBoxVip, 0);
            toolStrip1.ResumeLayout(false);
            toolStrip1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)picBoxImagenFondo).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label lblClientes;
        private Label label1;
        private ListBox lsBoxClientes;
        private Label lblApellidos;
        private Label lblCiudad;
        private ToolStrip toolStrip1;
        private ToolStripButton strBtnNuevo;
        private ToolStripButton strBtnGuardar;
        private ToolStripButton strBtnEliminar;
        private PictureBox picBoxImagenFondo;
        private Label lblCorreo;
        private Label lblComentario;
        private Label lblVip;
        private TextBox txtBoxNombre;
        private TextBox txtBoxApellidos;
        private TextBox txtBoxCiudad;
        private TextBox txtBoxCorreo;
        private TextBox txtBoxComentario;
        private CheckBox chBoxVip;
    }
}