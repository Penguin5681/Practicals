<?php 
    function swapVar($a, $b) {
        echo "Before: a = $a b = $b\n";
        $a = $a + $b;
        $b = $a - $b;
        $a = $a - $b;

        echo "After: a = $a b = $b";
    }

    function pattern1($n = 4) {
        for ($i = 1; $i <= $n; $i++) {
            for ($j = 1; $j <= $i; $j++) {
                echo $j." ";
            }
                echo "<br/>";
        }
    }

    function pattern2($n = 4) {
        for ($i = 1; $i <= $n; $i++) {
            for ($j = 1; $j <= $i; $j++) {
                echo $i." ";
            }
                echo "<br/>";
        }
    }

    function createDB() {
        $connectionQuery = new mysqli("localhost", "root", "");

        if ($connectionQuery->connect_error)
            die ("Error connecting to phpmyadmin ".$connectionQuery->connect_error);
        
        $sqlQuery = "CREATE DATABASE BCA";
        
        if ($connectionQuery->query($sqlQuery))
            echo "Database Created Successfully ;)";
        else echo "Error creating the database";

        $connectionQuery->close();
    }

    function createTable() {
        $connectionQuery = new mysqli("localhost", "root", "", "BCA");

        if ($connectionQuery->connect_error)
            die ("Error connecting to phpmyadmin ".$connectionQuery->connect_errno);
        
        $sqlQuery = "CREATE TABLE SEM_2(ROLL_NO INT, FULL_NAME VARCHAR(25))";

        if ($connectionQuery->query($sqlQuery))
            echo "Table SEM_2 Created successfully ;)";
        else echo "Error creating the table";

        $connectionQuery->close();
    }

    function insertData() {
        $connectionQuery = new mysqli("localhost", "root", "", "BCA");

        if ($connectionQuery->connect_error)
            die ("Error connecting to phpmyadmin ".$connectionQuery->connect_errno);

        $sqlQuery0 = "INSERT INTO SEM_2 VALUES(1, 'PRANAV SINHA')";
        $sqlQuery1 = "INSERT INTO SEM_2 VALUES(2, 'TANISHA SHAH')";
        $sqlQuery2 = "INSERT INTO SEM_2 VALUES(3, 'SWAYAM PATEL')";

        if ($connectionQuery->query($sqlQuery0) and $connectionQuery->query($sqlQuery1) and $connectionQuery->query($sqlQuery2))
            echo "3 Record added successfully ;)";
        else echo "Error adding record";
        
        $connectionQuery->close();
    }

    function displayRecord() {
        $connectionQuery = new mysqli("localhost", "root", "", "BCA");

        if ($connectionQuery->connect_error)
            die ("Error connecting to phpmyadmin ".$connectionQuery->connect_errno);
        
        $sqlQuery = "SELECT * FROM SEM_2";
        $result = $connectionQuery->query($sqlQuery);

        if ($result->num_rows > 0) {
            echo "<table>";
            echo "<tr> <th> Roll No </th> <th> Full Name </th> </tr>";
                while ($row = $result->fetch_assoc()) {
                    echo "<tr>";
                    echo "<td>" . $row['ROLL_NO'] . "</td>"; 
                    echo "<td>" . $row['FULL_NAME'] . "</td>"; 
                    echo "</tr>";
                }
            echo "</table>";
        }
        else echo "No Data Found";

        $connectionQuery->close();
    }

    function deleteRecords() {
        $connectionQuery = new mysqli("localhost", "root", "", "BCA");

        if ($connectionQuery->connect_error)
            die ("Error connecting to phpmyadmin ".$connectionQuery->connect_errno);
        
        $sqlQuery = "DELETE FROM SEM_2 WHERE ROLL_NO = 1";

        if ($connectionQuery->query($sqlQuery))
            echo "Record deleted successfully ;)";
        else 
            echo "Error deleting the record";
        
        $connectionQuery->close();
    }

    function dropTable() {
        $connectionQuery = new mysqli("localhost", "root", "", "BCA");

        if ($connectionQuery->connect_error)
            die ("Error connecting to phpmyadmin ".$connectionQuery->connect_errno);
        
        $sqlQuery = "DROP TABLE SEM_2";

        if ($connectionQuery->query($sqlQuery))
            echo "Table Dropped :(";
        
        else echo "Error dropping the table";
    }

    function dropDB() {
        $connectionQuery = new mysqli("localhost", "root", "", "BCA");

        if ($connectionQuery->connect_error)
            die ("Error connecting to phpmyadmin ".$connectionQuery->connect_errno);
        
        $sqlQuery = "DROP DATABASE BCA";

        if ($connectionQuery->query($sqlQuery))
            echo "Database Dropped :(";
        
        else echo "Error dropping the database";
    }

    function uploadFile() {
        if (isset($_FILES["file"])) {
            $filename = $_FILES["file"]["name"];
            $fileTemp = $_FILES["file"]["tmp_name"];
            $dest = "E:\uploads\\". $filename;
    
            if (move_uploaded_file($fileTemp, $dest)) echo "True";
            else echo "False";
        }
    }

    function isPalindrome($str) {
        return $str == strrev($str);
    }

    function isPalindromeFOR($str) {
        $flag = true;
        for ($i = 0; $i < strlen($str); $i++) {
            if ($str[$i] == $str[strlen($str) - 1 - $i])
                $flag = true;
            else {$flag = false; break;}
        }
        return $flag;
    }

    function strReverse($str) {
        $rev = "";

        for ($i = strlen($str); $i >= 0; $i--)
            $rev .= $str[$i];

        return $rev;
        
    }

    class showStr {
        public function printHello() {
            return 'MyClass class has initialized!';
        }
    }

    // $inst = new showStr();
    // echo $inst->printHello();

    class intro {
        public function intro_($name) {
            return "Hello My name is: ".$name;
        }
    }
    
    // $cObj = new intro();
    // echo $cObj->intro_("Pranav");

    class ArrSort {
        public function ArraySort($arr) {
            sort($arr);
            foreach($arr as $x)
                echo $x . " ";
        }
    }

    // $obj = new ArrSort();
    // $arr = array(1, 2, -3, 4);
    // $arr1 = array("name" => "Pranav", "age" => 19, "state" => "Gujarat");

    // $obj->ArraySort($arr);

    class calc {
        private $a, $b;
        public function __construct($a, $b) {
            $this->a = $a;
            $this->b = $b;
        }

        public function displayMenu() {
            return "1. Addition <br/> 2. Subtraction <br/> 3. Multiplication";
        }

        public function calc($ch) {
            switch ($ch) {
                case 1: return $this->a + $this->b;
                case 2: return $this->a - $this->b;
                case 3: return $this->a * $this->b;
                default: return "Invalid Choice :-|";
            }
        }
    }

    class dateDiff {
        private $date1, $date2;

        public function __construct($date1, $date2) {
            $this->date1 = new DateTime($date1);
            $this->date2 = new DateTime($date2);
        }

        public function diff() {
            $interval = $this->date1->diff($this->date2);
            return [$interval->y, $interval->m, $interval->d];
        }
    }

    // $date1 = "2023-05-11";
    // $date2 = "2003-06-09";

    // $obj1 = new dateDiff($date1, $date2);
    // [$y, $m, $d] = $obj1->diff();
    // echo "Difference: " . $y . "-" . $m . "-" . $d;

    function strToDateTime($dateStr = "2023-05-11 07:40:45") {
        $date = date('y-m-d', strtotime($dateStr));
        $dateTime = date('y-m-d h:m:s', strtotime($dateStr));
        echo $date . "<br/>" . $dateTime;
        // echo date('y-m-d h:m:s');
    }

    strToDateTime();

    // $obj1 = new calc(12, 4);
    // echo $obj1->displayMenu();
    // echo $obj1->calc(1);

    // uploadFile();
    // createTable();
    // insertData();
    // displayRecord();
    // deleteRecords();
    // dropTable();
    // dropDB();

?>

<!-- <form action="a.php" method="post" enctype="multipart/form-data">
    <input type="file" name="file"> <br>
    <input type="submit">
</form> -->
