using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Trivial
{
    class NoSelButton : Button
    {


        public NoSelButton()
        {
            SetStyle(ControlStyles.Selectable, false);


        }


    }
}
