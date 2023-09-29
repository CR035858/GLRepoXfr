//REST operator
//When declaring a function  -last arg in a function
function foo(x,y, ...others){
console.log(x);
console.log(y);
console.log(others);
}
foo(14,17,34,76,32,12);

function sort( ...numbers){
    numbers.sort();
    return numbers;
    }
   var sortedNums =  sort(14,17,34,76,32,12);
   console.log(sortedNums);
//When Array Destructuring
const days = [
    'Mon','Tues','Wed','Thu','Fri'
];

const [first,second, ...restOfDays] = days;
console.log(first,second,restOfDays);

//When Object Destructuring
const john ={
    ename : 'John',
    age : 34,
    emails : [
        'john@gmail.com','john@yahoo.com'
    ],
    address : {
        city : 'Bangalore',
        pin : 560029
    }

};
const {ename,age, ...otherDetailsOfJohn } = john;
console.log(ename,age,otherDetailsOfJohn);