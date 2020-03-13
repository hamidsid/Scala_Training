class Reference[T] {

  private var contents: T = _

  def set(value: T) {
    contents = value
  }

  def get: T = contents

}

object IntegerReference {
  def main(args: Array[String]): Unit = {
    val cell = new Reference[Int]
    cell.set(13)
    println(cell.get)
  }
}


