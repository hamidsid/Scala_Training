object HigherOrderFunctions {


  def main(args: Array[String]): Unit = {
    myFunc(25, multiplyBy2)

    val salaries = Seq(3322,"dfadfk", 3454)
    val newSalaries = salaries.map(x => println(x))
    newSalaries



  }

  def multiplyBy2(a:Int) = {
    a * 2
  }

  def myFunc(a: Int, f: Int => AnyVal)= {
    println(f(a))
  }


}
