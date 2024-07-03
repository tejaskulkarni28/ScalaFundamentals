package Revision

object PlaywithRecursion extends App {
  // 1. Using methods
//  private def _printTill10(n: Int): Int = {
//    println(n)
//    if(n < 10) _printTill10(n + 1)
//    else n
//  }
//  _printTill10(0)

  // stack overflow factorial non-tail recursive
  private def _printFactorial(n: BigInt): BigInt = {
    if(n == 1) n
    else n * _printFactorial(n-1)
  }
  println(_printFactorial(4))

  // tail recursive
//  private def _printTailFactorial(n: BigInt): BigInt = {
//    def factoryHelper(n: BigInt, a: BigInt): BigInt = {
//      if(n == 0){
//        a
//      }else{
//        factoryHelper(n-1, n*a)
//      }
//    }
//    factoryHelper(n, 1)
//  }
//  println(_printTailFactorial(20000))


}

