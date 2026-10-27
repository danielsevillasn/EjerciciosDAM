namespace Trivial
{
    partial class Form1
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.cmsMenu = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.opcMenu = new System.Windows.Forms.ToolStripMenuItem();
            this.opcOpciones = new System.Windows.Forms.ToolStripMenuItem();
            this.opcNombreCapitales = new System.Windows.Forms.ToolStripMenuItem();
            this.opcNombrePaises = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.opcMultiplesOpciones = new System.Windows.Forms.ToolStripMenuItem();
            this.opcEscribirRespuesta = new System.Windows.Forms.ToolStripMenuItem();
            this.gradientPanel1 = new Trivial.GradientPanel();
            this.lbTextoPrincipal = new System.Windows.Forms.Label();
            this.pnPartida = new System.Windows.Forms.Panel();
            this.pbPincel = new System.Windows.Forms.PictureBox();
            this.tbRespuestaCorrecta = new System.Windows.Forms.TextBox();
            this.tbEscribirRespuesta = new System.Windows.Forms.TextBox();
            this.btnCapital4 = new System.Windows.Forms.Button();
            this.btnCapital3 = new System.Windows.Forms.Button();
            this.btnCapital2 = new System.Windows.Forms.Button();
            this.btnCapital1 = new System.Windows.Forms.Button();
            this.pnAciertosFondo = new System.Windows.Forms.Panel();
            this.lbAciertos = new System.Windows.Forms.Label();
            this.pbAciertos = new System.Windows.Forms.PictureBox();
            this.pbSiguiente = new System.Windows.Forms.PictureBox();
            this.pnCapital = new System.Windows.Forms.Panel();
            this.lbCapitalFondo = new System.Windows.Forms.Label();
            this.pnPais = new System.Windows.Forms.Panel();
            this.lbPaisJuego = new System.Windows.Forms.Label();
            this.pbGlobo = new System.Windows.Forms.PictureBox();
            this.pnFondo1 = new System.Windows.Forms.Panel();
            this.lbPaisFondo = new System.Windows.Forms.Label();
            this.pnMenu = new System.Windows.Forms.Panel();
            this.btnNuevaPartida = new System.Windows.Forms.Button();
            this.btnSalir = new System.Windows.Forms.Button();
            this.pbMenu = new System.Windows.Forms.PictureBox();
            this.cmsMenu.SuspendLayout();
            this.gradientPanel1.SuspendLayout();
            this.pnPartida.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbPincel)).BeginInit();
            this.pnAciertosFondo.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbAciertos)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbSiguiente)).BeginInit();
            this.pnCapital.SuspendLayout();
            this.pnPais.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbGlobo)).BeginInit();
            this.pnFondo1.SuspendLayout();
            this.pnMenu.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbMenu)).BeginInit();
            this.SuspendLayout();
            // 
            // cmsMenu
            // 
            this.cmsMenu.BackColor = System.Drawing.Color.White;
            this.cmsMenu.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.opcMenu,
            this.opcOpciones});
            this.cmsMenu.Name = "contextMenuStrip1";
            this.cmsMenu.Size = new System.Drawing.Size(125, 48);
            // 
            // opcMenu
            // 
            this.opcMenu.Name = "opcMenu";
            this.opcMenu.Size = new System.Drawing.Size(124, 22);
            this.opcMenu.Text = "Menu";
            this.opcMenu.Click += new System.EventHandler(this.menuToolStripMenuItem_Click);
            // 
            // opcOpciones
            // 
            this.opcOpciones.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.opcNombreCapitales,
            this.opcNombrePaises,
            this.toolStripSeparator1,
            this.opcMultiplesOpciones,
            this.opcEscribirRespuesta});
            this.opcOpciones.Name = "opcOpciones";
            this.opcOpciones.Size = new System.Drawing.Size(124, 22);
            this.opcOpciones.Text = "Opciones";
            // 
            // opcNombreCapitales
            // 
            this.opcNombreCapitales.Checked = true;
            this.opcNombreCapitales.CheckState = System.Windows.Forms.CheckState.Checked;
            this.opcNombreCapitales.Name = "opcNombreCapitales";
            this.opcNombreCapitales.Size = new System.Drawing.Size(176, 22);
            this.opcNombreCapitales.Text = "Nombre Capitales";
            this.opcNombreCapitales.Click += new System.EventHandler(this.OpcionJuego);
            // 
            // opcNombrePaises
            // 
            this.opcNombrePaises.Name = "opcNombrePaises";
            this.opcNombrePaises.Size = new System.Drawing.Size(176, 22);
            this.opcNombrePaises.Text = "Nombre Países";
            this.opcNombrePaises.Click += new System.EventHandler(this.OpcionJuego);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(173, 6);
            // 
            // opcMultiplesOpciones
            // 
            this.opcMultiplesOpciones.Checked = true;
            this.opcMultiplesOpciones.CheckState = System.Windows.Forms.CheckState.Checked;
            this.opcMultiplesOpciones.Name = "opcMultiplesOpciones";
            this.opcMultiplesOpciones.Size = new System.Drawing.Size(176, 22);
            this.opcMultiplesOpciones.Text = "Multiples Opciones";
            this.opcMultiplesOpciones.Click += new System.EventHandler(this.OpcionJuego);
            // 
            // opcEscribirRespuesta
            // 
            this.opcEscribirRespuesta.Name = "opcEscribirRespuesta";
            this.opcEscribirRespuesta.Size = new System.Drawing.Size(176, 22);
            this.opcEscribirRespuesta.Text = "Escribir Respuesta";
            this.opcEscribirRespuesta.Click += new System.EventHandler(this.OpcionJuego);
            // 
            // gradientPanel1
            // 
            this.gradientPanel1.ColorBottom = System.Drawing.Color.Chocolate;
            this.gradientPanel1.ColorTop = System.Drawing.Color.Orange;
            this.gradientPanel1.Controls.Add(this.pbMenu);
            this.gradientPanel1.Controls.Add(this.lbTextoPrincipal);
            this.gradientPanel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.gradientPanel1.Location = new System.Drawing.Point(0, 0);
            this.gradientPanel1.Margin = new System.Windows.Forms.Padding(0);
            this.gradientPanel1.Name = "gradientPanel1";
            this.gradientPanel1.Size = new System.Drawing.Size(378, 87);
            this.gradientPanel1.TabIndex = 0;
            this.gradientPanel1.MouseMove += new System.Windows.Forms.MouseEventHandler(this.Arrastrar);
            // 
            // lbTextoPrincipal
            // 
            this.lbTextoPrincipal.AutoSize = true;
            this.lbTextoPrincipal.BackColor = System.Drawing.Color.Transparent;
            this.lbTextoPrincipal.Font = new System.Drawing.Font("Comic Sans MS", 21.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbTextoPrincipal.ForeColor = System.Drawing.Color.White;
            this.lbTextoPrincipal.Location = new System.Drawing.Point(117, 28);
            this.lbTextoPrincipal.Name = "lbTextoPrincipal";
            this.lbTextoPrincipal.Size = new System.Drawing.Size(145, 40);
            this.lbTextoPrincipal.TabIndex = 0;
            this.lbTextoPrincipal.Text = "TRIVIAL";
            this.lbTextoPrincipal.MouseMove += new System.Windows.Forms.MouseEventHandler(this.Arrastrar);
            // 
            // pnPartida
            // 
            this.pnPartida.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("pnPartida.BackgroundImage")));
            this.pnPartida.Controls.Add(this.pbPincel);
            this.pnPartida.Controls.Add(this.tbRespuestaCorrecta);
            this.pnPartida.Controls.Add(this.tbEscribirRespuesta);
            this.pnPartida.Controls.Add(this.btnCapital4);
            this.pnPartida.Controls.Add(this.btnCapital3);
            this.pnPartida.Controls.Add(this.btnCapital2);
            this.pnPartida.Controls.Add(this.btnCapital1);
            this.pnPartida.Controls.Add(this.pnAciertosFondo);
            this.pnPartida.Controls.Add(this.pnCapital);
            this.pnPartida.Controls.Add(this.pnPais);
            this.pnPartida.Controls.Add(this.pnFondo1);
            this.pnPartida.Location = new System.Drawing.Point(0, 87);
            this.pnPartida.Margin = new System.Windows.Forms.Padding(0);
            this.pnPartida.Name = "pnPartida";
            this.pnPartida.Size = new System.Drawing.Size(378, 443);
            this.pnPartida.TabIndex = 2;
            this.pnPartida.Visible = false;
            // 
            // pbPincel
            // 
            this.pbPincel.BackColor = System.Drawing.Color.Transparent;
            this.pbPincel.Image = global::Trivial.Properties.Resources.icons8_pencil_64;
            this.pbPincel.Location = new System.Drawing.Point(27, 233);
            this.pbPincel.Name = "pbPincel";
            this.pbPincel.Size = new System.Drawing.Size(64, 64);
            this.pbPincel.TabIndex = 6;
            this.pbPincel.TabStop = false;
            this.pbPincel.Visible = false;
            // 
            // tbRespuestaCorrecta
            // 
            this.tbRespuestaCorrecta.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.tbRespuestaCorrecta.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tbRespuestaCorrecta.ForeColor = System.Drawing.Color.Black;
            this.tbRespuestaCorrecta.Location = new System.Drawing.Point(40, 315);
            this.tbRespuestaCorrecta.Name = "tbRespuestaCorrecta";
            this.tbRespuestaCorrecta.ReadOnly = true;
            this.tbRespuestaCorrecta.Size = new System.Drawing.Size(295, 31);
            this.tbRespuestaCorrecta.TabIndex = 5;
            this.tbRespuestaCorrecta.Text = "Correcta";
            this.tbRespuestaCorrecta.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.tbRespuestaCorrecta.Visible = false;
            // 
            // tbEscribirRespuesta
            // 
            this.tbEscribirRespuesta.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.tbEscribirRespuesta.Enabled = false;
            this.tbEscribirRespuesta.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tbEscribirRespuesta.ForeColor = System.Drawing.Color.Black;
            this.tbEscribirRespuesta.Location = new System.Drawing.Point(97, 251);
            this.tbEscribirRespuesta.Name = "tbEscribirRespuesta";
            this.tbEscribirRespuesta.Size = new System.Drawing.Size(238, 31);
            this.tbEscribirRespuesta.TabIndex = 5;
            this.tbEscribirRespuesta.Text = "Respuesta";
            this.tbEscribirRespuesta.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.tbEscribirRespuesta.Visible = false;
            this.tbEscribirRespuesta.KeyDown += new System.Windows.Forms.KeyEventHandler(this.introducirRespuestaEscrita);
            // 
            // btnCapital4
            // 
            this.btnCapital4.BackColor = System.Drawing.Color.FloralWhite;
            this.btnCapital4.FlatAppearance.BorderSize = 2;
            this.btnCapital4.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCapital4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCapital4.ForeColor = System.Drawing.Color.SaddleBrown;
            this.btnCapital4.Location = new System.Drawing.Point(200, 298);
            this.btnCapital4.Name = "btnCapital4";
            this.btnCapital4.Size = new System.Drawing.Size(166, 67);
            this.btnCapital4.TabIndex = 4;
            this.btnCapital4.Text = "CAPITAL4";
            this.btnCapital4.UseVisualStyleBackColor = false;
            this.btnCapital4.Click += new System.EventHandler(this.eleccionOpciones);
            // 
            // btnCapital3
            // 
            this.btnCapital3.BackColor = System.Drawing.Color.FloralWhite;
            this.btnCapital3.FlatAppearance.BorderSize = 2;
            this.btnCapital3.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCapital3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCapital3.ForeColor = System.Drawing.Color.SaddleBrown;
            this.btnCapital3.Location = new System.Drawing.Point(12, 298);
            this.btnCapital3.Name = "btnCapital3";
            this.btnCapital3.Size = new System.Drawing.Size(166, 67);
            this.btnCapital3.TabIndex = 4;
            this.btnCapital3.Text = "CAPITAL3";
            this.btnCapital3.UseVisualStyleBackColor = false;
            this.btnCapital3.Click += new System.EventHandler(this.eleccionOpciones);
            // 
            // btnCapital2
            // 
            this.btnCapital2.BackColor = System.Drawing.Color.FloralWhite;
            this.btnCapital2.FlatAppearance.BorderSize = 2;
            this.btnCapital2.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCapital2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCapital2.ForeColor = System.Drawing.Color.SaddleBrown;
            this.btnCapital2.Location = new System.Drawing.Point(200, 215);
            this.btnCapital2.Name = "btnCapital2";
            this.btnCapital2.Size = new System.Drawing.Size(166, 67);
            this.btnCapital2.TabIndex = 4;
            this.btnCapital2.Text = "CAPITAL2";
            this.btnCapital2.UseVisualStyleBackColor = false;
            this.btnCapital2.Click += new System.EventHandler(this.eleccionOpciones);
            // 
            // btnCapital1
            // 
            this.btnCapital1.BackColor = System.Drawing.Color.FloralWhite;
            this.btnCapital1.FlatAppearance.BorderSize = 2;
            this.btnCapital1.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCapital1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCapital1.ForeColor = System.Drawing.Color.SaddleBrown;
            this.btnCapital1.Location = new System.Drawing.Point(12, 215);
            this.btnCapital1.Name = "btnCapital1";
            this.btnCapital1.Size = new System.Drawing.Size(166, 67);
            this.btnCapital1.TabIndex = 4;
            this.btnCapital1.Text = "CAPITAL1";
            this.btnCapital1.UseVisualStyleBackColor = false;
            this.btnCapital1.Click += new System.EventHandler(this.eleccionOpciones);
            // 
            // pnAciertosFondo
            // 
            this.pnAciertosFondo.BackColor = System.Drawing.Color.Orange;
            this.pnAciertosFondo.Controls.Add(this.lbAciertos);
            this.pnAciertosFondo.Controls.Add(this.pbAciertos);
            this.pnAciertosFondo.Controls.Add(this.pbSiguiente);
            this.pnAciertosFondo.Location = new System.Drawing.Point(0, 386);
            this.pnAciertosFondo.Name = "pnAciertosFondo";
            this.pnAciertosFondo.Size = new System.Drawing.Size(378, 57);
            this.pnAciertosFondo.TabIndex = 2;
            // 
            // lbAciertos
            // 
            this.lbAciertos.AutoSize = true;
            this.lbAciertos.BackColor = System.Drawing.Color.Transparent;
            this.lbAciertos.Font = new System.Drawing.Font("Comic Sans MS", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbAciertos.ForeColor = System.Drawing.Color.White;
            this.lbAciertos.Location = new System.Drawing.Point(74, 14);
            this.lbAciertos.Name = "lbAciertos";
            this.lbAciertos.Size = new System.Drawing.Size(69, 30);
            this.lbAciertos.TabIndex = 0;
            this.lbAciertos.Text = "100%";
            // 
            // pbAciertos
            // 
            this.pbAciertos.BackColor = System.Drawing.Color.Transparent;
            this.pbAciertos.Image = global::Trivial.Properties.Resources.trophy_50px;
            this.pbAciertos.Location = new System.Drawing.Point(12, 5);
            this.pbAciertos.Name = "pbAciertos";
            this.pbAciertos.Size = new System.Drawing.Size(50, 50);
            this.pbAciertos.TabIndex = 5;
            this.pbAciertos.TabStop = false;
            this.pbAciertos.MouseEnter += new System.EventHandler(this.HoverMenu);
            this.pbAciertos.MouseLeave += new System.EventHandler(this.HoverMenuLeave);
            // 
            // pbSiguiente
            // 
            this.pbSiguiente.BackColor = System.Drawing.Color.Transparent;
            this.pbSiguiente.Image = global::Trivial.Properties.Resources.arrow_filled_50px;
            this.pbSiguiente.Location = new System.Drawing.Point(316, 5);
            this.pbSiguiente.Name = "pbSiguiente";
            this.pbSiguiente.Size = new System.Drawing.Size(50, 50);
            this.pbSiguiente.TabIndex = 5;
            this.pbSiguiente.TabStop = false;
            this.pbSiguiente.Click += new System.EventHandler(this.pbSiguiente_Click);
            this.pbSiguiente.MouseEnter += new System.EventHandler(this.HoverMenu);
            this.pbSiguiente.MouseLeave += new System.EventHandler(this.HoverMenuLeave);
            // 
            // pnCapital
            // 
            this.pnCapital.BackColor = System.Drawing.Color.DarkOrange;
            this.pnCapital.Controls.Add(this.lbCapitalFondo);
            this.pnCapital.Location = new System.Drawing.Point(0, 149);
            this.pnCapital.Name = "pnCapital";
            this.pnCapital.Size = new System.Drawing.Size(378, 46);
            this.pnCapital.TabIndex = 2;
            // 
            // lbCapitalFondo
            // 
            this.lbCapitalFondo.AutoSize = true;
            this.lbCapitalFondo.BackColor = System.Drawing.Color.Transparent;
            this.lbCapitalFondo.Font = new System.Drawing.Font("Comic Sans MS", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbCapitalFondo.Location = new System.Drawing.Point(142, 8);
            this.lbCapitalFondo.Name = "lbCapitalFondo";
            this.lbCapitalFondo.Size = new System.Drawing.Size(105, 30);
            this.lbCapitalFondo.TabIndex = 0;
            this.lbCapitalFondo.Text = "CAPITAL";
            this.lbCapitalFondo.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // pnPais
            // 
            this.pnPais.BackColor = System.Drawing.Color.FloralWhite;
            this.pnPais.Controls.Add(this.lbPaisJuego);
            this.pnPais.Controls.Add(this.pbGlobo);
            this.pnPais.Location = new System.Drawing.Point(27, 64);
            this.pnPais.Name = "pnPais";
            this.pnPais.Size = new System.Drawing.Size(322, 66);
            this.pnPais.TabIndex = 3;
            // 
            // lbPaisJuego
            // 
            this.lbPaisJuego.AutoSize = true;
            this.lbPaisJuego.BackColor = System.Drawing.Color.Transparent;
            this.lbPaisJuego.Font = new System.Drawing.Font("Microsoft Sans Serif", 21.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbPaisJuego.ForeColor = System.Drawing.Color.SaddleBrown;
            this.lbPaisJuego.Location = new System.Drawing.Point(85, 21);
            this.lbPaisJuego.Name = "lbPaisJuego";
            this.lbPaisJuego.Size = new System.Drawing.Size(80, 33);
            this.lbPaisJuego.TabIndex = 3;
            this.lbPaisJuego.Text = "PAIS";
            this.lbPaisJuego.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // pbGlobo
            // 
            this.pbGlobo.BackColor = System.Drawing.Color.Transparent;
            this.pbGlobo.Image = global::Trivial.Properties.Resources.globe_earth_45px;
            this.pbGlobo.Location = new System.Drawing.Point(13, 12);
            this.pbGlobo.Name = "pbGlobo";
            this.pbGlobo.Size = new System.Drawing.Size(45, 45);
            this.pbGlobo.TabIndex = 2;
            this.pbGlobo.TabStop = false;
            // 
            // pnFondo1
            // 
            this.pnFondo1.BackColor = System.Drawing.Color.DarkOrange;
            this.pnFondo1.Controls.Add(this.lbPaisFondo);
            this.pnFondo1.Location = new System.Drawing.Point(0, 0);
            this.pnFondo1.Name = "pnFondo1";
            this.pnFondo1.Size = new System.Drawing.Size(378, 46);
            this.pnFondo1.TabIndex = 1;
            // 
            // lbPaisFondo
            // 
            this.lbPaisFondo.AutoSize = true;
            this.lbPaisFondo.BackColor = System.Drawing.Color.Transparent;
            this.lbPaisFondo.Font = new System.Drawing.Font("Comic Sans MS", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbPaisFondo.Location = new System.Drawing.Point(144, 8);
            this.lbPaisFondo.Name = "lbPaisFondo";
            this.lbPaisFondo.Size = new System.Drawing.Size(65, 30);
            this.lbPaisFondo.TabIndex = 0;
            this.lbPaisFondo.Text = "PAÍS";
            this.lbPaisFondo.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // pnMenu
            // 
            this.pnMenu.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("pnMenu.BackgroundImage")));
            this.pnMenu.Controls.Add(this.btnNuevaPartida);
            this.pnMenu.Controls.Add(this.btnSalir);
            this.pnMenu.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.pnMenu.Location = new System.Drawing.Point(0, 87);
            this.pnMenu.Margin = new System.Windows.Forms.Padding(0);
            this.pnMenu.Name = "pnMenu";
            this.pnMenu.Size = new System.Drawing.Size(378, 443);
            this.pnMenu.TabIndex = 1;
            // 
            // btnNuevaPartida
            // 
            this.btnNuevaPartida.BackColor = System.Drawing.Color.Chocolate;
            this.btnNuevaPartida.FlatAppearance.BorderColor = System.Drawing.Color.SaddleBrown;
            this.btnNuevaPartida.FlatAppearance.BorderSize = 3;
            this.btnNuevaPartida.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnNuevaPartida.Font = new System.Drawing.Font("Comic Sans MS", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnNuevaPartida.ForeColor = System.Drawing.Color.White;
            this.btnNuevaPartida.Location = new System.Drawing.Point(74, 106);
            this.btnNuevaPartida.Name = "btnNuevaPartida";
            this.btnNuevaPartida.Size = new System.Drawing.Size(230, 67);
            this.btnNuevaPartida.TabIndex = 0;
            this.btnNuevaPartida.Text = "NUEVA PARTIDA";
            this.btnNuevaPartida.UseVisualStyleBackColor = false;
            this.btnNuevaPartida.Click += new System.EventHandler(this.btnNuevaPartida_Click);
            // 
            // btnSalir
            // 
            this.btnSalir.BackColor = System.Drawing.Color.Chocolate;
            this.btnSalir.FlatAppearance.BorderColor = System.Drawing.Color.SaddleBrown;
            this.btnSalir.FlatAppearance.BorderSize = 3;
            this.btnSalir.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnSalir.Font = new System.Drawing.Font("Comic Sans MS", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSalir.ForeColor = System.Drawing.Color.White;
            this.btnSalir.Location = new System.Drawing.Point(74, 215);
            this.btnSalir.Name = "btnSalir";
            this.btnSalir.Size = new System.Drawing.Size(230, 67);
            this.btnSalir.TabIndex = 0;
            this.btnSalir.Text = "SALIR";
            this.btnSalir.UseVisualStyleBackColor = false;
            this.btnSalir.Click += new System.EventHandler(this.BtnSalir_Click);
            // 
            // pbMenu
            // 
            this.pbMenu.BackColor = System.Drawing.Color.Transparent;
            this.pbMenu.ContextMenuStrip = this.cmsMenu;
            this.pbMenu.Image = global::Trivial.Properties.Resources.menu_filled_35px;
            this.pbMenu.Location = new System.Drawing.Point(40, 29);
            this.pbMenu.Name = "pbMenu";
            this.pbMenu.Size = new System.Drawing.Size(35, 35);
            this.pbMenu.TabIndex = 1;
            this.pbMenu.TabStop = false;
            this.pbMenu.Click += new System.EventHandler(this.pbOpciones);
            this.pbMenu.MouseEnter += new System.EventHandler(this.HoverMenu);
            this.pbMenu.MouseLeave += new System.EventHandler(this.HoverMenuLeave);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.SandyBrown;
            this.ClientSize = new System.Drawing.Size(378, 530);
            this.Controls.Add(this.pnPartida);
            this.Controls.Add(this.pnMenu);
            this.Controls.Add(this.gradientPanel1);
            this.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.cmsMenu.ResumeLayout(false);
            this.gradientPanel1.ResumeLayout(false);
            this.gradientPanel1.PerformLayout();
            this.pnPartida.ResumeLayout(false);
            this.pnPartida.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbPincel)).EndInit();
            this.pnAciertosFondo.ResumeLayout(false);
            this.pnAciertosFondo.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbAciertos)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbSiguiente)).EndInit();
            this.pnCapital.ResumeLayout(false);
            this.pnCapital.PerformLayout();
            this.pnPais.ResumeLayout(false);
            this.pnPais.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbGlobo)).EndInit();
            this.pnFondo1.ResumeLayout(false);
            this.pnFondo1.PerformLayout();
            this.pnMenu.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.pbMenu)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private GradientPanel gradientPanel1;
        private System.Windows.Forms.Label lbTextoPrincipal;
        private System.Windows.Forms.Button btnNuevaPartida;
        private System.Windows.Forms.PictureBox pbMenu;
        private System.Windows.Forms.Button btnSalir;
        private System.Windows.Forms.Panel pnMenu;
        private System.Windows.Forms.ContextMenuStrip cmsMenu;
        private System.Windows.Forms.ToolStripMenuItem opcMenu;
        private System.Windows.Forms.ToolStripMenuItem opcOpciones;
        private System.Windows.Forms.ToolStripMenuItem opcNombreCapitales;
        private System.Windows.Forms.ToolStripMenuItem opcNombrePaises;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripMenuItem opcMultiplesOpciones;
        private System.Windows.Forms.ToolStripMenuItem opcEscribirRespuesta;
        private System.Windows.Forms.Panel pnPartida;
        private System.Windows.Forms.PictureBox pbGlobo;
        private System.Windows.Forms.Panel pnFondo1;
        private System.Windows.Forms.Label lbPaisFondo;
        private System.Windows.Forms.Panel pnPais;
        private System.Windows.Forms.Label lbPaisJuego;
        private System.Windows.Forms.Panel pnCapital;
        private System.Windows.Forms.Label lbCapitalFondo;
        private System.Windows.Forms.Button btnCapital4;
        private System.Windows.Forms.Button btnCapital3;
        private System.Windows.Forms.Button btnCapital2;
        private System.Windows.Forms.Button btnCapital1;
        private System.Windows.Forms.PictureBox pbSiguiente;
        private System.Windows.Forms.PictureBox pbAciertos;
        private System.Windows.Forms.Panel pnAciertosFondo;
        private System.Windows.Forms.Label lbAciertos;
        private System.Windows.Forms.TextBox tbEscribirRespuesta;
        private System.Windows.Forms.TextBox tbRespuestaCorrecta;
        private System.Windows.Forms.PictureBox pbPincel;
    }
}

