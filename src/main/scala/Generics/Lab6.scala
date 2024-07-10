package Generics

object Lab6 extends App {
  // Contravariance example in scala
  // let's study variance 3rd type that is contravariant
  private class Payment{}
  private class Credit extends Payment{}
  private class Debit extends Payment{}

  private class Process[-T <: Payment](){}
  private val paymentProcess: Process[Payment] = Process[Payment]

  private val creditProcess: Process[Credit] = paymentProcess
  private val debitProcess: Process[Debit] = paymentProcess

  // Above example is written by me `Tejas Kulkarni`
  // just for getting clarity :)
}
