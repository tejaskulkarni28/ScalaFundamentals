package Functions

object CBNandCBV extends App {
  def callByValue(n: Int):Int = {
    n
  }
  def callByName(n: => Int):Int = {
    n
  }
  // difference between call by value and call by name in scala
  println(callByValue(5)) // Argument is evaluated first
  println(callByName(5)) // Argument is evaluated till it comes in the method `Syntax: :=>`
}
