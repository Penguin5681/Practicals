<!-- 13. Write a PHP function that will take an integer value and return sum of digits. -->

<?php
    function digitSum($x) {
        $sum = 0;
        $temp = $x;
        
        while ($temp > 0) {
            $sum += $temp % 10;
            $temp /= 10;
        }
        return $sum;
    }

    echo digitSum(1234);
?>