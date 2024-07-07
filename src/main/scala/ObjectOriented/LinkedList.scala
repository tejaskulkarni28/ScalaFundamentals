package ObjectOriented

object LinkedList extends App {
  sealed trait LinkedList[+A]

  case object Empty extends LinkedList[Nothing]

  case class Node[+A](value: A, next: LinkedList[A]) extends LinkedList[A]
}
