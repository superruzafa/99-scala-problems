package lists

import lists.P26.combinations
import org.scalatest.FunSuite

class P26Spec extends FunSuite {

  test("P26 - Combinations of an empty list") {
    assert(Nil == combinations(10, Nil))
  }

  test("P26 - Combinations a singleton list") {
    assert(List(List("x")) == combinations(1, List("x")))
    assert(Nil == combinations(2, List("x")))
  }

  test("P25 - Combinations a list") {
    val l = List("a", "b", "c", "d", "e")
    val combs = combinations(3, l)
    println(combs)
    assert(combs forall { _.length == 3 })
    assert(combs forall { _.forall { l.contains }})
  }

}
