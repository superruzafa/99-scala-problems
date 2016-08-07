package lists

object P02 {

  /** P02 - Find the last but one element of a list */
  def penultimate[T](xs: List[T]): T = xs match {
    case Nil | _ :: Nil => throw new NoSuchElementException
    case x :: _ :: Nil => x
    case _ :: ys => penultimate(ys)
  }

}
