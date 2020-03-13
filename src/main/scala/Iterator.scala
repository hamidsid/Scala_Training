import scala.util.control.Breaks

trait Iterator[T] {

  def hasNext: Boolean

  def next(): T
}

class IntIterator(to: Int) extends Iterator[Int] {
  private var current = 0

  val inloop = new Breaks

  override def hasNext: Boolean = current < to

  override def next(): Int = {
    if (hasNext) {
      val t = current
      if (t <= 0) {
        println("You have reached the 0, no next item")
        return -1
      }
      current += 1
      t
    } else 0
  }
}

object IteratorDemo {

  def main(args: Array[String]): Unit = {

    val iterator = new IntIterator(1)

    println(iterator.next())
  }


}
