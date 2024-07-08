package Generics

object Lab3 extends App{
  // Study of Invariance
  private class Stack[A]{
    private var elements: List[A] = Nil

    def push(element: A): Unit = {
      elements = element :: elements
    }

    def printStack(): Unit = {
      elements.foreach(println)
    }

  }
  class Animal
  class Dog(val temp: String) extends Animal{
    override def toString: String = temp
  }

  private val dog1 = new Dog("Lucy")
  private val dog2 = new Dog("Max")
  private val dog3 = new Dog("Jimmy")
  private val dog4 = new Dog("Jolly")

  private val stackOfDogs = new Stack[Dog]
  stackOfDogs.push(dog1)
  stackOfDogs.push(dog2)
  stackOfDogs.push(dog3)
  stackOfDogs.push(dog4)

  stackOfDogs.printStack()

}
