package lists

object P05 {

  /** P05 - Reverse a list */
  def reverse[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case y :: ys => reverse(ys) ++ List(y)
  }

}
