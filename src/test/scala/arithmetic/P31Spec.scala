package arithmetic

import org.scalatest.FunSuite
import arithmetic.P31.Int2PrimeCheck
import org.scalatest.prop.TableDrivenPropertyChecks

class P31Spec extends FunSuite with TableDrivenPropertyChecks {

  val candidates = Table(
    ("n", "isPrime"),
    (1, true), (2, true), (3, true), (4, false), (5, true), (6, false), (7, true), (8, false), (9, false),
    (10, false), (11, true), (12, false), (13, true), (14, false), (15, false), (16, false), (17, true), (18, false), (19, true)
  )

  test ("Test isPrime against well known prime and non-prime numbers") {
    forAll(candidates) { (n: Int, expected: Boolean) => assert(n.isPrime == expected) }
  }

}
