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
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Explorador));
            this.trvArchivos = new System.Windows.Forms.TreeView();
            this.lsvFicheros = new System.Windows.Forms.ListView();
            this.Nombre = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.FechaCreacion = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.fechaModificacion = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.fechaAcceso = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.strBtnNuevo = new System.Windows.Forms.ToolStripDropDownButton();
            this.strBtnCarpeta = new System.Windows.Forms.ToolStripMenuItem();
            this.strBtnFichero = new System.Windows.Forms.ToolStripMenuItem();
            this.strBtnVistas = new System.Windows.Forms.ToolStripDropDownButton();
            this.strBtnIconosGrandes = new System.Windows.Forms.ToolStripMenuItem();
            this.strBtnDetalles = new System.Windows.Forms.ToolStripMenuItem();
            this.strBtnIconosPequeños = new System.Windows.Forms.ToolStripMenuItem();
            this.strBtnLista = new System.Windows.Forms.ToolStripMenuItem();
            this.strBtnMosaico = new System.Windows.Forms.ToolStripMenuItem();
            this.imgList = new System.Windows.Forms.ImageList(this.components);
            this.toolStrip1.SuspendLayout();
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
            this.lsvFicheros.SmallImageList = this.imgList;
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
            // toolStrip1
            // 
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.strBtnNuevo,
            this.strBtnVistas});
            this.toolStrip1.Location = new System.Drawing.Point(0, 0);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(800, 38);
            this.toolStrip1.TabIndex = 2;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // strBtnNuevo
            // 
            this.strBtnNuevo.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.strBtnCarpeta,
            this.strBtnFichero});
            this.strBtnNuevo.Image = ((System.Drawing.Image)(resources.GetObject("strBtnNuevo.Image")));
            this.strBtnNuevo.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.strBtnNuevo.Name = "strBtnNuevo";
            this.strBtnNuevo.Size = new System.Drawing.Size(55, 35);
            this.strBtnNuevo.Text = "Nuevo";
            this.strBtnNuevo.TextDirection = System.Windows.Forms.ToolStripTextDirection.Horizontal;
            this.strBtnNuevo.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageAboveText;
            // 
            // strBtnCarpeta
            // 
            this.strBtnCarpeta.Image = ((System.Drawing.Image)(resources.GetObject("strBtnCarpeta.Image")));
            this.strBtnCarpeta.Name = "strBtnCarpeta";
            this.strBtnCarpeta.Size = new System.Drawing.Size(180, 22);
            this.strBtnCarpeta.Text = "Carpeta";
            this.strBtnCarpeta.Click += new System.EventHandler(this.strBtnCarpeta_Click);
            // 
            // strBtnFichero
            // 
            this.strBtnFichero.Image = ((System.Drawing.Image)(resources.GetObject("strBtnFichero.Image")));
            this.strBtnFichero.Name = "strBtnFichero";
            this.strBtnFichero.Size = new System.Drawing.Size(180, 22);
            this.strBtnFichero.Text = "Fichero";
            this.strBtnFichero.Click += new System.EventHandler(this.strBtnFichero_Click);
            // 
            // strBtnVistas
            // 
            this.strBtnVistas.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.strBtnIconosGrandes,
            this.strBtnDetalles,
            this.strBtnIconosPequeños,
            this.strBtnLista,
            this.strBtnMosaico});
            this.strBtnVistas.Image = ((System.Drawing.Image)(resources.GetObject("strBtnVistas.Image")));
            this.strBtnVistas.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.strBtnVistas.Name = "strBtnVistas";
            this.strBtnVistas.Size = new System.Drawing.Size(50, 35);
            this.strBtnVistas.Text = "Vistas";
            this.strBtnVistas.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageAboveText;
            // 
            // strBtnIconosGrandes
            // 
            this.strBtnIconosGrandes.Name = "strBtnIconosGrandes";
            this.strBtnIconosGrandes.Size = new System.Drawing.Size(180, 22);
            this.strBtnIconosGrandes.Text = "Iconos grandes";
            this.strBtnIconosGrandes.Click += new System.EventHandler(this.strBtnIconosGrandes_Click);
            // 
            // strBtnDetalles
            // 
            this.strBtnDetalles.Name = "strBtnDetalles";
            this.strBtnDetalles.Size = new System.Drawing.Size(180, 22);
            this.strBtnDetalles.Text = "Detalles";
            this.strBtnDetalles.Click += new System.EventHandler(this.strBtnDetalles_Click);
            // 
            // strBtnIconosPequeños
            // 
            this.strBtnIconosPequeños.Name = "strBtnIconosPequeños";
            this.strBtnIconosPequeños.Size = new System.Drawing.Size(180, 22);
            this.strBtnIconosPequeños.Text = "Iconos pequeños";
            this.strBtnIconosPequeños.Click += new System.EventHandler(this.strBtnIconosPequeños_Click);
            // 
            // strBtnLista
            // 
            this.strBtnLista.Name = "strBtnLista";
            this.strBtnLista.Size = new System.Drawing.Size(180, 22);
            this.strBtnLista.Text = "Lista";
            this.strBtnLista.Click += new System.EventHandler(this.strBtnLista_Click);
            // 
            // strBtnMosaico
            // 
            this.strBtnMosaico.Name = "strBtnMosaico";
            this.strBtnMosaico.Size = new System.Drawing.Size(180, 22);
            this.strBtnMosaico.Text = "Mosaico";
            this.strBtnMosaico.Click += new System.EventHandler(this.strBtnMosaico_Click);
            // 
            // imgList
            // 
            this.imgList.ImageStream = ((System.Windows.Forms.ImageListStreamer)(resources.GetObject("imgList.ImageStream")));
            this.imgList.TransparentColor = System.Drawing.Color.Transparent;
            this.imgList.Images.SetKeyName(0, "text-format.png");
            this.imgList.Images.SetKeyName(1, "document.png");
            // 
            // Explorador
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.lsvFicheros);
            this.Controls.Add(this.trvArchivos);
            this.Name = "Explorador";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.Explorador_FormClosing);
            this.Load += new System.EventHandler(this.Form1_Load);
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TreeView trvArchivos;
        private System.Windows.Forms.ListView lsvFicheros;
        private System.Windows.Forms.ColumnHeader Nombre;
        private System.Windows.Forms.ColumnHeader FechaCreacion;
        private System.Windows.Forms.ColumnHeader fechaModificacion;
        private System.Windows.Forms.ColumnHeader fechaAcceso;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripDropDownButton strBtnNuevo;
        private System.Windows.Forms.ToolStripMenuItem strBtnCarpeta;
        private System.Windows.Forms.ToolStripMenuItem strBtnFichero;
        private System.Windows.Forms.ToolStripDropDownButton strBtnVistas;
        private System.Windows.Forms.ToolStripMenuItem strBtnIconosGrandes;
        private System.Windows.Forms.ToolStripMenuItem strBtnDetalles;
        private System.Windows.Forms.ToolStripMenuItem strBtnIconosPequeños;
        private System.Windows.Forms.ToolStripMenuItem strBtnLista;
        private System.Windows.Forms.ToolStripMenuItem strBtnMosaico;
        private System.Windows.Forms.ImageList imgList;
    }
}

