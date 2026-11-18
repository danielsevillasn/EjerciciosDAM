namespace ModeloExamenA
{
    partial class FrmConsultaList
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
            this.components = new System.ComponentModel.Container();
            this.lblTitulo = new System.Windows.Forms.Label();
            this.lblFiltroCategoria = new System.Windows.Forms.Label();
            this.cmbCategoria = new System.Windows.Forms.ComboBox();
            this.lblVistas = new System.Windows.Forms.Label();
            this.cmbVistas = new System.Windows.Forms.ComboBox();
            this.lsvVehiculos = new System.Windows.Forms.ListView();
            this.colMatricula = new System.Windows.Forms.ColumnHeader();
            this.colMarca = new System.Windows.Forms.ColumnHeader();
            this.colModelo = new System.Windows.Forms.ColumnHeader();
            this.colCategoria = new System.Windows.Forms.ColumnHeader();
            this.colMotor = new System.Windows.Forms.ColumnHeader();
            this.colObservaciones = new System.Windows.Forms.ColumnHeader();
            this.btnRefrescar = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.Font = new System.Drawing.Font("Segoe UI", 14F, System.Drawing.FontStyle.Bold);
            this.lblTitulo.ForeColor = System.Drawing.Color.DarkSlateBlue;
            this.lblTitulo.Location = new System.Drawing.Point(24, 45);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(378, 32);
            this.lblTitulo.TabIndex = 2;
            this.lblTitulo.Text = "Consulta de Vehículos (ListView)";
            // 
            // lblFiltroCategoria
            // 
            this.lblFiltroCategoria.AutoSize = true;
            this.lblFiltroCategoria.Location = new System.Drawing.Point(28, 92);
            this.lblFiltroCategoria.Name = "lblFiltroCategoria";
            this.lblFiltroCategoria.Size = new System.Drawing.Size(149, 20);
            this.lblFiltroCategoria.TabIndex = 3;
            this.lblFiltroCategoria.Text = "Filtrar por Categoría:";
            // 
            // cmbCategoria
            // 
            this.cmbCategoria.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbCategoria.FormattingEnabled = true;
            this.cmbCategoria.Items.AddRange(new object[] {
            "Todos",
            "Turismo",
            "Motocicleta",
            "Furgoneta"});
            this.cmbCategoria.Location = new System.Drawing.Point(183, 88);
            this.cmbCategoria.Name = "cmbCategoria";
            this.cmbCategoria.Size = new System.Drawing.Size(170, 28);
            this.cmbCategoria.TabIndex = 4;
            this.cmbCategoria.SelectedIndexChanged += new System.EventHandler(this.cmbCategoria_SelectedIndexChanged);
            // 
            // lblVistas
            // 
            this.lblVistas.AutoSize = true;
            this.lblVistas.Location = new System.Drawing.Point(380, 92);
            this.lblVistas.Name = "lblVistas";
            this.lblVistas.Size = new System.Drawing.Size(126, 20);
            this.lblVistas.TabIndex = 5;
            this.lblVistas.Text = "Estilo de Vista:";
            // 
            // cmbVistas
            // 
            this.cmbVistas.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbVistas.FormattingEnabled = true;
            this.cmbVistas.Items.AddRange(new object[] {
            "Detalles",
            "Iconos grandes",
            "Iconos pequeños",
            "Lista",
            "Mosaico"});
            this.cmbVistas.Location = new System.Drawing.Point(512, 88);
            this.cmbVistas.Name = "cmbVistas";
            this.cmbVistas.Size = new System.Drawing.Size(170, 28);
            this.cmbVistas.TabIndex = 6;
            this.cmbVistas.SelectedIndexChanged += new System.EventHandler(this.cmbVistas_SelectedIndexChanged);
            // 
            // lsvVehiculos
            // 
            this.lsvVehiculos.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.colMatricula,
            this.colMarca,
            this.colModelo,
            this.colCategoria,
            this.colMotor,
            this.colObservaciones});
            this.lsvVehiculos.FullRowSelect = true;
            this.lsvVehiculos.GridLines = true;
            this.lsvVehiculos.HideSelection = false;
            this.lsvVehiculos.Location = new System.Drawing.Point(28, 132);
            this.lsvVehiculos.Name = "lsvVehiculos";
            this.lsvVehiculos.Size = new System.Drawing.Size(830, 385);
            this.lsvVehiculos.TabIndex = 7;
            this.lsvVehiculos.UseCompatibleStateImageBehavior = false;
            this.lsvVehiculos.View = System.Windows.Forms.View.Details;
            this.lsvVehiculos.DoubleClick += new System.EventHandler(this.lsvVehiculos_DoubleClick);
            // 
            // colMatricula
            // 
            this.colMatricula.Text = "Matrícula";
            this.colMatricula.Width = 110;
            // 
            // colMarca
            // 
            this.colMarca.Text = "Marca";
            this.colMarca.Width = 120;
            // 
            // colModelo
            // 
            this.colModelo.Text = "Modelo";
            this.colModelo.Width = 130;
            // 
            // colCategoria
            // 
            this.colCategoria.Text = "Categoría";
            this.colCategoria.Width = 120;
            // 
            // colMotor
            // 
            this.colMotor.Text = "Motorización";
            this.colMotor.Width = 120;
            // 
            // colObservaciones
            // 
            this.colObservaciones.Text = "Observaciones";
            this.colObservaciones.Width = 220;
            // 
            // btnRefrescar
            // 
            this.btnRefrescar.Location = new System.Drawing.Point(715, 87);
            this.btnRefrescar.Name = "btnRefrescar";
            this.btnRefrescar.Size = new System.Drawing.Size(143, 30);
            this.btnRefrescar.TabIndex = 8;
            this.btnRefrescar.Text = "🔄 Actualizar Lista";
            this.btnRefrescar.UseVisualStyleBackColor = true;
            this.btnRefrescar.Click += new System.EventHandler(this.btnRefrescar_Click);
            // 
            // FrmConsultaList
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(884, 561);
            this.Controls.Add(this.btnRefrescar);
            this.Controls.Add(this.lsvVehiculos);
            this.Controls.Add(this.cmbVistas);
            this.Controls.Add(this.lblVistas);
            this.Controls.Add(this.cmbCategoria);
            this.Controls.Add(this.lblFiltroCategoria);
            this.Controls.Add(this.lblTitulo);
            this.Name = "FrmConsultaList";
            this.Text = "Gestión de Vehículos - Modelo A (Consulta en Lista)";
            this.Activated += new System.EventHandler(this.FrmConsultaList_Activated);
            this.Load += new System.EventHandler(this.FrmConsultaList_Load);
            this.Controls.SetChildIndex(this.lblTitulo, 0);
            this.Controls.SetChildIndex(this.lblFiltroCategoria, 0);
            this.Controls.SetChildIndex(this.cmbCategoria, 0);
            this.Controls.SetChildIndex(this.lblVistas, 0);
            this.Controls.SetChildIndex(this.cmbVistas, 0);
            this.Controls.SetChildIndex(this.lsvVehiculos, 0);
            this.Controls.SetChildIndex(this.btnRefrescar, 0);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.Label lblFiltroCategoria;
        private System.Windows.Forms.ComboBox cmbCategoria;
        private System.Windows.Forms.Label lblVistas;
        private System.Windows.Forms.ComboBox cmbVistas;
        private System.Windows.Forms.ListView lsvVehiculos;
        private System.Windows.Forms.ColumnHeader colMatricula;
        private System.Windows.Forms.ColumnHeader colMarca;
        private System.Windows.Forms.ColumnHeader colModelo;
        private System.Windows.Forms.ColumnHeader colCategoria;
        private System.Windows.Forms.ColumnHeader colMotor;
        private System.Windows.Forms.ColumnHeader colObservaciones;
        private System.Windows.Forms.Button btnRefrescar;
    }
}
