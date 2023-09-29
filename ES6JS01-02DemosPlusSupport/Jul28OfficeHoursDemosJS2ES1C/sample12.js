//Object Destructuring
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
/*const ename = john.ename;
console.log(ename);*/
/*
const {ename,age} = john;
console.log(ename,age); */

const {ename, age:yearsOld,address : {city},emails : [primEMail,secEMail]} = john;
console.log(ename,yearsOld,city,primEMail,secEMail);
