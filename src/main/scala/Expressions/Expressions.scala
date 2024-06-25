package Expressions
// What is the difference between instructions and expressions in Scala?
// -> Instructions means do something
// -> Expressions means give me the value of something

object Expressions extends App {
  val x = 1 + 2 // Expression
  println(x)

  println(1 + 2 * 2)

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  //  will not compile because of type int and val due to its immutability behaviour
  //  val bVariable = 2
  //  bVariable += 3
  //  println(bVariable)

  // If expression
  val aCondition = false
  val aConditionValue = if(aCondition) 10 else 15 // If expression
  println(aConditionValue)

  // Revision
  val bCondition = true
  val bConditionValue = if(bCondition) 100 else 150 // If expression
  println(bConditionValue)

  // While loop which should not be used in Scala and as of now I don't now why
  // Just for practice purpose
  //  var i:Int = 0
  //  while(i<10){
  //    println(i)
  //    i += 1
  //  }


  // Code block in Scala
  val aCodeBlock = {
    val xCodeBlock = 2
    val yCodeBlock = 3
    if(xCodeBlock < yCodeBlock) "X is Small" else "Y is Large"
  }
  println(aCodeBlock) //here return type is string
  //  println(xCodeBlock)
  // here xCodeBlock value can't be used outside the curly brackets
  // because of its scope not available outside its block means the curly brackets

}
