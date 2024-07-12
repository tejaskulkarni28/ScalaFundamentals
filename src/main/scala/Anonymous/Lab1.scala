package Anonymous

import scala.annotation.tailrec

object Lab1 extends App {
  println("Hello! Anonymous function lab1 by Tejas Kulkarni")
  class Test{
    def printTest(): Unit = {
      println("This text is from the base class")
    }

  }
  private val anon: Test = new Test{
    override def printTest():Unit={
      println("This text is from the anonymous function")
    }
  }
  anon.printTest()
}
