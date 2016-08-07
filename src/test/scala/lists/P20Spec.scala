package lists

import lists.P20.removeAt
import org.scalatest.FunSuite

class P20Spec extends FunSuite {

  test("P20 - Remove from an empty list") {
    intercept[NoSuchElementException] {
      removeAt(9, Nil)
    }
  }

  test("P20 - Remove from a singleton list") {
    assert((Nil, 1) == removeAt(0, List(1)))
  }

  test("P20 - Remove from a list") {
    assert((List("a", "b", "c", "e"), "d") == removeAt(3, List("a", "b", "c", "d", "e")))
  }

}
