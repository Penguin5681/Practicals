<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Home_Page.aspx.cs" Inherits="Student_Receipt.Home_Page" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Student Exam Form</title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h1>Student Exam Form</h1>
            <asp:Label ID="lblName" runat="server" Text="Name:"></asp:Label>
            <asp:TextBox ID="txtName" runat="server"></asp:TextBox><br />

            <asp:Label ID="lblExamType" runat="server" Text="Exam Type:"></asp:Label>
            <asp:DropDownList ID="ddlExamType" runat="server">
                <asp:ListItem Text="Unit" Value="Unit"></asp:ListItem>
                <asp:ListItem Text="Midterm" Value="Midterm"></asp:ListItem>
                <asp:ListItem Text="Final" Value="Final"></asp:ListItem>
            </asp:DropDownList><br />

            <asp:Label ID="lblYear" runat="server" Text="Year:"></asp:Label>
            <asp:TextBox ID="txtYear" runat="server"></asp:TextBox><br />

            <asp:Label ID="lblSubject" runat="server" Text="Subject:"></asp:Label>
            <asp:TextBox ID="txtSubject" runat="server"></asp:TextBox><br />

            <asp:Label ID="lblFees" runat="server" Text="Fees:"></asp:Label>
            <asp:TextBox ID="txtFees" runat="server"></asp:TextBox><br />

            <asp:Button ID="b1" runat="server" Text="Generate Receipt" OnClick="btnGenerateReceipt_Click" />
            <hr />
            <asp:Label ID="lblReceipt" runat="server" Text=""></asp:Label>
        </div>
    </form>
</body>
</html>