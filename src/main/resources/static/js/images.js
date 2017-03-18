var timerid = 0;
var images = new Array(	"images/nati3.png", "images/nati4.png");
var countimages = 0;
function startTime()
{

    if(timerid)
    {
        timerid = 0;
    }
    var tDate = new Date();

    if(countimages == images.length)
    {
        countimages = 0;
    }
    if(tDate.getSeconds() % 5 == 0)
    {
        document.getElementById("naties").src = images[countimages];
        countimages++;
    }

    timerid = setTimeout("startTime()", 1000);
}