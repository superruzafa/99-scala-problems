package lists

object P04 {

  /** P04 - Find the number of elements of a list */
  def length[T](xs: List[T]): Int = xs match {
    case Nil => 0
    case _ :: ys => 1 + length(ys)
  }

}
