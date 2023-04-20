<!-- 25. 
Write a php page and create a user form which asks for marks in five subjects out of 100 and then displays the mark sheet of the student. The format is as follows:
Name of Student*:
Marks in Each Subject
Subject 1* :
Subject 2* :
Subject 3* :
Subject 4* :
Subject 5* : 
Total Marks Obtained:
Total Marks:
-->

<form method="post">
    <b> Name of the student: <b/> <input type="text" name="stdName" required>
    <br/>
    <b> Marks in Each subject: </b>
    <br/>
    Subject 1 : <input type="text" name="s1" required> <br/>
    Subject 2 : <input type="text" name="s2" required> <br/>
    Subject 3 : <input type="text" name="s3" required> <br/>
    Subject 4 : <input type="text" name="s4" required> <br/>
    Subject 5 : <input type="text" name="s5" required> <br/>
    <input type="submit">
</form>

<?php
    if (isset($_POST["stdName"])) {
    $total = $_POST["s1"] + $_POST["s2"] + $_POST["s3"] + $_POST["s4"] + $_POST["s5"];
    echo "Total Marks Obtained: $total <br/>";
    echo "Total Marks: $total";
    }
?>