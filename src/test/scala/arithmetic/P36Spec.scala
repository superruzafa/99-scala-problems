package arithmetic

import arithmetic.P36.Int2PrimeFactorMultiplicityFinder
import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks

class P36Spec extends FunSuite with TableDrivenPropertyChecks {

  val candidates = Table(
    ("n", "Prime factors")
    , (1, List())
    , (2, List((2,1)))
    , (3, List((3,1)))
    , (4, List((2,2)))
    , (5, List((5,1)))
    , (6, List((2,1),(3,1)))
    , (100, List((2,2),(5,2)))
  )

  test ("Test prime factors") {
    forAll(candidates) { (m: Int, expectedFactors: List[(Int, Int)]) =>
      assert(m.primeFactorMultiplicity == expectedFactors)
    }
  }

}
