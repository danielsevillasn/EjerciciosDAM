using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Trivial
{
    public partial class FrmTrivial : Form
    {
        private int PreguntasRealizadas;
        private int Aciertos;
        private int Pregunta;

        private bool HaRespondido;

        private string[] Capitales;
        private string[] Paises;

        private TextBox[] Respuestas;

        private void InicializarCapitalesPaises()
        {
            Capitales = new string[] { "Berlín", "Viena", "Bruselas", "Sofía", "Nicosia", "Zagreb", "Copenhague",
                "Bratislava", "Liubliana" , "Madrid", "Tallin", "Helsinki", "París", "Atenas", "Budapest", "Dublín",
                "Roma", "Riga", "Vilna", "Luxemburgo", "La Valeta", "Ámsterdam", "Varsovia", "Lisboa", "Londres",
                "Praga", "Bucarest", "Estocolmo" };
            Paises = new string[] { "Alemania", "Austria", "Bélgica", "Bulgaria", "Chipre", "Croacia", "Dinamarca",
                "Eslovaquia", "Eslovenia", "España", "Estonia", "Finlandia", "Francia", "Grecia", "Hungría", "Irlanda",
                "Italia", "Letonia", "Lituania", "Luxemburgo", "Malta", "Países Bajos", "Polonia", "Portugal",
                "Reino Unido", "Chéquia", "Rumanía", "Suecia" };
        }
        private int NuevoAleatorio()
        {
            Random random = new Random();
            int rAleatorio = random.Next(0, Capitales.Length);

            return rAleatorio;
        }

        public void NuevaPartida()
        {
            PreguntasRealizadas = 1;
            Aciertos = 0;
            Pregunta = NuevoAleatorio();
            TxtBoxResultado.Clear();
            HaRespondido = false;
            TxtBoxPorcentaje.Text = Convert.ToString((Aciertos / PreguntasRealizadas) * 100)
                + " %";
        }

        private void GenerarPaises()
        {
            Random random = new Random();
            int[] posRespuestas = new int[4];
            for (int contador = 0; contador < 4; contador++)
            {
                posRespuestas[contador] = -1;
            }

            posRespuestas[random.Next(0, 4)] = Pregunta;

            for (int contador = 0; contador < 4; contador++)
            {
                if (posRespuestas[contador] == -1)
                {
                    int nuevoPais = NuevoAleatorio();

                    if (posRespuestas[0] == nuevoPais || posRespuestas[1] == nuevoPais
                        || posRespuestas[2] == nuevoPais || posRespuestas[3] == nuevoPais)
                    {
                        contador--;
                        continue;
                    } else
                    {
                        posRespuestas[contador] = nuevoPais;
                    }
                }
            }

            for (int contador = 0; contador < 4; contador++)
            {
                Respuestas[contador].Text = Paises[posRespuestas[contador]];
            }
        }

        private void GenerarCapitales()
        {
            Random random = new Random();
            int[] posRespuestas = new int[4];
            for (int contador = 0; contador < 4; contador++)
            {
                posRespuestas[contador] = -1;
            }

            posRespuestas[random.Next(0, 4)] = Pregunta;

            for (int contador = 0; contador < 4; contador++)
            {
                if (posRespuestas[contador] == -1)
                {
                    int nuevaCapital = NuevoAleatorio();

                    if (posRespuestas[0] == nuevaCapital || posRespuestas[1] == nuevaCapital
                        || posRespuestas[2] == nuevaCapital || posRespuestas[3] == nuevaCapital)
                    {
                        contador--;
                        continue;
                    }
                    else
                    {
                        posRespuestas[contador] = nuevaCapital;
                    }
                }
            }

            for (int contador = 0; contador < 4; contador++)
            {
                Respuestas[contador].Text = Capitales[posRespuestas[contador]];
            }
        }

        public FrmTrivial()
        {
            InitializeComponent();
            Respuestas = new TextBox[] { TxtBoxRespuesta0, TxtBoxRespuesta1, TxtBoxRespuesta2, TxtBoxRespuesta3 };
            InicializarCapitalesPaises();
            NuevaPartida();
            TxtBoxPregunta.Text = Paises[Pregunta];
            GenerarCapitales();
        }

        public void Limpiar()
        {
            for (int contador = 0; contador < Respuestas.Length; contador++)
            {
                Respuestas[contador].Clear();
            }
        }

        private void MnuOpciones_Click(object sender, EventArgs e)
        {
            switch (((ToolStripMenuItem)sender).Name)
            {
                case "MnuOpcionesCapitales":
                    MnuOpcionesPaises.Checked = false;
                    LblPregunta.Text = "País:";
                    LblRespuesta.Text = "Capital:";
                    MnuOpcionesCapitales.Checked = true;

                    NuevaPartida();
                    Limpiar();

                    TxtBoxPregunta.Text = Paises[Pregunta];

                    if (MnuOpcionesMultiples.Checked)
                    {
                        GenerarCapitales();
                    }
                    break;
                case "MnuOpcionesPaises":
                    MnuOpcionesCapitales.Checked = false;
                    LblPregunta.Text = "Capital:";
                    LblRespuesta.Text = "País:";
                    MnuOpcionesPaises.Checked = true;

                    NuevaPartida();
                    Limpiar();

                    TxtBoxPregunta.Text = Capitales[Pregunta];
                    
                    if (MnuOpcionesMultiples.Checked)
                    {
                        GenerarPaises();
                    }
                    break;
                case "MnuOpcionesMultiples":
                    MnuOpcionesEscribir.Checked = false;
                    TxtBoxRespuesta0.ReadOnly = true;
                    TxtBoxRespuesta1.Visible = true;
                    TxtBoxRespuesta2.Visible = true;
                    TxtBoxRespuesta3.Visible = true;
                    MnuOpcionesMultiples.Checked = true;

                    NuevaPartida();
                    Limpiar();

                    if (MnuOpcionesCapitales.Checked)
                    {
                        TxtBoxPregunta.Text = Paises[Pregunta];
                        GenerarCapitales();
                    } else
                    {
                        TxtBoxPregunta.Text = Capitales[Pregunta];
                        GenerarPaises();
                    }
                    break;
                case "MnuOpcionesEscribir":
                    MnuOpcionesMultiples.Checked = false;
                    TxtBoxRespuesta0.ReadOnly = false;
                    TxtBoxRespuesta1.Visible = false;
                    TxtBoxRespuesta2.Visible = false;
                    TxtBoxRespuesta3.Visible = false;
                    MnuOpcionesEscribir.Checked = true;

                    NuevaPartida();
                    Limpiar();

                    if (MnuOpcionesCapitales.Checked)
                    {
                        TxtBoxPregunta.Text = Paises[Pregunta];
                    } else
                    {
                        TxtBoxPregunta.Text = Capitales[Pregunta];
                    }
                    break;
                default:
                    break;
            }
        }

        private void MnuPartidaNueva_Click(object sender, EventArgs e)
        {
            NuevaPartida();
            Limpiar();
            TxtBoxResultado.Clear();

            if (MnuOpcionesCapitales.Checked)
            {
                TxtBoxPregunta.Text = Paises[Pregunta];

                if (MnuOpcionesMultiples.Checked)
                {
                    GenerarCapitales();
                }
            } else
            {
                TxtBoxPregunta.Text = Capitales[Pregunta];

                if (MnuOpcionesMultiples.Checked)
                {
                    GenerarPaises();
                }
            }
        }

        private void BtnSalir_Click(object sender, EventArgs e)
        {
            System.Environment.Exit(0);
        }

        private bool EsMultipleCorrecto(string pNombre)
        {
            if (MnuOpcionesCapitales.Checked)
            {
                return pNombre.Equals(Capitales[Pregunta]);
            } else
            {
                return pNombre.Equals(Paises[Pregunta]);
            }
        }

        private void BtnRespuestas_Click(object sender, EventArgs e)
        {
            if (!HaRespondido)
            {
                switch (((TextBox)sender).Name)
                {
                    case "TxtBoxRespuesta0":
                        if (((TextBox)sender).ReadOnly)
                        {
                            if (EsMultipleCorrecto(((TextBox)sender).Text))
                            {
                                Aciertos++;
                                TxtBoxResultado.Text = "¡Correcto!";
                            } else
                            {
                                TxtBoxResultado.Text = "Incorrecto.";
                            }

                            TxtBoxPorcentaje.Text = Convert.ToString(((double)Aciertos / (double)PreguntasRealizadas) * 100)
                                + " %";

                            HaRespondido = true;
                        }
                        break;
                    case "TxtBoxRespuesta1":
                    case "TxtBoxRespuesta2":
                    case "TxtBoxRespuesta3":
                        if (EsMultipleCorrecto(((TextBox)sender).Text))
                        {
                            Aciertos++;
                            TxtBoxResultado.Text = "¡Correcto!";
                        } else
                        {
                            TxtBoxResultado.Text = "Incorrecto.";
                        }
                        TxtBoxPorcentaje.Text = Convert.ToString(((double)Aciertos / (double)PreguntasRealizadas) * 100)
                            + " %";

                        HaRespondido = true;
                        break;
                    default:
                        break;
                }
            }
        }

        private bool EsEscribirCorrecto(String pNombre)
        {
            bool respuestaCorrecta = false;

            if (MnuOpcionesCapitales.Checked)
            {
                for (int contador = 0; (contador < Capitales.Length) && !respuestaCorrecta; contador++)
                {
                    if (pNombre.ToUpper().Equals(Capitales[Pregunta].ToUpper()))
                    {
                        respuestaCorrecta = true;
                    }
                }
            } else
            {
                for (int contador = 0; (contador < Paises.Length) && !respuestaCorrecta; contador++)
                {
                    if (pNombre.ToUpper().Equals(Paises[Pregunta].ToUpper()))
                    {
                        respuestaCorrecta = true;
                    }
                }
            }

            return respuestaCorrecta;
        }

        private void BtnRespuesta0_IntroPressed(object sender, KeyPressEventArgs e)
        {
            if (!((TextBox)sender).ReadOnly)
            {
                if (e.KeyChar == (char)Keys.Enter)
                {
                    if (!HaRespondido)
                    {
                        if (EsEscribirCorrecto(((TextBox)sender).Text))
                        {
                            Aciertos++;
                            TxtBoxResultado.Text = "¡Correcto!";
                        } else
                        {
                            TxtBoxResultado.Text = "Incorrecto.";
                        }

                        HaRespondido = true;
                        TxtBoxPorcentaje.Text = Convert.ToString(((double)Aciertos / (double)PreguntasRealizadas) * 100)
                            + " %";
                    }
                }

            }
        }

        private void BtnSiguiente_Click(object sender, EventArgs e)
        {
            PreguntasRealizadas++;
            Pregunta = NuevoAleatorio();
            HaRespondido = false;
            TxtBoxResultado.Clear();
            TxtBoxRespuesta0.Clear();

            if (MnuOpcionesCapitales.Checked)
            {
                TxtBoxPregunta.Text = Paises[Pregunta];

                if (MnuOpcionesMultiples.Checked)
                {
                    GenerarCapitales();
                }
            } else
            {
                TxtBoxPregunta.Text = Capitales[Pregunta];

                if (MnuOpcionesMultiples.Checked)
                {
                    GenerarPaises();
                }
            }
        }
    }
}