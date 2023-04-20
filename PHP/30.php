<!-- 30. Write a PHP Script that will insert data into sem_2 table. -->

<?php
    $connection_query = new mysqli("localhost", "root", "", "BCA");

    if ($connection_query->connect_error)   
        echo "Error Connecting to the Database.". $connection_query->connect_error;

    $sql_query = "INSERT INTO SEM_2(ID, NAME_, COURSE)VALUES(2, 'Tanisha Shah', 'BBA')";

    if ($connection_query->query($sql_query))
        echo "Record has been added successfully!";
    else    
        echo "Unable to add record :<( ";

    $connection_query->close();
?>