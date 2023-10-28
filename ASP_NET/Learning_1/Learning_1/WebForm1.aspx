<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="Learning_1.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
        </div>
        <asp:Label ID="Name_Label" runat="server" Text="Enter Name"></asp:Label>
&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="Name_Text" runat="server" OnTextChanged="TextBox2_TextChanged" style="margin-left: 0px"></asp:TextBox>
        <p>
            <asp:Label ID="Age_Label" runat="server" Text="Enter Age"></asp:Label>
&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="Age_Text" runat="server" OnTextChanged="TextBox2_TextChanged" style="margin-left: 0px"></asp:TextBox>
        </p>
        <p>
            <asp:Label ID="Phone_Label" runat="server" Text="Enter Phone Number"></asp:Label>
&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="Phone_Text" runat="server"></asp:TextBox>
        </p>
        <p>
            <asp:Label ID="Course_Label" runat="server" Text="Enter Course"></asp:Label>
&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="Course_Text" runat="server"></asp:TextBox>
        </p>
        <asp:Button ID="Submit_Button" runat="server" OnClick="Submit_Button_Click" Text="Submit" />
    &nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Reset" />
    </form>
</body>
</html>
