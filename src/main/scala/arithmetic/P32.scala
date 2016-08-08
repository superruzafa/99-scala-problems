package arithmetic

object P32 {

  def gcd(a: Int, b: Int): Int = if  (b == 0) a else gcd(b, a % b)

}
