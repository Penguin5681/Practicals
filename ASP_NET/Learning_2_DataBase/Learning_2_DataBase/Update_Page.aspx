<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Update_Page.aspx.cs" Inherits="Learning_2_DataBase.WebForm3" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="Label1" runat="server" Text="Enter Id: "></asp:Label>
&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            <br />
        </div>
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Update Email Address" />
&nbsp; New Email:&nbsp;&nbsp;
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
&nbsp;<p>
            <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Update Phone Number" />
&nbsp; New Phone Number:
            <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
        </p>
        <asp:Button ID="Button3" runat="server" OnClick="Button3_Click" Text="Go Back" />
        <p>
            <asp:Label ID="Label2" runat="server"></asp:Label>
        </p>
    </form>
</body>
</html>
