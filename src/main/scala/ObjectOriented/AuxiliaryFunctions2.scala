package ObjectOriented

object AuxiliaryFunctions2 extends App {
 class AuxiliaryFunctions2(arg1: String, arg2: String){
   // cause for double definition
   def this(arg1: String) = this(arg1, "Argument 2")
   def this(arg2: String)(temp: Int) = this("Argument 1", arg2)
 }
 val instance1OfAuxilaryClass = AuxiliaryFunctions2("a1")(2)
}
