package lists

import org.scalatest.FunSuite
import P07.flatten

class P07Spec extends FunSuite {

  test("P07 - Flatten an empty list") {
    assert(Nil == flatten(Nil))
  }

  test("P07 - Flatten an already flat list") {
    assert(List(1, 2, 3) == flatten(List(1, 2, 3)))
  }

  test("P07 - Flatten a nested list") {
    assert(List(1, 2, 3, 4, 5, 6, 7, 8) == flatten(List(1, List(2, 3), 4, List(List(5), List(6, 7)), 8)))
  }

}
