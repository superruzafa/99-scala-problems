package logic

import logic.P46._
import org.scalatest.FunSuite

class P46Spec extends FunSuite {

  def loop: Boolean = loop

  test ("Test and") {
    assert(and(false, false) == false)
    assert(and(false, true) == false)
    assert(and(true, false) == false)
    assert(and(true, true) == true)
    assert(and(false, loop) == false)
  }

  test ("Test or") {
    assert(or(false, false) == false)
    assert(or(false, true) == true)
    assert(or(true, false) == true)
    assert(or(true, true) == true)
    assert(or(true, loop) == true)
  }

  test ("Test nand") {
    assert(nand(false, false) == true)
    assert(nand(false, true) == true)
    assert(nand(true, false) == true)
    assert(nand(true, true) == false)
    assert(nand(false, loop) == true)
  }

  test ("Test nor") {
    assert(nor(false, false) == true)
    assert(nor(false, true) == false)
    assert(nor(true, false) == false)
    assert(nor(true, true) == false)
    assert(nor(true, loop) == false)
  }

  test ("Test xor") {
    assert(xor(false, false) == false)
    assert(xor(false, true) == true)
    assert(xor(true, false) == true)
    assert(xor(true, true) == false)
  }

  test ("Test impl") {
    assert(impl(false, false) == true)
    assert(impl(false, true) == true)
    assert(impl(true, false) == false)
    assert(impl(true, true) == true)
  }

  test ("Test equ") {
    assert(equ(false, false) == true)
    assert(equ(false, true) == false)
    assert(equ(true, false) == false)
    assert(equ(true, true) == true)
  }

}
