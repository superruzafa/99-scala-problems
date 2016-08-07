package lists

import lists.P17.split
import org.scalatest.FunSuite

class P17Spec extends FunSuite {

  test("P17 - Split an empty list") {
    assert((Nil, Nil) == split(0, Nil))
  }

  test("P17 - Split a singleton list in pos 0") {
    assert((Nil, List(1)) == split(0, List(1)))
  }

  test("P17 - Split a singleton list in pos 1") {
    assert((List(1), Nil) == split(1, List(1)))
  }

  test("P17 - Split a list beyond the list length") {
    assert((List(1,2,3), Nil) == split(99, List(1,2,3)))
  }

  test("P17 - Split a list") {
    assert((List(1,2,3), List(4,5,6)) == split(3, List(1,2,3,4,5,6)))
  }

}
