<!-- 5. Write a PHP Script that will assign two integer values and swap their values -->

<?php
    $a = 12;
    $b = 24;

    echo "Before: a = $a and b = $b";

    $temp = $a;
    $a = $b;
    $b = $temp;

    echo "<br/>After: a = $a and b = $b";
?>