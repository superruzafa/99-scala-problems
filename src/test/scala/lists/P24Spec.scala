package lists

import lists.P24.lotto
import org.scalatest.FunSuite

class P24Spec extends FunSuite {

  test("P24 - Lotto from empty interval") {
    assert(Nil == lotto(5, 0))
  }

  test("P24 - Lotto with no count") {
    assert(Nil == lotto(0, 1000))
  }

  test("P24 - Extract all balls") {
    assert(List(1,2,3,4,5) == lotto(5, 5).sorted)
  }

  test("P24 - Real lotto") {
    assert(lotto(3, 10).length == 3)
  }

}
