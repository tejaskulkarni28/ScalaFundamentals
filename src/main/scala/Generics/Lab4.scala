package Generics

object Lab4 extends App {
  // Invariance in generics with another example
  // Badminton new players list of stack
  private abstract class Badminton
  private class Player(val name: String) extends Badminton{
    override def toString: String = name
  }

  class Stack[A]{
    private var names: List[A] = Nil

    // new name for that particular instance of return type A
    def push(name: A): Unit = {
      names = name :: names
    }
    def peek(): Unit = {
      names.foreach(println)
    }
  }

  // players and Instance of particular
  private val player1 = new Player("Tejas")
  private val player2 = new Player("Sachin")
  private val player3 = new Player("Saloni")
  private val player4 = new Player("Rahul")

  // instance of Stack
  private val listOfStacks = new Stack[Player]
  listOfStacks.push(player1)
  listOfStacks.push(player2)
  listOfStacks.push(player3)
  listOfStacks.push(player4)

  // print the new players
  listOfStacks.peek()
}
