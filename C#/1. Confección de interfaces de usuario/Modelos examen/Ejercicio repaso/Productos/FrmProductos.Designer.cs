namespace Productos
{
    partial class FrmProductos
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.lbCategorias = new System.Windows.Forms.ListBox();
            this.lvProductos = new System.Windows.Forms.ListView();
            this.id = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.nombreProducto = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.stock = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.categoria = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.SuspendLayout();
            // 
            // lbCategorias
            // 
            this.lbCategorias.FormattingEnabled = true;
            this.lbCategorias.Location = new System.Drawing.Point(100, 170);
            this.lbCategorias.Name = "lbCategorias";
            this.lbCategorias.Size = new System.Drawing.Size(120, 95);
            this.lbCategorias.Sorted = true;
            this.lbCategorias.TabIndex = 0;
            this.lbCategorias.SelectedIndexChanged += new System.EventHandler(this.cargarContenido);
            // 
            // lvProductos
            // 
            this.lvProductos.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.id,
            this.nombreProducto,
            this.stock,
            this.categoria});
            this.lvProductos.Font = new System.Drawing.Font("Arial Narrow", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lvProductos.HideSelection = false;
            this.lvProductos.Location = new System.Drawing.Point(250, 50);
            this.lvProductos.Name = "lvProductos";
            this.lvProductos.Size = new System.Drawing.Size(500, 350);
            this.lvProductos.Sorting = System.Windows.Forms.SortOrder.Ascending;
            this.lvProductos.TabIndex = 1;
            this.lvProductos.UseCompatibleStateImageBehavior = false;
            this.lvProductos.View = System.Windows.Forms.View.Details;
            // 
            // id
            // 
            this.id.Text = "ID";
            this.id.Width = 100;
            // 
            // nombreProducto
            // 
            this.nombreProducto.Text = "Nombre producto";
            this.nombreProducto.Width = 150;
            // 
            // stock
            // 
            this.stock.Text = "Unidades en stock";
            this.stock.Width = 150;
            // 
            // categoria
            // 
            this.categoria.Text = "Categoria";
            this.categoria.Width = 150;
            // 
            // FrmProductos
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lvProductos);
            this.Controls.Add(this.lbCategorias);
            this.Name = "FrmProductos";
            this.Text = "Productos";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.FrmProductos_FormClosing);
            this.Load += new System.EventHandler(this.FrmProductos_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.ListBox lbCategorias;
        private System.Windows.Forms.ListView lvProductos;
        private System.Windows.Forms.ColumnHeader id;
        private System.Windows.Forms.ColumnHeader nombreProducto;
        private System.Windows.Forms.ColumnHeader stock;
        private System.Windows.Forms.ColumnHeader categoria;
    }
}

