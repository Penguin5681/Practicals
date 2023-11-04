using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Learning_2_DataBase
{
    public partial class Delete_Page : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string connection_string = @"Data Source = (LocalDB)\MSSQLLocalDb; AttachDbFilename = C:\Users\prana\source\repos\Learning_2_DataBase\Learning_2_DataBase\App_Data\Database1.mdf; Integrated Security = True";

            SqlConnection connection_object = new SqlConnection(connection_string);
            connection_object.Open();

            string sql_query = "DELETE FROM Employee_Table where id = @id";

            SqlCommand command_object = new SqlCommand(sql_query, connection_object);
            command_object.Parameters.AddWithValue("@id", TextBox1.Text);
            command_object.ExecuteNonQuery();

            Label2.Text = "Record Deleted Successfully!";
            TextBox1.Text = string.Empty;

            connection_object.Close();
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            Response.Redirect("Home_Page.aspx");
        }
    }
}