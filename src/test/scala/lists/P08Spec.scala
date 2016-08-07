package lists

import org.scalatest.FunSuite
import P08.compress

class P08Spec extends FunSuite {

  test("P08 - Compress an empty list") {
    assert(Nil == compress(Nil))
  }

  test("P09 - Compress an already compressedlist") {
    assert(List(1, 2, 3, 4, 5) == compress(List(1, 2, 3, 4, 5)))
  }

  test("P09 - Compress a list") {
    assert(List(1, 2, 3, 4, 5) == compress(List(1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5)))
  }

}
