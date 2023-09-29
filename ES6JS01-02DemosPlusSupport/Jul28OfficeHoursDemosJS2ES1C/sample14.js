//SPREAD
const result = Math.max(10,12,34,56,90,32,76);
console.log(result);
var array = [10,12,34,56,90,32,76];

const result1 = Math.max(...array);
console.log(result1);
//SPread Extended
const arrx = [1,2,3,4,5,6];
const arry = [7,8,9,10,11];
//concatenates
const array1 = [...arrx, ...arry];
console.log(array1);
//Object Spread < ES 2015
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
const johncopy ={
    ...john
}
console.log(john);
console.log(johncopy);
johncopy.ename = 'Jonathan';
johncopy.emails.push('john@xyz.com');
console.log(john);
console.log(johncopy);
//primitives not copied
//objects copied - shared among copied original