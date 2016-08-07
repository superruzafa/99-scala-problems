package lists

object P18 {

  /** P18 - Extract a slice from a list */
  def slice[T](from: Int, until: Int, xs: List[T]): List[T] = {
    def sliceRec(f: Int, u: Int, ys: List[T], acc: List[T]): List[T] = (f, u, ys) match {
      case (_, _, Nil) => acc.reverse
      case (0, 0, _) => acc.reverse
      case (0, _, z :: zs) => sliceRec(0, u - 1, zs, z :: acc)
      case (_, _, z :: zs) => sliceRec(f - 1, u, zs, acc)
    }
    sliceRec(from, until - from, xs, Nil)
  }

}
