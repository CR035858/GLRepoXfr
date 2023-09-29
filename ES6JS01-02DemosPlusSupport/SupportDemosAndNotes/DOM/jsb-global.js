/*
   jsb-global.js
   This file contains commonly-used functions for scripts accompanying
   The JavaScript Bible 7th Edition (Wiley, 2009) by Danny Goodman with Paul Novitski et al.
*/

// add an event to an element
/*
var var1=100;
var var2=200;
var var3=300;
add(var1,var2,var3)
function add(obj1,obj2,obj3){obj1+obj2+obj3;}
addEvent(window,'load',initialize);


while(true)
{

}*/
function addEvent(elem, evtType, func)
{

   if (elem && typeof(elem) == "object")
   {
      // first try the W3C DOM method
      if (elem.addEventListener)
      {
	
         elem.addEventListener(evtType, func, false);

      }
      // otherwise use the 'traditional' technique
      else
      {
	//button1.onclick=disp;
	//button[onclick]=disp;
	window[onload]=initialize;
         elem["on" + evtType] = func;
      }
//button1.onclick=method
//button1[onclick]=method
   }
}
