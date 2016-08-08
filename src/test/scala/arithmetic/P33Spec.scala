package arithmetic

import P33.Int2CoprimeCheck
import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks

class P33Spec extends FunSuite with TableDrivenPropertyChecks {

  val candidates = Table(
    ("a", "b", "isCoprime")
    , (1, 1, true)
    , (13, 5, true)
    , (13, 5, true)
    , (13, 13, false)
  )

  test ("Test isPrime against well known prime and non-prime numbers") {
    forAll(candidates) { (a: Int, b: Int, expectedIsCoprime: Boolean) =>
      assert(a.isCoprimeTo(b) == expectedIsCoprime)
      assert(b.isCoprimeTo(a) == expectedIsCoprime)
    }
  }

}
