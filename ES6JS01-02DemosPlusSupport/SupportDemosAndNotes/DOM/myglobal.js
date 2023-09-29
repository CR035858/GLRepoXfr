alert("We are in MyGlobal js");
addEvent(window,'load',myinit);
function myinit()
{
if(document.getElementById)
{
var myButton=document.getElementById('submitButton');
addEvent(myButton,'click',displayData);

}

}
function displayData()
{
var eName=document.getElementById('name').value;
var eAddr=document.getElementById('addr').value;
alert("The Name is :"+eName+" And Address is "+eAddr);

}