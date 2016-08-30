package logic

object P47 {

  implicit class BooleanWrapper(b1: Boolean) {
    def and(b2: => Boolean): Boolean  = if (b1) b2 else false
    def or(b2: => Boolean): Boolean   = if (b1) true else b2
    def nand(b2: => Boolean): Boolean = if (b1) !b2 else true
    def nor(b2: => Boolean): Boolean  = if (b1) false else !b2
    def xor(b2: Boolean): Boolean     = b1 != b2
    def impl(b2: => Boolean): Boolean = if (b1) b2 else true
    def equ(b2: Boolean): Boolean     = b1 == b2
  }
}
