package logic

import logic.P47._
import org.scalatest.FunSuite

class P47Spec extends FunSuite {

  def loop: Boolean = loop

  test ("Test and") {
    assert((false and false) == false)
    assert((false and true)  == false)
    assert((true  and false) == false)
    assert((true  and true)  == true)
    assert((false and loop)  == false)
  }

  test ("Test or") {
    assert((false or false) == false)
    assert((false or true)  == true)
    assert((true  or false) == true)
    assert((true  or true)  == true)
    assert((true  or loop)  == true)
  }

  test ("Test nand") {
    assert((false nand false) == true)
    assert((false nand true)  == true)
    assert((true  nand false) == true)
    assert((true  nand true)  == false)
    assert((false nand loop)  == true)
  }

  test ("Test nor") {
    assert((false nor false) == true)
    assert((false nor true)  == false)
    assert((true  nor false) == false)
    assert((true  nor true)  == false)
    assert((true  nor loop)  == false)
  }

  test ("Test xor") {
    assert((false xor false) == false)
    assert((false xor true)  == true)
    assert((true  xor false) == true)
    assert((true  xor true)  == false)
  }
  
  test ("Test impl") {
    assert((false impl false) == true)
    assert((false impl true)  == true)
    assert((true  impl false) == false)
    assert((true  impl true)  == true)
  }

  test ("Test equ") {
    assert((false equ false) == true)
    assert((false equ true)  == false)
    assert((true  equ false) == false)
    assert((true  equ true)  == true)
  }

}
