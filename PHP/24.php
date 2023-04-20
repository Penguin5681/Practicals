<!-- 24. Write a HTML Form & PHP Script that will take name and message from user and display it -->

    <form action="#" method="post">
        Enter your name: <input type="text" name="username" required>
        <input type="submit" name="sub">
    </form>

<?php
    if (isset($_POST["username"])) {
        $name = $_POST["username"];
        echo $name;
    }
?>