import org.scalatest.FunSuite

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
class CubeCalculatorTest extends FunSuite{
  test("cube 3 should be 27"){

    assert(CubeCalculator.cube(3) === 27)
  }

  test("Cube of 0"){
    assert(CubeCalculator.cube(0) === 0)
  }

}
