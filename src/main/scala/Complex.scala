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
class Complex(real: Double, imaginary: Double) {

  def re: Double = real
  def im: Double = imaginary

    override def toString() =
    "" + re + (if (im >= 0) "+" else "") + im + "i"
}

object ComplexNumbers {
  def main(args: Array[String]): Unit = {
    var c = new Complex(3.5, 7.2)
    println(c)

    c = new Complex(4, -2)
    println(c)
  }


}
