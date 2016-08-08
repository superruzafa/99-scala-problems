package lists

import lists.P25.randomPermute
import org.scalatest.FunSuite

class P25Spec extends FunSuite {

  test("P25 - Permute an empty list") {
    assert(Nil == randomPermute(Nil))
  }

  test("P25 - Permute a singleton list") {
    assert(List("x") == randomPermute(List("x")))
  }

  test("P25 - Permute a list") {
    val l = List("a", "b", "c", "d", "e")
    val r = randomPermute(l)
    assert(l.length == r.length)
    assert(l forall r.contains)
  }

}
