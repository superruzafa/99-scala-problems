package lists

object P26 {

  /** P26 - Generate the combinations of K distinct objects chosen from the N elements of a list */
  def combinations[T](n: Int, xs: List[T]): List[List[T]] = {
    def combRec(m: Int, ys: List[T], curr: List[T], acc: List[List[T]]): List[List[T]] = (m, ys) match {
      case (0, _) => curr.reverse :: acc
      case (_, Nil) => acc
      case (_, z :: zs) =>
        combRec(m - 1, zs, z :: curr, acc) ++
        combRec(m, zs, curr, acc)
    }

    combRec(n, xs, Nil, Nil)
  }
}
