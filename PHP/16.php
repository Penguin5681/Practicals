<!-- 16. Write a PHP function to reverse a string -->

<?php
    function strReverse($St) {
        $rsl = "";
        for ($i = strlen($St) - 1; $i >= 0; $i--)
            $rsl .= $St[$i];

        return $rsl;
    }

    echo strReverse("PRANAV SINHA");
?>