namespace ModeloExamenA
{
    partial class FrmConsultaTree
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
            this.lblTitulo = new System.Windows.Forms.Label();
            this.trvVehiculos = new System.Windows.Forms.TreeView();
            this.grpDetalles = new System.Windows.Forms.GroupBox();
            this.picDetalleFoto = new System.Windows.Forms.PictureBox();
            this.txtDetObservaciones = new System.Windows.Forms.TextBox();
            this.lblDetObservaciones = new System.Windows.Forms.Label();
            this.txtDetFecha = new System.Windows.Forms.TextBox();
            this.lblDetFecha = new System.Windows.Forms.Label();
            this.txtDetMotor = new System.Windows.Forms.TextBox();
            this.lblDetMotor = new System.Windows.Forms.Label();
            this.txtDetCategoria = new System.Windows.Forms.TextBox();
            this.lblDetCategoria = new System.Windows.Forms.Label();
            this.txtDetModelo = new System.Windows.Forms.TextBox();
            this.lblDetModelo = new System.Windows.Forms.Label();
            this.txtDetMarca = new System.Windows.Forms.TextBox();
            this.lblDetMarca = new System.Windows.Forms.Label();
            this.txtDetMatricula = new System.Windows.Forms.TextBox();
            this.lblDetMatricula = new System.Windows.Forms.Label();
            this.grpDetalles.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picDetalleFoto)).BeginInit();
            this.SuspendLayout();
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.Font = new System.Drawing.Font("Segoe UI", 14F, System.Drawing.FontStyle.Bold);
            this.lblTitulo.ForeColor = System.Drawing.Color.DarkSlateBlue;
            this.lblTitulo.Location = new System.Drawing.Point(24, 45);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(434, 32);
            this.lblTitulo.TabIndex = 2;
            this.lblTitulo.Text = "Consulta Jerárquica en Árbol (TreeView)";
            // 
            // trvVehiculos
            // 
            this.trvVehiculos.Font = new System.Drawing.Font("Segoe UI", 9.5F);
            this.trvVehiculos.Location = new System.Drawing.Point(28, 90);
            this.trvVehiculos.Name = "trvVehiculos";
            this.trvVehiculos.Size = new System.Drawing.Size(310, 425);
            this.trvVehiculos.TabIndex = 3;
            this.trvVehiculos.AfterSelect += new System.Windows.Forms.TreeViewEventHandler(this.trvVehiculos_AfterSelect);
            // 
            // grpDetalles
            // 
            this.grpDetalles.Controls.Add(this.picDetalleFoto);
            this.grpDetalles.Controls.Add(this.txtDetObservaciones);
            this.grpDetalles.Controls.Add(this.lblDetObservaciones);
            this.grpDetalles.Controls.Add(this.txtDetFecha);
            this.grpDetalles.Controls.Add(this.lblDetFecha);
            this.grpDetalles.Controls.Add(this.txtDetMotor);
            this.grpDetalles.Controls.Add(this.lblDetMotor);
            this.grpDetalles.Controls.Add(this.txtDetCategoria);
            this.grpDetalles.Controls.Add(this.lblDetCategoria);
            this.grpDetalles.Controls.Add(this.txtDetModelo);
            this.grpDetalles.Controls.Add(this.lblDetModelo);
            this.grpDetalles.Controls.Add(this.txtDetMarca);
            this.grpDetalles.Controls.Add(this.lblDetMarca);
            this.grpDetalles.Controls.Add(this.txtDetMatricula);
            this.grpDetalles.Controls.Add(this.lblDetMatricula);
            this.grpDetalles.Location = new System.Drawing.Point(360, 90);
            this.grpDetalles.Name = "grpDetalles";
            this.grpDetalles.Size = new System.Drawing.Size(498, 425);
            this.grpDetalles.TabIndex = 4;
            this.grpDetalles.TabStop = false;
            this.grpDetalles.Text = "Detalles del Vehículo Seleccionado";
            // 
            // picDetalleFoto
            // 
            this.picDetalleFoto.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.picDetalleFoto.Location = new System.Drawing.Point(315, 30);
            this.picDetalleFoto.Name = "picDetalleFoto";
            this.picDetalleFoto.Size = new System.Drawing.Size(165, 140);
            this.picDetalleFoto.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.picDetalleFoto.TabIndex = 14;
            this.picDetalleFoto.TabStop = false;
            // 
            // txtDetObservaciones
            // 
            this.txtDetObservaciones.Location = new System.Drawing.Point(125, 290);
            this.txtDetObservaciones.Multiline = true;
            this.txtDetObservaciones.Name = "txtDetObservaciones";
            this.txtDetObservaciones.ReadOnly = true;
            this.txtDetObservaciones.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.txtDetObservaciones.Size = new System.Drawing.Size(355, 115);
            this.txtDetObservaciones.TabIndex = 13;
            // 
            // lblDetObservaciones
            // 
            this.lblDetObservaciones.AutoSize = true;
            this.lblDetObservaciones.Location = new System.Drawing.Point(15, 293);
            this.lblDetObservaciones.Name = "lblDetObservaciones";
            this.lblDetObservaciones.Size = new System.Drawing.Size(108, 20);
            this.lblDetObservaciones.TabIndex = 12;
            this.lblDetObservaciones.Text = "Observaciones:";
            // 
            // txtDetFecha
            // 
            this.txtDetFecha.Location = new System.Drawing.Point(125, 245);
            this.txtDetFecha.Name = "txtDetFecha";
            this.txtDetFecha.ReadOnly = true;
            this.txtDetFecha.Size = new System.Drawing.Size(170, 27);
            this.txtDetFecha.TabIndex = 11;
            // 
            // lblDetFecha
            // 
            this.lblDetFecha.AutoSize = true;
            this.lblDetFecha.Location = new System.Drawing.Point(15, 248);
            this.lblDetFecha.Name = "lblDetFecha";
            this.lblDetFecha.Size = new System.Drawing.Size(106, 20);
            this.lblDetFecha.TabIndex = 10;
            this.lblDetFecha.Text = "Fecha Registro:";
            // 
            // txtDetMotor
            // 
            this.txtDetMotor.Location = new System.Drawing.Point(125, 202);
            this.txtDetMotor.Name = "txtDetMotor";
            this.txtDetMotor.ReadOnly = true;
            this.txtDetMotor.Size = new System.Drawing.Size(170, 27);
            this.txtDetMotor.TabIndex = 9;
            // 
            // lblDetMotor
            // 
            this.lblDetMotor.AutoSize = true;
            this.lblDetMotor.Location = new System.Drawing.Point(15, 205);
            this.lblDetMotor.Name = "lblDetMotor";
            this.lblDetMotor.Size = new System.Drawing.Size(100, 20);
            this.lblDetMotor.TabIndex = 8;
            this.lblDetMotor.Text = "Motorización:";
            // 
            // txtDetCategoria
            // 
            this.txtDetCategoria.Location = new System.Drawing.Point(125, 158);
            this.txtDetCategoria.Name = "txtDetCategoria";
            this.txtDetCategoria.ReadOnly = true;
            this.txtDetCategoria.Size = new System.Drawing.Size(170, 27);
            this.txtDetCategoria.TabIndex = 7;
            // 
            // lblDetCategoria
            // 
            this.lblDetCategoria.AutoSize = true;
            this.lblDetCategoria.Location = new System.Drawing.Point(15, 161);
            this.lblDetCategoria.Name = "lblDetCategoria";
            this.lblDetCategoria.Size = new System.Drawing.Size(77, 20);
            this.lblDetCategoria.TabIndex = 6;
            this.lblDetCategoria.Text = "Categoría:";
            // 
            // txtDetModelo
            // 
            this.txtDetModelo.Location = new System.Drawing.Point(125, 115);
            this.txtDetModelo.Name = "txtDetModelo";
            this.txtDetModelo.ReadOnly = true;
            this.txtDetModelo.Size = new System.Drawing.Size(170, 27);
            this.txtDetModelo.TabIndex = 5;
            // 
            // lblDetModelo
            // 
            this.lblDetModelo.AutoSize = true;
            this.lblDetModelo.Location = new System.Drawing.Point(15, 118);
            this.lblDetModelo.Name = "lblDetModelo";
            this.lblDetModelo.Size = new System.Drawing.Size(64, 20);
            this.lblDetModelo.TabIndex = 4;
            this.lblDetModelo.Text = "Modelo:";
            // 
            // txtDetMarca
            // 
            this.txtDetMarca.Location = new System.Drawing.Point(125, 72);
            this.txtDetMarca.Name = "txtDetMarca";
            this.txtDetMarca.ReadOnly = true;
            this.txtDetMarca.Size = new System.Drawing.Size(170, 27);
            this.txtDetMarca.TabIndex = 3;
            // 
            // lblDetMarca
            // 
            this.lblDetMarca.AutoSize = true;
            this.lblDetMarca.Location = new System.Drawing.Point(15, 75);
            this.lblDetMarca.Name = "lblDetMarca";
            this.lblDetMarca.Size = new System.Drawing.Size(53, 20);
            this.lblDetMarca.TabIndex = 2;
            this.lblDetMarca.Text = "Marca:";
            // 
            // txtDetMatricula
            // 
            this.txtDetMatricula.Location = new System.Drawing.Point(125, 30);
            this.txtDetMatricula.Name = "txtDetMatricula";
            this.txtDetMatricula.ReadOnly = true;
            this.txtDetMatricula.Size = new System.Drawing.Size(170, 27);
            this.txtDetMatricula.TabIndex = 1;
            // 
            // lblDetMatricula
            // 
            this.lblDetMatricula.AutoSize = true;
            this.lblDetMatricula.Location = new System.Drawing.Point(15, 33);
            this.lblDetMatricula.Name = "lblDetMatricula";
            this.lblDetMatricula.Size = new System.Drawing.Size(74, 20);
            this.lblDetMatricula.TabIndex = 0;
            this.lblDetMatricula.Text = "Matrícula:";
            // 
            // FrmConsultaTree
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(884, 561);
            this.Controls.Add(this.grpDetalles);
            this.Controls.Add(this.trvVehiculos);
            this.Controls.Add(this.lblTitulo);
            this.Name = "FrmConsultaTree";
            this.Text = "Gestión de Vehículos - Modelo A (Consulta en Árbol)";
            this.Activated += new System.EventHandler(this.FrmConsultaTree_Activated);
            this.Load += new System.EventHandler(this.FrmConsultaTree_Load);
            this.Controls.SetChildIndex(this.lblTitulo, 0);
            this.Controls.SetChildIndex(this.trvVehiculos, 0);
            this.Controls.SetChildIndex(this.grpDetalles, 0);
            this.grpDetalles.ResumeLayout(false);
            this.grpDetalles.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picDetalleFoto)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.TreeView trvVehiculos;
        private System.Windows.Forms.GroupBox grpDetalles;
        private System.Windows.Forms.Label lblDetMatricula;
        private System.Windows.Forms.TextBox txtDetMatricula;
        private System.Windows.Forms.Label lblDetMarca;
        private System.Windows.Forms.TextBox txtDetMarca;
        private System.Windows.Forms.Label lblDetModelo;
        private System.Windows.Forms.TextBox txtDetModelo;
        private System.Windows.Forms.Label lblDetCategoria;
        private System.Windows.Forms.TextBox txtDetCategoria;
        private System.Windows.Forms.Label lblDetMotor;
        private System.Windows.Forms.TextBox txtDetMotor;
        private System.Windows.Forms.Label lblDetFecha;
        private System.Windows.Forms.TextBox txtDetFecha;
        private System.Windows.Forms.Label lblDetObservaciones;
        private System.Windows.Forms.TextBox txtDetObservaciones;
        private System.Windows.Forms.PictureBox picDetalleFoto;
    }
}
