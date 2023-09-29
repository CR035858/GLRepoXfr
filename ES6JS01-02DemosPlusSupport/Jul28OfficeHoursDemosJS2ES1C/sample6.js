const jsonData = [
    {
        "name":"Television",
        "description":"Electronic Goods",
        "price":"10000",
        "discount":{
            "min":12,
            "max":22
        }
    },
    {
        "name":"Refrigerator",
        "description":"Electronic Goods",
        "price":25000,
        "discount":{
            "min":10,
            "max":20
        }
    }
]
var jsonDataStr = JSON.stringify(jsonData);
console.log(jsonDataStr);
const obj = {name: "John", age: 30, city: "New York"};
const jsonStr = JSON.stringify(obj);
console.log(jsonStr); // Output: '{"name":"John","age":30,"city":"New York"}'