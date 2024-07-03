package ObjectOriented

object Objects extends App {
  private object Tank{
   val size:Int = 30
  }
  private object Fish{
    val typeof: String = "Beta"
  }
  private val forFlowerHorn = Tank
  println(forFlowerHorn.size)
  private val forGoldenFish = Tank
  println(forGoldenFish.size)

  println(forFlowerHorn == forGoldenFish)

  private val forFish = Fish
  println(forFish.typeof)

  class Test{
    val a: Int = 2
  }
  private val objectOfTest = Test()
  println(objectOfTest.a)

  private val objectOfTest2 = Test()
  println(objectOfTest == objectOfTest2) // will be false because of the class instance which are not the same as the
  // objects in scala


  private object NoteBook{
    val brand: String = "Classmate"
  }
  private val notebookForTejas = NoteBook
  println(notebookForTejas.brand)
  private val notebookForShreyash = NoteBook
  println(notebookForTejas == notebookForShreyash)


  // trying to compare the instances of the class instance if it is one or not
  private class NoteBook{
    val owner: String = "John"
  }
  private val objectOfNoteBook  = NoteBook()
  private val objectOfNoteBook2 = NoteBook()
  println(objectOfNoteBook == objectOfNoteBook2)
  // here it will print false... because one class can have multiple instances

}
