package lists

object P07 {

  /** P07 - Flatten a nested list structure */
  def flatten(xs: List[Any]): List[Any] = xs match {
    case Nil => Nil
    case (ys: List[_]) :: zs => flatten(ys) ++ flatten(zs)
    case y :: ys => y :: flatten(ys)
  }

}
