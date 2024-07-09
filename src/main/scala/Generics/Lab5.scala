package Generics

object Lab5 extends App {
  class Stack[A]{
    private var books: List[A] = Nil
    def push(book: A): Unit = {
      books = books :+ book
    }
    def list(): Unit = {
      books.foreach(println)
    }
  }
  private abstract class Books
  private class Book(name: String) extends Books{
    override def toString: String = this.name
  }

  private val book1 = new Book("Saul Goodman")
  private val book2 = new Book("Don't Give a ..")
  private val book3 = new Book("Chanakya In You")

  private val stackOfBooks: Stack[Book] = Stack[Book]
  stackOfBooks.push(book1)
  stackOfBooks.push(book2)
  stackOfBooks.push(book3)

  stackOfBooks.list()



}
