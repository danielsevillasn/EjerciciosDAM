namespace EjercicioPeliculas
{
    partial class FrmPeliculas
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
            this.lsvPeliculas = new System.Windows.Forms.ListView();
            this.lblTitulo = new System.Windows.Forms.Label();
            this.titulo = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.actores = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.director = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.SuspendLayout();
            // 
            // lsvPeliculas
            // 
            this.lsvPeliculas.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.titulo,
            this.actores,
            this.director});
            this.lsvPeliculas.HideSelection = false;
            this.lsvPeliculas.Location = new System.Drawing.Point(417, 59);
            this.lsvPeliculas.Name = "lsvPeliculas";
            this.lsvPeliculas.Size = new System.Drawing.Size(359, 402);
            this.lsvPeliculas.TabIndex = 0;
            this.lsvPeliculas.UseCompatibleStateImageBehavior = false;
            this.lsvPeliculas.View = System.Windows.Forms.View.Details;
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.Font = new System.Drawing.Font("Arial", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.Location = new System.Drawing.Point(105, 27);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(184, 32);
            this.lblTitulo.TabIndex = 1;
            this.lblTitulo.Text = "Clasificación";
            // 
            // titulo
            // 
            this.titulo.Text = "Titulo";
            this.titulo.Width = 100;
            // 
            // actores
            // 
            this.actores.Text = "Actores";
            this.actores.Width = 150;
            // 
            // director
            // 
            this.director.Text = "Director";
            this.director.Width = 100;
            // 
            // FrmPeliculas
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 491);
            this.Controls.Add(this.lblTitulo);
            this.Controls.Add(this.lsvPeliculas);
            this.Name = "FrmPeliculas";
            this.Text = "Peliculas";
            this.Load += new System.EventHandler(this.FrmPeliculas_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListView lsvPeliculas;
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.ColumnHeader titulo;
        private System.Windows.Forms.ColumnHeader actores;
        private System.Windows.Forms.ColumnHeader director;
    }
}

