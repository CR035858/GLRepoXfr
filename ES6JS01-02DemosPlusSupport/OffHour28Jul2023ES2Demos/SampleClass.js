class Employee {
    constructor(name,age)
    {
        console.log(this);
        this.name = name;
        this.age = age;

    }
    celebrateBirthDay()
    {
        this.age++;
    }
}
var emp1 = new Employee('Harsha',32);
console.log(emp1);
emp1.celebrateBirthDay();
console.log(emp1);
