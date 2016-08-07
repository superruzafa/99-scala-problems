package lists

import lists.P12.decode
import org.scalatest.FunSuite

class P12Spec extends FunSuite {

  test("P12 - Decode an empty list") {
    assert(Nil == decode(Nil))
  }

  test("P12 - Decode a list without duplicates") {
    assert(List(1,2,3) == decode(List((1, 1), (1, 2), (1, 3))))
  }

  test("P12 - Decode an list with non-consecutive duplicates") {
    assert(List(1,2,1) == decode(List((1,1),(1,2),(1,1))))
  }

  test("P12 - Decode an list with consecutive duplicates") {
    assert(List(1, 1, 1, 2, 2, 3) == decode(List((3, 1), (2, 2), (1, 3))))
  }

}
