package lists

object P01 {

  /** P01 - Find the last element of a list */
  def last[T](xs: List[T]): T = xs match {
    case Nil => throw new NoSuchElementException
    case x :: Nil => x
    case _ :: ys => last(ys)
  }

}



