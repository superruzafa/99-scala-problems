package arithmetic

import arithmetic.P33.Int2CoprimeCheck

object P34 {

  implicit class Int2TotientCheck(m: Int) {
    def totient: Int = (1 to m) count m.isCoprimeTo
  }

}
