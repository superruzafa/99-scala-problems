package lists

object P03 {

  /** P03 - Find the Kth element of a list. */
  def nth[T](n: Int, xs: List[T]): T = (n, xs) match {
    case (_, Nil) => throw new NoSuchElementException
    case (0, y :: _) => y
    case (m, _ :: ys) => nth(m - 1, ys)
  }

}
