addEvent(window,'load',myinitialize);
function myinitialize()
{
var myButton1=document.getElementById('myButton');
addEvent(myButton1,'click',utilityFun);
}
function utilityFun()
{
var myTextObject=document.getElementById('typedtext');
var myText=myTextObject.value;
var myResultText=myText.makeInitialCap();
myTextObject.value=myResultText;
}
String.prototype.makeInitialCap=function()
{
var myStrings=this.split(' ');
for(var i=0;i<myStrings.length;i++)
{
var fString=myStrings[i].charAt(0);
var lString=myStrings[i].substr(1);
var fString=fString.toUpperCase();//H
var lString=lString.toLowerCase();//ello
myStrings[i]=fString+lString;
}
 return myStrings.join(' ');
}