object ForComp extends App {


/*    val countries = List("china", "india", "sweden")

    val result = for (country <- countries) yield {

      country match {
        case "india" => "delhi"
        case "china" => "bejing"
        case "sweden" => "stockholm"
        case _ => "not the country in the list"
      }
    }

  for {
    i <- 1 to 3
    j <- 1 to 2
    k <- 10 to 12; if (k % 2 == 0)
  } println(i + " " + j + " " + k )

  println(result.foreach(value => println(value)))*/
  //
  //  def doubler(i : Int) : Int = { i * 2}
  //
  //  val d = doubler(_)
  //
  //  println(d(5))
  //
  //
  //  val i = 1 to 10
  //
  //
  //  i.map(d).foreach(value => println(value))

 /* def getOps(c: Int) = (i: Int) => {

    if (c > 0) { i * 2}
    else i * 3
  }

  val range = 1 to 5
  range.map(getOps(3)).foreach(value => println(value))*/

 /* val costumers = Array("mike","veli","ali")
  def reminderPayment(x :String) = println("Payment reminder for " + x)

  costumers foreach reminderPayment*/

  val s = "Hello world"

  //val f = (x: Int) => { x + 5}
 /* val numbers = List(1,2,3,4,5)

  numbers.map((x: Int) => { x + 5}).foreach(value => println(value))*/


  val myfunc = (x: Int, s:String) => {s + x + s}

  println(myfunc(5,"-"))

}
