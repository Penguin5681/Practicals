<!-- 31. Write a PHP Script that will display records of sem_2 table in tabular format. -->

<?php
    $connection_query = new mysqli("localhost", "root", "", "bca");

    if ($connection_query->connect_error) 
        echo "Error Connecting to the database. " .$connection_query->connect_error;

    $sql_query = "SELECT * FROM SEM_2";

    $result = $connection_query->query($sql_query);

    if ($result->num_rows > 0) {
        echo "<table>";
        echo "<tr> <th> id <th/> <th> Name <th/> <th> Course <th/> <tr/>";
            while ($row = $result->fetch_assoc()) {
                echo "<tr>";
                echo "<td>" . $row['ID'] . "<td/>";
                echo "<td>" . $row['NAME_'] . "<td/>";
                echo "<td>" . $row['COURSE'] . "<td/>";
                echo "<tr/>";
            }
        echo "<table/>";
    }
        else
            echo "The Table is empty!";
    $connection_query->close();
?>