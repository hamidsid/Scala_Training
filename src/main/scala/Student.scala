/*
 *  Created : 2020-03-09
 *
 *  Copyright (c) 2020 Ericsson AB, Sweden.
 *  All rights reserved.
 *  The Copyright to the computer program(s) herein is the property of Ericsson AB, Sweden.
 *  The program(s) may be used and/or copied with the written permission from Ericsson AB
 *  or in accordance with the terms and conditions stipulated in the agreement/contract
 *  under which the program(s) have been supplied.
 */

/**
 * @author ehdmisa
 */
class Student(srollNo:Int, sname: String, sPercentage: Int) {

  var rollNo: Int = srollNo
  var name: String = sname
  var percentage: Int = sPercentage

  //Class methods…


  def printResult() {
    print("Roll number : " + rollNo);
    print("\nName  : " + name);
    print("\nHas scored " + percentage + "% and is ");
    if (percentage > 50)
      print("passed")
    else
      print("failed")
  }
}

object Demo extends App{

  var student1 = new Student(234, "Alex", 46)
  student1.printResult()

}
