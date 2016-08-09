package arithmetic

import arithmetic.P35.Int2PrimeFactorFinder
import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks

class P35Spec extends FunSuite with TableDrivenPropertyChecks {

  val candidates = Table(
    ("n", "Prime factors")
    , (1, List())
    , (2, List(2))
    , (3, List(3))
    , (4, List(2, 2))
    , (5, List(5))
    , (6, List(2, 3))
    , (100, List(2, 2, 5, 5))
  )

  test ("Test prime factors") {
    forAll(candidates) { (m: Int, expectedFactors: List[Int]) =>
      assert(m.primeFactors == expectedFactors)
    }
  }

}
