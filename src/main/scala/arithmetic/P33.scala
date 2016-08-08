package arithmetic

import P32.gcd

object P33 {

  implicit class Int2CoprimeCheck(n: Int) {

    def isCoprimeTo(m: Int): Boolean = gcd(n, m) == 1

  }

}
