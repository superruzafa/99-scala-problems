package lists

object P06 {

  /** P06 - Find out whether a list is a palindrome */
  def isPalindrome[T](xs: List[T]): Boolean = {
    def isPalindromeRec(ys: List[T], zs: List[T]): Boolean = (ys, zs) match {
      case (Nil, Nil) => true
      case (u :: us, v :: vs) if u == v => isPalindromeRec(us, vs)
      case _ => false
    }
    isPalindromeRec(xs, xs.reverse)
  }

}
