package arithmetic

import arithmetic.P34.Int2TotientCheck
import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks

class P34Spec extends FunSuite with TableDrivenPropertyChecks {

  val candidates = Table(
    ("m", "totient")
    , (0, 0)
    , (1, 1)
    , (2, 1)
    , (5, 4)
    , (9, 6)
    , (10, 4)
  )

  test ("Test isPrime against well known prime and non-prime numbers") {
    forAll(candidates) { (m: Int, expectedTotient: Int) =>
      assert(m.totient == expectedTotient, m.totient)
    }
  }

}
