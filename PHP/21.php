<!-- 21. Write a PHP Calculator class which will accept two values as arguments, then add them, subtract them, multiply them together, or divide them on request -->

<?php
    class calculator {
        private $a;
        private $b;

        public function __construct($a, $b) {
            $this->a = $a;
            $this->b = $b;
        }

        public function calc($ch) {
            switch ($ch) {
                case 1:
                    return $this->a + $this->b;
                case 2:
                    return $this->a - $this->b;
                case 3:
                    return $this->a * $this->b;
                case 4:
                    return $this->a / $this->b;
            }
        }
    }

    $calculator = new calculator(12, 3);
    $ch = 4;
    $rsl = $calculator->calc(4);
    echo $rsl;
?>