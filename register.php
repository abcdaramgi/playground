<?php
$host="210.123.142.101:3306";
$dbid="kddnswlr";
$dbpw="kdkd4813";
$dbname="mydatabase";

$conn = new mysqli($host, $dbid, $dbpw, $dbname);

if($conn){
    echo "connect <br>";
}
else{
    echo "disconnect <br>";
}

?>