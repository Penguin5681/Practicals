using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace MaxLength10
{
    public partial class Home : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string input_string = TextBox1.Text;

            if (input_string.Length > 10)
            {
                Label2.Text = "Length: " + input_string.Length + " > 10";
            }
            else
            {
                Label2.Text = "Nice String";
            }
        }
    }
}