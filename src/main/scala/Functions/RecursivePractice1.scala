package Functions


// below The object RecursivePractice1 becomes a whole main method `when we extends the triat called App which is predefined`
// this is very useful to quickly write and execute the code without creating the separate main method.
object RecursivePractice1 extends App {
      // Question: I want a method which ony prints the even numbers from 0 to 100
      def printEvenOnly(i: Int, value: Int):Unit={
        // base condition for when to stop a loop
        if(i > 100) {
          println("Integer I exceeds 100: ")
        }
        if(i <= 100){
          if(value % 2 == 0) println(value)
          printEvenOnly(i+1, value+1)
        }
      }

      // Calling the printEvenOnly method
      printEvenOnly(0, 0)
}
