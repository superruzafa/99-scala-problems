package lists

import org.scalatest.FunSuite
import P05.reverse

class P05Spec extends FunSuite {

  test("P05 - Reverse an empty list") {
    assert(Nil == reverse(Nil))
  }

  test("P05 - Reverse a singleton list") {
    assert(List(1) == reverse(List(1)))
  }

  test("P05 - Reverse a generic list") {
    assert(List(3, 2, 1) == reverse(List(1, 2, 3)))
  }

}
