namespace ExploradorDeArchivos
{
    partial class Explorador
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
            this.trvArchivos = new System.Windows.Forms.TreeView();
            this.lsvFicheros = new System.Windows.Forms.ListView();
            this.Nombre = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.FechaCreacion = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.fechaModificacion = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.fechaAcceso = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.SuspendLayout();
            // 
            // trvArchivos
            // 
            this.trvArchivos.Location = new System.Drawing.Point(94, 85);
            this.trvArchivos.Name = "trvArchivos";
            this.trvArchivos.Size = new System.Drawing.Size(155, 278);
            this.trvArchivos.TabIndex = 0;
            this.trvArchivos.AfterSelect += new System.Windows.Forms.TreeViewEventHandler(this.trvArchivos_AfterSelect);
            // 
            // lsvFicheros
            // 
            this.lsvFicheros.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.Nombre,
            this.FechaCreacion,
            this.fechaModificacion,
            this.fechaAcceso});
            this.lsvFicheros.GridLines = true;
            this.lsvFicheros.HideSelection = false;
            this.lsvFicheros.Location = new System.Drawing.Point(283, 85);
            this.lsvFicheros.Name = "lsvFicheros";
            this.lsvFicheros.Size = new System.Drawing.Size(397, 278);
            this.lsvFicheros.Sorting = System.Windows.Forms.SortOrder.Ascending;
            this.lsvFicheros.TabIndex = 1;
            this.lsvFicheros.UseCompatibleStateImageBehavior = false;
            this.lsvFicheros.View = System.Windows.Forms.View.Details;
            this.lsvFicheros.DoubleClick += new System.EventHandler(this.lsvFicheros_DoubleClick);
            // 
            // Nombre
            // 
            this.Nombre.Tag = "";
            this.Nombre.Text = "Nombre";
            this.Nombre.Width = 100;
            // 
            // FechaCreacion
            // 
            this.FechaCreacion.Text = "Fecha de creacion";
            this.FechaCreacion.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.FechaCreacion.Width = 125;
            // 
            // fechaModificacion
            // 
            this.fechaModificacion.Text = "Fecha de modificacion";
            this.fechaModificacion.Width = 125;
            // 
            // fechaAcceso
            // 
            this.fechaAcceso.Text = "Fecha de acceso";
            this.fechaAcceso.Width = 125;
            // 
            // Explorador
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lsvFicheros);
            this.Controls.Add(this.trvArchivos);
            this.Name = "Explorador";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.Explorador_FormClosing);
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TreeView trvArchivos;
        private System.Windows.Forms.ListView lsvFicheros;
        private System.Windows.Forms.ColumnHeader Nombre;
        private System.Windows.Forms.ColumnHeader FechaCreacion;
        private System.Windows.Forms.ColumnHeader fechaModificacion;
        private System.Windows.Forms.ColumnHeader fechaAcceso;
    }
}

