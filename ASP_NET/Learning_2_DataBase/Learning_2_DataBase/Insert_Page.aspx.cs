using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Learning_2_DataBase
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            Response.Redirect("Home_Page.aspx");
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            TextBox1.Text = "";
            TextBox2.Text = "";
            TextBox3.Text = "";
            TextBox3.Text = "";
            TextBox4.Text = "";
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string connection_string = @"Data Source = (LocalDB)\MSSQLLocalDb; AttachDbFilename = C:\Users\prana\source\repos\Learning_2_DataBase\Learning_2_DataBase\App_Data\Database1.mdf; Integrated Security = True";
            SqlConnection connection_object = new SqlConnection(connection_string);
            connection_object.Open();

            string sql_query = "INSERT INTO Employee_Table VALUES (@id, @First_Name, @Last_Name, @EMail_Address, @Phone_Number)";

            SqlCommand sqlCommand = new SqlCommand(sql_query, connection_object);

            sqlCommand.Parameters.AddWithValue("@id", TextBox1.Text);
            sqlCommand.Parameters.AddWithValue("@First_Name", TextBox2.Text);
            sqlCommand.Parameters.AddWithValue("@Last_Name", TextBox3.Text);
            sqlCommand.Parameters.AddWithValue("@EMail_Address", TextBox4.Text);
            sqlCommand.Parameters.AddWithValue("@Phone_Number", TextBox5.Text);

            sqlCommand.ExecuteNonQuery();

            // string sql_query = "INSERT INTO Employee_Data VALUES (@First_Name, @Last_Name, @Employee_Id, @Email_Address, @Phone_Number)";

            // SqlCommand sqlCommand = new SqlCommand(sql_query, connection_object);
        

            // sqlCommand.ExecuteNonQuery();

            Label6.Text = "Data Inserted Successfully ;)";
           
            connection_object.Close();
        }

        protected void Button4_Click(object sender, EventArgs e)
        {

        }
    }
}