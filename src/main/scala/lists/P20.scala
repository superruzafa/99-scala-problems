package lists

object P20 {

  /** P20 - Remove the Kth element from a list */
  def removeAt[T](n: Int, xs: List[T]): (List[T], T) = {
    def removeAtRec(m: Int, ys: List[T], acc: List[T]): (List[T], T) = (m, ys) match {
      case (_, Nil) => throw new NoSuchElementException
      case (0, z :: zs) => (acc.reverse ++ zs, z)
      case (m, z :: zs) => removeAtRec(m - 1, zs, z :: acc)
    }
    removeAtRec(n, xs, Nil)
  }

}
