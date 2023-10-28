<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Home_Page.aspx.cs" Inherits="Learning_2_DataBase.Home_Page" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
        </div>
        <asp:Label ID="Label1" runat="server" Text="Select a Operation"></asp:Label>
        <p>
            1.&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Insert Data" />
        </p>
        2.&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button2" runat="server" Text="Update Data" OnClick="Button2_Click" />
        <p>
            3.&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:Button ID="Button3" runat="server" Text="Delete Data" OnClick="Button3_Click" style="height: 29px" />
        </p>
        4.&nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button4" runat="server" Text="Display Data" OnClick="Button4_Click" />
    </form>
</body>
</html>
