package Playground

object Playground2 extends App{
  val firstName: String = "Tejas"
  val lastName: String = "Kulkarni"
  val designation: String = "Scala Developer"
  val joiningDate: String = "01/01/2001"

  println("Welcome " + firstName + " " + lastName + " as our new joiner, who had joined on " + joiningDate + " as a " + designation + ". ")

  // with interpolator `s`
  println(s"Welcome $firstName $lastName as our new joiner, who had joined on $joiningDate as a $designation.")
}
