package Functions

object RecursivePractice2 extends App {
  def practice(a: Int, b: Int): String = {
    if(a != b) "Good" else "Not Good"
  }
  println(practice(5, 10))
}
