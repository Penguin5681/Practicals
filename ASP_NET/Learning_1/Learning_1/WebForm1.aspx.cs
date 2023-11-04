using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Learning_1
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void TextBox2_TextChanged(object sender, EventArgs e)
        {

        }

        protected void Submit_Button_Click(object sender, EventArgs e)
        {
            Session["Name"] = Name_Text.Text.ToString();
            Session["Age"] = Age_Text.Text.ToString();
            Session["Phone"] = Phone_Text.Text.ToString();
            Session["Course"] = Course_Text.Text.ToString();
            Response.Redirect("DisplayPage.aspx");
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Name_Text.Text = "";
            Age_Text.Text = "";
            Phone_Text.Text = "";
            Course_Text.Text = "";
        }
    }
}