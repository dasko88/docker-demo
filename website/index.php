<html>
    <head>
        <title>Php webapp</title>
        <head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<script>
	$(function() {
    console.log( "ready!" );

    $.get("http://docker-demo-server/beds", function(data, status){
        alert("Data: " + data + "\nStatus: " + status);
    });
});
</script>
    </head>

    <body>
        <h1>Welcome to PHP</h1>
        <ul>
            <?php

            echo "Ciao";

            ?>
        </ul>
    </body>
</html>