package arithmetic

import P40.GoldbachFinder

import scala.language.postfixOps

object P41 {
  def goldbachList(r: Range): Map[Int, (Int, Int)] = {
    val evens = r dropWhile { _ % 2 != 0 } by 2
    evens map { i => i -> i.goldbach } toMap
  }

  def printGoldbachList(r: Range): Unit =
    goldbachList(r).toList.sorted.foreach { case (i, (p1, p2)) =>
      println(s"$i = $p1 + $p2")
    }
}
