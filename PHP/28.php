<!-- 28. Write a PHP that will create an BCA database -->

<?php
    $connection_query = new mysqli('localhost', 'root', '');

    if ($connection_query->connect_error)
        echo "Error Creating a connection. ".$connection_query->connect_error;
    
    $sql_query = "CREATE DATABASE BCA";

    if ($connection_query->query($sql_query) == TRUE)
        echo "<b> DATABASE CREATED SUCCESSFULLY </b>";
    else
        echo "Error Creating a Database";

    $connection_query->close();
?>