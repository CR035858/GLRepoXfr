//Functions as Object apply and bind
function greet(message,name) {
    console.log(this);
    console.log(message + ' '+name+ '!');
}
greet('Good Morning','John');
console.log(greet instanceof(Object));
//SINCE function is an object we can assign properties
greet.x = 100;
console.log(greet.x);
greet.foo = function(){
    console.log('greet.foo was called');
}
greet.foo();
// CALL - Can change the context (usually context is the window or Object containing function)
greet.call('hello as context');
greet.call('hello','Good Evening','Raj');
//Apply works just like the call but can take array as args
var args = ['Good Morning','Mary'];
greet.apply('hello',args);
//Global Context retained when we pass null as Context
greet.apply(null,args);
//Bind creates multitime use functions
var greetBound = greet.bind('world')
//args passed when we call
greetBound('hello',args);
var greetBound1 = greet.bind('world','Rahim');
greetBound1('Good Evening'); // It takes it as first arg and then next arg thru method