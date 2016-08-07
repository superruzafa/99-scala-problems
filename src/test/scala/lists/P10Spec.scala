package lists

import org.scalatest.FunSuite
import P10.encode

class P10Spec extends FunSuite {

  test("P10 - Encode an empty list") {
    assert(Nil == encode(Nil))
  }

  test("P10 - Encode an list without duplicates") {
    assert(List((1,1), (1,2), (1,3)) == encode(List(1,2,3)))
  }

  test("P10 - Encode an list without consecutive duplicates") {
    assert(List((1,1), (1,2), (1,1)) == encode(List(1,2,1)))
  }

  test("P10 - Encode list") {
    assert(List((3,1), (2,2), (1,3)) == encode(List(1,1,1,2,2,3)))
  }

}
