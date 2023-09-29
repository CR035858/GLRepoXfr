// Function is not taking argument neither it is returning arguments
/*function sayHello()
{
    console.log("Hello Good Morning");
}
sayHello();*/
function checkScore(score)
{
    console.log("We are checking the Score ");
    if( score >= 50 && score < 60)
    {
        console.log("Good Passed");
    }
    else if(score >= 60 && score < 75)
    {
        console.log("Excellent Secured First class");
    }
    else if(score >= 75 && score <= 100)
    {
        console.log("Great Secured Distinction");
    }
}
checkScore(56);
checkScore(75);
checkScore(65);/**/
function addNumbers(num1,num2)
{
    var result = num1 + num2;
    return result;   
}
//----------------------
var myResult = addNumbers(100,200);
console.log("The result returned is "+myResult);

var myResult1 = addNumbers(1000,2000);
console.log("The Result is "+myResult1);
