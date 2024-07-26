package Anonymous

object Lab3 extends App {
  // anonymous functions (Lambdas)
  class Person{
    def name: String = "John"
  }

  private val openingCan = (opener: String, person: Person) => {
    true
  }

  private val person = new Person()
  println(openingCan("Opener", person))
}
