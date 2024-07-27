package TypeBound

object Lab1 extends App {
  class Animal
  class Pet extends Animal
  class Wild extends Animal

  class Dog extends Pet
  class Cat extends Pet

  class Lion extends Wild
  class Tiger extends Wild


  class PetContainer[+A <: Pet]
  // extends Pet -> `If we do this then it will allow us Lion to be in the pet container
  // so the lower-type bound restricts us to do that which will be helpful in writing good code

  class WildContainer[+A] extends Wild

  val dog: PetContainer[Dog] = PetContainer[Dog]
  val cat: PetContainer[Cat] = PetContainer[Cat]
  //  val lion: PetContainer[Lion] = PetContainer[Lion] if uncomment the code then it will show us the error
}


