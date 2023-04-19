<!-- 17. Write a PHP function that checks whether a passed string is palindrome or not? -->

<?php
    function isPalindrome($St) {
        $flag = true;
        for ($i = 0; $i < strlen($St) - 1; $i++) {
            if ($St[$i] == $St[strlen($St) - 1 - $i])
                $flag = true;
            else $flag = false;
        }

        return $flag;
    }

    if (isPalindrome("RACECAR")) echo "YES";
    else echo "NO";
?>