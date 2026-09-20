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
            TxtResultado = new TextBox();
            BtnC = new Button();
            BtnCe = new Button();
            BtnDivision = new Button();
            BtnBorraMemoria = new Button();
            Btn7 = new Button();
            Btn8 = new Button();
            Btn9 = new Button();
            Btn6 = new Button();
            Btn5 = new Button();
            Btn4 = new Button();
            BtnRecuperaMemoria = new Button();
            BtnMultiplicacion = new Button();
            Btn3 = new Button();
            Btn2 = new Button();
            Btn1 = new Button();
            BtnGuardaMemoria = new Button();
            BtnResta = new Button();
            BtnSuma = new Button();
            BtnFraccion = new Button();
            Btn0 = new Button();
            BtnSumaMemoria = new Button();
            BtnIgual = new Button();
            LblNombre = new Label();
            SuspendLayout();
            // 
            // TxtResultado
            // 
            TxtResultado.Location = new Point(134, 62);
            TxtResultado.Name = "TxtResultado";
            TxtResultado.Size = new Size(411, 23);
            TxtResultado.TabIndex = 0;
            // 
            // BtnC
            // 
            BtnC.Location = new Point(445, 91);
            BtnC.Name = "BtnC";
            BtnC.Size = new Size(100, 23);
            BtnC.TabIndex = 2;
            BtnC.Text = "C";
            BtnC.UseVisualStyleBackColor = true;
            BtnC.Click += BtnC_Click;
            // 
            // BtnCe
            // 
            BtnCe.Location = new Point(314, 91);
            BtnCe.Name = "BtnCe";
            BtnCe.Size = new Size(125, 23);
            BtnCe.TabIndex = 3;
            BtnCe.Text = "CE";
            BtnCe.UseVisualStyleBackColor = true;
            BtnCe.Click += BtnCe_Click;
            // 
            // BtnDivision
            // 
            BtnDivision.Location = new Point(470, 120);
            BtnDivision.Name = "BtnDivision";
            BtnDivision.Size = new Size(75, 23);
            BtnDivision.TabIndex = 4;
            BtnDivision.Text = "/";
            BtnDivision.UseVisualStyleBackColor = true;
            BtnDivision.Click += BtnOperando_Click;
            // 
            // BtnBorraMemoria
            // 
            BtnBorraMemoria.Location = new Point(134, 120);
            BtnBorraMemoria.Name = "BtnBorraMemoria";
            BtnBorraMemoria.Size = new Size(75, 23);
            BtnBorraMemoria.TabIndex = 5;
            BtnBorraMemoria.Text = "MC";
            BtnBorraMemoria.UseVisualStyleBackColor = true;
            BtnBorraMemoria.Click += BtnBorraMemoria_Click;
            // 
            // Btn7
            // 
            Btn7.Location = new Point(227, 120);
            Btn7.Name = "Btn7";
            Btn7.Size = new Size(75, 23);
            Btn7.TabIndex = 6;
            Btn7.Text = "7";
            Btn7.UseVisualStyleBackColor = true;
            Btn7.Click += BtnNumero_Click;
            // 
            // Btn8
            // 
            Btn8.Location = new Point(308, 120);
            Btn8.Name = "Btn8";
            Btn8.Size = new Size(75, 23);
            Btn8.TabIndex = 7;
            Btn8.Text = "8";
            Btn8.UseVisualStyleBackColor = true;
            Btn8.Click += BtnNumero_Click;
            // 
            // Btn9
            // 
            Btn9.Location = new Point(389, 120);
            Btn9.Name = "Btn9";
            Btn9.Size = new Size(75, 23);
            Btn9.TabIndex = 8;
            Btn9.Text = "9";
            Btn9.UseVisualStyleBackColor = true;
            Btn9.Click += BtnNumero_Click;
            // 
            // Btn6
            // 
            Btn6.Location = new Point(389, 149);
            Btn6.Name = "Btn6";
            Btn6.Size = new Size(75, 23);
            Btn6.TabIndex = 13;
            Btn6.Text = "6";
            Btn6.UseVisualStyleBackColor = true;
            Btn6.Click += BtnNumero_Click;
            // 
            // Btn5
            // 
            Btn5.Location = new Point(308, 149);
            Btn5.Name = "Btn5";
            Btn5.Size = new Size(75, 23);
            Btn5.TabIndex = 12;
            Btn5.Text = "5";
            Btn5.UseVisualStyleBackColor = true;
            Btn5.Click += BtnNumero_Click;
            // 
            // Btn4
            // 
            Btn4.Location = new Point(227, 149);
            Btn4.Name = "Btn4";
            Btn4.Size = new Size(75, 23);
            Btn4.TabIndex = 11;
            Btn4.Text = "4";
            Btn4.UseVisualStyleBackColor = true;
            Btn4.Click += BtnNumero_Click;
            // 
            // BtnRecuperaMemoria
            // 
            BtnRecuperaMemoria.Location = new Point(134, 149);
            BtnRecuperaMemoria.Name = "BtnRecuperaMemoria";
            BtnRecuperaMemoria.Size = new Size(75, 23);
            BtnRecuperaMemoria.TabIndex = 10;
            BtnRecuperaMemoria.Text = "MR";
            BtnRecuperaMemoria.UseVisualStyleBackColor = true;
            BtnRecuperaMemoria.Click += BtnRecuperaMemoria_Click;
            // 
            // BtnMultiplicacion
            // 
            BtnMultiplicacion.Location = new Point(470, 149);
            BtnMultiplicacion.Name = "BtnMultiplicacion";
            BtnMultiplicacion.Size = new Size(75, 23);
            BtnMultiplicacion.TabIndex = 9;
            BtnMultiplicacion.Text = "*";
            BtnMultiplicacion.UseVisualStyleBackColor = true;
            BtnMultiplicacion.Click += BtnOperando_Click;
            // 
            // Btn3
            // 
            Btn3.Location = new Point(389, 178);
            Btn3.Name = "Btn3";
            Btn3.Size = new Size(75, 23);
            Btn3.TabIndex = 18;
            Btn3.Text = "3";
            Btn3.UseVisualStyleBackColor = true;
            Btn3.Click += BtnNumero_Click;
            // 
            // Btn2
            // 
            Btn2.Location = new Point(308, 178);
            Btn2.Name = "Btn2";
            Btn2.Size = new Size(75, 23);
            Btn2.TabIndex = 17;
            Btn2.Text = "2";
            Btn2.UseVisualStyleBackColor = true;
            Btn2.Click += BtnNumero_Click;
            // 
            // Btn1
            // 
            Btn1.Location = new Point(227, 178);
            Btn1.Name = "Btn1";
            Btn1.Size = new Size(75, 23);
            Btn1.TabIndex = 16;
            Btn1.Text = "1";
            Btn1.UseVisualStyleBackColor = true;
            Btn1.Click += BtnNumero_Click;
            // 
            // BtnGuardaMemoria
            // 
            BtnGuardaMemoria.Location = new Point(134, 178);
            BtnGuardaMemoria.Name = "BtnGuardaMemoria";
            BtnGuardaMemoria.Size = new Size(75, 23);
            BtnGuardaMemoria.TabIndex = 15;
            BtnGuardaMemoria.Text = "MS";
            BtnGuardaMemoria.UseVisualStyleBackColor = true;
            BtnGuardaMemoria.Click += BtnGuardaMemoria_Click;
            // 
            // BtnResta
            // 
            BtnResta.Location = new Point(470, 178);
            BtnResta.Name = "BtnResta";
            BtnResta.Size = new Size(75, 23);
            BtnResta.TabIndex = 14;
            BtnResta.Text = "-";
            BtnResta.UseVisualStyleBackColor = true;
            BtnResta.Click += BtnOperando_Click;
            // 
            // BtnSuma
            // 
            BtnSuma.Location = new Point(389, 207);
            BtnSuma.Name = "BtnSuma";
            BtnSuma.Size = new Size(75, 23);
            BtnSuma.TabIndex = 23;
            BtnSuma.Text = "+";
            BtnSuma.UseVisualStyleBackColor = true;
            BtnSuma.Click += BtnOperando_Click;
            // 
            // BtnFraccion
            // 
            BtnFraccion.Location = new Point(308, 207);
            BtnFraccion.Name = "BtnFraccion";
            BtnFraccion.Size = new Size(75, 23);
            BtnFraccion.TabIndex = 22;
            BtnFraccion.Text = "1/x";
            BtnFraccion.UseVisualStyleBackColor = true;
            BtnFraccion.Click += BtnFraccion_Click;
            // 
            // Btn0
            // 
            Btn0.Location = new Point(227, 207);
            Btn0.Name = "Btn0";
            Btn0.Size = new Size(75, 23);
            Btn0.TabIndex = 21;
            Btn0.Text = "0";
            Btn0.UseVisualStyleBackColor = true;
            Btn0.Click += BtnNumero_Click;
            // 
            // BtnSumaMemoria
            // 
            BtnSumaMemoria.Location = new Point(134, 207);
            BtnSumaMemoria.Name = "BtnSumaMemoria";
            BtnSumaMemoria.Size = new Size(75, 23);
            BtnSumaMemoria.TabIndex = 20;
            BtnSumaMemoria.Text = "M+";
            BtnSumaMemoria.UseVisualStyleBackColor = true;
            BtnSumaMemoria.Click += BtnSumaMemoria_Click;
            // 
            // BtnIgual
            // 
            BtnIgual.Location = new Point(470, 207);
            BtnIgual.Name = "BtnIgual";
            BtnIgual.Size = new Size(75, 23);
            BtnIgual.TabIndex = 19;
            BtnIgual.Text = "=";
            BtnIgual.UseVisualStyleBackColor = true;
            BtnIgual.Click += BtnIgual_Click;
            // 
            // LblNombre
            // 
            LblNombre.AutoSize = true;
            LblNombre.BackColor = SystemColors.Menu;
            LblNombre.Location = new Point(150, 95);
            LblNombre.Name = "LblNombre";
            LblNombre.Size = new Size(130, 15);
            LblNombre.TabIndex = 24;
            LblNombre.Text = "Daniel Sevilla Navarrete";
            // 
            // FrmCalculadora
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(688, 332);
            Controls.Add(LblNombre);
            Controls.Add(BtnSuma);
            Controls.Add(BtnFraccion);
            Controls.Add(Btn0);
            Controls.Add(BtnSumaMemoria);
            Controls.Add(BtnIgual);
            Controls.Add(Btn3);
            Controls.Add(Btn2);
            Controls.Add(Btn1);
            Controls.Add(BtnGuardaMemoria);
            Controls.Add(BtnResta);
            Controls.Add(Btn6);
            Controls.Add(Btn5);
            Controls.Add(Btn4);
            Controls.Add(BtnRecuperaMemoria);
            Controls.Add(BtnMultiplicacion);
            Controls.Add(Btn9);
            Controls.Add(Btn8);
            Controls.Add(Btn7);
            Controls.Add(BtnBorraMemoria);
            Controls.Add(BtnDivision);
            Controls.Add(BtnCe);
            Controls.Add(BtnC);
            Controls.Add(TxtResultado);
            Name = "FrmCalculadora";
            Text = "FrmCalculadora";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox TxtResultado;
        private Button BtnC;
        private Button BtnCe;
        private Button BtnDivision;
        private Button BtnBorraMemoria;
        private Button Btn7;
        private Button Btn8;
        private Button Btn9;
        private Button Btn6;
        private Button Btn5;
        private Button Btn4;
        private Button BtnRecuperaMemoria;
        private Button BtnMultiplicacion;
        private Button Btn3;
        private Button Btn2;
        private Button Btn1;
        private Button BtnGuardaMemoria;
        private Button BtnResta;
        private Button BtnSuma;
        private Button BtnFraccion;
        private Button Btn0;
        private Button BtnSumaMemoria;
        private Button BtnIgual;
        private Label LblNombre;
    }
}