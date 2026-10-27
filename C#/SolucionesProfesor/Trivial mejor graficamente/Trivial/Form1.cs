using System;
using System.Drawing;
using System.Windows.Forms;
using System.Runtime.InteropServices;
using System.Drawing.Text;
using System.Collections.Generic;
using System.Linq;

namespace Trivial
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        //Fuente de texto personalizada desde recursos del proyecto

        [DllImport("gdi32.dll")]
        private static extern IntPtr AddFontMemResourceEx(IntPtr pbfont, uint cbfont
            , IntPtr pdv, [In] ref uint pcFonts);

        FontFamily ff;
        Font font;

        private void loadFont()
        {
            byte[] fontArray = Trivial.Properties.Resources.Funhouse;
            int dataLenght = Trivial.Properties.Resources.Funhouse.Length;

            IntPtr ptrData = Marshal.AllocCoTaskMem(dataLenght);

            Marshal.Copy(fontArray, 0, ptrData, dataLenght);

            uint cFonts = 0;

            AddFontMemResourceEx(ptrData, (uint)fontArray.Length, IntPtr.Zero, ref cFonts);

            PrivateFontCollection pfc = new PrivateFontCollection();
            pfc.AddMemoryFont(ptrData, dataLenght);

            //Memory leaks

            Marshal.FreeCoTaskMem(ptrData);

            ff = pfc.Families[0];
            font = new Font(ff, 15f, FontStyle.Regular);
        }

        private void allocFont(Font f, Control c, float size)
        {
            FontStyle fontStyle = FontStyle.Regular;

            c.Font = new Font(ff, size, fontStyle);
        }

        //Arrastrar ventana con FormBorderStyle = None

        public const int WM_NCLBUTTONDOWN = 0xA1;
        public const int HT_CAPTION = 0x2;

        [DllImportAttribute("user32.dll")]
        public static extern int SendMessage(IntPtr hWnd, int Msg, int wParam, int lParam);
        [DllImportAttribute("user32.dll")]
        public static extern bool ReleaseCapture();

        private void Arrastrar(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Left)
            {
                ReleaseCapture();
                SendMessage(Handle, WM_NCLBUTTONDOWN, HT_CAPTION, 0);
            }
        }
        //Eventos de Hover para PictureBox
        private void HoverMenu(object sender, EventArgs e)
        {
            if (sender.Equals(pbSiguiente))
            {
                pbSiguiente.BackColor = Color.DarkOrange;
            }
            else if (sender.Equals(pbMenu))
            {
                pbMenu.BackColor = Color.DarkOrange;
            }
        }
        private void HoverMenuLeave(object sender, EventArgs e)
        {
            if (sender.Equals(pbSiguiente))
            {
                pbSiguiente.BackColor = Color.Transparent;
            }
            else if (sender.Equals(pbMenu))
            {
                pbMenu.BackColor = Color.Transparent;
            }
        }


        //Boton Salir del programa
        private void BtnSalir_Click(object sender, EventArgs e)
        {
            DialogResult drSalir = MessageBox.Show("¿Desea Salir?", "Salir", MessageBoxButtons.YesNo, MessageBoxIcon.Question);

            if (drSalir == DialogResult.Yes)
            {
                if (System.Windows.Forms.Application.MessageLoop)
                {
                    System.Windows.Forms.Application.Exit();// WinForms app
                }
                else
                {
                    System.Environment.Exit(1); // Console app
                }
            }
        }

        List<Button> listaBotones = new List<Button>();

        private void Form1_Load(object sender, EventArgs e)
        {
            loadFont();
            allocFont(font, this.lbTextoPrincipal, 25);
            allocFont(font, this.lbPaisJuego, 19);
            allocFont(font, this.btnCapital1, 12);
            allocFont(font, this.btnCapital2, 12);
            allocFont(font, this.btnCapital3, 12);
            allocFont(font, this.btnCapital4, 12);
            allocFont(font, this.tbEscribirRespuesta, 13);
            allocFont(font, this.tbRespuestaCorrecta, 13);
            cargarPaises();
        }

        //Mostrar ContextMenuStrip

        private void pbOpciones(object sender, EventArgs e)
        {
            cmsMenu.Show(pbMenu, new Point(0, pbMenu.Height));
        }

        //Panel Menu Principal
        private void menuToolStripMenuItem_Click(object sender, EventArgs e)
        {
            pnPartida.Visible = false;
        }

        //Panel Nueva partida
        private void btnNuevaPartida_Click(object sender, EventArgs e)
        {
            lbAciertos.ResetText();
            numAciertos = 0;
            numJugadas = 0;
            pnPartida.Visible = true;

            if (respuestaMultiple == true)
            {
                nuevaRonda();
            }
            else
            {
                nuevaRondaEscrita();
            }
            esperaRespuesta();
        }

        //Variables para la partida (Uso de SortedDictionary, equivale a TreeMap de Java)

        SortedDictionary<string, string> paisesCapitales = new SortedDictionary<string, string>();

        String[] arrayPaises;
        String[] arrayCapitales;      

        private void cargarPaises()
        {
            //Añadimos los Paises y sus capitales (35 Paises / 35 Capitales) 

            paisesCapitales.Add("Afganistan", "Kabul");
            paisesCapitales.Add("Austria", "Viena");
            paisesCapitales.Add("Argelia", "Argel");
            paisesCapitales.Add("Angola", "Luanda");
            paisesCapitales.Add("Alemania", "Berlin");

            paisesCapitales.Add("China", "Pekin");
            paisesCapitales.Add("Chipre", "Nicosia");
            paisesCapitales.Add("Croacia", "Zagreb");
            paisesCapitales.Add("Cuba", "La Habana");
            paisesCapitales.Add("Chad", "Yemena");

            paisesCapitales.Add("Letonia", "Riga");
            paisesCapitales.Add("Madagascar", "Antananarivo");
            paisesCapitales.Add("Marruecos", "Rabat");
            paisesCapitales.Add("Nauru", "Yaren");
            paisesCapitales.Add("Polonia", "Varsovia");

            paisesCapitales.Add("Portugal", "Lisboa");
            paisesCapitales.Add("Rusia", "Moscu");
            paisesCapitales.Add("Samoa", "Apia");
            paisesCapitales.Add("Senegal", "Dakar");
            paisesCapitales.Add("Serbia", "Belgrado");

            paisesCapitales.Add("Siria", "Damasco");
            paisesCapitales.Add("Espana", "Madrid");
            paisesCapitales.Add("Fiyi", "Suva");
            paisesCapitales.Add("Georgia", "Tiflis");
            paisesCapitales.Add("Grecia", "Atenas");

            paisesCapitales.Add("Filipinas", "Manila");
            paisesCapitales.Add("Eslovenia", "Liubliana");
            paisesCapitales.Add("Liechtenstein", "Vaduz");
            paisesCapitales.Add("Ucrania", "Kiev");
            paisesCapitales.Add("Yibuti", "Yibuti");

            paisesCapitales.Add("Zambia", "Lusaka");
            paisesCapitales.Add("Zimbabwe", "Harare");
            paisesCapitales.Add("Panama", "Panama");
            paisesCapitales.Add("Noruega", "Oslo");
            paisesCapitales.Add("Nepal", "Katmandu");

            arrayPaises = paisesCapitales.Keys.ToArray();
            arrayCapitales = paisesCapitales.Values.ToArray();
        }

        private Random rd = new Random();
        List<string> capitalesRep = new List<string>();
        List<string> paisesRep = new List<string>();

        double porcentajeAciertos;
        int numAciertos;
        int numJugadas;

        String opcionCorrecta;

        private void nuevaRonda()
        {
            limpiar();

            listaBotones.Add(btnCapital1);
            listaBotones.Add(btnCapital2);
            listaBotones.Add(btnCapital3);
            listaBotones.Add(btnCapital4);

            int numAleatorioPais = rd.Next(0, 35);//Num aleatorio 0-34
            int numAleatorioPosicion;

            if (juegoPaisCapital == true) { //Modo de juego Pais y Capitales
            capitalesRep.Clear();

            lbPaisJuego.Text = arrayPaises[numAleatorioPais];
            capitalesRep.Add(paisesCapitales[lbPaisJuego.Text]);

            for (int i = 0, x2 = 4; i < 3; i++, x2--)
            {
                int numAleatorioCapital = rd.Next(0,35); //Num aleatorio 0-34
                numAleatorioPosicion = rd.Next(0, x2); //Num Aleatorio 0 - x2 (Botones Disponibles)

                if (capitalesRep.Contains(arrayCapitales[numAleatorioCapital])){ //Si la capital se repite, añadimos una vuelta al bucle
                        i--;
                        x2++;
                }
                else
                {
                    listaBotones.ElementAt(numAleatorioPosicion).Text = arrayCapitales[numAleatorioCapital];
                    listaBotones.RemoveAt(numAleatorioPosicion);
                    capitalesRep.Add(arrayCapitales[numAleatorioCapital]);
                }
            }
            listaBotones.ElementAt(0).Text = paisesCapitales[lbPaisJuego.Text];
            opcionCorrecta = listaBotones.ElementAt(0).Name;
            listaBotones.RemoveAt(0);
            }
            else //Modo de juego Capital y Paises
            {
                paisesRep.Clear();

                lbPaisJuego.Text = arrayCapitales[numAleatorioPais];

               // paisesRep.Add(paisesCapitales[lbPaisJuego.Text]);
                paisesRep.Add(paisesCapitales.Keys.Single(s => paisesCapitales[s] == lbPaisJuego.Text)); //Devuelve Key segun Valor

                for (int i = 0, x2 = 4; i < 3; i++, x2--)
                {
                    int numAleatorioCapital = rd.Next(0, 35); //Num aleatorio 0-34
                    numAleatorioPosicion = rd.Next(0, x2); //Num Aleatorio 0 - x2 (Botones Disponibles)

                    if (paisesRep.Contains(arrayPaises[numAleatorioCapital]))
                    { //Si la capital se repite, añadimos una vuelta al bucle
                        i--;
                        x2++;
                    }
                    else
                    {
                        listaBotones.ElementAt(numAleatorioPosicion).Text = arrayPaises[numAleatorioCapital];
                        listaBotones.RemoveAt(numAleatorioPosicion);
                        paisesRep.Add(arrayPaises[numAleatorioCapital]);
                    }
                }

               // listaBotones.ElementAt(0).Text = paisesCapitales[lbPaisJuego.Text];
                listaBotones.ElementAt(0).Text = paisesCapitales.Keys.Single(s => paisesCapitales[s] == lbPaisJuego.Text); //Devuelve Key segun Valor
                opcionCorrecta = listaBotones.ElementAt(0).Name;
                listaBotones.RemoveAt(0);
            }
            esperaRespuesta();
        }

        private void nuevaRondaEscrita()
        {
            limpiar();

            int numAleatorio = rd.Next(0, 35);

            if (juegoPaisCapital == true) { 
                lbPaisJuego.Text = arrayPaises[numAleatorio];

                opcionCorrecta = paisesCapitales[lbPaisJuego.Text];
            }
            else {
                lbPaisJuego.Text = arrayCapitales[numAleatorio];

                opcionCorrecta = paisesCapitales.Keys.Single(s => paisesCapitales[s] == lbPaisJuego.Text);
            }
            esperaRespuesta();
        }

        private void esperaRespuesta()
        {
            pbSiguiente.Enabled = false;
        }

        private void limpiar()
        {
            if (respuestaMultiple == true)
            {
                btnCapital1.Enabled = true;
                btnCapital2.Enabled = true;
                btnCapital3.Enabled = true;
                btnCapital4.Enabled = true;


                btnCapital1.ResetText();
                btnCapital2.ResetText();
                btnCapital3.ResetText();
                btnCapital4.ResetText();

                btnCapital1.BackColor = Color.FloralWhite;
                btnCapital2.BackColor = Color.FloralWhite;
                btnCapital3.BackColor = Color.FloralWhite;
                btnCapital4.BackColor = Color.FloralWhite;
            }
            else
            {
                tbEscribirRespuesta.Clear(); 
                tbRespuestaCorrecta.Clear();

                tbEscribirRespuesta.ReadOnly = false;

                tbEscribirRespuesta.BackColor = Color.FloralWhite;
                tbRespuestaCorrecta.BackColor = Color.FloralWhite;
            }
            lbPaisJuego.ResetText();
        }

        private void pbSiguiente_Click(object sender, EventArgs e)
        {
            if(respuestaMultiple == true)
            {
                nuevaRonda();
            }
            else
            {
                nuevaRondaEscrita();
            }
        }

        private void eleccionOpciones(object sender, EventArgs e)
        {
            Button btnPulsado = (Button) sender;

            numJugadas++;

            btnCapital1.Enabled = false;
            btnCapital2.Enabled = false;
            btnCapital3.Enabled = false;
            btnCapital4.Enabled = false;

            if (btnPulsado.Name.Equals(opcionCorrecta))
            {
                btnPulsado.BackColor = Color.Green;
                numAciertos++;
            }
            else
            {
                btnPulsado.BackColor = Color.Red;
                this.Controls.Find(opcionCorrecta, true).FirstOrDefault().BackColor = Color.Green;
            }

            pbSiguiente.Enabled = true;
                   
            porcentajeAciertos = Convert.ToDouble(numAciertos) / Convert.ToDouble(numJugadas) * 100;

            lbAciertos.Text =  String.Format("{0:0.}%", porcentajeAciertos);

        }

        private bool juegoPaisCapital = true;
        private bool respuestaMultiple = true;

        private void OpcionJuego(object sender, EventArgs e)
        {
            ToolStripItem modoJuego = (ToolStripItem) sender;

            if (modoJuego.Name.Equals("opcNombrePaises"))
            {
                juegoPaisCapital = false;
                opcNombrePaises.Checked = true;
                opcNombreCapitales.Checked = false;

                lbPaisFondo.Text = "CAPITAL";
                lbCapitalFondo.Text = "PAIS";
            }
            else if(modoJuego.Name.Equals("opcNombreCapitales"))
            {
                juegoPaisCapital = true;
                opcNombrePaises.Checked = false;
                opcNombreCapitales.Checked = true;

                lbPaisFondo.Text = "PAIS";
                lbCapitalFondo.Text = "CAPITAL";
            }else if(modoJuego.Name.Equals("opcEscribirRespuesta"))
            {
                respuestaMultiple = false;

                pbPincel.Visible = true;
                tbEscribirRespuesta.Visible = true;
                tbEscribirRespuesta.Enabled = true;
                tbRespuestaCorrecta.Visible = true;

                opcEscribirRespuesta.Checked = true;
                opcMultiplesOpciones.Checked = false;

                btnCapital1.Visible = false;
                btnCapital2.Visible = false;
                btnCapital3.Visible = false;
                btnCapital4.Visible = false;             
            }
            else if(modoJuego.Name.Equals("opcMultiplesOpciones"))
            {
                respuestaMultiple = true;

                pbPincel.Visible = false;
                tbRespuestaCorrecta.Visible = false;
                tbEscribirRespuesta.Visible = false;
                tbEscribirRespuesta.Enabled = false;

                opcMultiplesOpciones.Checked = true;
                opcEscribirRespuesta.Checked = false;

                btnCapital1.Visible = true;
                btnCapital2.Visible = true;
                btnCapital3.Visible = true;
                btnCapital4.Visible = true;
            }

            if (respuestaMultiple == true)
            {
                nuevaRonda();
            }
            else
            {
                nuevaRondaEscrita();
            }
        }

        private void introducirRespuestaEscrita(object sender, KeyEventArgs e)
        {
            if(e.KeyCode == Keys.Enter && pbSiguiente.Enabled == false) { 

            numJugadas++;

            tbEscribirRespuesta.ReadOnly = true;

            if (tbEscribirRespuesta.Text.ToUpper().Equals(opcionCorrecta.ToUpper()))
            {
                tbEscribirRespuesta.BackColor = Color.Green;
                numAciertos++;
            }
            else
            {
                tbEscribirRespuesta.BackColor = Color.Red;
                tbRespuestaCorrecta.BackColor = Color.Green;
                tbRespuestaCorrecta.Text = opcionCorrecta;
            }
            pbSiguiente.Enabled = true;

            porcentajeAciertos = Convert.ToDouble(numAciertos) / Convert.ToDouble(numJugadas) * 100;

            lbAciertos.Text = String.Format("{0:0.}%", porcentajeAciertos);
            }
           
        }

    }
}
