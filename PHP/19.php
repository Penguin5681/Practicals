<!-- 19. Write a simple PHP class which displays an introductory message like "Hello All, I am Karuna", where "Karuna" is an argument value of the method within the class. -->

<?php
    class intro {
        public function returnIntro($name) {
            return "Hello All, I am $name!";
        }
    }

    $obj = new intro();
    echo $obj->returnIntro("Pranav");
?>