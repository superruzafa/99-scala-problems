package lists

object P21 {

  /** P21 - Insert an element at a given position into a list */
  def insertAt[T](value: T, n: Int, xs: List[T]): List[T] = (n, xs) match {
    case (_, Nil) => List(value)
    case (0, ys) => value :: ys
    case (_, y :: ys) => y :: insertAt(value, n - 1, ys)
  }

}
