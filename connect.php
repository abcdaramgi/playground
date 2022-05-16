<?php
function connect_db($dbid, dbpw, dbname)
{
    return mysqli_connect($host, $dbpw, $dbname);
}
?>