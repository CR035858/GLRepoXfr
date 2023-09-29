/*
   jsb-global.js
   This file contains commonly-used functions for scripts accompanying
   The JavaScript Bible 7th Edition (Wiley, 2009) by Danny Goodman with Paul Novitski et al.
*/

// add an event to an element
//addEvent(window,'load',initialize)
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
         elem["on" + evtType] = func; //window.load = func // window[onload] = func // sub[onclick] = func
      }
//button1.onclick=method
//button1[onclick]=method
//window[onload]=initialize
   }
}
//---------------------------------------------------------------------------------------