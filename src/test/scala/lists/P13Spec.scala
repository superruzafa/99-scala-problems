package lists

import org.scalatest.FunSuite
import P13.encode

class P13Spec extends FunSuite {

  test("P13 - Encode an empty list") {
    assert(Nil == encode(Nil))
  }

  test("P13 - Encode an list without duplicates") {
    assert(List((1,1), (1,2), (1,3)) == encode(List(1,2,3)))
  }

  test("P13 - Encode an list without consecutive duplicates") {
    assert(List((1,1), (1,2), (1,1)) == encode(List(1,2,1)))
  }

  test("P13 - Encode list") {
    assert(List((3,1), (2,2), (1,3)) == encode(List(1,1,1,2,2,3)))
  }

}
