<!-- 12. Write a PHP function that will take three integer values and find out max number. -->

<?php

    function returnMax($x, $y, $z) {
        if ($x > $y and $x > $z) 
            return "$x is the largest";
        else if ($y > $x and $y > $z) 
            return "$y is the largest";
        else
            return "$z is the largest";
    }

    $x = 12; $y = 13; $z = 14;
    echo returnMax($x, $y, $z);
?>