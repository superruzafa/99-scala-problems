package lists

import lists.P23.randomSelect
import org.scalatest.FunSuite

class P23Spec extends FunSuite {

  test("P23 - Random select from an empty list") {
    assert(Nil == randomSelect(0, Nil))
    assert(Nil == randomSelect(3, Nil))
  }

  test("P23 - No select from a singleton list") {
    assert(Nil == randomSelect(0, List("a")))
  }

  test("P23 - Random select from a singleton list") {
    assert(List("a") == randomSelect(1, List("a")))
    assert(List("a") == randomSelect(3, List("a")))
  }

  test("P23 - Random select from a list") {
    val xs: List[String] = List("a", "b", "c", "d", "e")
    val l = randomSelect(3, xs)
    assert(l.length == 3)
    assert(l forall xs.contains )
  }

}
