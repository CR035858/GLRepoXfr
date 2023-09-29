class Employee {
    constructor(name,age)
    {
        console.log(this);
        let _name = name;
        let _age = age;
        console.log(this);

    }
    celebrateBirthDay()
    {
        this.age1++;
    }
}
let emp1 = new Employee('Harsha',32);
console.log(emp1);
console.log(emp1._name);
console.log(emp1._age);
emp1._name = 'Kiran';
emp1._age = 34;
console.log(emp1);