package arithmetic

import arithmetic.P41._
import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks

class P41Spec extends FunSuite with TableDrivenPropertyChecks {

  val candidates = Table(
    ("range", "goldbach primes"),
    (9 to 20, Map(
      10 -> (3, 7),
      12 -> (5, 7),
      14 -> (3, 11),
      16 -> (3, 13),
      18 -> (5, 13),
      20 -> (3, 17)
    ))
  )

  test ("Test prime factors") {
    forAll(candidates) { (r: Range, expected: Map[Int, (Int, Int)]) =>
      assert(goldbachList(r) == expected)
    }
  }

}
