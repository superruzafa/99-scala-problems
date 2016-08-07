package lists

import org.scalatest.FunSuite
import P09.pack

class P09Spec extends FunSuite {

  test("P09 - Pack an empty list") {
    assert(Nil == pack(Nil))
  }

  test("P09 - Pack an already compressedlist") {
    assert(List(List(1),List(2),List(3),List(4),List(5)) == pack(List(1,2,3,4,5)))
  }

  test("P09 - Compress a list") {
    assert(List(List(1,1,1), List(2,2), List(3)) == pack(List(1,1,1,2,2,3)))
  }

}
