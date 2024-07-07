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

  // Triat and abstract + sealed + final
  abstract class Animal{
    def domain: String

    def kingdom: String

    def phylum: String

    def classType: String

    def order: String

    def family: String

    def genus: String

    def species: String

    def binomial: String
  }
  trait specificDetails{
    def lifeExpectancy: String

    def height: Float

    def weight: Float

    def colors: String
  }
  // need implementations
  // for example
  class LhasaApso extends Animal with specificDetails{
    override def domain: String = "Eukarya"

    override def kingdom: String = "Animalia"

    override def phylum: String = "Chordata"

    override def classType: String = "Mammalia"

    override def order: String = "Carnivora"

    override def family: String = "Canidae"

    override def genus: String = "Canis"

    override def species: String = "Canis lupus"

    override def binomial: String = "Canis lupus familiaris"

    override def lifeExpectancy: String = "12-15 years"

    override def height: Float = 28.0f // Example height in cm

    override def weight: Float = 6.5f // Example weight in kg

    override def colors: String = "Gold, white, black, brown, honey, slate, gray, brindle"
  }

  private val lhasaApso = new LhasaApso
  println(s"Binomial name: ${lhasaApso.binomial}")
  println(s"Life expectancy: ${lhasaApso.lifeExpectancy}")
  println(s"Height: ${lhasaApso.height} cm")
  println(s"Weight: ${lhasaApso.weight} kg")
  println(s"Colors: ${lhasaApso.colors}")
}
