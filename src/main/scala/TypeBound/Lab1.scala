package TypeBound

object Lab1 extends App {
  // Bounded types
  class Animal
  class Dog extends Animal
  class Man extends Dog // just for fun not correct I know


  // upper bound example
  class MyList[A <: Animal]{}

  // lower bound example
  class Stack[A >: Dog]{}


  val instanceOfDog = new Dog()
  val instanceOfAnimal = new Animal()

  val listOfDogs:MyList[Dog] = new MyList[Dog]
  // here a -> dog and a should be the subtype of Animal which is dog
  // that means it works

  val listOfDogs1: MyList[Man] = new MyList[Man]
  // here Man means A type of List is not a subclass Of Animal
  // which means incorrect that why it is giving me the error

  // -> Let's try lower bound
  // -> In lower bound A says that A should be superclass
  // -> of Dog which means Animal is the superclass of Dog
  // -> therefore it will work fantastically
  val listOfAnimals:Stack[Animal] = Stack[Animal]


  // but let's give the Dog as a type of A which will
  // not work because as per the rule give in lower bound
  // A should be the supertype of Dog but we will give a class
  // type which is not the supertype of the class Dog
  // therefore it will not work
  val listOfStacks:Stack[Man] = Stack[Man]
  // so yess it did not worked
}

