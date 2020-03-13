object SalaryRaiser {

  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  def smallPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * salary)


  def main(args: Array[String]): Unit = {

    val salaries = List(2300.5, 1700, 1000,2000)

    val raisedSalaries = SalaryRaiser.hugePromotion(salaries)

    raisedSalaries.foreach(salary => println(salary))

  }
}