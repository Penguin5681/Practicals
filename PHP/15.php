<!-- 15. Write a PHP function to check a number is prime or not -->

<?php
    function isPrime($n) {
        if ($n <= 1) return false;
        for ($i = 2; $i <= sqrt($n); $i++) {
            if ($n % $i == 0) return false;
        }
        return true;
    }

    if (isPrime(7)) echo "7 is Prime";
    else echo "7 is not Prime";
?>