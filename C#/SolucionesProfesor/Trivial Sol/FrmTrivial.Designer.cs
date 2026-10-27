namespace Trivial
{
    partial class FrmTrivial
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
            this.MnuPpal = new System.Windows.Forms.MenuStrip();
            this.MnuPartida = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuPartidaNueva = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuItem1 = new System.Windows.Forms.ToolStripSeparator();
            this.MnuPartidaSalir = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuOpciones = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuOpcionesCapitales = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuOpcionesPaises = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuItem2 = new System.Windows.Forms.ToolStripSeparator();
            this.MnuOpcionesMultiples = new System.Windows.Forms.ToolStripMenuItem();
            this.MnuOpcionesEscribir = new System.Windows.Forms.ToolStripMenuItem();
            this.LblPregunta = new System.Windows.Forms.Label();
            this.TxtBoxPregunta = new System.Windows.Forms.TextBox();
            this.LblRespuesta = new System.Windows.Forms.Label();
            this.TxtBoxRespuesta0 = new System.Windows.Forms.TextBox();
            this.TxtBoxRespuesta1 = new System.Windows.Forms.TextBox();
            this.TxtBoxRespuesta2 = new System.Windows.Forms.TextBox();
            this.TxtBoxRespuesta3 = new System.Windows.Forms.TextBox();
            this.TxtBoxResultado = new System.Windows.Forms.TextBox();
            this.BtnSiguiente = new System.Windows.Forms.Button();
            this.BtnSalir = new System.Windows.Forms.Button();
            this.TxtBoxPorcentaje = new System.Windows.Forms.TextBox();
            this.MnuPpal.SuspendLayout();
            this.SuspendLayout();
            // 
            // MnuPpal
            // 
            this.MnuPpal.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.MnuPartida,
            this.MnuOpciones});
            this.MnuPpal.Location = new System.Drawing.Point(0, 0);
            this.MnuPpal.Name = "MnuPpal";
            this.MnuPpal.Size = new System.Drawing.Size(179, 24);
            this.MnuPpal.TabIndex = 0;
            this.MnuPpal.Text = "menuStrip1";
            // 
            // MnuPartida
            // 
            this.MnuPartida.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.MnuPartidaNueva,
            this.toolStripMenuItem1,
            this.MnuPartidaSalir});
            this.MnuPartida.Name = "MnuPartida";
            this.MnuPartida.Size = new System.Drawing.Size(56, 20);
            this.MnuPartida.Text = "Partida";
            // 
            // MnuPartidaNueva
            // 
            this.MnuPartidaNueva.Name = "MnuPartidaNueva";
            this.MnuPartidaNueva.Size = new System.Drawing.Size(108, 22);
            this.MnuPartidaNueva.Text = "Nueva";
            this.MnuPartidaNueva.Click += new System.EventHandler(this.MnuPartidaNueva_Click);
            // 
            // toolStripMenuItem1
            // 
            this.toolStripMenuItem1.Name = "toolStripMenuItem1";
            this.toolStripMenuItem1.Size = new System.Drawing.Size(105, 6);
            // 
            // MnuPartidaSalir
            // 
            this.MnuPartidaSalir.Name = "MnuPartidaSalir";
            this.MnuPartidaSalir.Size = new System.Drawing.Size(108, 22);
            this.MnuPartidaSalir.Text = "Salir";
            this.MnuPartidaSalir.Click += new System.EventHandler(this.BtnSalir_Click);
            // 
            // MnuOpciones
            // 
            this.MnuOpciones.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.MnuOpcionesCapitales,
            this.MnuOpcionesPaises,
            this.toolStripMenuItem2,
            this.MnuOpcionesMultiples,
            this.MnuOpcionesEscribir});
            this.MnuOpciones.Name = "MnuOpciones";
            this.MnuOpciones.Size = new System.Drawing.Size(69, 20);
            this.MnuOpciones.Text = "Opciones";
            // 
            // MnuOpcionesCapitales
            // 
            this.MnuOpcionesCapitales.Checked = true;
            this.MnuOpcionesCapitales.CheckOnClick = true;
            this.MnuOpcionesCapitales.CheckState = System.Windows.Forms.CheckState.Checked;
            this.MnuOpcionesCapitales.Name = "MnuOpcionesCapitales";
            this.MnuOpcionesCapitales.Size = new System.Drawing.Size(174, 22);
            this.MnuOpcionesCapitales.Text = "Nombre capitales";
            this.MnuOpcionesCapitales.Click += new System.EventHandler(this.MnuOpciones_Click);
            // 
            // MnuOpcionesPaises
            // 
            this.MnuOpcionesPaises.CheckOnClick = true;
            this.MnuOpcionesPaises.Name = "MnuOpcionesPaises";
            this.MnuOpcionesPaises.Size = new System.Drawing.Size(174, 22);
            this.MnuOpcionesPaises.Text = "Nombre países";
            this.MnuOpcionesPaises.Click += new System.EventHandler(this.MnuOpciones_Click);
            // 
            // toolStripMenuItem2
            // 
            this.toolStripMenuItem2.Name = "toolStripMenuItem2";
            this.toolStripMenuItem2.Size = new System.Drawing.Size(171, 6);
            // 
            // MnuOpcionesMultiples
            // 
            this.MnuOpcionesMultiples.Checked = true;
            this.MnuOpcionesMultiples.CheckOnClick = true;
            this.MnuOpcionesMultiples.CheckState = System.Windows.Forms.CheckState.Checked;
            this.MnuOpcionesMultiples.Name = "MnuOpcionesMultiples";
            this.MnuOpcionesMultiples.Size = new System.Drawing.Size(174, 22);
            this.MnuOpcionesMultiples.Text = "Múltiples opciones";
            this.MnuOpcionesMultiples.Click += new System.EventHandler(this.MnuOpciones_Click);
            // 
            // MnuOpcionesEscribir
            // 
            this.MnuOpcionesEscribir.CheckOnClick = true;
            this.MnuOpcionesEscribir.Name = "MnuOpcionesEscribir";
            this.MnuOpcionesEscribir.Size = new System.Drawing.Size(174, 22);
            this.MnuOpcionesEscribir.Text = "Escribir respuesta";
            this.MnuOpcionesEscribir.Click += new System.EventHandler(this.MnuOpciones_Click);
            // 
            // LblPregunta
            // 
            this.LblPregunta.AutoSize = true;
            this.LblPregunta.Location = new System.Drawing.Point(15, 24);
            this.LblPregunta.Margin = new System.Windows.Forms.Padding(3);
            this.LblPregunta.Name = "LblPregunta";
            this.LblPregunta.Size = new System.Drawing.Size(32, 13);
            this.LblPregunta.TabIndex = 1;
            this.LblPregunta.Text = "País:";
            // 
            // TxtBoxPregunta
            // 
            this.TxtBoxPregunta.Location = new System.Drawing.Point(15, 40);
            this.TxtBoxPregunta.Multiline = true;
            this.TxtBoxPregunta.Name = "TxtBoxPregunta";
            this.TxtBoxPregunta.ReadOnly = true;
            this.TxtBoxPregunta.Size = new System.Drawing.Size(150, 20);
            this.TxtBoxPregunta.TabIndex = 2;
            this.TxtBoxPregunta.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // LblRespuesta
            // 
            this.LblRespuesta.AutoSize = true;
            this.LblRespuesta.Location = new System.Drawing.Point(15, 63);
            this.LblRespuesta.Margin = new System.Windows.Forms.Padding(3);
            this.LblRespuesta.Name = "LblRespuesta";
            this.LblRespuesta.Size = new System.Drawing.Size(42, 13);
            this.LblRespuesta.TabIndex = 3;
            this.LblRespuesta.Text = "Capital:";
            // 
            // TxtBoxRespuesta0
            // 
            this.TxtBoxRespuesta0.Location = new System.Drawing.Point(15, 79);
            this.TxtBoxRespuesta0.Multiline = true;
            this.TxtBoxRespuesta0.Name = "TxtBoxRespuesta0";
            this.TxtBoxRespuesta0.ReadOnly = true;
            this.TxtBoxRespuesta0.Size = new System.Drawing.Size(150, 20);
            this.TxtBoxRespuesta0.TabIndex = 4;
            this.TxtBoxRespuesta0.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.TxtBoxRespuesta0.Click += new System.EventHandler(this.BtnRespuestas_Click);
            this.TxtBoxRespuesta0.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.BtnRespuesta0_IntroPressed);
            // 
            // TxtBoxRespuesta1
            // 
            this.TxtBoxRespuesta1.Location = new System.Drawing.Point(15, 105);
            this.TxtBoxRespuesta1.Multiline = true;
            this.TxtBoxRespuesta1.Name = "TxtBoxRespuesta1";
            this.TxtBoxRespuesta1.ReadOnly = true;
            this.TxtBoxRespuesta1.Size = new System.Drawing.Size(150, 20);
            this.TxtBoxRespuesta1.TabIndex = 5;
            this.TxtBoxRespuesta1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.TxtBoxRespuesta1.Click += new System.EventHandler(this.BtnRespuestas_Click);
            // 
            // TxtBoxRespuesta2
            // 
            this.TxtBoxRespuesta2.Location = new System.Drawing.Point(15, 131);
            this.TxtBoxRespuesta2.Multiline = true;
            this.TxtBoxRespuesta2.Name = "TxtBoxRespuesta2";
            this.TxtBoxRespuesta2.ReadOnly = true;
            this.TxtBoxRespuesta2.Size = new System.Drawing.Size(150, 20);
            this.TxtBoxRespuesta2.TabIndex = 6;
            this.TxtBoxRespuesta2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.TxtBoxRespuesta2.Click += new System.EventHandler(this.BtnRespuestas_Click);
            // 
            // TxtBoxRespuesta3
            // 
            this.TxtBoxRespuesta3.Location = new System.Drawing.Point(15, 157);
            this.TxtBoxRespuesta3.Multiline = true;
            this.TxtBoxRespuesta3.Name = "TxtBoxRespuesta3";
            this.TxtBoxRespuesta3.ReadOnly = true;
            this.TxtBoxRespuesta3.Size = new System.Drawing.Size(150, 20);
            this.TxtBoxRespuesta3.TabIndex = 7;
            this.TxtBoxRespuesta3.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.TxtBoxRespuesta3.Click += new System.EventHandler(this.BtnRespuestas_Click);
            // 
            // TxtBoxResultado
            // 
            this.TxtBoxResultado.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(103)))), ((int)(((byte)(237)))), ((int)(((byte)(255)))));
            this.TxtBoxResultado.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(168)))), ((int)(((byte)(102)))));
            this.TxtBoxResultado.Location = new System.Drawing.Point(15, 183);
            this.TxtBoxResultado.Multiline = true;
            this.TxtBoxResultado.Name = "TxtBoxResultado";
            this.TxtBoxResultado.ReadOnly = true;
            this.TxtBoxResultado.Size = new System.Drawing.Size(150, 20);
            this.TxtBoxResultado.TabIndex = 8;
            this.TxtBoxResultado.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // BtnSiguiente
            // 
            this.BtnSiguiente.Location = new System.Drawing.Point(15, 209);
            this.BtnSiguiente.Name = "BtnSiguiente";
            this.BtnSiguiente.Size = new System.Drawing.Size(75, 23);
            this.BtnSiguiente.TabIndex = 9;
            this.BtnSiguiente.Text = "Siguiente";
            this.BtnSiguiente.UseVisualStyleBackColor = true;
            this.BtnSiguiente.Click += new System.EventHandler(this.BtnSiguiente_Click);
            // 
            // BtnSalir
            // 
            this.BtnSalir.Location = new System.Drawing.Point(15, 238);
            this.BtnSalir.Name = "BtnSalir";
            this.BtnSalir.Size = new System.Drawing.Size(75, 23);
            this.BtnSalir.TabIndex = 10;
            this.BtnSalir.Text = "Salir";
            this.BtnSalir.UseVisualStyleBackColor = true;
            this.BtnSalir.Click += new System.EventHandler(this.BtnSalir_Click);
            // 
            // TxtBoxPorcentaje
            // 
            this.TxtBoxPorcentaje.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(168)))), ((int)(((byte)(102)))));
            this.TxtBoxPorcentaje.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(103)))), ((int)(((byte)(237)))), ((int)(((byte)(255)))));
            this.TxtBoxPorcentaje.Location = new System.Drawing.Point(115, 224);
            this.TxtBoxPorcentaje.Multiline = true;
            this.TxtBoxPorcentaje.Name = "TxtBoxPorcentaje";
            this.TxtBoxPorcentaje.ReadOnly = true;
            this.TxtBoxPorcentaje.Size = new System.Drawing.Size(50, 20);
            this.TxtBoxPorcentaje.TabIndex = 11;
            this.TxtBoxPorcentaje.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // FrmTrivial
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(179, 270);
            this.Controls.Add(this.TxtBoxPorcentaje);
            this.Controls.Add(this.BtnSalir);
            this.Controls.Add(this.BtnSiguiente);
            this.Controls.Add(this.TxtBoxResultado);
            this.Controls.Add(this.TxtBoxRespuesta3);
            this.Controls.Add(this.TxtBoxRespuesta2);
            this.Controls.Add(this.TxtBoxRespuesta1);
            this.Controls.Add(this.TxtBoxRespuesta0);
            this.Controls.Add(this.LblRespuesta);
            this.Controls.Add(this.TxtBoxPregunta);
            this.Controls.Add(this.LblPregunta);
            this.Controls.Add(this.MnuPpal);
            this.MainMenuStrip = this.MnuPpal;
            this.Name = "FrmTrivial";
            this.Text = "FrmTrivial";
            this.MnuPpal.ResumeLayout(false);
            this.MnuPpal.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip MnuPpal;
        private System.Windows.Forms.ToolStripMenuItem MnuPartida;
        private System.Windows.Forms.ToolStripMenuItem MnuPartidaNueva;
        private System.Windows.Forms.ToolStripSeparator toolStripMenuItem1;
        private System.Windows.Forms.ToolStripMenuItem MnuPartidaSalir;
        private System.Windows.Forms.ToolStripMenuItem MnuOpciones;
        private System.Windows.Forms.ToolStripMenuItem MnuOpcionesCapitales;
        private System.Windows.Forms.ToolStripMenuItem MnuOpcionesPaises;
        private System.Windows.Forms.ToolStripSeparator toolStripMenuItem2;
        private System.Windows.Forms.ToolStripMenuItem MnuOpcionesMultiples;
        private System.Windows.Forms.ToolStripMenuItem MnuOpcionesEscribir;
        private System.Windows.Forms.Label LblPregunta;
        private System.Windows.Forms.TextBox TxtBoxPregunta;
        private System.Windows.Forms.Label LblRespuesta;
        private System.Windows.Forms.TextBox TxtBoxRespuesta0;
        private System.Windows.Forms.TextBox TxtBoxRespuesta1;
        private System.Windows.Forms.TextBox TxtBoxRespuesta2;
        private System.Windows.Forms.TextBox TxtBoxRespuesta3;
        private System.Windows.Forms.TextBox TxtBoxResultado;
        private System.Windows.Forms.Button BtnSiguiente;
        private System.Windows.Forms.Button BtnSalir;
        private System.Windows.Forms.TextBox TxtBoxPorcentaje;
    }
}

