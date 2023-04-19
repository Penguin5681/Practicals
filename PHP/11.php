<!-- 

    11. Write a PHP Script that will display following pattern style as an output.
    1
    2 2
    3 3 3
    4 4 4 4

 -->

 <?php
    for ($i = 1; $i <= 4; $i++) {
        for ($j = 1; $j <= $i; $j++) {
            echo $i. " ";
        }
            echo "<br/>";
    }
?>