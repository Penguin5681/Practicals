<!-- 32. Write a PHP Script that will delete records from sem_2 table. -->

<?php
    $connection_query = new mysqli("localhost", "root", "", "BCA");

    if ($connection_query->connect_error) 
        echo "Error Connecting to the Database! ". $connection_query->connect_error;

    $sql_query = "DELETE FROM SEM_2 WHERE ID=1";

    if ($connection_query->query($sql_query)) 
        echo "Record Deleted Successfully";
    else 
        echo "Error Deleting the record!";
    
    $connection_query->close();
?>