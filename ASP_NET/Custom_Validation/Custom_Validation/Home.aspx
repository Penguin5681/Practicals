<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Home.aspx.cs" Inherits="Custom_Validation.Home" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <script type="text/ecmascript">
        function validateLength(sender, args) {
            debugger;
            if (args.Value.length < 5)
                return args.IsValid = false;
            else
                return args.IsValid = true;
        }
    </script>
</head>
<body>
    <form id="form1" runat="server">
        <div>
        </div>
        <asp:Label ID="Label1" runat="server" Text="Enter a string"></asp:Label>
&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;
        <asp:CustomValidator ID="CustomValidator1" runat="server" ControlToValidate="TextBox1" ErrorMessage="You must enter 5 characters" ForeColor="Red" ClientValidationFunction ="validateLength"></asp:CustomValidator>
        <p>
            <asp:Label ID="Label2" runat="server"></asp:Label>
        </p>
    </form>
</body>
</html>
