package Functions

import scala.annotation.tailrec

object RecursivePractice2 extends App {
  @tailrec
  private def concatenateString(n: Int, str: String, str1: String): String = {
    if(n <= 0) str1
    else concatenateString(n - 1, str, str + str1);
  }
  println(concatenateString(3, "AB", ""))
}
