namespace Misiones_Espaciales
{
    partial class FrmAlta
    {
        private System.ComponentModel.IContainer components = null;

        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador

        private void InitializeComponent()
        {
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.tsbNuevo = new System.Windows.Forms.ToolStripButton();
            this.tsbGuardar = new System.Windows.Forms.ToolStripButton();
            this.tsbEliminar = new System.Windows.Forms.ToolStripButton();
            this.tsbLimpiar = new System.Windows.Forms.ToolStripButton();
            this.lblCodigo = new System.Windows.Forms.Label();
            this.txtCodigo = new System.Windows.Forms.TextBox();
            this.lblNombre = new System.Windows.Forms.Label();
            this.txtNombre = new System.Windows.Forms.TextBox();
            this.lblDestino = new System.Windows.Forms.Label();
            this.cmbDestino = new System.Windows.Forms.ComboBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.rdbOrbital = new System.Windows.Forms.RadioButton();
            this.rdbRover = new System.Windows.Forms.RadioButton();
            this.rdbTelescopio = new System.Windows.Forms.RadioButton();
            this.chkTripulada = new System.Windows.Forms.CheckBox();
            this.lblObservaciones = new System.Windows.Forms.Label();
            this.txtObservaciones = new System.Windows.Forms.TextBox();
            this.picInsignia = new System.Windows.Forms.PictureBox();
            this.btnCargarImagen = new System.Windows.Forms.Button();
            this.lsbMisiones = new System.Windows.Forms.ListBox();
            this.lblListado = new System.Windows.Forms.Label();
            this.toolStrip1.SuspendLayout();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picInsignia)).BeginInit();
            this.SuspendLayout();

