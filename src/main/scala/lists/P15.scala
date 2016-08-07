package lists

object P15 {

  /** P15 - Duplicate the elements of a list a given number of times */
  def duplicateN[T](n: Int, xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case y :: ys =>
      val ds = for (i <- 1 to n) yield y
      ds.toList ++ duplicateN(n, ys)
  }

}
