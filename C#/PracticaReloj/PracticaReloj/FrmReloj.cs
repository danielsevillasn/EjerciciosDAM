using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PracticaReloj
{
    public partial class FrmReloj : Form
    {
        private string paisSeleccionado = null;
        private int diferenciaHoraria = 0;

        public FrmReloj()
        {
            InitializeComponent();

            ActualizarYCentrarLabel(lblHoraPaís, "Hora en ?");
            timerEspaña.Start();
        }

        private void timerEspaña_Tick(object sender, EventArgs e)
        {
            DateTime ahora = DateTime.Now;
            txtBoxHoraActual.Text = ahora.ToString("HH:mm:ss");

            if (!string.IsNullOrEmpty(paisSeleccionado))
            {
                txtBoxHoraPaís.Text = ahora.AddHours(diferenciaHoraria).ToString("HH:mm:ss");
            }
        }

        private void mstrAñadir_Click(object sender, EventArgs e)
        {
            FrmAñadir frm = new FrmAñadir();

            if (frm.ShowDialog() == DialogResult.OK)
            {
                for (int i = 3; i < mstrPaís.DropDownItems.Count; i++)
                {
                    if (mstrPaís.DropDownItems[i].Text.Equals(frm.NombrePais, StringComparison.OrdinalIgnoreCase))
                    {
                        MessageBox.Show($"El país '{frm.NombrePais}' ya está en la lista.", "Duplicado", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                        frm.Dispose();
                        return;
                    }
                }

                ToolStripMenuItem itemPais = new ToolStripMenuItem(frm.NombrePais);
                itemPais.Tag = frm.DiferenciaHoraria;
                itemPais.Click += ItemPais_Click;

                mstrPaís.DropDownItems.Add(itemPais);
            }

            frm.Dispose();
        }

        private void ItemPais_Click(object sender, EventArgs e)
        {
            ToolStripMenuItem itemSeleccionado = (ToolStripMenuItem)sender;

            paisSeleccionado = itemSeleccionado.Text;
            diferenciaHoraria = (int)itemSeleccionado.Tag;

            ActualizarYCentrarLabel(lblHoraPaís, $"Hora en {paisSeleccionado}");
            txtBoxHoraPaís.Text = DateTime.Now.AddHours(diferenciaHoraria).ToString("HH:mm:ss");
            
        }

        private void mstrBorrar_Click(object sender, EventArgs e)
        {
            if (mstrPaís.DropDownItems.Count <= 3)
            {
                MessageBox.Show("No hay países añadidos para borrar.", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            List<string> listaPaises = new List<string>();
            for (int i = 3; i < mstrPaís.DropDownItems.Count; i++)
            {
                listaPaises.Add(mstrPaís.DropDownItems[i].Text);
            }

            FrmBorrar frm = new FrmBorrar(listaPaises);

            if (frm.ShowDialog() == DialogResult.OK)
            {
                string nombreBorrar = frm.PaisSeleccionado;

                for (int i = 3; i < mstrPaís.DropDownItems.Count; i++)
                {
                    if (mstrPaís.DropDownItems[i].Text == nombreBorrar)
                    {
                        mstrPaís.DropDownItems.RemoveAt(i);
                        break;
                    }
                }

                if (paisSeleccionado == nombreBorrar)
                {
                    paisSeleccionado = null;
                    ActualizarYCentrarLabel(lblHoraPaís, "Hora en ?");
                    txtBoxHoraPaís.Clear();
                }
            }

            frm.Dispose();
        }

        private void ActualizarYCentrarLabel(Label lbl, string nuevoTexto)
        {
            lbl.Text = nuevoTexto;
            lbl.Left = (this.ClientSize.Width - lbl.Width) / 2;
        }
    }
}
