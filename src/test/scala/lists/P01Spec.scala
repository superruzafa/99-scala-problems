package lists

import P01.last
import org.scalatest.FunSuite

class P01Spec extends FunSuite {

  test("P01 - Last element of an empty list") {
    intercept[NoSuchElementException] {
      last(Nil)
    }
  }

  test("P01 - Last element of a singleton list") {
    assert("foo" == last(List("foo")))
  }

  test("P01 - Last element of a generic list") {
    assert("baz" == last(List("foo", "bar", "baz")))
  }

}
