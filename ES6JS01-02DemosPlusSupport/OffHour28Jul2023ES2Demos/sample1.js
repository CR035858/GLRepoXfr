class Employee {
    constructor(name,age)
    {
        console.log(this);
        this.name = name;
        this.age = age;

    }
}
var e = new Employee('Harish',76);
console.log(e);