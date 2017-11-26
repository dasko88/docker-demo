<html>
    <head>
        <title>Php webapp</title>
        <head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<script>
	$(function() {
        $.get("http://172.18.0.2:8080/hello", function(data, status){
    });
});
</script>
    </head>

    <body>
        <p>Bed 
            <?php
            $json = file_get_contents('http://172.18.0.2:8080/beds');
            echo $json;
            ?>
        </p>
    </body>
</html>