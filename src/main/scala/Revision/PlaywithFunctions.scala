package Revision

object PlaywithFunctions extends App {
  // pure function: takes input and returns output, no silly process
  // below function can be called the anonymous function
  private val add = (a:Int, b: Int) => a + b
  println(add(2, 2))

  private val subtract = (a: Int, b: Int) => a - b
  println(subtract(4, 3))

  private val multiply = (a: Int, b : Int) => a * b
  println(multiply(2, 2))
}
