using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Database_Connection_Test
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string connection_string = @"Data Source = (LocalDb)/MSSqlLocalDb; AttachDbFilename = C:\Users\prana\source\repos\Database_Connection_Test\Database_Connection_Test\App_Data\Test_Database.mdf; Integrated Security = True";

            using (SqlConnection conn = new SqlConnection(connection_string))
            {
                try
                {
                    conn.Open();
                    Label1.Text = "Database Connected Successfully";
                    conn.Close();
                }
                catch (Exception ex)
                {
                    Label1.Text = "Error establishing connection: " + ex.Message;
                }
            }
        }
    }
}