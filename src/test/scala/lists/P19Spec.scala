package lists

import lists.P19.rotate
import org.scalatest.FunSuite

class P19Spec extends FunSuite {

  test("P19 - Rotate an empty list") {
    assert(Nil == rotate(99, Nil))
  }

  test("P19 - Rotate a singleton list") {
    assert(List(1) == rotate(9, List(1)))
  }

  test("P19 - Rotate 0 times") {
    assert(List(1,2,3,4) == rotate(0, List(1,2,3,4)))
  }

  test("P19 - Rotate 2 places to left") {
    assert(List(3,4,5,1,2) == rotate(2, List(1,2,3,4,5)))
  }

  test("P19 - Rotate 2 places to right") {
    assert(List(4,5,1,2,3) == rotate(-2, List(1,2,3,4,5)))
  }

  test("P19 - Cyclic rotation to left") {
    assert(List(1,2,3,4,5) == rotate(5, List(1,2,3,4,5)))
  }

  test("P19 - Cyclic rotation to left #2") {
    assert(List(1,2,3,4,5) == rotate(15, List(1,2,3,4,5)))
  }

  test("P19 - Cyclic rotation to right") {
    assert(List(1,2,3,4,5) == rotate(-5, List(1,2,3,4,5)))
  }

  test("P19 - Cyclic rotation to right #2") {
    assert(List(1,2,3,4,5) == rotate(-15, List(1,2,3,4,5)))
  }


}
