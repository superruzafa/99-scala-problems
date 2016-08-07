package lists

object P24 {

  import P23.randomSelect

  /** P24 - Lotto: Draw N different random numbers from the set 1..M */
  def lotto(n: Int, m: Int): List[Int] = randomSelect(n, (1 to m).toList)
}
