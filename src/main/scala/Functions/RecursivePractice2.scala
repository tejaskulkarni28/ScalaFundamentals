package Functions

object RecursivePractice2 extends App {
  def concatinateString(n: Int, str: String, str1: String): String = {
    if(n <= 0) str1
    else concatinateString(n - 1, str, str + str1);
  }
  println(concatinateString(3, "AB", ""))
}
