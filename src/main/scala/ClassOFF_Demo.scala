object ClassOFF_Demo {


  def main(args: Array[String]): Unit = {


    val stringClass = classOf[String]

    stringClass.getMethods.foreach(value => println(value))


  }

}
