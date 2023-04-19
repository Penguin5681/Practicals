<!-- 14. Write a function to calculate the factorial of a number (non-negative integer). The function
accept the number as a argument -->

<?php
    function fact($n) {
        if ($n <= 1) return 1;
        return $n * fact($n - 1); 
    }

    echo fact(5);
?>