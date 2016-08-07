package lists

object P08 {

  /** P08 -  Eliminate consecutive duplicates of list elements */
  def compress[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case x :: (tail@(y :: ys)) if x == y => compress(tail)
    case y :: ys => y :: compress(ys)
  }

}
