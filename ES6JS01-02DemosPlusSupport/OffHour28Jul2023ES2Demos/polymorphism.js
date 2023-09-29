class Shape{
    draw()
    {
        console.log("Drawing Shape");
    }
}
class Rectangle extends Shape{
    draw()
    {
        console.log("Drawing Rectangle");
    }
}
class Triangle extends Shape {
    draw()
    {
        console.log("Drawing Triangle");
    }
}

let shape = new Shape();
let rectangle = new Rectangle();
shape.draw();
rectangle.draw();