package arithmetic

object P31 {

  implicit class Int2PrimeCheck(n: Int) {
    def isPrime: Boolean = (2 to n / 2) forall( i => n % i != 0)
  }

}
