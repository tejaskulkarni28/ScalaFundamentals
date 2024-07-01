package Revision

// also called auxiliary functions
object MultipleConstructors extends App {
  // instance of class Student
  private val _sincereStudent = Student("Shantanu Sarraf", 15, 106222181)
  _sincereStudent.display()

  private val _aGoodStudent = Student("Tejas Kulkarni", 1062221971)
  _aGoodStudent.display()

  private val _aBitSincereStudent = Student("Shrinand Kulkarni", 28)
  _aBitSincereStudent.display()

  private val _notABitSincereStudent = Student("Paras Nemade")
  _notABitSincereStudent.display()
}




class Student(name: String, roll: Int, prn: BigInt){
  // multiple constructors
  def this(name: String)={
    this(name, 5, 1062221874)
  }

  def this(name: String, roll: Int)={
    this(name, roll, 1062221984)
  }

  def this(name: String, prn: BigInt)={
    this(name, 22, prn)
  }

  // display the details of student
  def display():Unit={
    println(s"Student details are $name, $roll, $prn")
  }
}
