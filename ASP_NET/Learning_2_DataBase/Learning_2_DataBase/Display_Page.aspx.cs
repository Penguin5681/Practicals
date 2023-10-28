using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Learning_2_DataBase
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string connection_string = @"Data Source = (LocalDB)\MSSQLLocalDb; AttachDbFilename = C:\Users\prana\source\repos\Learning_2_DataBase\Learning_2_DataBase\App_Data\Database1.mdf; Integrated Security = True";
            
            SqlConnection connection_object = new SqlConnection(connection_string);
            
            connection_object.Open();
        
            string sqlQuery = "SELECT * FROM Employee_Table";
            string output = " ";

            SqlCommand cmd = new SqlCommand(sqlQuery, connection_object);
            SqlDataReader dataReader = cmd.ExecuteReader();
            while (dataReader.Read())
                output += dataReader.GetValue(0) + " - " + dataReader.GetValue(1) + " - " + dataReader.GetValue(2) + " - " + dataReader.GetValue(3) + " - " + dataReader.GetValue(4) + "<br/>";

            Response.Write(output);
            dataReader.Close();
            connection_object.Close();
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            Response.Redirect("Home_Page.aspx");
        }
    }
}