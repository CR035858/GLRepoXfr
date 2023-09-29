class Employee {
    constructor(name,age)
    {
      //  console.log(this);
        let _name = name;
        let _age = age;
      //  console.log(this);
      this.getName = function(){
        return _name;
      }
      this.setName = function(name){
        _name = name;
      }
      this.setName = function(newName)
      {
        if (typeof newName === "string")
        {
            _name = newName;
        }
      }

    }
    get name() {
        return this.getName();
    }
    set name(newName)
    {
       return this.setName(newName);
    }
    celebrateBirthDay()
    {
        this.age1++;
    }
}
let person1 = new Employee('Kiran',34);
console.log(person1._name);
console.log(person1.getName());
console.log(person1.name);
person1.setName('Rajan');
console.log(person1.name);
person1.name = "Mohan";
