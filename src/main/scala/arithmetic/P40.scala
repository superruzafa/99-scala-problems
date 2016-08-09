package arithmetic

import P31.Int2PrimeCheck
import P39.listPrimesInRange

object P40 {
  implicit class GoldbachFinder(n: Int) {

    require(n > 2 && n % 2 == 0, "Goldbach conjecture applies only to even numbers greater than 2")

    def goldbach: (Int, Int) =
        listPrimesInRange(2 to n / 2) find { i: Int => (n - i).isPrime } match {
          case Some(i) => (i, n - i)
          case None => throw new NoSuchElementException("Goldbach conjecture refuted!")
        }
  }
}
