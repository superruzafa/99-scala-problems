package lists

import lists.P14.duplicate
import org.scalatest.FunSuite

class P14Spec extends FunSuite {

  test("P14 - Duplicate an empty list") {
    assert(Nil == duplicate(Nil))
  }

  test("P14 - Duplicate an singleton list") {
    assert(List(1,1) == duplicate(List(1)))
  }

  test("P14 - Duplicate a generic list") {
    assert(List(false,false,1,1,"a","a") == duplicate(List(false,1,"a")))
  }

}
