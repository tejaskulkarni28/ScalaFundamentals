package Anonymous

object Lab2 extends App {
  trait Man{
    def name(name: String): String
    def wantsToPee(): Unit
  }
  private val Shreyash: Man = new Man{
    var store: String = ""
    override def name(name: String): String = {
      store = name
      store
    }
    override def wantsToPee(): Unit = {
      println(s"$store wants to pee in the toilet")
    }
  }
  Shreyash.name("Shreyash")
  Shreyash.wantsToPee()

}
