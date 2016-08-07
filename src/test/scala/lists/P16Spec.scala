package lists

import lists.P16.drop
import org.scalatest.FunSuite

class P16Spec extends FunSuite {

  test("P16 - Drop an element from an empty list") {
    intercept[NoSuchElementException] {
      drop(0, Nil)
    }
  }

  test("P16 - Drop the only element of a singleton list") {
    assert(drop(0, List(1)).isEmpty)
  }

  test("P16 - Drop an arbitrary element") {
    assert(List(0,1,2,4,5) == drop(3, List(0,1,2,3,4,5)))
  }

}
