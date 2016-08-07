package lists

object P17 {

  /** P17 - Split a list into two parts */
  def split[T](n: Int, xs: List[T]): (List[T], List[T]) = {
    def splitRec(n: Int, ys: List[T], acc: List[T]): (List[T], List[T]) = (n, ys) match {
      case (0, zs) => (acc.reverse, zs)
      case (_, Nil) => (acc.reverse, Nil)
      case (m, z :: zs) => splitRec(m - 1, zs, z :: acc)
    }
    splitRec(n, xs, Nil)
  }

}
