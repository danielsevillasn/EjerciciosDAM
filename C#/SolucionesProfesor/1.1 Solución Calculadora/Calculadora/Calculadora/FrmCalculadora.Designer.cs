namespace Calculadora
{
    partial class FrmCalculadora
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
            this.BtnDivision = new System.Windows.Forms.Button();
            this.BtnMultiplica = new System.Windows.Forms.Button();
            this.BtnResta = new System.Windows.Forms.Button();
            this.BtnIgual = new System.Windows.Forms.Button();
            this.BtnNumNueve = new System.Windows.Forms.Button();
            this.BtnNumSeis = new System.Windows.Forms.Button();
            this.BtnNumTres = new System.Windows.Forms.Button();
            this.BtnSuma = new System.Windows.Forms.Button();
            this.BtnNumOcho = new System.Windows.Forms.Button();
            this.BtnNumCinco = new System.Windows.Forms.Button();
            this.BtnNumDos = new System.Windows.Forms.Button();
            this.BtnFraccionX = new System.Windows.Forms.Button();
            this.BtnNumSiete = new System.Windows.Forms.Button();
            this.BtnNumCuatro = new System.Windows.Forms.Button();
            this.BtnNumUno = new System.Windows.Forms.Button();
            this.BtnNumZero = new System.Windows.Forms.Button();
            this.BtnMemoryClear = new System.Windows.Forms.Button();
            this.BtnMemoryRecall = new System.Windows.Forms.Button();
            this.BtnMemoryStorage = new System.Windows.Forms.Button();
            this.BtnSumNumMemory = new System.Windows.Forms.Button();
            this.TxtCaja = new System.Windows.Forms.TextBox();
            this.BtnClear = new System.Windows.Forms.Button();
            this.BtnClearError = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // BtnDivision
            // 
            this.BtnDivision.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnDivision.ForeColor = System.Drawing.Color.Red;
            this.BtnDivision.Location = new System.Drawing.Point(313, 121);
            this.BtnDivision.Name = "BtnDivision";
            this.BtnDivision.Size = new System.Drawing.Size(59, 55);
            this.BtnDivision.TabIndex = 0;
            this.BtnDivision.Text = "/";
            this.BtnDivision.UseVisualStyleBackColor = true;
            this.BtnDivision.Click += new System.EventHandler(this.division_Click);
            // 
            // BtnMultiplica
            // 
            this.BtnMultiplica.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnMultiplica.ForeColor = System.Drawing.Color.Red;
            this.BtnMultiplica.Location = new System.Drawing.Point(313, 182);
            this.BtnMultiplica.Name = "BtnMultiplica";
            this.BtnMultiplica.Size = new System.Drawing.Size(59, 55);
            this.BtnMultiplica.TabIndex = 1;
            this.BtnMultiplica.Text = "*";
            this.BtnMultiplica.UseVisualStyleBackColor = true;
            this.BtnMultiplica.Click += new System.EventHandler(this.multiplica_Click);
            // 
            // BtnResta
            // 
            this.BtnResta.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnResta.ForeColor = System.Drawing.Color.Red;
            this.BtnResta.Location = new System.Drawing.Point(313, 245);
            this.BtnResta.Name = "BtnResta";
            this.BtnResta.Size = new System.Drawing.Size(59, 55);
            this.BtnResta.TabIndex = 2;
            this.BtnResta.Text = "-";
            this.BtnResta.UseVisualStyleBackColor = true;
            this.BtnResta.Click += new System.EventHandler(this.resta_Click);
            // 
            // BtnIgual
            // 
            this.BtnIgual.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnIgual.ForeColor = System.Drawing.Color.Red;
            this.BtnIgual.Location = new System.Drawing.Point(315, 306);
            this.BtnIgual.Name = "BtnIgual";
            this.BtnIgual.Size = new System.Drawing.Size(59, 55);
            this.BtnIgual.TabIndex = 3;
            this.BtnIgual.Text = "=";
            this.BtnIgual.UseVisualStyleBackColor = true;
            this.BtnIgual.Click += new System.EventHandler(this.igual_Click);
            // 
            // BtnNumNueve
            // 
            this.BtnNumNueve.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnNumNueve.ForeColor = System.Drawing.Color.DodgerBlue;
            this.BtnNumNueve.Location = new System.Drawing.Point(248, 121);
            this.BtnNumNueve.Name = "BtnNumNueve";
            this.BtnNumNueve.Size = new System.Drawing.Size(59, 55);
            this.BtnNumNueve.TabIndex = 4;
            this.BtnNumNueve.Text = "9";
            this.BtnNumNueve.UseVisualStyleBackColor = true;
            this.BtnNumNueve.AutoSizeChanged += new System.EventHandler(this.manejadorBotones);
            this.BtnNumNueve.Click += new System.EventHandler(this.manejadorBotones);
            // 
            // BtnNumSeis
            // 
            this.BtnNumSeis.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnNumSeis.ForeColor = System.Drawing.Color.DodgerBlue;
            this.BtnNumSeis.Location = new System.Drawing.Point(248, 182);
            this.BtnNumSeis.Name = "BtnNumSeis";
            this.BtnNumSeis.Size = new System.Drawing.Size(59, 55);
            this.BtnNumSeis.TabIndex = 5;
            this.BtnNumSeis.Text = "6";
            this.BtnNumSeis.UseVisualStyleBackColor = true;
            this.BtnNumSeis.AutoSizeChanged += new System.EventHandler(this.manejadorBotones);
            this.BtnNumSeis.Click += new System.EventHandler(this.manejadorBotones);
            // 
            // BtnNumTres
            // 
            this.BtnNumTres.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnNumTres.ForeColor = System.Drawing.Color.DodgerBlue;
            this.BtnNumTres.Location = new System.Drawing.Point(248, 245);
            this.BtnNumTres.Name = "BtnNumTres";
            this.BtnNumTres.Size = new System.Drawing.Size(59, 55);
            this.BtnNumTres.TabIndex = 6;
            this.BtnNumTres.Text = "3";
            this.BtnNumTres.UseVisualStyleBackColor = true;
            this.BtnNumTres.AutoSizeChanged += new System.EventHandler(this.manejadorBotones);
            this.BtnNumTres.Click += new System.EventHandler(this.manejadorBotones);
            // 
            // BtnSuma
            // 
            this.BtnSuma.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnSuma.ForeColor = System.Drawing.Color.Red;
            this.BtnSuma.Location = new System.Drawing.Point(250, 306);
            this.BtnSuma.Name = "BtnSuma";
            this.BtnSuma.Size = new System.Drawing.Size(59, 55);
            this.BtnSuma.TabIndex = 7;
            this.BtnSuma.Text = "+";
            this.BtnSuma.UseVisualStyleBackColor = true;
            this.BtnSuma.Click += new System.EventHandler(this.suma_Click);
            // 
            // BtnNumOcho
            // 
            this.BtnNumOcho.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnNumOcho.ForeColor = System.Drawing.Color.DodgerBlue;
            this.BtnNumOcho.Location = new System.Drawing.Point(183, 121);
            this.BtnNumOcho.Name = "BtnNumOcho";
            this.BtnNumOcho.Size = new System.Drawing.Size(59, 55);
            this.BtnNumOcho.TabIndex = 8;
            this.BtnNumOcho.Text = "8";
            this.BtnNumOcho.UseVisualStyleBackColor = true;
            this.BtnNumOcho.AutoSizeChanged += new System.EventHandler(this.manejadorBotones);
            this.BtnNumOcho.Click += new System.EventHandler(this.manejadorBotones);
            // 
            // BtnNumCinco
            // 
            this.BtnNumCinco.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnNumCinco.ForeColor = System.Drawing.Color.DodgerBlue;
            this.BtnNumCinco.Location = new System.Drawing.Point(183, 182);
            this.BtnNumCinco.Name = "BtnNumCinco";
            this.BtnNumCinco.Size = new System.Drawing.Size(59, 55);
            this.BtnNumCinco.TabIndex = 9;
            this.BtnNumCinco.Text = "5";
            this.BtnNumCinco.UseVisualStyleBackColor = true;
            this.BtnNumCinco.AutoSizeChanged += new System.EventHandler(this.manejadorBotones);
            this.BtnNumCinco.Click += new System.EventHandler(this.manejadorBotones);
            // 
            // BtnNumDos
            // 
            this.BtnNumDos.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnNumDos.ForeColor = System.Drawing.Color.DodgerBlue;
            this.BtnNumDos.Location = new System.Drawing.Point(183, 245);
            this.BtnNumDos.Name = "BtnNumDos";
            this.BtnNumDos.Size = new System.Drawing.Size(59, 55);
            this.BtnNumDos.TabIndex = 10;
            this.BtnNumDos.Text = "2";
            this.BtnNumDos.UseVisualStyleBackColor = true;
            this.BtnNumDos.AutoSizeChanged += new System.EventHandler(this.manejadorBotones);
            this.BtnNumDos.Click += new System.EventHandler(this.manejadorBotones);
            // 
            // BtnFraccionX
            // 
            this.BtnFraccionX.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnFraccionX.ForeColor = System.Drawing.Color.DodgerBlue;
            this.BtnFraccionX.Location = new System.Drawing.Point(183, 306);
            this.BtnFraccionX.Name = "BtnFraccionX";
            this.BtnFraccionX.Size = new System.Drawing.Size(59, 55);
            this.BtnFraccionX.TabIndex = 11;
            this.BtnFraccionX.Text = "1/x";
            this.BtnFraccionX.UseVisualStyleBackColor = true;
            this.BtnFraccionX.Click += new System.EventHandler(this.fraccionX_Click);
            // 
            // BtnNumSiete
            // 
            this.BtnNumSiete.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnNumSiete.ForeColor = System.Drawing.Color.DodgerBlue;
            this.BtnNumSiete.Location = new System.Drawing.Point(118, 121);
            this.BtnNumSiete.Name = "BtnNumSiete";
            this.BtnNumSiete.Size = new System.Drawing.Size(59, 55);
            this.BtnNumSiete.TabIndex = 12;
            this.BtnNumSiete.Text = "7";
            this.BtnNumSiete.UseVisualStyleBackColor = true;
            this.BtnNumSiete.AutoSizeChanged += new System.EventHandler(this.manejadorBotones);
            this.BtnNumSiete.Click += new System.EventHandler(this.manejadorBotones);
            // 
            // BtnNumCuatro
            // 
            this.BtnNumCuatro.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnNumCuatro.ForeColor = System.Drawing.Color.DodgerBlue;
            this.BtnNumCuatro.Location = new System.Drawing.Point(118, 182);
            this.BtnNumCuatro.Name = "BtnNumCuatro";
            this.BtnNumCuatro.Size = new System.Drawing.Size(59, 55);
            this.BtnNumCuatro.TabIndex = 13;
            this.BtnNumCuatro.Text = "4";
            this.BtnNumCuatro.UseVisualStyleBackColor = true;
            this.BtnNumCuatro.AutoSizeChanged += new System.EventHandler(this.manejadorBotones);
            this.BtnNumCuatro.Click += new System.EventHandler(this.manejadorBotones);
            // 
            // BtnNumUno
            // 
            this.BtnNumUno.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnNumUno.ForeColor = System.Drawing.Color.DodgerBlue;
            this.BtnNumUno.Location = new System.Drawing.Point(118, 245);
            this.BtnNumUno.Name = "BtnNumUno";
            this.BtnNumUno.Size = new System.Drawing.Size(59, 55);
            this.BtnNumUno.TabIndex = 14;
            this.BtnNumUno.Text = "1";
            this.BtnNumUno.UseVisualStyleBackColor = true;
            this.BtnNumUno.AutoSizeChanged += new System.EventHandler(this.manejadorBotones);
            this.BtnNumUno.Click += new System.EventHandler(this.manejadorBotones);
            // 
            // BtnNumZero
            // 
            this.BtnNumZero.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnNumZero.ForeColor = System.Drawing.Color.DodgerBlue;
            this.BtnNumZero.Location = new System.Drawing.Point(118, 306);
            this.BtnNumZero.Name = "BtnNumZero";
            this.BtnNumZero.Size = new System.Drawing.Size(59, 55);
            this.BtnNumZero.TabIndex = 15;
            this.BtnNumZero.Text = "0";
            this.BtnNumZero.UseVisualStyleBackColor = true;
            this.BtnNumZero.Click += new System.EventHandler(this.manejadorBotones);
            // 
            // BtnMemoryClear
            // 
            this.BtnMemoryClear.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnMemoryClear.ForeColor = System.Drawing.Color.Red;
            this.BtnMemoryClear.Location = new System.Drawing.Point(44, 121);
            this.BtnMemoryClear.Name = "BtnMemoryClear";
            this.BtnMemoryClear.Size = new System.Drawing.Size(59, 55);
            this.BtnMemoryClear.TabIndex = 16;
            this.BtnMemoryClear.Text = "MC";
            this.BtnMemoryClear.UseVisualStyleBackColor = true;
            this.BtnMemoryClear.Click += new System.EventHandler(this.memoryClear_Click);
            // 
            // BtnMemoryRecall
            // 
            this.BtnMemoryRecall.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnMemoryRecall.ForeColor = System.Drawing.Color.Red;
            this.BtnMemoryRecall.Location = new System.Drawing.Point(44, 183);
            this.BtnMemoryRecall.Name = "BtnMemoryRecall";
            this.BtnMemoryRecall.Size = new System.Drawing.Size(59, 55);
            this.BtnMemoryRecall.TabIndex = 17;
            this.BtnMemoryRecall.Text = "MR";
            this.BtnMemoryRecall.UseVisualStyleBackColor = true;
            this.BtnMemoryRecall.Click += new System.EventHandler(this.memoryRecall_Click);
            // 
            // BtnMemoryStorage
            // 
            this.BtnMemoryStorage.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnMemoryStorage.ForeColor = System.Drawing.Color.Red;
            this.BtnMemoryStorage.Location = new System.Drawing.Point(44, 245);
            this.BtnMemoryStorage.Name = "BtnMemoryStorage";
            this.BtnMemoryStorage.Size = new System.Drawing.Size(59, 55);
            this.BtnMemoryStorage.TabIndex = 18;
            this.BtnMemoryStorage.Text = "MS";
            this.BtnMemoryStorage.UseVisualStyleBackColor = true;
            this.BtnMemoryStorage.Click += new System.EventHandler(this.memoryStorage_Click);
            // 
            // BtnSumNumMemory
            // 
            this.BtnSumNumMemory.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnSumNumMemory.ForeColor = System.Drawing.Color.Red;
            this.BtnSumNumMemory.Location = new System.Drawing.Point(44, 306);
            this.BtnSumNumMemory.Name = "BtnSumNumMemory";
            this.BtnSumNumMemory.Size = new System.Drawing.Size(59, 55);
            this.BtnSumNumMemory.TabIndex = 19;
            this.BtnSumNumMemory.Text = "M+";
            this.BtnSumNumMemory.UseVisualStyleBackColor = true;
            this.BtnSumNumMemory.Click += new System.EventHandler(this.sumNumMemory_Click);
            // 
            // TxtCaja
            // 
            this.TxtCaja.BackColor = System.Drawing.Color.White;
            this.TxtCaja.Cursor = System.Windows.Forms.Cursors.No;
            this.TxtCaja.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TxtCaja.Location = new System.Drawing.Point(44, 27);
            this.TxtCaja.Multiline = true;
            this.TxtCaja.Name = "TxtCaja";
            this.TxtCaja.ReadOnly = true;
            this.TxtCaja.Size = new System.Drawing.Size(328, 39);
            this.TxtCaja.TabIndex = 20;
            this.TxtCaja.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // BtnClear
            // 
            this.BtnClear.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnClear.ForeColor = System.Drawing.Color.Red;
            this.BtnClear.Location = new System.Drawing.Point(283, 72);
            this.BtnClear.Name = "BtnClear";
            this.BtnClear.Size = new System.Drawing.Size(89, 43);
            this.BtnClear.TabIndex = 21;
            this.BtnClear.Text = "C";
            this.BtnClear.UseVisualStyleBackColor = true;
            this.BtnClear.Click += new System.EventHandler(this.clear_Click);
            // 
            // BtnClearError
            // 
            this.BtnClearError.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnClearError.ForeColor = System.Drawing.Color.Red;
            this.BtnClearError.Location = new System.Drawing.Point(188, 72);
            this.BtnClearError.Name = "BtnClearError";
            this.BtnClearError.Size = new System.Drawing.Size(89, 43);
            this.BtnClearError.TabIndex = 22;
            this.BtnClearError.Text = "CE";
            this.BtnClearError.UseVisualStyleBackColor = true;
            this.BtnClearError.Click += new System.EventHandler(this.clearError_Click);
            // 
            // FrmCalculadora
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(429, 376);
            this.Controls.Add(this.BtnClearError);
            this.Controls.Add(this.BtnClear);
            this.Controls.Add(this.TxtCaja);
            this.Controls.Add(this.BtnSumNumMemory);
            this.Controls.Add(this.BtnMemoryStorage);
            this.Controls.Add(this.BtnMemoryRecall);
            this.Controls.Add(this.BtnMemoryClear);
            this.Controls.Add(this.BtnNumZero);
            this.Controls.Add(this.BtnNumUno);
            this.Controls.Add(this.BtnNumCuatro);
            this.Controls.Add(this.BtnNumSiete);
            this.Controls.Add(this.BtnFraccionX);
            this.Controls.Add(this.BtnNumDos);
            this.Controls.Add(this.BtnNumCinco);
            this.Controls.Add(this.BtnNumOcho);
            this.Controls.Add(this.BtnSuma);
            this.Controls.Add(this.BtnNumTres);
            this.Controls.Add(this.BtnNumSeis);
            this.Controls.Add(this.BtnNumNueve);
            this.Controls.Add(this.BtnIgual);
            this.Controls.Add(this.BtnResta);
            this.Controls.Add(this.BtnMultiplica);
            this.Controls.Add(this.BtnDivision);
            this.Name = "FrmCalculadora";
            this.Text = "Calculadora";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button BtnDivision;
        private System.Windows.Forms.Button BtnMultiplica;
        private System.Windows.Forms.Button BtnResta;
        private System.Windows.Forms.Button BtnIgual;
        private System.Windows.Forms.Button BtnNumNueve;
        private System.Windows.Forms.Button BtnNumSeis;
        private System.Windows.Forms.Button BtnNumTres;
        private System.Windows.Forms.Button BtnSuma;
        private System.Windows.Forms.Button BtnNumOcho;
        private System.Windows.Forms.Button BtnNumCinco;
        private System.Windows.Forms.Button BtnNumDos;
        private System.Windows.Forms.Button BtnFraccionX;
        private System.Windows.Forms.Button BtnNumSiete;
        private System.Windows.Forms.Button BtnNumCuatro;
        private System.Windows.Forms.Button BtnNumUno;
        private System.Windows.Forms.Button BtnNumZero;
        private System.Windows.Forms.Button BtnMemoryClear;
        private System.Windows.Forms.Button BtnMemoryRecall;
        private System.Windows.Forms.Button BtnMemoryStorage;
        private System.Windows.Forms.Button BtnSumNumMemory;
        private System.Windows.Forms.TextBox TxtCaja;
        private System.Windows.Forms.Button BtnClear;
        private System.Windows.Forms.Button BtnClearError;
    }
}

