using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace Trivial
{
    // Autor: danielsevilla
    public partial class FrmTrivial : Form
    {
        // Datos del juego
        private string[] numerosPokedex = new string[] { "0001", "0094", "0133", "0197", "0248", "0249", "0282", "0384", "0443", "0445", "0448", "0658", "0681", "0700", "0722", "0778", "0849", "0887" };
        private string[] nombresPokemon = new string[] { "Bulbasaur", "Gengar", "Eevee", "Umbreon", "Tyranitar", "Lugia", "Gardevoir", "Rayquaza", "Gible", "Garchomp", "Lucario", "Greninja", "Aegislash", "Sylveon", "Rowlet", "Mimikyu", "Toxtricity", "Dragapult" };

        private Random rnd = new Random();
        private int indiceCorrecto;
        private int preguntasRespondidas = 0;
        private const int MAX_PREGUNTAS = 10;

        public FrmTrivial()
        {
            InitializeComponent();
            ConfigurarEventos();
            ConfigurarInterfazInicial();
            IniciarPartida();
        }

        private void ConfigurarEventos()
        {
            // Eventos del menú - Partida
            nuevaToolStripMenuItem.Click += (s, e) => IniciarPartida();
            salirToolStripMenuItem.Click += (s, e) => Application.Exit();

            // Eventos del menú - Tipo de pregunta (mutuamente excluyentes)
            MStrPokedex.Click += (s, e) => { MStrPokedex.Checked = true; MStrPokemon.Checked = false; IniciarPartida(); };
            MStrPokemon.Click += (s, e) => { MStrPokemon.Checked = true; MStrPokedex.Checked = false; IniciarPartida(); };

            // Eventos del menú - Modo de respuesta (mutuamente excluyentes)
            MStrOpciones.Click += (s, e) => { MStrOpciones.Checked = true; MStrRespuesta.Checked = false; AplicarModoVisual(); };
            MStrRespuesta.Click += (s, e) => { MStrRespuesta.Checked = true; MStrOpciones.Checked = false; AplicarModoVisual(); };

            // Eventos de los botones de respuesta
            BtnOpcion1.Click += BotonRespuesta_Click;
            BtnOpcion2.Click += BotonRespuesta_Click;
            BtnOpcion3.Click += BotonRespuesta_Click;
            BtnOpcion4.Click += BotonRespuesta_Click;

            // Evento para comprobar la respuesta escrita al pulsar Enter
            TxtBoxBusqueda.KeyDown += TxtBoxBusqueda_KeyDown;
        }

        private void ConfigurarInterfazInicial()
        {
            PbProgreso.Minimum = 0;
            PbProgreso.Maximum = MAX_PREGUNTAS;
            AplicarModoVisual();
        }

        private void AplicarModoVisual()
        {
            bool modoBotones = MStrOpciones.Checked;

            // Mostrar/Ocultar botones según el modo
            BtnOpcion1.Visible = modoBotones;
            BtnOpcion2.Visible = modoBotones;
            BtnOpcion3.Visible = modoBotones;
            BtnOpcion4.Visible = modoBotones;

            // Mostrar/Ocultar y limpiar TextBox
            TxtBoxBusqueda.Visible = !modoBotones;
            TxtBoxBusqueda.Clear();
            if (!modoBotones) TxtBoxBusqueda.Focus();
        }

        private void IniciarPartida()
        {
            preguntasRespondidas = 0;
            PbProgreso.Value = 0;
            GenerarPregunta();
        }

        private void GenerarPregunta()
        {
            if (preguntasRespondidas >= MAX_PREGUNTAS)
            {
                MessageBox.Show("¡Has completado la partida!", "Fin del Juego", MessageBoxButtons.OK, MessageBoxIcon.Information);
                IniciarPartida();
                return;
            }

            indiceCorrecto = rnd.Next(nombresPokemon.Length);
            TxtBoxBusqueda.Clear();

            // Configurar los Labels dependiendo de qué pregunta hacemos
            if (MStrPokedex.Checked)
            {
                LblNumPokedex.Text = $"Nº Pokédex: {numerosPokedex[indiceCorrecto]}";
                LblPokemon.Text = "¿Cuál es su nombre?";
            }
            else // MStrPokemon.Checked
            {
                LblPokemon.Text = $"Pokémon: {nombresPokemon[indiceCorrecto]}";
                LblNumPokedex.Text = "¿Cuál es su número?";
            }

            if (MStrOpciones.Checked)
            {
                GenerarBotonesMultiples();
            }
        }

        private void GenerarBotonesMultiples()
        {
            List<int> opcionesIndices = new List<int> { indiceCorrecto };

            // Generar 3 opciones incorrectas que no se repitan
            while (opcionesIndices.Count < 4)
            {
                int aleatorio = rnd.Next(nombresPokemon.Length);
                if (!opcionesIndices.Contains(aleatorio))
                {
                    opcionesIndices.Add(aleatorio);
                }
            }

            // Desordenar los índices
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
            string respuestaCorrecta = MStrPokedex.Checked ? nombresPokemon[indiceCorrecto] : numerosPokedex[indiceCorrecto];

            if (respuestaUsuario.Equals(respuestaCorrecta, StringComparison.OrdinalIgnoreCase))
            {
                MessageBox.Show("¡Correcto!", "Acierto", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                MessageBox.Show($"Incorrecto. La respuesta era: {respuestaCorrecta}", "Fallo", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }

            preguntasRespondidas++;
            PbProgreso.Value = preguntasRespondidas;
            GenerarPregunta();
        }

        private void BotonRespuesta_Click(object sender, EventArgs e)
        {
            Button botonPulsado = (Button)sender;
            ComprobarRespuesta(botonPulsado.Text);
        }

        private void TxtBoxBusqueda_KeyDown(object sender, KeyEventArgs e)
        {
            // Solo comprobar la respuesta cuando el usuario pulsa Enter
            if (e.KeyCode == Keys.Enter && !string.IsNullOrWhiteSpace(TxtBoxBusqueda.Text))
            {
                // Evita que suene el "ding" de Windows al pulsar Enter en un TextBox
                e.SuppressKeyPress = true;
                ComprobarRespuesta(TxtBoxBusqueda.Text.Trim());
            }
        }

        // Este evento se generó en tu diseñador, lo dejamos vacío ya que evaluamos al pulsar Enter (KeyDown)
        private void TxtBoxBusqueda_TextChanged(object sender, EventArgs e)
        {
        }
    }
}