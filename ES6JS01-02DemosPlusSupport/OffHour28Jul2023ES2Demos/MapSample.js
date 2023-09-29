const numbers  = new Map(
    [[1,"One"],[2,"Two"],[3,"Three"]]
);
console.log(numbers.size);
console.log(numbers.entries());
console.log(numbers.values());
console.log(numbers.keys());
numbers.set(40,"Forty");
console.log(numbers);
console.log(numbers.get(3));
numbers.delete(2);
console.log(numbers);
//numbers.clear()
for(let [key,value] of numbers){
    console.log(`$(key) = $(value)`);
}