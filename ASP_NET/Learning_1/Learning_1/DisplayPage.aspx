<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="DisplayPage.aspx.cs" Inherits="Learning_1.WebForm2" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
        </div>
        <asp:Label ID="Label1" runat="server"></asp:Label>
        <p>
            <asp:Label ID="Label2" runat="server"></asp:Label>
        </p>
        <asp:Label ID="Label3" runat="server"></asp:Label>
        <p>
            <asp:Label ID="Label4" runat="server"></asp:Label>
        </p>
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Display Data" />
&nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Go Back" />
    </form>
</body>
</html>
