namespace BibliotecaMdi
{
    partial class FrmPadre
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            MnuPrincipal = new MenuStrip();
            MStrFichero = new ToolStripMenuItem();
            MStrAlta = new ToolStripMenuItem();
            MStrConsulta = new ToolStripMenuItem();
            MStrSeparator1 = new ToolStripSeparator();
            MStrSalir = new ToolStripMenuItem();
            button1 = new Button();
            button2 = new Button();
            MnuPrincipal.SuspendLayout();
            SuspendLayout();
            // 
            // MnuPrincipal
            // 
            MnuPrincipal.Items.AddRange(new ToolStripItem[] { MStrFichero });
            MnuPrincipal.Location = new Point(0, 0);
            MnuPrincipal.Name = "MnuPrincipal";
            MnuPrincipal.Size = new Size(800, 24);
            MnuPrincipal.TabIndex = 1;
            MnuPrincipal.Text = "menuStrip1";
            // 
            // MStrFichero
            // 
            MStrFichero.DropDownItems.AddRange(new ToolStripItem[] { MStrAlta, MStrConsulta, MStrSeparator1, MStrSalir });
            MStrFichero.Name = "MStrFichero";
            MStrFichero.Size = new Size(58, 20);
            MStrFichero.Text = "Fichero";
            // 
            // MStrAlta
            // 
            MStrAlta.Name = "MStrAlta";
            MStrAlta.ShortcutKeys = Keys.Control | Keys.A;
            MStrAlta.Size = new Size(162, 22);
            MStrAlta.Text = "Alta";
            MStrAlta.Click += MStrAlta_Click;
            // 
            // MStrConsulta
            // 
            MStrConsulta.Name = "MStrConsulta";
            MStrConsulta.ShortcutKeys = Keys.Control | Keys.B;
            MStrConsulta.Size = new Size(162, 22);
            MStrConsulta.Text = "Consulta";
            MStrConsulta.Click += MStrConsulta_Click;
            // 
            // MStrSeparator1
            // 
            MStrSeparator1.Name = "MStrSeparator1";
            MStrSeparator1.Size = new Size(159, 6);
            // 
            // MStrSalir
            // 
            MStrSalir.Name = "MStrSalir";
            MStrSalir.ShortcutKeys = Keys.Control | Keys.S;
            MStrSalir.Size = new Size(162, 22);
            MStrSalir.Text = "Salir";
            MStrSalir.Click += MStrSalir_Click;
            // 
            // button1
            // 
            button1.Location = new Point(0, 425);
            button1.Name = "button1";
            button1.Size = new Size(75, 23);
            button1.TabIndex = 3;
            button1.Text = "button1";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.Location = new Point(725, 425);
            button2.Name = "button2";
            button2.Size = new Size(75, 23);
            button2.TabIndex = 5;
            button2.Text = "button2";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // FrmPadre
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button2);
            Controls.Add(button1);
            Controls.Add(MnuPrincipal);
            IsMdiContainer = true;
            MainMenuStrip = MnuPrincipal;
            Name = "FrmPadre";
            Text = "FrmPadre";
            MnuPrincipal.ResumeLayout(false);
            MnuPrincipal.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private MenuStrip MnuPrincipal;
        private ToolStripMenuItem MStrFichero;
        private ToolStripMenuItem MStrAlta;
        private ToolStripMenuItem MStrConsulta;
        private ToolStripSeparator MStrSeparator1;
        private ToolStripMenuItem MStrSalir;
        private Button button1;
        private Button button2;
    }
}
