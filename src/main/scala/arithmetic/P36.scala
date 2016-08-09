package arithmetic

import lists.P10.encode
import arithmetic.P35.Int2PrimeFactorFinder

object P36 {

  implicit class Int2PrimeFactorMultiplicityFinder(n: Int) {
    def primeFactorMultiplicity: List[(Int, Int)] = encode(n.primeFactors) map { _.swap }
  }

}
