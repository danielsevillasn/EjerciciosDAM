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
    public partial class FrmConsultaList : FrmClientes
    {
        public FrmConsultaList()
        {
            InitializeComponent();
            //Seleccionar vista por defecto.
            CmbVista.SelectedIndex = 0;
        }

        private void CmbCiudad_SelectedIndexChanged(object sender, EventArgs e)
        {
            //Borrar listado de clientes al cambiar de ciudad.
            LsvClientes.Items.Clear();

            //Rellenar listado con clientes de la ciudad seleccionada.
            foreach (Cliente cl in ListadoClientes.Values.Where(p => p.Ciudad == CmbCiudad.SelectedItem.ToString()))
            {
                //Determinar si el cliente es Vip o no para cambiar el índice de icono
                int esVip = cl.Vip ? 1 : 0;

                ListViewItem elemento = LsvClientes.Items.Add(cl.Nombre, esVip);
                elemento.SubItems.Add(cl.Apellidos);
                elemento.SubItems.Add(cl.Email);
                elemento.SubItems.Add(cl.Comentario);
            }
        }

        private void CmbVista_SelectedIndexChanged(object sender, EventArgs e)
        {
            //Cambiar vista en función del texto seleccionado
            switch (CmbVista.SelectedIndex) {
                case 0:
                    LsvClientes.View = View.Details;
                    break;
                case 1:
                    LsvClientes.View = View.LargeIcon;
                    break;
            }
        }

        private void FrmConsultaList_Activated(object sender, EventArgs e)
        {
            //Si se cambia de ventana, limpiar lista de cliente y volver a añadir
            //los de la ciudad seleccionada.
            if (CambioVentana)
            {
                CmbCiudad.Items.Clear();

                //Comparar ciudad del cliente con la seleccionada en el combobox
                foreach (Cliente cl in ListadoClientes.Values)
                {
                    if (!CmbCiudad.Items.Contains(cl.Ciudad)) CmbCiudad.Items.Add(cl.Ciudad);
                }
                if (CmbCiudad.Items.Count > 0) CmbCiudad.SelectedIndex = 0;
                CambioVentana = false;
            }
        }

        private void FrmConsultaList_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }
    }
}
