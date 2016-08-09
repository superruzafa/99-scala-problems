package arithmetic

import P31.Int2PrimeCheck

object P39 {
  def listPrimesInRange(r: Range): List[Int] = r.toList filter { _.isPrime }
}
