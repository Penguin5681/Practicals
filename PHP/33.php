<!-- 32. Write a PHP Script that will drop table sem_5 from database -->

<?php
    $connection_query = new mysqli("localhost", "root", "", "BCA");

    if ($connection_query->connect_error) 
        echo "Error connecting to the database! ". $connection_query->connect_error;

    $sql_query = "DROP TABLE SEM_2";

    if ($connection_query->query($sql_query))
        echo "Table Has been dropped successfully";
    else   
        echo "Error Dropping the table!";
    
    $connection_query->close();
?>