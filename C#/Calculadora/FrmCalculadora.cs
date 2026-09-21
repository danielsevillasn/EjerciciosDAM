using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculadora
{
    public partial class FrmCalculadora : Form
    {
        private double Operador1;
        private double Operador2;
        private bool SoloUnOperando = true;
        private string Operando = "";
        private double Memoria = 0;
        public FrmCalculadora()
        {
            InitializeComponent();
        }

        private void BtnNumero_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            TxtResultado.Text += btn.Text;
        }

        private void BtnCe_Click(object sender, EventArgs e)
        {
            TxtResultado.Text = "";
        }

        private void BtnC_Click(object sender, EventArgs e)
        {
            TxtResultado.Text = "";
            Operador1 = 0;
            Operador2 = 0;
            Operando = "";
            SoloUnOperando = true;
        }

        private void BtnOperando_Click(object sender, EventArgs e)
        {
            if (SoloUnOperando)
            {
                Button btn = (Button)sender;
                Operador1 = System.Convert.ToDouble(TxtResultado.Text);
                Operando = btn.Text;
                SoloUnOperando = false;
                TxtResultado.Text = "";
            }
        }

        private void BtnIgual_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            Operador2 = System.Convert.ToDouble(TxtResultado.Text);

            TxtResultado.Text = "";
            switch (Operando)
            {
                case "/" :
                    TxtResultado.Text = "" + Operador1 / Operador2;
                    break;
                case "*":
                    TxtResultado.Text = "" + Operador1 * Operador2;
                    break;
                case "-":
                    TxtResultado.Text = "" + (Operador1 - Operador2);
                    break;
                case "+":
                    TxtResultado.Text = "" + (Operador1 + Operador2);
                    break;

            }
            SoloUnOperando = true;
        }

        private void BtnFraccion_Click(object sender, EventArgs e)
        {
            if (TxtResultado.Text != "")
            {
                double valor = Convert.ToDouble(TxtResultado.Text);
                if (valor != 0)
                    TxtResultado.Text = Convert.ToString(1 / valor);
            }
        }

        private void BtnGuardaMemoria_Click(object sender, EventArgs e)
        {
            if (TxtResultado.Text != "")
                Memoria = Convert.ToDouble(TxtResultado.Text);
        }

        private void BtnRecuperaMemoria_Click(object sender, EventArgs e)
        {
            TxtResultado.Text = Convert.ToString(Memoria);
        }

        private void BtnBorraMemoria_Click(object sender, EventArgs e)
        {
            Memoria = 0;
        }

        private void BtnSumaMemoria_Click(object sender, EventArgs e)
        {
            if (TxtResultado.Text != "")
                Memoria += Convert.ToDouble(TxtResultado.Text);
        }
    }
}
