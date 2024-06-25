package Functions

object Playground extends App{
  // creating a normal function without any parameters
  def sayHello():String =
    "Hello! This is theCoderNoob"
    // This one is without any codeblocks

  def sayHii():String = {
    "Hii! This is theCoderNoob"
    // This one is with codeblocks
  }

  def sumAB(a:Int, b:Int):Int={
    a + b
    // This one with parameters and return type is Integer
  }

  def isCorrect(a:Int, b:Int):Boolean={
    if(a > b) true else false
    // This one compares a and b integers and return Boolean value
  }

  // calling function 1:
  println(sayHello())

  // calling function 2:
  println(sayHii())

  // calling function 3:
  println(sumAB(2, 2))

  // calling function 4:
  println(isCorrect(2, 4))

  // In scala, as per my knowledge we don't use or try to avoid loops i.e: while, for, etc..
  // Therefore, in the next function we will use recursion instead of any loops in Scala.
  def printTill5(n:Int, value:Int):Unit={
    if(n > 0)
      println(value)
      printTill5(n-1, value+1)
  }
  printTill5(5, 1)
  // This is how recursion works in scala without any loops
  // I still don't know why do we try to avoid loops in scala
  // I will try to know how and why do we not use loops in scala
}
