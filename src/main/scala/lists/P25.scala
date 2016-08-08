package lists

object P25 {

  import P20.removeAt

  /** P25 - Generate a random permutation of the elements of a list */
  def randomPermute[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case _ =>
      val i = (math.random * xs.length).toInt
      val (ys, y): (List[T], T) = removeAt(i, xs)
      y :: randomPermute(ys)
  }
}
