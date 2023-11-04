using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Student_Receipt
{
    public partial class Home_Page : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void btnGenerateReceipt_Click(object sender, EventArgs e)
        {
            // Retrieve form input values
            string name = txtName.Text;
            string examType = ddlExamType.SelectedValue;
            string year = txtYear.Text;
            string subject = txtSubject.Text;
            string fees = txtFees.Text;

            // Create a receipt
            string receipt = $"Receipt\nName: {name}\nExam Type: {examType}\nYear: {year}\nSubject: {subject}\nFees: ${fees}";

            // Display the receipt
            lblReceipt.Text = receipt;
        }
    }
}