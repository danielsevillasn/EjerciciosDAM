namespace Misiones_Espaciales
{
    partial class FrmConsultaList
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
            this.lblFiltro = new System.Windows.Forms.Label();
            this.cmbFiltroDestino = new System.Windows.Forms.ComboBox();
            this.lblEstilo = new System.Windows.Forms.Label();
            this.cmbEstiloVista = new System.Windows.Forms.ComboBox();
            this.lsvMisiones = new System.Windows.Forms.ListView();
            this.colCodigo = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.colNombre = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.colDestino = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.colTipoNave = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.colTripulacion = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.colObservaciones = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.SuspendLayout();

            // lblFiltro
            this.lblFiltro.AutoSize = true;
            this.lblFiltro.Location = new System.Drawing.Point(20, 35);
            this.lblFiltro.Name = "lblFiltro";
            this.lblFiltro.Size = new System.Drawing.Size(80, 13);
            this.lblFiltro.TabIndex = 0;
            this.lblFiltro.Text = "Filtrar por destino:";

            // cmbFiltroDestino
            this.cmbFiltroDestino.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbFiltroDestino.FormattingEnabled = true;
            this.cmbFiltroDestino.Location = new System.Drawing.Point(106, 32);
            this.cmbFiltroDestino.Name = "cmbFiltroDestino";
            this.cmbFiltroDestino.Size = new System.Drawing.Size(180, 21);
            this.cmbFiltroDestino.TabIndex = 1;
            this.cmbFiltroDestino.SelectedIndexChanged += new System.EventHandler(this.cmbFiltroDestino_SelectedIndexChanged);

            // lblEstilo
            this.lblEstilo.AutoSize = true;
            this.lblEstilo.Location = new System.Drawing.Point(340, 35);
            this.lblEstilo.Name = "lblEstilo";
            this.lblEstilo.Size = new System.Drawing.Size(32, 13);
            this.lblEstilo.TabIndex = 2;
            this.lblEstilo.Text = "Vista:";

            // cmbEstiloVista
            this.cmbEstiloVista.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbEstiloVista.FormattingEnabled = true;
            this.cmbEstiloVista.Location = new System.Drawing.Point(378, 32);
            this.cmbEstiloVista.Name = "cmbEstiloVista";
            this.cmbEstiloVista.Size = new System.Drawing.Size(150, 21);
            this.cmbEstiloVista.TabIndex = 3;
            this.cmbEstiloVista.SelectedIndexChanged += new System.EventHandler(this.cmbEstiloVista_SelectedIndexChanged);

            // lsvMisiones
            this.lsvMisiones.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.colCodigo,
            this.colNombre,
            this.colDestino,
            this.colTipoNave,
            this.colTripulacion,
            this.colObservaciones});
            this.lsvMisiones.FullRowSelect = true;
            this.lsvMisiones.GridLines = true;
            this.lsvMisiones.Location = new System.Drawing.Point(20, 60);
            this.lsvMisiones.Name = "lsvMisiones";
            this.lsvMisiones.Size = new System.Drawing.Size(760, 370);
            this.lsvMisiones.TabIndex = 4;
            this.lsvMisiones.UseCompatibleStateImageBehavior = false;
            this.lsvMisiones.View = System.Windows.Forms.View.Details;
            this.lsvMisiones.DoubleClick += new System.EventHandler(this.lsvMisiones_DoubleClick);

            // colCodigo
            this.colCodigo.Text = "Código";
            this.colCodigo.Width = 100;

            // colNombre
            this.colNombre.Text = "Nombre Misión";
            this.colNombre.Width = 150;

            // colDestino
            this.colDestino.Text = "Destino";
            this.colDestino.Width = 120;

            // colTipoNave
            this.colTipoNave.Text = "Tipo Nave";
            this.colTipoNave.Width = 150;

            // colTripulacion
            this.colTripulacion.Text = "Tripulación";
            this.colTripulacion.Width = 80;

            // colObservaciones
            this.colObservaciones.Text = "Observaciones";
            this.colObservaciones.Width = 160;

            // FrmConsultaList
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lsvMisiones);
            this.Controls.Add(this.cmbEstiloVista);
            this.Controls.Add(this.lblEstilo);
            this.Controls.Add(this.cmbFiltroDestino);
            this.Controls.Add(this.lblFiltro);
            this.Name = "FrmConsultaList";
            this.Text = "Listado de Expediciones";
            this.Load += new System.EventHandler(this.FrmConsultaList_Load);
            this.ResumeLayout(false);
            this.PerformLayout();
        }

        #endregion

        private System.Windows.Forms.Label lblFiltro;
        private System.Windows.Forms.ComboBox cmbFiltroDestino;
        private System.Windows.Forms.Label lblEstilo;
        private System.Windows.Forms.ComboBox cmbEstiloVista;
        private System.Windows.Forms.ListView lsvMisiones;
        private System.Windows.Forms.ColumnHeader colCodigo;
        private System.Windows.Forms.ColumnHeader colNombre;
        private System.Windows.Forms.ColumnHeader colDestino;
        private System.Windows.Forms.ColumnHeader colTipoNave;
        private System.Windows.Forms.ColumnHeader colTripulacion;
        private System.Windows.Forms.ColumnHeader colObservaciones;
    }
}
