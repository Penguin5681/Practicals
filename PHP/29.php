<!-- 29. Write a PHP Script that will create sem_2 table under BCA Database -->

<?php
    $connection_query = new mysqli("localhost", "root", "", "bca");

    if ($connection_query->connect_error)
        echo "Error Creating a Connection!". $connection_query->connect_error;
    
    $sql_query = "CREATE TABLE SEM_2(ID INT, NAME_ VARCHAR(25), COURSE VARCHAR(9))";

    if ($connection_query->query($sql_query) == TRUE)
        echo "SEM_2 Table has been created successfully!";
    else 
        echo "Error creating the table :<(";
    
        $connection_query->close();
?>