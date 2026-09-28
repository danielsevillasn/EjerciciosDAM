using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace Trivial
{
    public partial class FrmTrivial : Form
    {
        //Atributos//
        private string[] numerosPokedex = new string[] { "0001", "0094", "0133", "0197", "0248", "0249", "0282", "0384", "0443", "0445", "0448", "0658", "0681", "0700", "0722", "0778", "0849", "0887" };
        private string[] nombresPokemon = new string[] { "Bulbasaur", "Gengar", "Eevee", "Umbreon", "Tyranitar", "Lugia", "Gardevoir", "Rayquaza", "Gible", "Garchomp", "Lucario", "Greninja", "Aegislash", "Sylveon", "Rowlet", "Mimikyu", "Toxtricity", "Dragapult" };

        private Random rnd = new Random();
        private int indiceCorrecto;
        private String respuestaCorrecta;
        private int preguntasAcertadas = 0;
        private int preguntasRespondidas = 0;
        private const int NUMERO_PREGUNTAS = 10;
        private List<int> pokemonsUtilizados = new List<int>();

        //Constructor//
        public FrmTrivial()
        {
            InitializeComponent();
            ConfigurarInterfazInicial();
            IniciarPartida();
        }

        //Métodos//

        //Configura la barra de acierto 
        private void ConfigurarInterfazInicial()
        {
            ProBarAcierto.Minimum = 0;
            ProBarAcierto.Maximum = NUMERO_PREGUNTAS;
        }
        //Da inicio a la partida reseteando variables
        private void IniciarPartida()
        {
            preguntasRespondidas = 0;
            preguntasAcertadas = 0;
            ProBarAcierto.Value = 0;
            LblAcierto.Text = "0%";
            ActualizarYCentrarLabel(LblAcierto, "0%");
            pokemonsUtilizados.Clear();
            GenerarPregunta();
        }
        //Genera la pregunta eligiendo un indice que previamente se guardará para que no se repita 
        private void GenerarPregunta()
        {
            if (preguntasRespondidas >= NUMERO_PREGUNTAS)
            {
                MessageBox.Show("¡Has completado la partida!", "Fin del Juego");
                IniciarPartida();
                return;
            }
            while (true)
            {
                indiceCorrecto = rnd.Next(nombresPokemon.Length);
                if (!pokemonsUtilizados.Contains(indiceCorrecto))
                {
                    break;
                }
            }

            pokemonsUtilizados.Add(indiceCorrecto);

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

            if (MStrMúltipleOpciones.Checked)
            {
                GenerarBotonesMultiples();
            }
        }
        //Genera las respuestas aleatorias en los botones asegurandose de que este la correcta
        private void GenerarBotonesMultiples()
        {
            List<int> opcionesIndices = new List<int>();
            opcionesIndices.Add(indiceCorrecto);

            while (opcionesIndices.Count < 4)
            {
                int aleatorio = rnd.Next(nombresPokemon.Length);
                if (!opcionesIndices.Contains(aleatorio))
                {
                    opcionesIndices.Add(aleatorio);
                }
            }

            opcionesIndices = opcionesIndices.OrderBy(x => rnd.Next()).ToList();

            Button[] botones = { BtnOpcion1, BtnOpcion2, BtnOpcion3, BtnOpcion4 };
            string[] fuenteDatos;

            if (MStrPokemon.Checked)
            {
                fuenteDatos = numerosPokedex;
            }
            else
            {
                fuenteDatos = nombresPokemon;
            }
            for (int i = 0; i < botones.Length; i++)
            {
                botones[i].Text = fuenteDatos[opcionesIndices[i]];
            }

        }

        //Comprueba la respuesta del usuario teniendo en cuenta la correcta y manda un mensaje que determina si es o no correcta
        private void ComprobarRespuesta(string respuestaUsuario)
        {
            if (respuestaUsuario.Trim().ToLower() == respuestaCorrecta.ToLower())
            {
                MessageBox.Show("Acierto", "¡Correcto!");
                preguntasAcertadas++;
            }
            else
            {
                MessageBox.Show("La respuesta correcta era: " + respuestaCorrecta, "¡Incorrecto!");
            }
            preguntasRespondidas++;
            ProBarAcierto.Value = preguntasRespondidas;
            LblAcierto.Text = (preguntasAcertadas * 100) / NUMERO_PREGUNTAS + "%";
            ActualizarYCentrarLabel(LblAcierto, (preguntasAcertadas * 100) / NUMERO_PREGUNTAS + "%");
            GenerarPregunta();
        }

        //Actualiza los label de tal forma que cuando aumenten en tamaño no quede mal visualmente
        private void ActualizarYCentrarLabel(System.Windows.Forms.Label lbl, string nuevoTexto)
        {
            lbl.Text = nuevoTexto;
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
            TxtBoxRespuesta.Clear();
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
            IniciarPartida();
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
            IniciarPartida();
        }

        private void TxtBoxRespuesta_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                ComprobarRespuesta(TxtBoxRespuesta.Text);
                TxtBoxRespuesta.Clear();
            }

        }
    }
}