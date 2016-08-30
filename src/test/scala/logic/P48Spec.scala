package logic

import logic.P48._
import org.scalatest.FunSuite

class P48Spec extends FunSuite {

  test("Gray 1") {
    assert(gray(1) == Seq("0", "1"))
  }

  test("Gray 2") {
    assert(gray(2) == Seq("00", "01", "11", "10"))
  }

  test("Gray 3") {
    assert(gray(3) == Seq("000", "001", "011", "010", "110", "111", "101", "100"))
  }

}
