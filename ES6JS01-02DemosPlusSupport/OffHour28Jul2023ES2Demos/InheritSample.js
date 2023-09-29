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
class SoftwareEmngineer extends Employee 
{
    constructor(name,age,dept,salary)
    {
        super(name,age);
        this.dept = dept;
        this.salary = salary;
    }
    promote()
    {
        
        this.salary +=500;
    }
    celebrateBirthDay()
    {
        super.celebrateBirthDay();
        console.log("Wish You a Happy BirthDay");
    }
}
var sEngr1 = new SoftwareEmngineer('Kiran',34,'Design',1000);
console.log(sEngr1);
sEngr1.promote();
console.log(sEngr1);
sEngr1.celebrateBirthDay;
console.log(sEngr1);