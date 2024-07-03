package ObjectOriented

object Companions extends App {
  object Friend{
    val name: String = "Shanatanu"
  }
  class Friend{
    val name: String = "Shrinand"
  }
  private val objectFriend = Friend
  private val classObjectFriend = Friend()

  println(objectFriend == classObjectFriend)

  // because object in scala is a single-ton which means it has only one instance
  // and these below variables are pointing towards the same instance not as class instance variablesg
  private val objectFriend1 = Friend
  println(objectFriend1 == objectFriend)
}
