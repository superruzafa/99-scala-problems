package arithmetic

import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks
import P32.gcd

class P32Spec extends FunSuite with TableDrivenPropertyChecks {

  val candidates = Table(
    ("a", "b", "expectedGcd")
    , (0, 0, 0)
    , (1, 0, 1)
    , (1, 2, 1)
    , (4, 2, 2)
    , (25, 25, 25)
    , (25, 5, 5)
  )

  test ("Test isPrime against well known prime and non-prime numbers") {
    forAll(candidates) { (a: Int, b: Int, expectedGcd: Int) =>
      assert(gcd(a, b) == expectedGcd)
      assert(gcd(b, a) == expectedGcd)
    }
  }

}
