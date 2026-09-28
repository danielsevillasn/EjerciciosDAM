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

        //Variables globales que incializo en el constructor
        double num1;
        double num2;
        double numMemoria;
        string auxMemory;
        double total;
        string state;

        public FrmCalculadora()
        {
            InitializeComponent();
            this.num1 = 0; 
            this.num2 = 0;
            this.total = 0;
            this.numMemoria = 0;
            this.auxMemory = "";
            this.state = "";
        }

        private void manejadorBotones(object sender, EventArgs e)
        {
            Button botonNumerico = (Button)sender;
            this.TxtCaja.Text = this.TxtCaja.Text + botonNumerico.Text;
             
        }
        
        //CE
        private void clearError_Click(object sender, EventArgs e)
        {
            this.TxtCaja.Clear();
        }

        //C
        private void clear_Click(object sender, EventArgs e)
        {
            this.num1 = 0;
            this.num2 = 0;
            this.total = 0;
            this.state = "";
            this.TxtCaja.Clear();
        }

        //División
        private void division_Click(object sender, EventArgs e)
        {
            num1 = Convert.ToDouble(this.TxtCaja.Text);
            this.TxtCaja.Clear();
            state = "/";
        }

        //Multiplicación
        private void multiplica_Click(object sender, EventArgs e)
        {
            num1 = Convert.ToDouble(this.TxtCaja.Text);
            this.TxtCaja.Clear();
            state = "*";
        }

        //Resta
        private void resta_Click(object sender, EventArgs e)
        {
            num1 = Convert.ToDouble(this.TxtCaja.Text);
            this.TxtCaja.Clear();
            state = "-";
        }

        //Suma
        private void suma_Click(object sender, EventArgs e)
        {
            num1 = Convert.ToDouble(this.TxtCaja.Text);
            this.TxtCaja.Clear();
            state = "+";
        }

        // 1/X
        private void fraccionX_Click(object sender, EventArgs e)
        {
            num1 = Convert.ToDouble(this.TxtCaja.Text);
            this.TxtCaja.Clear();
            state = "1/x";
        }

        //MS --> Almacena el numero mostrado en memoria.
        private void memoryStorage_Click(object sender, EventArgs e)
        {
            
            numMemoria = Convert.ToDouble(this.TxtCaja.Text);
            MessageBox.Show("Número almacenado en memoria: " + numMemoria);
            //Limpio el textBox
            this.TxtCaja.Clear();
        }

        //MR --> Recupera el numero mostrado en memoria.
        private void memoryRecall_Click(object sender, EventArgs e)
        {
            auxMemory = Convert.ToString(this.numMemoria);
            this.TxtCaja.Text = this.auxMemory;
        }

        //MC --> Elimina cualquier numero almacenado en memoria.
        private void memoryClear_Click(object sender, EventArgs e)
        {
            numMemoria = 0;
        }

        //M+ --> Suma el número mostrado a otro número que se encuentre en memoria, pero no muestra la suma de estos números.
        private void sumNumMemory_Click(object sender, EventArgs e)
        {
            num1 = Convert.ToDouble(this.TxtCaja.Text);
            numMemoria = numMemoria + num1;
            //numMemoria += num1;
        }
        //Operaciones
        private void igual_Click(object sender, EventArgs e)
        {
                
                if (state.Equals("/"))
                {
                    num2 = Convert.ToDouble(this.TxtCaja.Text);
                    total = num1 / num2;
                }
                else if (state.Equals("*"))
                {
                    num2 = Convert.ToDouble(this.TxtCaja.Text);
                    total = num1 * num2;
                }
                else if (state.Equals("-"))
                {
                    num2 = Convert.ToDouble(this.TxtCaja.Text);
                    total = num1 - num2;
                }
                else if (state.Equals("+"))
                {
                    num2 = Convert.ToDouble(this.TxtCaja.Text);
                    total = num1 + num2;
                }
                else if(state.Equals("1/x"))
                {
                    num2 = 1;
                    total = num2 / num1;
                }
            
                
            this.TxtCaja.Text = Convert.ToString(this.total);
        }

    }
}
