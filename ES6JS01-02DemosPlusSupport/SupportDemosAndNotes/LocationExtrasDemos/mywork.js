var i=0;
function myCounter()
{
	i=i+1;
	postMessage(i);
	setTimeout("myCounter()",500);
}
myCounter();