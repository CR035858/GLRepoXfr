//ARRAY DESTRUCTURING
const days = [
    'Sun','Mon','Tues','Wed','Thu','Fri'
];
/*
const first = days[0];
const second = days[1];
const third = days[2];
const fourth = days[3];
const fifth = days[4]
const sixth = days[5];
const seventh = days[6];*/
const [first,second,,fourth,fifth='Holiday',sixth] = days;
console.log(first,second,fourth,fifth,sixth);