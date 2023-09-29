//--------------------ANONYMOUS FUNCTION
/*
const sum = function(x,y){
    return x + y;
};
console.log('The sum '+sum(100,200));
*/
// ----------------CALLBACK FUNCTION
/*const sum = function(x,y,lgResult){
    var result = x + y;
    lgResult(result);
};
function logResult(result){
    console.log(result);
}
sum (10,20,logResult); */
//-------------------------ANONYMOUS FUNCTION AS ARG to ANOTHER FUNCTION
/*const sumx = function(x,y,lgResult){
    var result = x + y;
    lgResult(result);
};
/*
function logResult(result){
    console.log(result);
}*/
/*
sum(10,20,function (result){
    console.log(result);
}); 
//----------------AVoiding Global Variables
function wrap() 
{
    var varx = 100;
    const sum1 = function(x,y,lgResult){
        var result = x + y;
        lgResult(result);
    };
    sum1 (10,20,function (result){
        console.log(result);
    }
    ); 
}
wrap();*/
//----------------Immediately Invoked Function Expression
/*console.log("--------------Understanding IIFE---------------");
(
    
function wrap() 
{
    var sampleVar;
    var varx = 100;
    const sum1 = function(x,y,lgResult){
        var result = x + y;
        lgResult(result);
    };
    sum1 (10,20,function (result){
        console.log(result);
    }
    ); 
})();*/

var sumarr = (
function sum(x) 
{ 
    var sumt = 0;
    for (var i = 0; i < x.length; i++) 
    sumt += x[i]; 
  
  return sumt; 
  } 
  )(x = [10,20,30]);
console.log(sumarr);
// wrap()