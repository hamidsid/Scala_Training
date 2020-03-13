object Demo1{

  def main(args: Array[String]): Unit = {

    val capitals = Map("france" -> "paris", "turkey" -> "Ankara")

    println(show(capitals.get("france")))
    println(show(capitals.get("frdance")))



    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    println(a.getOrElse(0))
    println(b.getOrElse(10))


    val list: List[Any] = List(
      "string",
      'c',
      true,
      () => "an anonymous function returning a string"
    )


    val face: Char = '☺'
    val number: Int = face  // 9786
    println(number)


    list.foreach(element => println(element))


  }


  def show(x: Option[String]) = x match {
    case Some(values) => values
    case None => "Not Defined!"
  }



}
