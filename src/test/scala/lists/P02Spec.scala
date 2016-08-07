package lists

import P02.penultimate
import org.scalatest.FunSuite

class P02Spec extends FunSuite {

  test("P02 - Last but one element of an empty list") {
    intercept[NoSuchElementException] {
      penultimate(Nil)
    }
  }

  test("P02 - Last but one element of a singleton list") {
    intercept[NoSuchElementException] {
      penultimate(List(1))
    }
  }

  test("P02 - Last but one element of a two-length list") {
    assert("foo" == penultimate(List("foo", "bar")))
  }

  test("P02 - Last but one element of a generic list") {
    assert(4 == penultimate(List(1, 2, 3, 4, 5)))
  }

}