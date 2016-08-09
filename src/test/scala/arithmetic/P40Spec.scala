package arithmetic

import arithmetic.P40.GoldbachFinder
import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks

class P40Spec extends FunSuite with TableDrivenPropertyChecks {

  val candidates = Table(
    ("n", "prime numbers")
    , (8,  (3, 5))
    , (28, (5, 23))
    , (54, (7, 47))
  )

  test ("Test prime factors") {
    forAll(candidates) { (n: Int, primePairs: (Int, Int)) =>
      assert(n.goldbach == primePairs)
    }
  }

}
