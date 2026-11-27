using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Arkanoid
{
    public partial class Arkanoid : Form
    {
        private int direccion = 1;
        private int desplazamientoPelota = 5;
        private int desplazamientoBarra = 5;
        public Arkanoid()
        {
            InitializeComponent();
        }

        private void Arkanoid_Load(object sender, EventArgs e)
        {

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            switch (direccion)
            {
                case 1:
                    if (pcbPelota.Top <= 0)
                    {
                        direccion = 2;
                    }
                    else if ((pcbPelota.Left + pcbPelota.Width) >= ClientSize.Width)
                    {
                        direccion = 4;
                    }
                    else
                    {
                        pcbPelota.Top = pcbPelota.Top - desplazamientoPelota;
                        pcbPelota.Left = pcbPelota.Left + desplazamientoPelota;
                    }

                    break;
                case 2:
                    if (pcbPelota.Bottom >= ClientSize.Height)
                    {
                        direccion = 1;
                    }
                    else if ((pcbPelota.Left + pcbPelota.Width) >= ClientSize.Width)
                    {
                        direccion = 3;
                    }
                    else
                    {
                        pcbPelota.Top = pcbPelota.Top + desplazamientoPelota;
                        pcbPelota.Left = pcbPelota.Left + desplazamientoPelota;
                    }
                    break;
                case 3:
                    if ((pcbPelota.Top + pcbPelota.Height) >= ClientSize.Height)
                    {
                        direccion = 4;
                    }
                    else if (pcbPelota.Left <= 0)
                    {
                        direccion = 2;
                    }
                    else
                    {
                        pcbPelota.Top = pcbPelota.Top + desplazamientoPelota;
                        pcbPelota.Left = pcbPelota.Left - desplazamientoPelota;
                    }
                    break;
                case 4:
                    if (pcbPelota.Top <= 0)
                    {
                        direccion = 3;
                    }
                    else if (pcbPelota.Left <= 0)
                    {
                        direccion = 1;
                    }
                    else
                    {
                        pcbPelota.Top = pcbPelota.Top - desplazamientoPelota; pcbPelota.Left = pcbPelota.Left - desplazamientoPelota;
                    }
                    break;
                default:
                    MessageBox.Show("No hay una buena direccion");
                    break;

            }
        }

        private void Arkanoid_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.A && pcbBarra.Left > 0)
            {
                pcbBarra.Left = pcbBarra.Left - desplazamientoBarra;
            }

            if (e.KeyCode == Keys.D && (pcbBarra.Left + pcbBarra.Width) < ClientSize.Width)
            {
                pcbBarra.Left = pcbBarra.Left + desplazamientoBarra;
            }
        }
    }
}
