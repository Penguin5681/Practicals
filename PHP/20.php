<!-- 20. Write a PHP class that sorts an ordered integer array with the help of sort() function -->

<?php
    class sortArray {   
        public function toSort($arr) {
            sort($arr);
            foreach ($arr as $x)
                echo $x. " ";
        }
    }

    $ord_int_array = array(12, 1, 43, 10, -1, 11);
    $sort = new sortArray();
    $sort->toSort($ord_int_array);

?>