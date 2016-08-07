package lists

import lists.P18.slice
import org.scalatest.FunSuite

class P18Spec extends FunSuite {

  test("P18 - Slice an empty list") {
    assert(Nil == slice(0, 1, Nil))
  }

  test("P18 - Slice a singleton list") {
    assert(List(1) == slice(0, 1, List(1)))
  }

  test("P18 - Slice a list") {
    assert(List(3,4,5) == slice(2, 5, List(1,2,3,4,5,6)))
  }

}
