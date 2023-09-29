/**
 * @author Sony
 */

window.onload = init;

var bgColourSelectionElement;
var shapeSelectionElement;
var txtColourSelectionElement;
var tweetSelectionElement;
var canvasElement;
var ctx;
var previewButton;

function init() {

	canvasElement = document.getElementById("canvasId");
	bgColourSelectionElement = document.getElementById("bgColourId");
	shapeSelectionElement = document.getElementById("shapeId");
	txtColourSelectionElement = document.getElementById("txtColourId");
	tweetSelectionElement = document.getElementById("tweetId");
	previewButton = document.getElementById("previewButtonId");

	previewButton.onclick = drawDesign;

	ctx = canvasElement.getContext("2d");
	ctx.fillStyle = "lightblue";
}

function drawDesign() {
	var bgColourSelectedIndex = bgColourSelectionElement.selectedIndex;
	var shapeSelectedIndex = shapeSelectionElement.selectedIndex;
	var txtColourSelectedIndex = txtColourSelectionElement.selectedIndex;
	var tweetSelectedIndex = tweetSelectionElement.selectedIndex;

	var bgColour = bgColourSelectionElement[bgColourSelectedIndex].value;
	var shape = shapeSelectionElement[shapeSelectedIndex].value;
	var txtColour = txtColourSelectionElement[txtColourSelectedIndex].value;
	var tweet = tweetSelectionElement[tweetSelectedIndex].value;

	fillBackground(bgColour);

	if (shape == "square")
		drawSquare(canvasElement, ctx);
	else if (shape == "circle")
		drawCircle(canvasElement, ctx);
	else if (shape == "triangle")
		drawTriangle(canvasElement, ctx);
else if (shape == "squareandtriangle"){
		drawTriangle(canvasElement, ctx);
		drawSquare(canvasElement, ctx);
	}
putTweet(txtColour, tweet, canvasElement, ctx);
}
function drawTriangle(mCanvas, mCtx) {
	//We will draw 50 random Triangle
	for (var i = 0; i < 50; i++) {

		//Get Random X
		var x = Math.floor(Math.random() * mCanvas.width);

		//Get Random Y
		var y = Math.floor(Math.random() * mCanvas.height);

		//Get Random x increment
		var xIncrement1 = Math.floor(Math.random() * 40);
		var xIncrement2 = Math.floor(Math.random() * 40);

		//Get Random y increment
		var yIncrement1 = Math.floor(Math.random() * 40);
		var yIncrement2 = Math.floor(Math.random() * 40);

		//Fill Brush Colour
		mCtx.fillStyle = "lightBlue";

		//IMPORTANT - Triangle is drawn as path. So must tell
		//the context object that we are starting new path
		/// before callign path methods
		mCtx.beginPath();

		//Draw Traingle
		mCtx.moveTo(x, y);

		mCtx.lineTo(x + xIncrement1, y + yIncrement1);

		mCtx.lineTo(x + xIncrement2, y + yIncrement2);

		mCtx.lineTo(x, y);

		mCtx.closePath();
		//Fill the Triangle
		mCtx.fill();
	}
}
function fillBackground(bgColour) {

	ctx.fillStyle = bgColour;
	ctx.fillRect(0, 0, canvasElement.width, canvasElement.height);

}
function putTweet(txtColour, tweet, mCanvas, mCtx) {
	mCtx.fillStyle = txtColour;
	mCtx.font = "bold 1em sans-serif";
	mCtx.textAlign = "left";

	//Add the top line
	mCtx.fillText("I saw this Tweet", 20, 40);

	//change the font for next text
	mCtx.font = "italic 1.2em serif";
	mCtx.fillText(tweet, 30, 100);

	//change the font and alignment for next text
	mCtx.font = "bold 1em sans-serif";
	mCtx.textAlign = "right";
	mCtx.fillText("...and all I got was this lousy t-Shirt", mCanvas.width - 20, mCanvas.height - 40);
}
function drawSquare(mCanvas, mCtx) {

	//We will draw 50 random squares
	for (var i = 0; i < 50; i++) {

		//Get Random X
		var x = Math.floor(Math.random() * mCanvas.width);
		//Get Random Y
		var y = Math.floor(Math.random() * mCanvas.height);
		//Get Random width
		var w = Math.floor(Math.random() * 40);

		//Fill Brush Colour
		mCtx.fillStyle = "lightBlue";

		//Draw Rectangle
		mCtx.fillRect(x, y, w, w);
	}

}

function drawCircle(mCanvas, mCtx) {
	//We will draw 50 random circles
	for (var i = 0; i < 50; i++) {

		//Get Random X
		var x = Math.floor(Math.random() * mCanvas.width);

		//Get Random Y
		var y = Math.floor(Math.random() * mCanvas.height);

		//Get Random width
		var radius = Math.floor(Math.random() * 40);

		//Fill Brush Colour
		mCtx.fillStyle = "lightBlue";

		//IMPORTANT - Circel is drawn as path. So must tell
		//the context object that we are startign new path
		/// before callign path methods
		mCtx.beginPath();

		//Draw Circle
		mCtx.arc(x, y, radius, 0, Math.PI * 2, true);

		//Fill the Circle
		mCtx.fill();
	}
}




