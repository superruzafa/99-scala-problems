package lists

object P19 {

  /** P19 - Extract a slice from a list */
  def rotate[T](n: Int, xs: List[T]): List[T] = {
    def rotateRec(m: Int, ys: List[T], acc: List[T]): List[T] = (m, ys) match {
      case (_, Nil) => Nil
      case (0, _) => ys ++ acc.reverse
      case (_, z :: zs) => rotateRec(m - 1, zs, z :: acc)
    }

    val m = if (n < 0) xs.length + n else n
    if (xs.isEmpty) Nil
    else rotateRec(m % xs.length, xs, Nil)
  }

}
