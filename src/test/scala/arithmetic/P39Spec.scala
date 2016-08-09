package arithmetic

import arithmetic.P39.listPrimesInRange
import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks

class P39Spec extends FunSuite with TableDrivenPropertyChecks {

  val candidates = Table(
    ("n", "Prime factors")
    , (1 to 10, List(1,2,3,5,7))
  )

  test ("Test prime factors") {
    forAll(candidates) { (r: Range, expectedPrimeList: List[Int]) =>
      assert(listPrimesInRange(r) == expectedPrimeList)
    }
  }

}
