namespace Misiones_Espaciales
{
    partial class FrmConsultaTree
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
            this.trvMisiones = new System.Windows.Forms.TreeView();
            this.panelDetalles = new System.Windows.Forms.Panel();
            this.lblDetalles = new System.Windows.Forms.Label();
            this.lblCodigo = new System.Windows.Forms.Label();
            this.txtCodigo = new System.Windows.Forms.TextBox();
            this.lblNombre = new System.Windows.Forms.Label();
            this.txtNombre = new System.Windows.Forms.TextBox();
            this.lblDestino = new System.Windows.Forms.Label();
            this.txtDestino = new System.Windows.Forms.TextBox();
            this.lblTipo = new System.Windows.Forms.Label();
            this.txtTipo = new System.Windows.Forms.TextBox();
            this.lblTripulacion = new System.Windows.Forms.Label();
            this.txtTripulacion = new System.Windows.Forms.TextBox();
            this.lblFecha = new System.Windows.Forms.Label();
            this.txtFecha = new System.Windows.Forms.TextBox();
            this.picDetalle = new System.Windows.Forms.PictureBox();
            this.panelDetalles.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picDetalle)).BeginInit();
            this.SuspendLayout();

            // trvMisiones
            this.trvMisiones.Location = new System.Drawing.Point(20, 35);
            this.trvMisiones.Name = "trvMisiones";
            this.trvMisiones.Size = new System.Drawing.Size(300, 390);
            this.trvMisiones.TabIndex = 0;
            this.trvMisiones.AfterSelect += new System.Windows.Forms.TreeViewEventHandler(this.trvMisiones_AfterSelect);

            // panelDetalles
            this.panelDetalles.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.panelDetalles.Controls.Add(this.lblDetalles);
            this.panelDetalles.Controls.Add(this.lblCodigo);
            this.panelDetalles.Controls.Add(this.txtCodigo);
            this.panelDetalles.Controls.Add(this.lblNombre);
            this.panelDetalles.Controls.Add(this.txtNombre);
            this.panelDetalles.Controls.Add(this.lblDestino);
            this.panelDetalles.Controls.Add(this.txtDestino);
            this.panelDetalles.Controls.Add(this.lblTipo);
            this.panelDetalles.Controls.Add(this.txtTipo);
            this.panelDetalles.Controls.Add(this.lblTripulacion);
            this.panelDetalles.Controls.Add(this.txtTripulacion);
            this.panelDetalles.Controls.Add(this.lblFecha);
            this.panelDetalles.Controls.Add(this.txtFecha);
            this.panelDetalles.Controls.Add(this.picDetalle);
            this.panelDetalles.Location = new System.Drawing.Point(340, 35);
            this.panelDetalles.Name = "panelDetalles";
            this.panelDetalles.Size = new System.Drawing.Size(440, 390);
            this.panelDetalles.TabIndex = 1;

            // lblDetalles
            this.lblDetalles.AutoSize = true;
            this.lblDetalles.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblDetalles.Location = new System.Drawing.Point(15, 10);
            this.lblDetalles.Name = "lblDetalles";
            this.lblDetalles.Size = new System.Drawing.Size(120, 15);
            this.lblDetalles.TabIndex = 0;
            this.lblDetalles.Text = "Detalles de la Misión";

            // lblCodigo
            this.lblCodigo.AutoSize = true;
            this.lblCodigo.Location = new System.Drawing.Point(15, 40);
            this.lblCodigo.Name = "lblCodigo";
            this.lblCodigo.Size = new System.Drawing.Size(44, 13);
            this.lblCodigo.TabIndex = 1;
            this.lblCodigo.Text = "Código:";

            // txtCodigo
            this.txtCodigo.BackColor = System.Drawing.SystemColors.Control;
            this.txtCodigo.Location = new System.Drawing.Point(100, 37);
            this.txtCodigo.Name = "txtCodigo";
            this.txtCodigo.ReadOnly = true;
            this.txtCodigo.Size = new System.Drawing.Size(200, 20);
            this.txtCodigo.TabIndex = 2;

            // lblNombre
            this.lblNombre.AutoSize = true;
            this.lblNombre.Location = new System.Drawing.Point(15, 70);
            this.lblNombre.Name = "lblNombre";
            this.lblNombre.Size = new System.Drawing.Size(50, 13);
            this.lblNombre.TabIndex = 3;
            this.lblNombre.Text = "Nombre:";

            // txtNombre
            this.txtNombre.BackColor = System.Drawing.SystemColors.Control;
            this.txtNombre.Location = new System.Drawing.Point(100, 67);
            this.txtNombre.Name = "txtNombre";
            this.txtNombre.ReadOnly = true;
            this.txtNombre.Size = new System.Drawing.Size(200, 20);
            this.txtNombre.TabIndex = 4;

            // lblDestino
            this.lblDestino.AutoSize = true;
            this.lblDestino.Location = new System.Drawing.Point(15, 100);
            this.lblDestino.Name = "lblDestino";
            this.lblDestino.Size = new System.Drawing.Size(45, 13);
            this.lblDestino.TabIndex = 5;
            this.lblDestino.Text = "Destino:";

            // txtDestino
            this.txtDestino.BackColor = System.Drawing.SystemColors.Control;
            this.txtDestino.Location = new System.Drawing.Point(100, 97);
            this.txtDestino.Name = "txtDestino";
            this.txtDestino.ReadOnly = true;
            this.txtDestino.Size = new System.Drawing.Size(200, 20);
            this.txtDestino.TabIndex = 6;

            // lblTipo
            this.lblTipo.AutoSize = true;
            this.lblTipo.Location = new System.Drawing.Point(15, 130);
            this.lblTipo.Name = "lblTipo";
            this.lblTipo.Size = new System.Drawing.Size(28, 13);
            this.lblTipo.TabIndex = 7;
            this.lblTipo.Text = "Tipo:";

            // txtTipo
            this.txtTipo.BackColor = System.Drawing.SystemColors.Control;
            this.txtTipo.Location = new System.Drawing.Point(100, 127);
            this.txtTipo.Name = "txtTipo";
            this.txtTipo.ReadOnly = true;
            this.txtTipo.Size = new System.Drawing.Size(200, 20);
            this.txtTipo.TabIndex = 8;

            // lblTripulacion
            this.lblTripulacion.AutoSize = true;
            this.lblTripulacion.Location = new System.Drawing.Point(15, 160);
            this.lblTripulacion.Name = "lblTripulacion";
            this.lblTripulacion.Size = new System.Drawing.Size(65, 13);
            this.lblTripulacion.TabIndex = 9;
            this.lblTripulacion.Text = "Tripulación:";

            // txtTripulacion
            this.txtTripulacion.BackColor = System.Drawing.SystemColors.Control;
            this.txtTripulacion.Location = new System.Drawing.Point(100, 157);
            this.txtTripulacion.Name = "txtTripulacion";
            this.txtTripulacion.ReadOnly = true;
            this.txtTripulacion.Size = new System.Drawing.Size(200, 20);
            this.txtTripulacion.TabIndex = 10;

            // lblFecha
            this.lblFecha.AutoSize = true;
            this.lblFecha.Location = new System.Drawing.Point(15, 190);
            this.lblFecha.Name = "lblFecha";
            this.lblFecha.Size = new System.Drawing.Size(77, 13);
            this.lblFecha.TabIndex = 11;
            this.lblFecha.Text = "Fecha Registro:";

            // txtFecha
            this.txtFecha.BackColor = System.Drawing.SystemColors.Control;
            this.txtFecha.Location = new System.Drawing.Point(100, 187);
            this.txtFecha.Name = "txtFecha";
            this.txtFecha.ReadOnly = true;
            this.txtFecha.Size = new System.Drawing.Size(200, 20);
            this.txtFecha.TabIndex = 12;

            // picDetalle
            this.picDetalle.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.picDetalle.Location = new System.Drawing.Point(20, 220);
            this.picDetalle.Name = "picDetalle";
            this.picDetalle.Size = new System.Drawing.Size(200, 150);
            this.picDetalle.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.picDetalle.TabIndex = 13;
            this.picDetalle.TabStop = false;

            // FrmConsultaTree
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.panelDetalles);
            this.Controls.Add(this.trvMisiones);
            this.Name = "FrmConsultaTree";
            this.Text = "Clasificación por Destino";
            this.Load += new System.EventHandler(this.FrmConsultaTree_Load);
            this.panelDetalles.ResumeLayout(false);
            this.panelDetalles.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picDetalle)).EndInit();
            this.ResumeLayout(false);
        }

        #endregion

        private System.Windows.Forms.TreeView trvMisiones;
        private System.Windows.Forms.Panel panelDetalles;
        private System.Windows.Forms.Label lblDetalles;
        private System.Windows.Forms.Label lblCodigo;
        private System.Windows.Forms.TextBox txtCodigo;
        private System.Windows.Forms.Label lblNombre;
        private System.Windows.Forms.TextBox txtNombre;
        private System.Windows.Forms.Label lblDestino;
        private System.Windows.Forms.TextBox txtDestino;
        private System.Windows.Forms.Label lblTipo;
        private System.Windows.Forms.TextBox txtTipo;
        private System.Windows.Forms.Label lblTripulacion;
        private System.Windows.Forms.TextBox txtTripulacion;
        private System.Windows.Forms.Label lblFecha;
        private System.Windows.Forms.TextBox txtFecha;
        private System.Windows.Forms.PictureBox picDetalle;
    }
}
