package lists

object P22 {

  /** P22 - Create a list containing all integers within a given range */
  def range(from: Int, to: Int): List[Int] =
    if (from > to) Nil
    else from :: range(from + 1, to)
}
