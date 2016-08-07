package lists

object P14 {

  /** P14 - Duplicate the elements of a list */
  def duplicate[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case y :: ys => y :: y :: duplicate(ys)
  }

}
