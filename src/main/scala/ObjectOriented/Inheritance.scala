package ObjectOriented

object Inheritance extends App {
  // This code is purely object oriented even I thought for a second that it is a fP style :(
  class Vehicle{
    def model(name: String): String = name
    def version(name: String): String = name
    def value(value: BigInt): BigInt = value
  }
  class Honda extends Vehicle{
    def printDetails():Unit={
      println(model("Amaze") + " " + version("2015") + " " + value(900000))
    }
  }
  class Maruti extends Vehicle{
    def printDetails(): Unit={
      println(model("Celerio") + " " + version("2014") + " " + value(600000))
    }
  }

  // creating an instance of class Honda
  private val instanceOfHonda = Honda()
  instanceOfHonda.printDetails()

  private val instanceOfMaruti = Maruti()
  instanceOfMaruti.printDetails()
}
