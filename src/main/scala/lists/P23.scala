package lists

object P23 {

  /** P23 - Extract a given number of randomly selected elements from a list */
  def randomSelect[T](n: Int, xs: List[T]): List[T] = {
    def randomSelectRec(m: Int, ys: List[T], acc: List[T]): List[T] = (n, m, ys) match {
      case (0, 0, z :: _)  => List(z)
      case (_, 0, z :: zs) => z :: randomSelect(n - 1, acc ++ zs)
      case (_, _, z :: zs) => randomSelectRec(m - 1, zs, z :: acc)
    }

    if (n == 0 || xs.isEmpty) Nil
    else randomSelectRec((math.random * xs.length).toInt, xs, Nil)
  }
}
