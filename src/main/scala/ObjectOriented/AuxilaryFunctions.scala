package ObjectOriented

import scala.annotation.targetName

object AuxiliaryFunctions extends App {
  private val object1 = Details("Amey", "Satwe", 24)
  object1.print()
  
  private val object2 = Details("Tejas")
  object2.print()
  
  private val object3 = Details(20)
  object3.print()
  
  private val object4 = Details()
}

class Details(var firstname: String, var lastname: String, var age: Int){
  def this(firstname:String) = {
    this(firstname, "Kulkarni", 22)
  }
  def this(age: Int)={
    this("Shweta", "Satwe", age)
  }
  // This will cause error
  //  @targetName("lastname")
  //  def this(lastname: String) = {
  //    this("Kalayni", lastname, 23)
  //  }
  def print():Unit={
    println(s"My firstname is $firstname and lastname is $lastname. And my age is $age")
  }
}
