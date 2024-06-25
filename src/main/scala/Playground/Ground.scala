package Playground

object Ground extends App {

  val notMutable: String = "This is a string"
  var yesMutable: String = "This is a string"

  yesMutable = "This will be a string"
  println(notMutable)
  println(yesMutable)

  println("Just a ground")
}
