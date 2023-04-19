<!-- 18. Write a simple PHP class which displays the following string : 'MyClass class has initialized!' -->

<?php 
    class simple {
        public function init() {
            echo "MyClass class has initialized!";
        }
    }

    $instance = new simple();
    $instance->init();
?>