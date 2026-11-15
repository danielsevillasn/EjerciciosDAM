namespace ModeloExamenA
{
    partial class FrmAlta
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        private void InitializeComponent()
        {
            this.toolStripAlta = new System.Windows.Forms.ToolStrip();
            this.btnNuevo = new System.Windows.Forms.ToolStripButton();
            this.btnGuardar = new System.Windows.Forms.ToolStripButton();
            this.btnEliminar = new System.Windows.Forms.ToolStripButton();
            this.btnLimpiar = new System.Windows.Forms.ToolStripButton();
            this.lblTitulo = new System.Windows.Forms.Label();
            this.lblMatricula = new System.Windows.Forms.Label();
            this.txtMatricula = new System.Windows.Forms.TextBox();
            this.lblMarca = new System.Windows.Forms.Label();
            this.txtMarca = new System.Windows.Forms.TextBox();
            this.lblModelo = new System.Windows.Forms.Label();
            this.txtModelo = new System.Windows.Forms.TextBox();
            this.grpCategoria = new System.Windows.Forms.GroupBox();
            this.rdbFurgoneta = new System.Windows.Forms.RadioButton();
            this.rdbMotocicleta = new System.Windows.Forms.RadioButton();
            this.rdbTurismo = new System.Windows.Forms.RadioButton();
            this.chkElectrico = new System.Windows.Forms.CheckBox();
            this.lblObservaciones = new System.Windows.Forms.Label();
            this.txtObservaciones = new System.Windows.Forms.TextBox();
            this.picFoto = new System.Windows.Forms.PictureBox();
            this.btnCargarFoto = new System.Windows.Forms.Button();
            this.ofdFoto = new System.Windows.Forms.OpenFileDialog();
            this.lblListado = new System.Windows.Forms.Label();
            this.lsbVehiculos = new System.Windows.Forms.ListBox();
            this.toolStripAlta.SuspendLayout();
            this.grpCategoria.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picFoto)).BeginInit();
            this.SuspendLayout();
            // 
            // toolStripAlta
            // 
            this.toolStripAlta.ImageScalingSize = new System.Drawing.Size(20, 20);
            this.toolStripAlta.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnNuevo,
            this.btnGuardar,
            this.btnEliminar,
            this.btnLimpiar});
            this.toolStripAlta.Location = new System.Drawing.Point(0, 28);
            this.toolStripAlta.Name = "toolStripAlta";
            this.toolStripAlta.Size = new System.Drawing.Size(884, 27);
            this.toolStripAlta.TabIndex = 2;
            this.toolStripAlta.Text = "toolStripAcciones";
            // 
            // btnNuevo
            // 
            this.btnNuevo.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnNuevo.Name = "btnNuevo";
            this.btnNuevo.Size = new System.Drawing.Size(76, 24);
            this.btnNuevo.Text = "➕ Nuevo";
            this.btnNuevo.Click += new System.EventHandler(this.btnNuevo_Click);
            // 
            // btnGuardar
            // 
            this.btnGuardar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnGuardar.Name = "btnGuardar";
            this.btnGuardar.Size = new System.Drawing.Size(86, 24);
            this.btnGuardar.Text = "💾 Guardar";
            this.btnGuardar.Click += new System.EventHandler(this.btnGuardar_Click);
            // 
            // btnEliminar
            // 
            this.btnEliminar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnEliminar.Name = "btnEliminar";
            this.btnEliminar.Size = new System.Drawing.Size(87, 24);
            this.btnEliminar.Text = "🗑️ Eliminar";
            this.btnEliminar.Click += new System.EventHandler(this.btnEliminar_Click);
            // 
            // btnLimpiar
            // 
            this.btnLimpiar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnLimpiar.Name = "btnLimpiar";
            this.btnLimpiar.Size = new System.Drawing.Size(83, 24);
            this.btnLimpiar.Text = "🧹 Limpiar";
            this.btnLimpiar.Click += new System.EventHandler(this.btnLimpiar_Click);
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.Font = new System.Drawing.Font("Segoe UI", 14F, System.Drawing.FontStyle.Bold);
            this.lblTitulo.ForeColor = System.Drawing.Color.DarkSlateBlue;
            this.lblTitulo.Location = new System.Drawing.Point(24, 68);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(378, 32);
            this.lblTitulo.TabIndex = 3;
            this.lblTitulo.Text = "Gestión y Registro de Vehículos";
            // 
            // lblMatricula
            // 
            this.lblMatricula.AutoSize = true;
            this.lblMatricula.Location = new System.Drawing.Point(28, 122);
            this.lblMatricula.Name = "lblMatricula";
            this.lblMatricula.Size = new System.Drawing.Size(74, 20);
            this.lblMatricula.TabIndex = 4;
            this.lblMatricula.Text = "Matrícula:";
            // 
            // txtMatricula
            // 
            this.txtMatricula.Location = new System.Drawing.Point(120, 118);
            this.txtMatricula.MaxLength = 10;
            this.txtMatricula.Name = "txtMatricula";
            this.txtMatricula.Size = new System.Drawing.Size(180, 27);
            this.txtMatricula.TabIndex = 5;
            // 
            // lblMarca
            // 
            this.lblMarca.AutoSize = true;
            this.lblMarca.Location = new System.Drawing.Point(28, 165);
            this.lblMarca.Name = "lblMarca";
            this.lblMarca.Size = new System.Drawing.Size(53, 20);
            this.lblMarca.TabIndex = 6;
            this.lblMarca.Text = "Marca:";
            // 
            // txtMarca
            // 
            this.txtMarca.Location = new System.Drawing.Point(120, 161);
            this.txtMarca.Name = "txtMarca";
            this.txtMarca.Size = new System.Drawing.Size(180, 27);
            this.txtMarca.TabIndex = 7;
            // 
            // lblModelo
            // 
            this.lblModelo.AutoSize = true;
            this.lblModelo.Location = new System.Drawing.Point(28, 208);
            this.lblModelo.Name = "lblModelo";
            this.lblModelo.Size = new System.Drawing.Size(64, 20);
            this.lblModelo.TabIndex = 8;
            this.lblModelo.Text = "Modelo:";
            // 
            // txtModelo
            // 
            this.txtModelo.Location = new System.Drawing.Point(120, 204);
            this.txtModelo.Name = "txtModelo";
            this.txtModelo.Size = new System.Drawing.Size(180, 27);
            this.txtModelo.TabIndex = 9;
            // 
            // grpCategoria
            // 
            this.grpCategoria.Controls.Add(this.rdbFurgoneta);
            this.grpCategoria.Controls.Add(this.rdbMotocicleta);
            this.grpCategoria.Controls.Add(this.rdbTurismo);
            this.grpCategoria.Location = new System.Drawing.Point(28, 248);
            this.grpCategoria.Name = "grpCategoria";
            this.grpCategoria.Size = new System.Drawing.Size(272, 108);
            this.grpCategoria.TabIndex = 10;
            this.grpCategoria.TabStop = false;
            this.grpCategoria.Text = "Categoría del Vehículo";
            // 
            // rdbFurgoneta
            // 
            this.rdbFurgoneta.AutoSize = true;
            this.rdbFurgoneta.Location = new System.Drawing.Point(15, 78);
            this.rdbFurgoneta.Name = "rdbFurgoneta";
            this.rdbFurgoneta.Size = new System.Drawing.Size(97, 24);
            this.rdbFurgoneta.TabIndex = 2;
            this.rdbFurgoneta.TabStop = true;
            this.rdbFurgoneta.Text = "Furgoneta";
            this.rdbFurgoneta.UseVisualStyleBackColor = true;
            // 
            // rdbMotocicleta
            // 
            this.rdbMotocicleta.AutoSize = true;
            this.rdbMotocicleta.Location = new System.Drawing.Point(15, 52);
            this.rdbMotocicleta.Name = "rdbMotocicleta";
            this.rdbMotocicleta.Size = new System.Drawing.Size(108, 24);
            this.rdbMotocicleta.TabIndex = 1;
            this.rdbMotocicleta.TabStop = true;
            this.rdbMotocicleta.Text = "Motocicleta";
            this.rdbMotocicleta.UseVisualStyleBackColor = true;
            // 
            // rdbTurismo
            // 
            this.rdbTurismo.AutoSize = true;
            this.rdbTurismo.Checked = true;
            this.rdbTurismo.Location = new System.Drawing.Point(15, 26);
            this.rdbTurismo.Name = "rdbTurismo";
            this.rdbTurismo.Size = new System.Drawing.Size(83, 24);
            this.rdbTurismo.TabIndex = 0;
            this.rdbTurismo.TabStop = true;
            this.rdbTurismo.Text = "Turismo";
            this.rdbTurismo.UseVisualStyleBackColor = true;
            // 
            // chkElectrico
            // 
            this.chkElectrico.AutoSize = true;
            this.chkElectrico.Location = new System.Drawing.Point(28, 368);
            this.chkElectrico.Name = "chkElectrico";
            this.chkElectrico.Size = new System.Drawing.Size(225, 24);
            this.chkElectrico.TabIndex = 11;
            this.chkElectrico.Text = "Vehículo Eléctrico o Híbrido";
            this.chkElectrico.UseVisualStyleBackColor = true;
            // 
            // lblObservaciones
            // 
            this.lblObservaciones.AutoSize = true;
            this.lblObservaciones.Location = new System.Drawing.Point(28, 404);
            this.lblObservaciones.Name = "lblObservaciones";
            this.lblObservaciones.Size = new System.Drawing.Size(108, 20);
            this.lblObservaciones.TabIndex = 12;
            this.lblObservaciones.Text = "Observaciones:";
            // 
            // txtObservaciones
            // 
            this.txtObservaciones.Location = new System.Drawing.Point(28, 430);
            this.txtObservaciones.Multiline = true;
            this.txtObservaciones.Name = "txtObservaciones";
            this.txtObservaciones.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.txtObservaciones.Size = new System.Drawing.Size(272, 85);
            this.txtObservaciones.TabIndex = 13;
            // 
            // picFoto
            // 
            this.picFoto.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.picFoto.Location = new System.Drawing.Point(335, 118);
            this.picFoto.Name = "picFoto";
            this.picFoto.Size = new System.Drawing.Size(180, 150);
            this.picFoto.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.picFoto.TabIndex = 14;
            this.picFoto.TabStop = false;
            // 
            // btnCargarFoto
            // 
            this.btnCargarFoto.Location = new System.Drawing.Point(335, 276);
            this.btnCargarFoto.Name = "btnCargarFoto";
            this.btnCargarFoto.Size = new System.Drawing.Size(180, 32);
            this.btnCargarFoto.TabIndex = 15;
            this.btnCargarFoto.Text = "📁 Cargar Foto...";
            this.btnCargarFoto.UseVisualStyleBackColor = true;
            this.btnCargarFoto.Click += new System.EventHandler(this.btnCargarFoto_Click);
            // 
            // ofdFoto
            // 
            this.ofdFoto.Filter = "Imágenes|*.jpg;*.jpeg;*.png;*.bmp";
            this.ofdFoto.Title = "Seleccionar imagen del vehículo";
            // 
            // lblListado
            // 
            this.lblListado.AutoSize = true;
            this.lblListado.Font = new System.Drawing.Font("Segoe UI", 10F, System.Drawing.FontStyle.Bold);
            this.lblListado.Location = new System.Drawing.Point(540, 92);
            this.lblListado.Name = "lblListado";
            this.lblListado.Size = new System.Drawing.Size(186, 23);
            this.lblListado.TabIndex = 16;
            this.lblListado.Text = "Vehículos Registrados:";
            // 
            // lsbVehiculos
            // 
            this.lsbVehiculos.FormattingEnabled = true;
            this.lsbVehiculos.ItemHeight = 20;
            this.lsbVehiculos.Location = new System.Drawing.Point(544, 118);
            this.lsbVehiculos.Name = "lsbVehiculos";
            this.lsbVehiculos.Size = new System.Drawing.Size(315, 384);
            this.lsbVehiculos.TabIndex = 17;
            this.lsbVehiculos.SelectedIndexChanged += new System.EventHandler(this.lsbVehiculos_SelectedIndexChanged);
            // 
            // FrmAlta
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(884, 561);
            this.Controls.Add(this.lsbVehiculos);
            this.Controls.Add(this.lblListado);
            this.Controls.Add(this.btnCargarFoto);
            this.Controls.Add(this.picFoto);
            this.Controls.Add(this.txtObservaciones);
            this.Controls.Add(this.lblObservaciones);
            this.Controls.Add(this.chkElectrico);
            this.Controls.Add(this.grpCategoria);
            this.Controls.Add(this.txtModelo);
            this.Controls.Add(this.lblModelo);
            this.Controls.Add(this.txtMarca);
            this.Controls.Add(this.lblMarca);
            this.Controls.Add(this.txtMatricula);
            this.Controls.Add(this.lblMatricula);
            this.Controls.Add(this.lblTitulo);
            this.Controls.Add(this.toolStripAlta);
            this.Name = "FrmAlta";
            this.Text = "Gestión de Vehículos - Modelo A (Alta y Mantenimiento)";
            this.Activated += new System.EventHandler(this.FrmAlta_Activated);
            this.Load += new System.EventHandler(this.FrmAlta_Load);
            this.Controls.SetChildIndex(this.toolStripAlta, 0);
            this.Controls.SetChildIndex(this.lblTitulo, 0);
            this.Controls.SetChildIndex(this.lblMatricula, 0);
            this.Controls.SetChildIndex(this.txtMatricula, 0);
            this.Controls.SetChildIndex(this.lblMarca, 0);
            this.Controls.SetChildIndex(this.txtMarca, 0);
            this.Controls.SetChildIndex(this.lblModelo, 0);
            this.Controls.SetChildIndex(this.txtModelo, 0);
            this.Controls.SetChildIndex(this.grpCategoria, 0);
            this.Controls.SetChildIndex(this.chkElectrico, 0);
            this.Controls.SetChildIndex(this.lblObservaciones, 0);
            this.Controls.SetChildIndex(this.txtObservaciones, 0);
            this.Controls.SetChildIndex(this.picFoto, 0);
            this.Controls.SetChildIndex(this.btnCargarFoto, 0);
            this.Controls.SetChildIndex(this.lblListado, 0);
            this.Controls.SetChildIndex(this.lsbVehiculos, 0);
            this.toolStripAlta.ResumeLayout(false);
            this.toolStripAlta.PerformLayout();
            this.grpCategoria.ResumeLayout(false);
            this.grpCategoria.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picFoto)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ToolStrip toolStripAlta;
        private System.Windows.Forms.ToolStripButton btnNuevo;
        private System.Windows.Forms.ToolStripButton btnGuardar;
        private System.Windows.Forms.ToolStripButton btnEliminar;
        private System.Windows.Forms.ToolStripButton btnLimpiar;
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.Label lblMatricula;
        private System.Windows.Forms.TextBox txtMatricula;
        private System.Windows.Forms.Label lblMarca;
        private System.Windows.Forms.TextBox txtMarca;
        private System.Windows.Forms.Label lblModelo;
        private System.Windows.Forms.TextBox txtModelo;
        private System.Windows.Forms.GroupBox grpCategoria;
        private System.Windows.Forms.RadioButton rdbFurgoneta;
        private System.Windows.Forms.RadioButton rdbMotocicleta;
        private System.Windows.Forms.RadioButton rdbTurismo;
        private System.Windows.Forms.CheckBox chkElectrico;
        private System.Windows.Forms.Label lblObservaciones;
        private System.Windows.Forms.TextBox txtObservaciones;
        private System.Windows.Forms.PictureBox picFoto;
        private System.Windows.Forms.Button btnCargarFoto;
        private System.Windows.Forms.OpenFileDialog ofdFoto;
        private System.Windows.Forms.Label lblListado;
        private System.Windows.Forms.ListBox lsbVehiculos;
    }
}
