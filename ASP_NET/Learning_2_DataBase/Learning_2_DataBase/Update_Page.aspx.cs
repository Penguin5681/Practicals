using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Learning_2_DataBase
{
    public partial class WebForm3 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string connection_string = @"Data Source = (LocalDB)\MSSQLLocalDb; AttachDbFilename = C:\Users\prana\source\repos\Learning_2_DataBase\Learning_2_DataBase\App_Data\Database1.mdf; Integrated Security = True";

            SqlConnection connection_object = new SqlConnection(connection_string);
            connection_object.Open();

            string sql_query = "UPDATE Employee_Table SET EMail_Address = @EMail_Address WHERE id = @id";

            SqlCommand command_object = new SqlCommand(sql_query, connection_object);
            command_object.Parameters.AddWithValue("@id", TextBox1.Text);
            command_object.Parameters.AddWithValue("@EMail_Address", TextBox2.Text);

            int rowsAffected = command_object.ExecuteNonQuery();

            if (rowsAffected > 0)
            {
                Label2.Text = "E-mail Updated successfully";
            }
            else
            {
                Label2.Text = "No records were updated. Check the ID.";
            }

            Label2.Text = "E-mail Updated successfully";
            TextBox1.Text = string.Empty;
            TextBox2.Text = string.Empty;

            connection_object.Close();
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            string connection_string = @"Data Source = (LocalDB)\MSSQLLocalDb; AttachDbFilename = C:\Users\prana\source\repos\Learning_2_DataBase\Learning_2_DataBase\App_Data\Database1.mdf; Integrated Security = True";

            SqlConnection connection_object = new SqlConnection(connection_string);
            connection_object.Open();

            string sql_query = "UPDATE Employee_Table SET Phone_Number = @Phone_Number WHERE id = @id";

            SqlCommand command_object = new SqlCommand(sql_query, connection_object);
            command_object.Parameters.AddWithValue("@id", TextBox1.Text);
            command_object.Parameters.AddWithValue("@Phone_Number", TextBox3.Text);

            int rowsAffected = command_object.ExecuteNonQuery();

            if (rowsAffected > 0)
            {
                Label2.Text = "Phone Number Updated successfully";
            }
            else
            {
                Label2.Text = "No records were updated. Check the ID.";
            }

            Label2.Text = "Phone_Number Updated successfully";
            TextBox1.Text = string.Empty;
            TextBox2.Text = string.Empty;

            connection_object.Close();
        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            Response.Redirect("Home_Page.aspx");
        }
    }
}