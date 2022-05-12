<?php
 $host = '210.123.142.101';
 $user = 'kddnswlr';
 $pw = 'kdkd4813';
 $dbName = 'mydatabase';
 $mysqli = new mysqli_connect($host, $user, $pw, $dbName);
 
$data_stream = "'".$_GET['testid']."'";

$query = "insert into table name(`testid`) values (".$data_stream.")";

$result = mysqli_query($nmysqli, $query);

if($result)
    echo "1";
else
    echo "-1";

mysqli_close($mysqli);
?>