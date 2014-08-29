var myCount=0;
var myDrawInterval;

window.onload = function () {
	var myCanvas = document.getElementById('myCanvas');
	if (myCanvas.getContext)
	{
		var ctx = myCanvas.getContext('2d');
		draw1(ctx);
	}

	function draw1(ctx)
	{
		myDrawInterval = setInterval(function(){drawStuff(ctx)},500);

		ctx.fillStyle = "rgb(100,200,200)";
		ctx.fillRect (10, 10, 80, 80);
		//lines
		for(i=0;i<10;i++)
		{
			ctx.moveTo(0,0);
			ctx.lineTo(200+i*5,100);
			ctx.stroke();  
		}
		// arcs
		for(i=0;i<10;i++)
		{
			ctx.clearRect(0, 0, myCanvas.width, myCanvas.height);
			ctx.beginPath();
			ctx.arc(95+i*2,50,40,0,2*Math.PI);
			ctx.stroke();
		}

	}


	function drawStuff(ctx)
	{
		myCount++;
		ctx.clearRect(0, 0, myCanvas.width, myCanvas.height);
		ctx.beginPath();
		ctx.arc(95+myCount*2,50,40,0,2*Math.PI);
		ctx.stroke();
		ctx.clip();
		if(myCount>10)
		{
			clearInterval(myDrawInterval);
		}

	}
	function draw2(ctx) {
		ctx.fillRect(0,0,150,150);
		ctx.translate(75,75);

		// Create a circular clipping path
		ctx.beginPath();
		ctx.arc(0,0,60,0,Math.PI*2,true);
		ctx.clip();

		// draw background
		var lingrad = ctx.createLinearGradient(0,-75,0,75);
		lingrad.addColorStop(0, '#232256');
		lingrad.addColorStop(1, '#143778');

		ctx.fillStyle = lingrad;
		ctx.fillRect(-75,-75,150,150);

		// draw stars
		for (var j=1;j<50;j++){
			ctx.save();
			ctx.fillStyle = '#fff';
			ctx.translate(75-Math.floor(Math.random()*150),
					75-Math.floor(Math.random()*150));
			drawStar(ctx,Math.floor(Math.random()*4)+2);
			ctx.restore();
		}

	}

	function drawStar(ctx,r){
		ctx.save();
		ctx.beginPath()
		ctx.moveTo(r,0);
		for (var i=0;i<9;i++){
			ctx.rotate(Math.PI/5);
			if(i%2 == 0) {
				ctx.lineTo((r/0.525731)*0.200811,0);
			} else {
				ctx.lineTo(r,0);
			}
		}
		ctx.closePath();
		ctx.fill();
		ctx.restore();
	}
}