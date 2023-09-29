var primes = new Set([1,3,5,7,11,13]);
console.log(primes);
console.log(primes.size);
console.log(primes.add(17));
console.log(primes);
primes.delete(5);
console.log(primes);
console.log(primes);
console.log(primes.has(8));