namespace Trivial
{
    partial class FrmTrivial
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FrmTrivial));
            menuStrip1 = new MenuStrip();
            partidaToolStripMenuItem = new ToolStripMenuItem();
            nuevaToolStripMenuItem = new ToolStripMenuItem();
            salirToolStripMenuItem = new ToolStripMenuItem();
            opcionesToolStripMenuItem = new ToolStripMenuItem();
            MStrPokedex = new ToolStripMenuItem();
            MStrPokemon = new ToolStripMenuItem();
            toolStripSeparator1 = new ToolStripSeparator();
            MStrOpciones = new ToolStripMenuItem();
            MStrRespuesta = new ToolStripMenuItem();
            TxtBoxBusqueda = new TextBox();
            LblPokemon = new Label();
            LblNumPokedex = new Label();
            BtnOpcion1 = new Button();
            BtnOpcion2 = new Button();
            BtnOpcion3 = new Button();
            BtnOpcion4 = new Button();
            PbProgreso = new ProgressBar();
            menuStrip1.SuspendLayout();
            SuspendLayout();
            // 
            // menuStrip1
            // 
            menuStrip1.Items.AddRange(new ToolStripItem[] { partidaToolStripMenuItem, opcionesToolStripMenuItem });
            menuStrip1.Location = new Point(0, 0);
            menuStrip1.Name = "menuStrip1";
            menuStrip1.Size = new Size(384, 24);
            menuStrip1.TabIndex = 0;
            menuStrip1.Text = "menuStrip1";
            // 
            // partidaToolStripMenuItem
            // 
            partidaToolStripMenuItem.DropDownItems.AddRange(new ToolStripItem[] { nuevaToolStripMenuItem, salirToolStripMenuItem });
            partidaToolStripMenuItem.Name = "partidaToolStripMenuItem";
            partidaToolStripMenuItem.Size = new Size(56, 20);
            partidaToolStripMenuItem.Text = "Partida";
            // 
            // nuevaToolStripMenuItem
            // 
            nuevaToolStripMenuItem.Name = "nuevaToolStripMenuItem";
            nuevaToolStripMenuItem.Size = new Size(108, 22);
            nuevaToolStripMenuItem.Text = "Nueva";
            // 
            // salirToolStripMenuItem
            // 
            salirToolStripMenuItem.Name = "salirToolStripMenuItem";
            salirToolStripMenuItem.Size = new Size(108, 22);
            salirToolStripMenuItem.Text = "Salir";
            // 
            // opcionesToolStripMenuItem
            // 
            opcionesToolStripMenuItem.DropDownItems.AddRange(new ToolStripItem[] { MStrPokedex, MStrPokemon, toolStripSeparator1, MStrOpciones, MStrRespuesta });
            opcionesToolStripMenuItem.Name = "opcionesToolStripMenuItem";
            opcionesToolStripMenuItem.Size = new Size(69, 20);
            opcionesToolStripMenuItem.Text = "Opciones";
            // 
            // MStrPokedex
            // 
            MStrPokedex.Checked = true;
            MStrPokedex.CheckState = CheckState.Checked;
            MStrPokedex.Name = "MStrPokedex";
            MStrPokedex.Size = new Size(174, 22);
            MStrPokedex.Text = "Numero pokédex";
            // 
            // MStrPokemon
            // 
            MStrPokemon.Name = "MStrPokemon";
            MStrPokemon.Size = new Size(174, 22);
            MStrPokemon.Text = "Nombre pokemon";
            // 
            // toolStripSeparator1
            // 
            toolStripSeparator1.Name = "toolStripSeparator1";
            toolStripSeparator1.Size = new Size(171, 6);
            // 
            // MStrOpciones
            // 
            MStrOpciones.Checked = true;
            MStrOpciones.CheckState = CheckState.Checked;
            MStrOpciones.Name = "MStrOpciones";
            MStrOpciones.Size = new Size(174, 22);
            MStrOpciones.Text = "Múltiples opciones";
            // 
            // MStrRespuesta
            // 
            MStrRespuesta.Name = "MStrRespuesta";
            MStrRespuesta.Size = new Size(174, 22);
            MStrRespuesta.Text = "Escribir respuesta";
            // 
            // TxtBoxBusqueda
            // 
            TxtBoxBusqueda.Location = new Point(142, 79);
            TxtBoxBusqueda.Name = "TxtBoxBusqueda";
            TxtBoxBusqueda.Size = new Size(100, 23);
            TxtBoxBusqueda.TabIndex = 2;
            TxtBoxBusqueda.TextChanged += TxtBoxBusqueda_TextChanged;
            // 
            // LblPokemon
            // 
            LblPokemon.AutoSize = true;
            LblPokemon.ImageAlign = ContentAlignment.TopCenter;
            LblPokemon.Location = new Point(161, 50);
            LblPokemon.Name = "LblPokemon";
            LblPokemon.Size = new Size(61, 15);
            LblPokemon.TabIndex = 3;
            LblPokemon.Text = "Pokemon:";
            // 
            // LblNumPokedex
            // 
            LblNumPokedex.AutoSize = true;
            LblNumPokedex.Location = new Point(135, 124);
            LblNumPokedex.Name = "LblNumPokedex";
            LblNumPokedex.Size = new Size(114, 15);
            LblNumPokedex.TabIndex = 4;
            LblNumPokedex.Text = "Numero Pokedédex:";
            // 
            // BtnOpcion1
            // 
            BtnOpcion1.Location = new Point(155, 150);
            BtnOpcion1.Name = "BtnOpcion1";
            BtnOpcion1.Size = new Size(75, 23);
            BtnOpcion1.TabIndex = 5;
            BtnOpcion1.Text = "button1";
            BtnOpcion1.UseVisualStyleBackColor = true;
            // 
            // BtnOpcion2
            // 
            BtnOpcion2.Location = new Point(155, 179);
            BtnOpcion2.Name = "BtnOpcion2";
            BtnOpcion2.Size = new Size(75, 23);
            BtnOpcion2.TabIndex = 6;
            BtnOpcion2.Text = "button1";
            BtnOpcion2.UseVisualStyleBackColor = true;
            // 
            // BtnOpcion3
            // 
            BtnOpcion3.Location = new Point(155, 208);
            BtnOpcion3.Name = "BtnOpcion3";
            BtnOpcion3.Size = new Size(75, 23);
            BtnOpcion3.TabIndex = 7;
            BtnOpcion3.Text = "button1";
            BtnOpcion3.UseVisualStyleBackColor = true;
            // 
            // BtnOpcion4
            // 
            BtnOpcion4.Location = new Point(155, 237);
            BtnOpcion4.Name = "BtnOpcion4";
            BtnOpcion4.Size = new Size(75, 23);
            BtnOpcion4.TabIndex = 8;
            BtnOpcion4.Text = "button1";
            BtnOpcion4.UseVisualStyleBackColor = true;
            // 
            // PbProgreso
            // 
            PbProgreso.Location = new Point(117, 295);
            PbProgreso.Name = "PbProgreso";
            PbProgreso.Size = new Size(150, 25);
            PbProgreso.TabIndex = 10;
            // 
            // FrmTrivial
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            BackColor = SystemColors.Info;
            ClientSize = new Size(384, 361);
            Controls.Add(PbProgreso);
            Controls.Add(BtnOpcion4);
            Controls.Add(BtnOpcion3);
            Controls.Add(BtnOpcion2);
            Controls.Add(BtnOpcion1);
            Controls.Add(LblNumPokedex);
            Controls.Add(LblPokemon);
            Controls.Add(TxtBoxBusqueda);
            Controls.Add(menuStrip1);
            Icon = (Icon)resources.GetObject("$this.Icon");
            MainMenuStrip = menuStrip1;
            Name = "FrmTrivial";
            Text = "Trivial";
            menuStrip1.ResumeLayout(false);
            menuStrip1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private MenuStrip menuStrip1;
        private ToolStripMenuItem partidaToolStripMenuItem;
        private ToolStripMenuItem nuevaToolStripMenuItem;
        private ToolStripMenuItem salirToolStripMenuItem;
        private ToolStripMenuItem opcionesToolStripMenuItem;
        private ToolStripMenuItem MStrPokedex;
        private ToolStripMenuItem MStrPokemon;
        private ToolStripSeparator toolStripSeparator1;
        private ToolStripMenuItem MStrOpciones;
        private ToolStripMenuItem MStrRespuesta;
        private TextBox TxtBoxBusqueda;
        private Label LblPokemon;
        private Label LblNumPokedex;
        private Button BtnOpcion1;
        private Button BtnOpcion2;
        private Button BtnOpcion3;
        private Button BtnOpcion4;
        private ProgressBar PbProgreso;
    }
}
