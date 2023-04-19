<!-- 9. Write a PHP Script that will check number is divisible by 13 and 7. -->

<?php
    $n = 91;
    if ($n % 13 == 0 and $n % 7 == 0) 
        echo "Divisible by 13 and 7";
    else
        echo "Not Divisible by 13 and 7";
?>