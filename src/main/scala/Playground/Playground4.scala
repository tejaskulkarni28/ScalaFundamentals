package Playground

object Playground4 extends App{
  // create a function name: DefaultArgs
  // after that I will test around the code how exactly does the default args works and which doesn't
  private def DefaultArgs(name: String, age: Int, lastname: String):Unit={
    println(name + " " + age + " " + " " + lastname)
  }
  DefaultArgs(age = 22, name = "Tejas", lastname = "Kulkarni")
}
