package logic

object P48 {

  def gray(n: Int): Seq[String] = {
    if (n <= 0) throw new IllegalArgumentException
    else if (n == 1) Seq("0", "1")
    else {
      val `grayₙ₋₁` = gray(n - 1)
      (`grayₙ₋₁` map {"0" + _}) ++ (`grayₙ₋₁`.reverse map {"1" + _})
    }
  }
}
