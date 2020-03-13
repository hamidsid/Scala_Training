import scala.util.Random

object PatternMatching {


  val x: Int = Random.nextInt(3)

  def show(n: Int) = n match {

    case 0 => "zero"
    case 1 => "one"
    case _ => "other"

  }


  def main(args: Array[String]): Unit = {

    val num = PatternMatching.x

    println(num)

    println(show(num))

  }
}
