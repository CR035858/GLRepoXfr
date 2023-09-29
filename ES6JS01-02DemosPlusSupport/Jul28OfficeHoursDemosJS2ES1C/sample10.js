//Default argument
function greeting(message='Hello', name ='World') {
    return `${message} ${name} !`;
}
console.log(greeting('Good Morning ','Bill'));
console.log(greeting('Good Morning '));//UNDEFINED
console.log(greeting());
console.log(greeting(undefined,'Bill'));