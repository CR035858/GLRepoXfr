//Functions As FirstClass Citizens
function foo(callback) {
    var x = 10, y = 20;
    var z =  x +  y;
    callback();
    function retFn()
    {
        console.log('retFn called');
    }
    return retFn;
}
function bar()
{
    console.log('bar called');
}
var resultingFn = foo (bar);
resultingFn();