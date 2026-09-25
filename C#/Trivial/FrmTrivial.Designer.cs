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
            MStrPrincipal = new MenuStrip();
            MstrPartida = new ToolStripMenuItem();
            MstrNueva = new ToolStripMenuItem();
            MstrSalir = new ToolStripMenuItem();
            MstrOpciones = new ToolStripMenuItem();
            MStrPokedex = new ToolStripMenuItem();
            MStrPokemon = new ToolStripMenuItem();
            SprOpciones = new ToolStripSeparator();
            MStrMúltipleOpciones = new ToolStripMenuItem();
            MStrRespuesta = new ToolStripMenuItem();
            LblModo = new Label();
            LblRespuestas = new Label();
            BtnOpcion1 = new Button();
            BtnOpcion2 = new Button();
            BtnOpcion3 = new Button();
            BtnOpcion4 = new Button();
            PbProgreso = new ProgressBar();
            LblBusqueda = new Label();
            MStrPrincipal.SuspendLayout();
            SuspendLayout();
            // 
            // MStrPrincipal
            // 
            MStrPrincipal.Items.AddRange(new ToolStripItem[] { MstrPartida, MstrOpciones });
            MStrPrincipal.Location = new Point(0, 0);
            MStrPrincipal.Name = "MStrPrincipal";
            MStrPrincipal.Size = new Size(384, 24);
            MStrPrincipal.TabIndex = 0;
            MStrPrincipal.Text = "menuStrip1";
            // 
            // MstrPartida
            // 
            MstrPartida.DropDownItems.AddRange(new ToolStripItem[] { MstrNueva, MstrSalir });
            MstrPartida.Name = "MstrPartida";
            MstrPartida.Size = new Size(56, 20);
            MstrPartida.Text = "Partida";
            // 
            // MstrNueva
            // 
            MstrNueva.Name = "MstrNueva";
            MstrNueva.Size = new Size(108, 22);
            MstrNueva.Text = "Nueva";
            MstrNueva.Click += MstrNueva_Click;
            // 
            // MstrSalir
            // 
            MstrSalir.Name = "MstrSalir";
            MstrSalir.Size = new Size(108, 22);
            MstrSalir.Text = "Salir";
            MstrSalir.Click += MstrSalir_Click;
            // 
            // MstrOpciones
            // 
            MstrOpciones.DropDownItems.AddRange(new ToolStripItem[] { MStrPokedex, MStrPokemon, SprOpciones, MStrMúltipleOpciones, MStrRespuesta });
            MstrOpciones.Name = "MstrOpciones";
            MstrOpciones.Size = new Size(69, 20);
            MstrOpciones.Text = "Opciones";
            // 
            // MStrPokedex
            // 
            MStrPokedex.Checked = true;
            MStrPokedex.CheckState = CheckState.Checked;
            MStrPokedex.Name = "MStrPokedex";
            MStrPokedex.Size = new Size(180, 22);
            MStrPokedex.Text = "Numero pokédex";
            MStrPokedex.Click += MStrPokedex_Click;
            // 
            // MStrPokemon
            // 
            MStrPokemon.Name = "MStrPokemon";
            MStrPokemon.Size = new Size(180, 22);
            MStrPokemon.Text = "Nombre pokemon";
            MStrPokemon.Click += MStrPokemon_Click;
            // 
            // SprOpciones
            // 
            SprOpciones.Name = "SprOpciones";
            SprOpciones.Size = new Size(177, 6);
            // 
            // MStrMúltipleOpciones
            // 
            MStrMúltipleOpciones.Checked = true;
            MStrMúltipleOpciones.CheckState = CheckState.Checked;
            MStrMúltipleOpciones.Name = "MStrMúltipleOpciones";
            MStrMúltipleOpciones.Size = new Size(180, 22);
            MStrMúltipleOpciones.Text = "Múltiples opciones";
            MStrMúltipleOpciones.Click += MStrMultiplespciones_Click;
            // 
            // MStrRespuesta
            // 
            MStrRespuesta.Name = "MStrRespuesta";
            MStrRespuesta.Size = new Size(180, 22);
            MStrRespuesta.Text = "Escribir respuesta";
            MStrRespuesta.Click += MStrRespuesta_Click;
            // 
            // LblModo
            // 
            LblModo.AutoSize = true;
            LblModo.ImageAlign = ContentAlignment.TopCenter;
            LblModo.Location = new Point(161, 50);
            LblModo.Name = "LblModo";
            LblModo.Size = new Size(61, 15);
            LblModo.TabIndex = 3;
            LblModo.Text = "Pokemon:";
            // 
            // LblRespuestas
            // 
            LblRespuestas.AutoSize = true;
            LblRespuestas.Location = new Point(135, 124);
            LblRespuestas.Name = "LblRespuestas";
            LblRespuestas.Size = new Size(114, 15);
            LblRespuestas.TabIndex = 4;
            LblRespuestas.Text = "Numero Pokedédex:";
            // 
            // BtnOpcion1
            // 
            BtnOpcion1.Location = new Point(155, 150);
            BtnOpcion1.Name = "BtnOpcion1";
            BtnOpcion1.Size = new Size(75, 23);
            BtnOpcion1.TabIndex = 5;
            BtnOpcion1.Text = "button1";
            BtnOpcion1.UseVisualStyleBackColor = true;
            BtnOpcion1.Click += BotonRespuesta_Click;
            // 
            // BtnOpcion2
            // 
            BtnOpcion2.Location = new Point(155, 179);
            BtnOpcion2.Name = "BtnOpcion2";
            BtnOpcion2.Size = new Size(75, 23);
            BtnOpcion2.TabIndex = 6;
            BtnOpcion2.Text = "button1";
            BtnOpcion2.UseVisualStyleBackColor = true;
            BtnOpcion2.Click += BotonRespuesta_Click;
            // 
            // BtnOpcion3
            // 
            BtnOpcion3.Location = new Point(155, 208);
            BtnOpcion3.Name = "BtnOpcion3";
            BtnOpcion3.Size = new Size(75, 23);
            BtnOpcion3.TabIndex = 7;
            BtnOpcion3.Text = "button1";
            BtnOpcion3.UseVisualStyleBackColor = true;
            BtnOpcion3.Click += BotonRespuesta_Click;
            // 
            // BtnOpcion4
            // 
            BtnOpcion4.Location = new Point(155, 237);
            BtnOpcion4.Name = "BtnOpcion4";
            BtnOpcion4.Size = new Size(75, 23);
            BtnOpcion4.TabIndex = 8;
            BtnOpcion4.Text = "button1";
            BtnOpcion4.UseVisualStyleBackColor = true;
            BtnOpcion4.Click += BotonRespuesta_Click;
            // 
            // PbProgreso
            // 
            PbProgreso.Location = new Point(117, 295);
            PbProgreso.Name = "PbProgreso";
            PbProgreso.Size = new Size(150, 25);
            PbProgreso.TabIndex = 10;
            // 
            // LblBusqueda
            // 
            LblBusqueda.AutoSize = true;
            LblBusqueda.Location = new Point(173, 87);
            LblBusqueda.Name = "LblBusqueda";
            LblBusqueda.Size = new Size(38, 15);
            LblBusqueda.TabIndex = 11;
            LblBusqueda.Text = "label1";
            // 
            // FrmTrivial
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            BackColor = SystemColors.Info;
            ClientSize = new Size(384, 361);
            Controls.Add(LblBusqueda);
            Controls.Add(PbProgreso);
            Controls.Add(BtnOpcion4);
            Controls.Add(BtnOpcion3);
            Controls.Add(BtnOpcion2);
            Controls.Add(BtnOpcion1);
            Controls.Add(LblRespuestas);
            Controls.Add(LblModo);
            Controls.Add(MStrPrincipal);
            Icon = (Icon)resources.GetObject("$this.Icon");
            MainMenuStrip = MStrPrincipal;
            Name = "FrmTrivial";
            Text = "Trivial";
            MStrPrincipal.ResumeLayout(false);
            MStrPrincipal.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private MenuStrip MStrPrincipal;
        private ToolStripMenuItem MstrPartida;
        private ToolStripMenuItem MstrNueva;
        private ToolStripMenuItem MstrSalir;
        private ToolStripMenuItem MstrOpciones;
        private ToolStripMenuItem MStrPokedex;
        private ToolStripMenuItem MStrPokemon;
        private ToolStripSeparator SprOpciones;
        private ToolStripMenuItem MStrMúltipleOpciones;
        private ToolStripMenuItem MStrRespuesta;
        private Label LblModo;
        private Label LblRespuestas;
        private Button BtnOpcion1;
        private Button BtnOpcion2;
        private Button BtnOpcion3;
        private Button BtnOpcion4;
        private ProgressBar PbProgreso;
        private Label LblBusqueda;
    }
}
