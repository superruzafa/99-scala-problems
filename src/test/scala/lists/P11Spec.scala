package lists

import lists.P11.encodedModified
import org.scalatest.FunSuite

class P11Spec extends FunSuite {

  test("P11 - Encode an empty list") {
    assert(Nil == encodedModified(Nil))
  }

  test("P10 - Encode an list without duplicates") {
    assert(List(1,2,3) == encodedModified(List(1,2,3)))
  }

  test("P10 - Encode an list without consecutive duplicates") {
    assert(List(1,2,1) == encodedModified(List(1,2,1)))
  }

  test("P10 - Encode list") {
    assert(List((3,1), (2,2),3) == encodedModified(List(1,1,1,2,2,3)))
  }

}
