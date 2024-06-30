package ObjectOriented

object Tank extends App {
  // Instantiate the class
  private val tank1 = Fish(2, 22, 8, 13) // default values in constructor which should be there
  tank1.setter("Guppies", "Red-blue-white", 4)
  tank1.setter("Rice", "Yellow-white", 4)

}
// In centimeters
class Fish(waterInLiter: Int, length:Int, breadth: Int, height: Int): // default constructor contains default values which are compulsory
  def setter(typeOf: String, color: String, groupof: Int):Unit = {
    println(typeOf + " " + color + " " + groupof)
  }
end Fish

