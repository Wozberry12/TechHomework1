import java.util.Scanner
private const val PI = 3.14156
class Circle(_name:String) : Shape(_name) {

   private val reader = Scanner(System.`in`)

   private var radius: Double = 0.0
   private var area: Double = 0.0


    override fun setDimensions(){
        print("Enter the radius of the $name: ")
        this.radius = reader.nextDouble()

        this.area = getArea()
    }

    override fun getArea(): Double {
        var totalArea: Double = 0.0
        totalArea = PI * this.radius * this.radius

        return totalArea
    }
    override fun printDimensions() {
        println("For this $name the radius is: ${this.radius} with an area of ${this.area}")
    }

}