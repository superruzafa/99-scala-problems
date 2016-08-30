package logic

object P46 {

  def and(b1: Boolean, b2: => Boolean): Boolean =  if (b1) b2 else false
  def or(b1: Boolean, b2: => Boolean): Boolean =   if (b1) true else b2
  def nand(b1: Boolean, b2: => Boolean): Boolean = if (b1) !b2 else true
  def nor(b1: Boolean, b2: => Boolean): Boolean =  if (b1) false else !b2
  def xor(b1: Boolean, b2: Boolean): Boolean = b1 != b2
  def impl(b1: Boolean, b2: => Boolean): Boolean = if (b1) b2 else true
  def equ(b1: Boolean, b2: Boolean): Boolean = b1 == b2

  def table2(f: (Boolean, Boolean) => Boolean): Unit = {

    val results = Seq(f(false, false), f(false, true), f(true, false), f(true, true)) map {_.toString}

    println(
      """A       B       result
        |false   false   %s
        |false   true    %s
        |true    false   %s
        |true    true    %s
      """.stripMargin.format(results: _*)
    )
  }
}
