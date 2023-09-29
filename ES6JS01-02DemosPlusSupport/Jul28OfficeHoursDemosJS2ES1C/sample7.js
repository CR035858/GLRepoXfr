//Context - Functions
function sample(){
    console.log(this);
}
sample();
var employee1 = {
    name : 'Emanuel',
    getName : function() {
        console.log(this);
    }
};
console.log(employee1.getName());
var getName = employee1.getName;
getName(); // global context execute in console of browser