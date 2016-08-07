package lists

import org.scalatest.FunSuite
import P04.length

class P04Spec extends FunSuite {

  test("P04 - Length of an empty list") {
    assert(0 == length(Nil))
  }

  test("P04 - Length of a singleton list") {
    assert(1 == length(List(1)))
  }

  test("P04 - Length of a generic list") {
    assert(6 == length(List(1, 2, 3, 4, 5, 6)))
  }

}
