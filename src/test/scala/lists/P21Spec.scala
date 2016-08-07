package lists

import lists.P21.insertAt
import org.scalatest.FunSuite

class P21Spec extends FunSuite {

  test("P21 - Insert in an empty list") {
    assert(List("a") == insertAt("a", 0, Nil))
    assert(List("a") == insertAt("a", 1, Nil))
    assert(List("a") == insertAt("a", 99, Nil))
  }

  test("P21 - Insert in an non-empty list") {
    assert(List("a","b","c") == insertAt("b", 1, List("a","c")))
  }

}
