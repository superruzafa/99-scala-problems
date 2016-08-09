package arithmetic

import arithmetic.P31.Int2PrimeCheck

object P35 {

  implicit class Int2PrimeFactorFinder(n: Int) {

    def primeFactors: List[Int] = {
      val primeSeq = Stream from 2 filter { _.isPrime }
      def primeFactorsRec(m: Int, primes: Stream[Int], acc: List[Int]): List[Int] = {
        if (m == 1) acc.reverse
        else if (m % primes.head == 0) primeFactorsRec(m / primes.head, primes, primes.head :: acc)
        else primeFactorsRec(m, primes.tail, acc)
      }
      primeFactorsRec(n, primeSeq, Nil)
    }
  }

}
