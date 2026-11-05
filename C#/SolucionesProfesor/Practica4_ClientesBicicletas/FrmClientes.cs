using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica4_ClientesBicicletas
{
    public partial class FrmClientes : Form
    {
        //Variables estáticas
        //Almacenar lista de cliente con la clave Email.
        public static SortedDictionary<string, Cliente> ListadoClientes = new SortedDictionary<string, Cliente>();

        //Controlar cambio de ventana
        public static bool CambioVentana = true;

        public FrmClientes()
        {
            InitializeComponent();

            //Crear clientes para probar más rápido.
            /*
            if (ListadoClientes.Count == 0)
            {
                Cliente[] test = {
                    new Cliente("Sergio","Lacon", "Guadalajara", "a@b.com","Hola pepe",true),
                    new Cliente("Ana","Perdices","Madrid","wdad@sfse.es","Adios pepe",false),
                    new Cliente("Antonio","Melón", "Madrid", "dwdaw@awdawd.es","",false)
                };
                foreach (Cliente c in test) ListadoClientes.Add(c.Email, c);
            }
            */
        }

        #region Métodos propios
        private void MostrarFormulario(Form formAbierto)
        {
            foreach (Form f in Application.OpenForms)
            {
                //Buscar si el formulario ya ha sido abierto.
                if (f.GetType() == formAbierto.GetType())
                {
                    //Si existe, mostrar el formulario existente.
                    f.Show();
                    this.Hide();
                    return;
                }
            }

            //Si no se ha abierto previamente, mostrar nuevo.
            formAbierto.Show();
            this.Hide();
        }


        #endregion
        private void MnuAlta_Click(object sender, EventArgs e)
        {
            FrmAlta form = new FrmAlta();
            CambioVentana = true;
            MostrarFormulario(form);
        }

        private void MnuConsultaList_Click(object sender, EventArgs e)
        {
            FrmConsultaList form = new FrmConsultaList();
            CambioVentana = true;
            MostrarFormulario(form);
        }

        private void MnuConsultaTree_Click(object sender, EventArgs e)
        {
            FrmConsultaTree form = new FrmConsultaTree();
            CambioVentana = true;
            MostrarFormulario(form);
        }

        private void MnuSalir_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
