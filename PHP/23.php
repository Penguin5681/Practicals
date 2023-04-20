<!-- 23. 
Write a PHP script to convert string to Date and DateTime.
Sample Date : '12-08-2004'
Expected Output : 2004-12-08 
-->

<?php
    $dateStr = '12-08-2004';
    $date = date('y-m-d', strtotime($dateStr));
    echo $date."<br/>";

    $dateTime = date('y-m-d H:i:s', strtotime($dateStr));
    echo $dateTime;
?>