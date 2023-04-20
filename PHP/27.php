<!-- 27. Write a php script that will help to upload a file. -->

<?php
if (isset($_FILES["file"])) {
    $file_name = $_FILES['file']['name'];
    $file_temp_name = $_FILES['file']['tmp_name'];
    $file_dest = "E:\uploads" . $file_name;

    if (move_uploaded_file($file_temp_name, $file_dest)) 
        echo "File uploaded Successfully";
     else 
        echo "Not Uploaded";
}

?>

<form action="27.php" method="post" enctype="multipart/form-data">
    <input type="file" name="file"> <br> <br>
    <input type="submit">
</form>