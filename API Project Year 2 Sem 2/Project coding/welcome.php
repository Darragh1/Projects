
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<!-- flickr -->
<p> <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script></p>

<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Welcome</title>
<script type="text/javascript" src="http://ajax.googleapis.com/
ajax/libs/jquery/1.4.2/jquery.min.js"></script>

<!-- Youtube script Starts Here-->
<script type="text/javascript">
function Show(){ 
document.getElementById( 'result' ).style.display = 'block'; 
}
</script>
<script type="text/javascript">
    $( document ).ready(function() {
        $("#show").click(function() {
            getYoutube($("#Search").val()+" music video");
        })
    });

function getYoutube(title){
$.ajax({
type: "GET",
url: yt_url='http://gdata.youtube.com/feeds/api/videos?q='+title+'&format=1&max-results=5&v=2&alt=jsonc',
dataType:"jsonp",
success: function(response)
{
if(response.data.items)
{
$.each(response.data.items, function(i,data)
{
var video_id=data.id;
var video_title=data.title;
var video_viewCount=data.viewCount;

var video_frame="<iframe width='600' height='385' src='http://www.youtube.com/embed/"+video_id+"' frameborder='0' type='text/html'></iframe>";

var final="<div id='title'>"+video_title+"</div><div>"+video_frame+"</div><div id='count'>"+video_viewCount+" Views</div>";
$("#result").html(final);
});


}
else
{
$("#result").html("<div id='no'>No Video</div>");
}
}

});

}
</script>
<script type="text/javascript">

  function showpics(){

    var pic= $("#Search").val();
    $.getJSON('http://api.flickr.com/services/feeds/photos_public.gne?tags='
      +pic+"&tagmode=any&format=json&jsoncallback=?",
      function(data){ $("#images").hide().html(data).fadeIn('fast');

    $.each(data.items, function(i,item) {
      $("<img/>").attr("src", item.media.m).appendTo("#images");
    });
  })
};
  </script>
<!-- Youtube Javascript Ends Here-->

<style>
#result { display: none;}

body {
background-image:url("red.jpg");;
color:#2E8AE6;
font-family:'Georgia', Times New Roman, Times, serif
}

#Search
{

border:2px solid #333;
font-size:20px;
padding:5px;
width:350px;
font-family:'Georgia', Times New Roman, Times, serif;
-moz-border-radius:5px;-webkit-border-radius:5px;


}
#input_box
{
text-align:left;
width:640px;
}
#result
{
background-color:black;
margin-top:25px;
min-height:400px;
width:600px;
border:solid 10px #ffffff;

-moz-border-radius:9px;
-webkit-border-radius:9px;

}
#no
{
padding:30px;
font-size:24px;
color:#fff;

}

#title
{
background-color:black;
font-size:26px;
text-align:left;
padding-bottom:8px;

}
#count
{
background-color:black;
text-align:right;
padding-top:8px;
}
#left, #right{ width: 48%; }
#left { float: left }
#right { float: right }
#main { width: 100%; text-align: center; }
#top { width: 100%; padding-bottom: 10px}
</style>

</head>

<body>

 <h1 align="center">PicMus Stream</h1>
 <h4 align='right' style='margin-right:20px; margin-top:10px;'>

<a href='logout.php'>Logout Here</a></h4>
 <div id="main">
    <div id="top">
        <p>Stream Pictures and Music Videos from <br />your favourite Artists.</p>
        <input type="text" id="Search"/>
        <input id="show" type="button" value="Submit" onclick="Show();showpics();"/>
    </div>
<div id="left">
    <div id="images"></div>
</div>
<div id="right">
    <div id="result"></div>
 </div>
</div>
 </body>
</html>