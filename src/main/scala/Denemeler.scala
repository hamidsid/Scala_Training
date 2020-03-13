object Denemeler {

  val ids: scala.Iterator[String] = Iterator("12314", "1234", "1234")


  ids.map { oneId => oneId == "1234"}.foreach(result => println(result))


  for (i <- 1 to 10) {
    val thread = new Thread {
      override def run {
      println("inside thread")
      }
    }
    thread.start
    Thread.sleep(1000) // slow the loop down a bit
  }

  def main(args: Array[String]): Unit = {

  }
}
