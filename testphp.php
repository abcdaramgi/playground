<?php
$host="210.123.142.101:3306";
$dbid="kddnswlr";
$dbpw="kdkd4813";
$dbname="mydatabase";

$conn = mysqli_connect($host, $dbid, $dbpw, $dbname);

$test_id = $_POST['testid'];

$sql = "INSERT INTO test (testid) VALUES ('$test_id')";

if($conn->query($sql)){
  echo "sign up success!!</br>";
}
else{
  echo "fail to insert sql";
}

?>
