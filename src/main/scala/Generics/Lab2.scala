package Generics

object Lab2 extends App {
  // Animal
  // Cat is the subtype of class Animal
  // Dog is the subtype of class Animal
  abstract class Animal{
    def returnName(name: String): String
  }
  class Cat extends Animal {
    override def returnName(name: String): String = name
  }
  class Dog extends Animal{
    override def returnName(name: String): String = name
  }

  private val instanceOfCat = new Cat()
  println(instanceOfCat.returnName("Mani mau"))

  private val instanceOfDog = new Dog()
  println(instanceOfDog.returnName("Kalu"))

  // covariance
  class Box[+A]{
    def returnType(typeOf: String): String = {
      println(typeOf)
      typeOf
    }
  }
  val listOfCats: Box[Cat] = new Box[Cat] // instance: box of cat
  val listOfDogs: Box[Dog] = new Box[Dog] // instance: box of dog
  private val BoxTypeOfCat:Box[Animal] = listOfCats
  private val BoxTypeOfDog:Box[Animal] = listOfDogs
  BoxTypeOfCat.returnType("Cats")
  BoxTypeOfDog.returnType("Dogs")


}
