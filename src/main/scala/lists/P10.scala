package lists

object P10 {

  /** P10 - Run-length encoding of a list */
  def encode[T](xs: List[T]): List[(Int, T)] = {
    def encodeRec(ys: List[T], curr: (Int, T), acc: List[(Int, T)]): List[(Int, T)] = (ys, curr) match {
      case (Nil, _) => curr :: acc
      case (z :: zs, (c, v)) if z == v => encodeRec(zs, (c + 1, v), acc)
      case (z :: zs, _) => encodeRec(zs, (1, z), curr :: acc)
    }

    xs match {
      case Nil => Nil
      case y :: ys => encodeRec(ys, (1, y), Nil).reverse
    }
  }

}
