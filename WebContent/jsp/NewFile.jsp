<!DOCTYPE html>  
<html>  
<head>  
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>  
<script>   
$(document).ready(function(){  
    $("button").click(function(){  
        $("div").animate({  
            left: '250px',  
            height: 'toggle', 
        });  
    });  
});   
</script>   
</head>  
<body>  
<button>Start Animation</button>  
<p>A simple animation example:</p>  
<div id="sam" style="background:#98bf21;height:100px;width:100px;position:absolute;"></div>  
</body>  
</html> 