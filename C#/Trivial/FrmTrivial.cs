using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Emit;
using System.Windows.Forms;

namespace Trivial
{
    // Autor: danielsevilla
    public partial class FrmTrivial : Form
    {
        //Atributos
        private string[] numerosPokedex = new string[] { "0001", "0094", "0133", "0197", "0248", "0249", "0282", "0384", "0443", "0445", "0448", "0658", "0681", "0700", "0722", "0778", "0849", "0887" };
        private string[] nombresPokemon = new string[] { "Bulbasaur", "Gengar", "Eevee", "Umbreon", "Tyranitar", "Lugia", "Gardevoir", "Rayquaza", "Gible", "Garchomp", "Lucario", "Greninja", "Aegislash", "Sylveon", "Rowlet", "Mimikyu", "Toxtricity", "Dragapult" };

        private int lenghtPokemon = 18;
        private Random rnd = new Random();
        private int indiceCorrecto;
        private String respuestaCorrecta;
        private int preguntasAcertadas = 0;
        private int preguntasRespondidas = 0;
        private const int MAX_PREGUNTAS = 10;

        //Constructor
        public FrmTrivial()
        {
            InitializeComponent();
            ConfigurarInterfazInicial();
            IniciarPartida();
        }

        //Métodos
        private void ConfigurarInterfazInicial()
        {
            ProBarAcierto.Minimum = 0;
            ProBarAcierto.Maximum = MAX_PREGUNTAS;
        }

        private void IniciarPartida()
        {
            preguntasRespondidas = 0;
            ProBarAcierto.Value = 0;
            LblAcierto.Text = "0%";
            ActualizarYCentrarLabel(LblAcierto, "0%");
            GenerarPregunta();
        }

        private void GenerarPregunta()
        {
            if (preguntasRespondidas >= MAX_PREGUNTAS)
            {
                MessageBox.Show("¡Has completado la partida!", "Fin del Juego", MessageBoxButtons.OK, MessageBoxIcon.Information);
                IniciarPartida();
            }
            else
            {
                indiceCorrecto = rnd.Next(lenghtPokemon);
                if (MStrPokemon.Checked)
                {
                    LblModo.Text = "Pokemon:";
                    ActualizarYCentrarLabel(LblModo, "Pokemon:");
                    LblRespuestas.Text = "Numero Pokédex:";
                    ActualizarYCentrarLabel(LblRespuestas, "Numero Pokédex:");
                    LblBusqueda.Text = nombresPokemon[indiceCorrecto];
                    ActualizarYCentrarLabel(LblBusqueda, nombresPokemon[indiceCorrecto]);
                    respuestaCorrecta = numerosPokedex[indiceCorrecto];
                }
                else
                {
                    LblModo.Text = "Numero Pokédex:";
                    ActualizarYCentrarLabel(LblModo, "Numero Pokédex:");
                    LblRespuestas.Text = "Pokemon:";
                    ActualizarYCentrarLabel(LblRespuestas, "Pokemon:");
                    LblBusqueda.Text = numerosPokedex[indiceCorrecto];
                    ActualizarYCentrarLabel(LblBusqueda, numerosPokedex[indiceCorrecto]);
                    respuestaCorrecta = nombresPokemon[indiceCorrecto];
                }


                GenerarBotonesMultiples();
            }
        }

        private void GenerarBotonesMultiples()
        {
            List<int> opcionesIndices = new List<int> { indiceCorrecto };

            while (opcionesIndices.Count < 4)
            {
                int aleatorio = rnd.Next(lenghtPokemon);
                if (!opcionesIndices.Contains(aleatorio))
                {
                    opcionesIndices.Add(aleatorio);
                }
            }

            opcionesIndices = opcionesIndices.OrderBy(x => rnd.Next()).ToList();

            Button[] botones = { BtnOpcion1, BtnOpcion2, BtnOpcion3, BtnOpcion4 };
            string[] arrayRespuestas = MStrPokedex.Checked ? nombresPokemon : numerosPokedex;

            for (int i = 0; i < 4; i++)
            {
                botones[i].Text = arrayRespuestas[opcionesIndices[i]];
            }
        }

        private void ComprobarRespuesta(string respuestaUsuario)
        {
            if (respuestaUsuario.Trim().ToLower() == respuestaCorrecta.ToLower())
            {
                MessageBox.Show("¡Correcto!", "Acierto", MessageBoxButtons.OK, MessageBoxIcon.Information);
                preguntasAcertadas++;
            }
            else
            {
                MessageBox.Show($"Incorrecto. La respuesta era: {respuestaCorrecta}", "Fallo", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            preguntasRespondidas++;
            ProBarAcierto.Value = preguntasRespondidas;
            LblAcierto.Text = (preguntasAcertadas * 100) / MAX_PREGUNTAS+"%";
            ActualizarYCentrarLabel(LblAcierto, (preguntasAcertadas * 100) / MAX_PREGUNTAS + "%");
            GenerarPregunta();
        }

        private void ActualizarYCentrarLabel(System.Windows.Forms.Label lbl, string nuevoTexto)
        {
            lbl.Text = nuevoTexto;

            // Si quieres centrarlo respecto a su contenedor o Formulario:
            lbl.Left = (this.ClientSize.Width - lbl.Width) / 2;
        }



        //Eventos de los elementos del formulario
        private void BotonRespuesta_Click(object sender, EventArgs e)
        {
            Button botonPulsado = (Button)sender;
            ComprobarRespuesta(botonPulsado.Text);
        }        
        private void BtnConfirmar_Click(object sender, EventArgs e)
        {
            ComprobarRespuesta(TxtBoxRespuesta.Text);
        }

        private void MstrSalir_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void MstrNueva_Click(object sender, EventArgs e)
        {
            IniciarPartida();
        }

        private void MStrPokedex_Click(object sender, EventArgs e)
        {
            MStrPokedex.Checked = true;
            MStrPokemon.Checked = false;
            IniciarPartida();
        }

        private void MStrPokemon_Click(object sender, EventArgs e)
        {
            MStrPokemon.Checked = true;
            MStrPokedex.Checked = false;
            IniciarPartida();
        }

        private void MStrMultiplespciones_Click(object sender, EventArgs e)
        {
            MStrMúltipleOpciones.Checked = true;
            MStrRespuesta.Checked = false;
            BtnOpcion1.Visible = true;
            BtnOpcion2.Visible = true;
            BtnOpcion3.Visible = true;
            BtnOpcion4.Visible = true;
            BtnConfirmar.Visible = false;
            TxtBoxRespuesta.Visible = false;
        }

        private void MStrRespuesta_Click(object sender, EventArgs e)
        {
            MStrRespuesta.Checked = true;
            MStrMúltipleOpciones.Checked = false;
            BtnOpcion1.Visible = false;
            BtnOpcion2.Visible = false;
            BtnOpcion3.Visible = false;
            BtnOpcion4.Visible = false;
            BtnConfirmar.Visible = true;
            TxtBoxRespuesta.Visible = true;
        }


    }
}