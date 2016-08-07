package lists

import lists.P22.range
import org.scalatest.FunSuite

class P22Spec extends FunSuite {

  test("P22 - Empty range") {
    assert(Nil == range(0, -1))
  }

  test("P22 - Singleton range") {
    assert(List(3) == range(3, 3))
  }

  test("P22 - Range") {
    assert(List(3,4,5,6) == range(3, 6))
  }

}
