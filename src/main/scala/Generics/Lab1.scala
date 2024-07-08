package Generics

object Lab1 extends App {
  // How to define the generics
  class Test[A]{}
  private object Test{
    def method[A]: Test[A] = ???
  }
  val instanceOfTest = Test[Int]
  val instanceOfTestObject = Test.method[Int]

  class Test2[Key, Value]{}
  private object Test2{
    def method[Key, Value]: Test2[Key, Value] = ???
  }
  val instanceOfTest2 = Test2[Int, Int]
  val instanceOfTest2OfObject = Test2.method[Int, Int]


  // covariance types:
  class CovariantList[+A]{}
  class InvarianceList[A]{}
  class ContravariantList[-A]{}

  class Animal{}
  class Cat extends Animal{}
  class Dog extends Animal{}
  // cat and dogs can be subtype of class animal

  class BoxOfAnimal[+A]{}

  // Invariance
  val listOfCats: BoxOfAnimal[Cat] = BoxOfAnimal[Cat]
  val boxOfAnimal: BoxOfAnimal[Animal] = listOfCats  
//  `You try to assign listOfCats (which is of type BoxOfAnimal[Cat]) to boxOfAnimal (which is of type BoxOfAnimal[Animal]).
//  Since BoxOfAnimal is invariant, BoxOfAnimal[Cat] is not considered a subtype of BoxOfAnimal[Animal].
//  This results in a type mismatch error, and the assignment is not allowed`
 
// `Covariance`
  class Vegetable
  class Potato extends Vegetable 
  class BoxOfVegetables[+A]{}
  val potatoes: BoxOfVegetables[Potato] = BoxOfVegetables[Potato]
  val boxOfPotatoes: BoxOfVegetables[Vegetable] = potatoes
  

}
