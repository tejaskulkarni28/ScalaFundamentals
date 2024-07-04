package ObjectOriented

object CaseClassTest extends App {
  case class Test(a: Int, b: String)

  private val output = Test(101, "Test")
  println(output.a + " " + output.b)

  private var output2 = Test(102, "Test")
//  output2.a = 103 // This line will not compile

  case class Test2(a: String, b: String)
  private val instanceOfCaseClass = Test2("B", "C")
  println(instanceOfCaseClass)


}