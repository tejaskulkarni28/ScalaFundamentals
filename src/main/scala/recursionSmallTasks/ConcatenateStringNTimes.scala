package RecursionSmallTasks

object ConcatenateStringNTimes extends App{
    def betterFunction(n: Int, string1: String, string2: String): String = {
      if (n <= 0) string2
      else betterFunction(n - 1, string1, string1 + string2)
    }
  println(betterFunction(3, "Tejas", ""))
}
