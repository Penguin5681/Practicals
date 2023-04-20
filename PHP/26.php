<!-- 26. Write a PHP Script that will be used for mail send. -->

<?php
$to = 'pranavsinha922@gmail.com';
$subject = 'Test email';
$message = 'This is a test email';
$headers = 'From: pranavsinha499@gmail.com';

if (mail($to, $subject, $message, $headers)) {
    echo 'Email sent successfully';
} else {
    echo 'An error occurred while sending the email';
}
?>