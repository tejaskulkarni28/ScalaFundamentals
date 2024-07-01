package Revision

object PlaywithMethods extends App {
  // more common method
  private def test():Unit={
    println("Test methods")
  }
  test()

  // methods with parameter
  private def test1(a: Int, b: String):Int={
    0
  }
  println(test1(1, "B"))

  // methods with multiple parameters
  private def test2(a: Int)(b: BigInt)(c:BigInt): String = {
    "Multiple parameters method"
  }
  println(test2(1)(101)(102))

  // methods without parameters
  private def name(): Unit = println("tejas")
  name()




}

