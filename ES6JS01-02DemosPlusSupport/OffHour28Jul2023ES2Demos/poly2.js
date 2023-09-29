const rectangle ={
    length :12,
    width : 4,
    area()
    {
        console.log("area is ",this.length * this.width);
    }
}
const square ={
    side :12,
   
    area()
    {
        console.log("area is ",this.side * this.side);
    }
}
rectangle.area();
square.area();