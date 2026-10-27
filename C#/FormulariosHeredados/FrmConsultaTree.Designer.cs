namespace FormulariosHeredados
{
    partial class FrmConsultaTree
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FrmConsultaTree));
            trvClientes = new TreeView();
            imgListLsv = new ImageList(components);
            SuspendLayout();
            // 
            // trvClientes
            // 
            trvClientes.ImageIndex = 0;
            trvClientes.ImageList = imgListLsv;
            trvClientes.Location = new Point(48, 146);
            trvClientes.Name = "trvClientes";
            trvClientes.SelectedImageIndex = 0;
            trvClientes.Size = new Size(300, 274);
            trvClientes.TabIndex = 1;
            trvClientes.AfterSelect += trvClientes_AfterSelect;
            // 
            // imgListLsv
            // 
            imgListLsv.ColorDepth = ColorDepth.Depth32Bit;
            imgListLsv.ImageStream = (ImageListStreamer)resources.GetObject("imgListLsv.ImageStream");
            imgListLsv.TransparentColor = Color.Transparent;
            imgListLsv.Images.SetKeyName(0, "user.png");
            imgListLsv.Images.SetKeyName(1, "home.png");
            // 
            // FrmConsultaTree
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(trvClientes);
            Name = "FrmConsultaTree";
            Text = "FrmConsultaTree";
            Load += FrmConsultaTree_Load;
            Controls.SetChildIndex(trvClientes, 0);
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TreeView trvClientes;
        private ImageList imgListLsv;
    }
}