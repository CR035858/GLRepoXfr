let x = 1;
console.log(x);
//var x = 2; // Not allowed
//let x = 2; // Not allowed
var y = 1;
console.log(y);
var y = 2; // allows
console.log(y);
//-----------------------SECOND DIFFERENCE
if(true)
{
    let varx = 100;
    var vary = 200;
    console.log("varx in block "+varx);
    console.log("vary in block "+vary)
}
//console.log("varx outside block "+varx); let takes local scope in block
console.log("vary outside block"+vary);
//-----------------------THIRD DIFFERENCE
//console.log(" x1 "+x1); // Not Allowed
console.log(" y1 "+y1); // Allowed with UNDEFINED message
let x1 = 10;
var y1 = 20;
//-----------------------CONST
//const vary; // Not allowed
const varc = 100;
console.log("varc is "+varc);
//varc = 200; 
console.log("varc again"+varc);
//-----------------------CONST as Object
const obj1 = 
{
    y : 100
};
obj1.y++;
console.log(" Obj1 's y "+obj1.y);
/* NOT ALLOWED
obj1 = {
    y :110
};*/
//--------------------------TEMPLATE STRING------------------------
const ename ='Harsha', message = 'Good Morning';
const greeting = message + ' '+ ename + '!!';
console.log(greeting);
const greetingNew = `${message} ${ename} !!`;
console.log(greetingNew);
//---------------------TemplateSTring advantage
const objx = {
    ename : 'Harsha',
    email : 'har@gmail.com',
    age : 34
};
const tableStr =
'<tr>'+
'<td>'+objx.ename+'</td>'+
'<td>'+objx.email+'</td>'+
'<td>'+objx.age+'</td>'+
'</tr>'
console.log(tableStr);
const tableStr1 = 
`<tr>
    <td>${objx.ename}</td>
    <td>${objx.email}</td>
    <td>${objx.age}</td>
</tr>`
;
console.log(tableStr1);
