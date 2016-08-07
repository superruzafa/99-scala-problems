package lists

import org.scalatest.FunSuite
import P03.nth

class P03Spec extends FunSuite {

  test("P03 - Nth element of an empty list") {
    intercept[NoSuchElementException] {
      nth(0, Nil)
    }
  }

  test("P03 - Out of bounds Nth element of an singleton list") {
    intercept[NoSuchElementException] {
      nth(99, List(1, 2, 3))
    }
  }

  test("P03 - Nth element of an singleton list") {
    assert(1 == nth(0, List(1, 2, 3)))
  }

}