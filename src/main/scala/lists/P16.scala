package lists

object P16 {

  /** P16 - Drop every Nth element from a list */
  def drop[T](n: Int, xs: List[T]): List[T] = (n, xs) match {
    case (_, Nil) => throw new NoSuchElementException
    case (0, y :: ys) => ys
    case (_, y :: ys) => y :: drop(n - 1, ys)
  }

}