            // toolStrip1
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.tsbNuevo,
            this.tsbGuardar,
            this.tsbEliminar,
            this.tsbLimpiar});
            this.toolStrip1.Location = new System.Drawing.Point(0, 24);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(800, 25);
            this.toolStrip1.TabIndex = 2;
            this.toolStrip1.Text = "toolStrip1";

            // tsbNuevo
            this.tsbNuevo.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tsbNuevo.Name = "tsbNuevo";
            this.tsbNuevo.Size = new System.Drawing.Size(55, 22);
            this.tsbNuevo.Text = "Nuevo";
            this.tsbNuevo.Click += new System.EventHandler(this.tsbNuevo_Click);

            // tsbGuardar
            this.tsbGuardar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tsbGuardar.Name = "tsbGuardar";
            this.tsbGuardar.Size = new System.Drawing.Size(64, 22);
            this.tsbGuardar.Text = "Guardar";
            this.tsbGuardar.Click += new System.EventHandler(this.tsbGuardar_Click);

            // tsbEliminar
            this.tsbEliminar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tsbEliminar.Name = "tsbEliminar";
            this.tsbEliminar.Size = new System.Drawing.Size(66, 22);
            this.tsbEliminar.Text = "Eliminar";
            this.tsbEliminar.Click += new System.EventHandler(this.tsbEliminar_Click);

            // tsbLimpiar
            this.tsbLimpiar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tsbLimpiar.Name = "tsbLimpiar";
            this.tsbLimpiar.Size = new System.Drawing.Size(61, 22);
            this.tsbLimpiar.Text = "Limpiar";
            this.tsbLimpiar.Click += new System.EventHandler(this.tsbLimpiar_Click);

            // lblCodigo
            this.lblCodigo.AutoSize = true;
            this.lblCodigo.Location = new System.Drawing.Point(20, 60);
            this.lblCodigo.Name = "lblCodigo";
            this.lblCodigo.Size = new System.Drawing.Size(44, 13);
            this.lblCodigo.TabIndex = 3;
            this.lblCodigo.Text = "Código:";

            // txtCodigo
            this.txtCodigo.Location = new System.Drawing.Point(80, 57);
            this.txtCodigo.Name = "txtCodigo";
            this.txtCodigo.Size = new System.Drawing.Size(200, 20);
            this.txtCodigo.TabIndex = 4;

            // lblNombre
            this.lblNombre.AutoSize = true;
            this.lblNombre.Location = new System.Drawing.Point(20, 90);
            this.lblNombre.Name = "lblNombre";
            this.lblNombre.Size = new System.Drawing.Size(50, 13);
            this.lblNombre.TabIndex = 5;
            this.lblNombre.Text = "Nombre:";

            // txtNombre
            this.txtNombre.Location = new System.Drawing.Point(80, 87);
            this.txtNombre.Name = "txtNombre";
            this.txtNombre.Size = new System.Drawing.Size(200, 20);
            this.txtNombre.TabIndex = 6;

            // lblDestino
            this.lblDestino.AutoSize = true;
            this.lblDestino.Location = new System.Drawing.Point(20, 120);
            this.lblDestino.Name = "lblDestino";
            this.lblDestino.Size = new System.Drawing.Size(45, 13);
            this.lblDestino.TabIndex = 7;
            this.lblDestino.Text = "Destino:";

            // cmbDestino
            this.cmbDestino.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbDestino.FormattingEnabled = true;
            this.cmbDestino.Location = new System.Drawing.Point(80, 117);
            this.cmbDestino.Name = "cmbDestino";
            this.cmbDestino.Size = new System.Drawing.Size(200, 21);
            this.cmbDestino.TabIndex = 8;

            // groupBox1
            this.groupBox1.Controls.Add(this.rdbOrbital);
            this.groupBox1.Controls.Add(this.rdbRover);
            this.groupBox1.Controls.Add(this.rdbTelescopio);
            this.groupBox1.Location = new System.Drawing.Point(20, 145);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(260, 80);
            this.groupBox1.TabIndex = 9;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Tipo de Nave";

            // rdbOrbital
            this.rdbOrbital.AutoSize = true;
            this.rdbOrbital.Checked = true;
            this.rdbOrbital.Location = new System.Drawing.Point(15, 20);
            this.rdbOrbital.Name = "rdbOrbital";
            this.rdbOrbital.Size = new System.Drawing.Size(90, 17);
            this.rdbOrbital.TabIndex = 0;
            this.rdbOrbital.TabStop = true;
            this.rdbOrbital.Text = "Sonda Orbital";
            this.rdbOrbital.UseVisualStyleBackColor = true;

            // rdbRover
            this.rdbRover.AutoSize = true;
            this.rdbRover.Location = new System.Drawing.Point(15, 43);
            this.rdbRover.Name = "rdbRover";
            this.rdbRover.Size = new System.Drawing.Size(115, 17);
            this.rdbRover.TabIndex = 1;
            this.rdbRover.Text = "Rover de Superficie";
            this.rdbRover.UseVisualStyleBackColor = true;

            // rdbTelescopio
            this.rdbTelescopio.AutoSize = true;
            this.rdbTelescopio.Location = new System.Drawing.Point(15, 66);
            this.rdbTelescopio.Name = "rdbTelescopio";
            this.rdbTelescopio.Size = new System.Drawing.Size(110, 17);
            this.rdbTelescopio.TabIndex = 2;
            this.rdbTelescopio.Text = "Telescopio Espacial";
            this.rdbTelescopio.UseVisualStyleBackColor = true;

            // chkTripulada
            this.chkTripulada.AutoSize = true;
            this.chkTripulada.Location = new System.Drawing.Point(80, 230);
            this.chkTripulada.Name = "chkTripulada";
            this.chkTripulada.Size = new System.Drawing.Size(110, 17);
            this.chkTripulada.TabIndex = 10;
            this.chkTripulada.Text = "Misión Tripulada";
            this.chkTripulada.UseVisualStyleBackColor = true;

            // lblObservaciones
            this.lblObservaciones.AutoSize = true;
            this.lblObservaciones.Location = new System.Drawing.Point(20, 260);
            this.lblObservaciones.Name = "lblObservaciones";
            this.lblObservaciones.Size = new System.Drawing.Size(78, 13);
            this.lblObservaciones.TabIndex = 11;
            this.lblObservaciones.Text = "Observaciones:";

            // txtObservaciones
            this.txtObservaciones.Location = new System.Drawing.Point(20, 276);
            this.txtObservaciones.Multiline = true;
            this.txtObservaciones.Name = "txtObservaciones";
            this.txtObservaciones.Size = new System.Drawing.Size(300, 60);
            this.txtObservaciones.TabIndex = 12;

            // picInsignia
            this.picInsignia.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.picInsignia.Location = new System.Drawing.Point(340, 57);
            this.picInsignia.Name = "picInsignia";
            this.picInsignia.Size = new System.Drawing.Size(150, 150);
            this.picInsignia.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.picInsignia.TabIndex = 13;
            this.picInsignia.TabStop = false;

            // btnCargarImagen
            this.btnCargarImagen.Location = new System.Drawing.Point(340, 213);
            this.btnCargarImagen.Name = "btnCargarImagen";
            this.btnCargarImagen.Size = new System.Drawing.Size(150, 23);
            this.btnCargarImagen.TabIndex = 14;
            this.btnCargarImagen.Text = "Cargar Insignia";
            this.btnCargarImagen.UseVisualStyleBackColor = true;
            this.btnCargarImagen.Click += new System.EventHandler(this.btnCargarImagen_Click);

            // lblListado
            this.lblListado.AutoSize = true;
            this.lblListado.Location = new System.Drawing.Point(520, 60);
            this.lblListado.Name = "lblListado";
            this.lblListado.Size = new System.Drawing.Size(90, 13);
            this.lblListado.TabIndex = 15;
            this.lblListado.Text = "Misiones registradas:";

            // lsbMisiones
            this.lsbMisiones.FormattingEnabled = true;
            this.lsbMisiones.Location = new System.Drawing.Point(520, 76);
            this.lsbMisiones.Name = "lsbMisiones";
            this.lsbMisiones.Size = new System.Drawing.Size(260, 251);
            this.lsbMisiones.TabIndex = 16;
            this.lsbMisiones.SelectedIndexChanged += new System.EventHandler(this.lsbMisiones_SelectedIndexChanged);

            // FrmAlta
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lsbMisiones);
            this.Controls.Add(this.lblListado);
            this.Controls.Add(this.btnCargarImagen);
            this.Controls.Add(this.picInsignia);
            this.Controls.Add(this.txtObservaciones);
            this.Controls.Add(this.lblObservaciones);
            this.Controls.Add(this.chkTripulada);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.cmbDestino);
            this.Controls.Add(this.lblDestino);
            this.Controls.Add(this.txtNombre);
            this.Controls.Add(this.lblNombre);
            this.Controls.Add(this.txtCodigo);
            this.Controls.Add(this.lblCodigo);
            this.Controls.Add(this.toolStrip1);
            this.Name = "FrmAlta";
            this.Text = "Alta y Mantenimiento de Misiones";
            this.Load += new System.EventHandler(this.FrmAlta_Load);
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picInsignia)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();
        }

        #endregion

        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripButton tsbNuevo;
        private System.Windows.Forms.ToolStripButton tsbGuardar;
        private System.Windows.Forms.ToolStripButton tsbEliminar;
        private System.Windows.Forms.ToolStripButton tsbLimpiar;
        private System.Windows.Forms.Label lblCodigo;
        private System.Windows.Forms.TextBox txtCodigo;
        private System.Windows.Forms.Label lblNombre;
        private System.Windows.Forms.TextBox txtNombre;
        private System.Windows.Forms.Label lblDestino;
        private System.Windows.Forms.ComboBox cmbDestino;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton rdbOrbital;
        private System.Windows.Forms.RadioButton rdbRover;
        private System.Windows.Forms.RadioButton rdbTelescopio;
        private System.Windows.Forms.CheckBox chkTripulada;
        private System.Windows.Forms.Label lblObservaciones;
        private System.Windows.Forms.TextBox txtObservaciones;
        private System.Windows.Forms.PictureBox picInsignia;
        private System.Windows.Forms.Button btnCargarImagen;
        private System.Windows.Forms.ListBox lsbMisiones;
        private System.Windows.Forms.Label lblListado;
    }
}
