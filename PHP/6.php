<!-- 6. Write PHP Script that will assign two integer values and swap their values without third variable. -->

<?php
    $a = 12;
    $b = 24;

    echo "Before: a = $a and b = $b";

    $a = $a + $b;
    $b = $a - $b;
    $a = $a - $b;

    echo "<br/>After: a = $a and b = $b";
?>