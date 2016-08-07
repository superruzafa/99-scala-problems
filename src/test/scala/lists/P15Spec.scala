package lists

import lists.P15.duplicateN
import org.scalatest.FunSuite

class P15Spec extends FunSuite {

  test("P14 - Duplicate an empty list") {
    assert(Nil == duplicateN(1, Nil))
    assert(Nil == duplicateN(2, Nil))
    assert(Nil == duplicateN(3, Nil))
  }

  test("P14 - Duplicate an singleton list") {
    assert(List(1) == duplicateN(1, List(1)))
    assert(List(1,1) == duplicateN(2, List(1)))
    assert(List(1,1,1) == duplicateN(3, List(1)))
  }

  test("P14 - Duplicate a generic list") {
    assert(List(false,1,"a") == duplicateN(1, List(false,1,"a")))
    assert(List(false,false,1,1,"a","a") == duplicateN(2, List(false,1,"a")))
    assert(List(false,false,false,1,1,1,"a","a","a") == duplicateN(3, List(false,1,"a")))
  }

}
