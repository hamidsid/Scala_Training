class Point {

  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x = _x
  def y = _y

  def x_=(newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning
  }



  def y_=(newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning
  }

  private def printWarning = println("Warning: Out of Bound")

}


object PointDemo {

  def main(args: Array[String]): Unit = {

    val point = new Point
    point.y = 33
    point.x = 19
  }
}
