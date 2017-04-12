package app
import scala.meta._
object App {
  def main(args: Array[String]): Unit = {
    val lst = List(
      Lit(1),
      Lit('a),
      Lit("a")
    )
    println(lst)
  }
}
