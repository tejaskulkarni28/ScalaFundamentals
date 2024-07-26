object Trait extends App {
  trait employees{
    def name: String
    def isEmployee: Boolean = true
  }
  trait t{}
  trait p{}
  trait c{}
  class salary extends employees with t with p with c{
    override def name: String = "John"
    override def isEmployee: Boolean = super.isEmployee
  }
}
