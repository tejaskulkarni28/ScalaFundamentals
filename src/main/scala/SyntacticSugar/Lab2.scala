package SyntacticSugar

object Lab2 extends App {
  /*
    Infix notations
   */
  private class Person(val name: String){
    def hangOutWith(name: String): Unit = println(s"$this.name is hanging with $name")
  }
  private val Tejas = new Person("Tejas")
  private val Harish = new Person("Harish")

  Tejas.hangOutWith("Shreyash")
  Tejas hangOutWith "Shreyash" // Infix notation

  Harish.hangOutWith("Nachiket")
  Harish hangOutWith "Nachiket" // Infix notation

}
