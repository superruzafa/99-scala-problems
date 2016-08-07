package lists

object P09 {

  /** P09 - Pack consecutive duplicates of list elements into sublists */
  def pack[T](xs: List[T]): List[List[T]] = {
    def packRec(ys: List[T], curr: List[T], acc: List[List[T]]): List[List[T]] = (ys, curr) match {
      case (Nil, Nil)                  => acc
      case (Nil, _)                    => curr :: acc
      case (z :: zs, Nil)              => packRec(zs, List(z), acc)
      case (z :: zs, c :: _) if z == c => packRec(zs, z :: curr, acc)
      case (z :: zs, _)                => packRec(zs, List(z), curr :: acc)
    }

    packRec(xs, Nil, Nil).reverse
  }

}
