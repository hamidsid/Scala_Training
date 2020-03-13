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
object Timer {

  def oncePerSecond(callback: () => Unit) : Unit = {

    var counter = 10

    while (counter > 0){
      callback();
      Thread sleep 1000
      counter = counter - 1
    }
  }
  /*def timeFlies(): Unit = {
    println("Time flies like an arrow")
  }
*/
  def main(args: Array[String]): Unit = {
    oncePerSecond(() => println("time flies with anonymous function"))
  }

}
