package lists

object P11 {

  /** P11 - Modified run-length encoding */
  def encodedModified[T](xs: List[T]): List[Any] = {
    def encodeModifiedRec(ys: List[T], curr: (Int, T), acc: List[Any]): List[Any] = (ys, curr) match {
      case (Nil, (1, v))               => v :: acc
      case (Nil, _)                    => curr :: acc
      case (z :: zs, (c, v)) if z == v => encodeModifiedRec(zs, (c + 1, v), acc)
      case (z :: zs, (1, v))           => encodeModifiedRec(zs, (1, z), v :: acc)
      case (z :: zs, _)                => encodeModifiedRec(zs, (1, z), curr :: acc)
    }

    xs match {
      case Nil => Nil
      case y :: ys => encodeModifiedRec(ys, (1, y), Nil).reverse
    }
  }

}
