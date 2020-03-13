case class WeatherForecast(temperatures: Seq[Double]) {

  private def convertCToF(temp: Double) = temp * 1.8 + 32

  def forecastToFahrenheit: Seq[Double] = temperatures.map(convertCToF)


}


object WeatherForecast {

  def main(args: Array[String]): Unit = {

    val data = Seq(23.4, 25.6, 33.6, 12.5, 0)

    val weatherData = new WeatherForecast(data)
    val result = weatherData.forecastToFahrenheit
    result.foreach(value => println(value))

  }

}
