package Playground

// all datatypes 
object Playground extends App {
  println("Line1: Hello!This is Tejas, ready to learn Scala.")

  // In Scala val is not mutable
  // so var is..

  private val i: Int = 101
  println("This is val i: " + i)

  private val str: String = "Hello! This is Tejas and this is string"
  println("This is string: " + str)

  private val aLong: Long = 123456789101112L
  println("This is long: " + aLong)

  private val aShort: Short = 123
  println("This is short: " + aShort)

  private val aFloat: Float = 1.2
  println("This is float: " + aFloat)

  private val aDouble: Double = 1.22
  println("This is double: " + aDouble)

  private var name: String = "Tejas"
  name = "Tejas Kulkarni"
  println("var is mutable: " + name)

  private val isIt:Boolean = true
  println(isIt)

}
