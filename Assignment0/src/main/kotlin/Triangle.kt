import java.util.Scanner
import kotlin.math.sqrt

open class Triangle(_name:String) : Shape(_name) {
    //Create Scanner Instance
    private val reader = Scanner(System.`in`)

    private var side1: Double = 0.0
    private var side2: Double = 0.0
    private var side3: Double = 0.0
    private var area: Double = 0.0

    override fun setDimensions(){
        print("Enter the $name's Side 1's length: ")
        var side1 : Double = reader.nextDouble()
        this.side1 = side1

        print("Enter $name's Side 2's length: ")
        var side2 : Double = reader.nextDouble()
        this.side2 = side2

        print("Enter $name's Side 3's length: ")
        var side3 : Double = reader.nextDouble()
        this.side3 = side3

        this.area = getArea()
    }


    override fun getArea(): Double {
        var totalArea: Double = 0.0
        var perimeter: Double = 0.0;
        //s = 1/2 of perimeter
        var s: Double = 0.0
        perimeter = side1 + side2 + side3
        s = perimeter / 2

        totalArea = sqrt(s*(s-side1)*(s-side2)*(s-side3))
        return totalArea
    }

    override fun printDimensions() {
        println("For this $name: " +
                " Side 1's length is ${side1}," +
                " Side 2's length is ${side2}, " +
                " Side 3's length is ${side3}.")
    }

}