package Playground

object Playground5 extends App {
  // List
  // List are immutable, you can create a new list adding new elements
  private val list1 = List(1,2,3,4,5)

  // basic operations on list
  // 1> Accessing elements in the list
  private val firstElement = list1.head
  private val secondElement = list1(1)
  private val lastElement = list1.tail

  println(s"$firstElement,  $secondElement, $lastElement")

  // 2> Adding new elements in the list
  private val updatedList1 = 0 :: list1
  println(list1)
  println(updatedList1)

  // 3> Adding new elements in the list but at last
  private val updatedList1dot2 = updatedList1 :+ 6
  println(updatedList1dot2)

  // !!!NOTE: JUST SAW THAT IF ELEMENT NEED TO BE ADDED AT SOMEWHERE BETWEEN THEN
  // NEED TO SPLIT TILL THAT PARTICULAR POINT AND THEN ADD THE ELEMENT AND REASSEMBLE THE LIST
  // :<-|(  HAHA

}
