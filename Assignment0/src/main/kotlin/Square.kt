import java.util.Scanner
class Square(_name:String) : Shape(_name) {
    private val reader = Scanner(System.`in`)

    private var length: Double = 0.0
    private var width: Double = 0.0
    private var area: Double =0.0

    override fun setDimensions() {
        print("Enter the length for the $name: ")
        this.length = reader.nextDouble()
        print("Enter the width for the $name: ")
        this.width = reader.nextDouble()

        this.area = getArea()
    }

    override fun getArea(): Double {
        var totalArea: Double = 0.0

        totalArea = this.length * this.width
        return totalArea
    }
    override fun printDimensions() {
        println("For this $name: the length is ${this.length} and the width is ${this.width}")
    }


}