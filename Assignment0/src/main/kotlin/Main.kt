//William Oswald
//09/07-Mobile Application Development
//Assignment 0
//Professor Karl Morris
fun main(args: Array<String>) {

    var shape1: Shape
    var shape2 : Shape
    var shape3 : Shape
    var shape4 : Shape

    shape1 = Triangle("Triangle")
    shape2 =  EquilateralTriangle("Equilateral Triangle")
    shape3 = Circle("Circle")
    shape4 = Square("Square")
    var shapeCollection = mutableListOf<Shape>(shape1,shape2,shape3,shape4)

    for (i in shapeCollection){
        println(i.name)
        i.setDimensions()
        println()
    }
    for(i in shapeCollection){
        i.printDimensions()
        println("Therefore, the total area of ${i.name} is %.2f.\n".format(i.getArea()))
    }

}