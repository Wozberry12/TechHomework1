import java.util.Scanner
import kotlin.math.sqrt

class EquilateralTriangle(_name:String) : Triangle(_name) {

    private val reader = Scanner(System.`in`)
    private var equalSides: Double = 0.0
    private var area:Double = 0.0

    override fun setDimensions(){
        print("For this ${this.name}, enter the length of each equal side: ")
        var equalSides:Double = reader.nextDouble()
        this.equalSides = equalSides

        this.area = getArea()
    }

    override fun getArea(): Double {
        var totalArea: Double = 0.0
        var perimeter: Double = 0.0;
        //s = 1/2 of perimeter
        var s: Double = 0.0
        perimeter = equalSides*3
        s = perimeter / 2

        totalArea = sqrt((s*(s-equalSides)*(s-equalSides)*(s-equalSides)))
        return totalArea
    }

    override fun printDimensions() {
        println("For this $name the length of each side is $equalSides.")
    }
}