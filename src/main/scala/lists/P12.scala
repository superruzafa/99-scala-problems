package lists

object P12 {

  /** P12 - Decode a run-length encoded list */
  def decode[T](xs: List[(Int, T)]): List[T] = xs match {
    case Nil => Nil
    case (c, v) :: ys =>
      val vs = for (i <- 1 to c) yield v
      vs.toList ++ decode(ys)
  }

}
