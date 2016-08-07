package lists

import org.scalatest.FunSuite
import P06.isPalindrome

class P06Spec extends FunSuite {

  test("P06 - Is palindrome an empty list") {
    assert(isPalindrome(Nil))
  }

  test("P06 - Is palindrome a singleton list") {
    assert(isPalindrome(List(1)))
  }

  test("P06 - Is palindrome a non-palindrome two-length list") {
    assert(!isPalindrome(List(1, 2)))
  }

  test("P06 - Is palindrome a palindrome two-length list") {
    assert(isPalindrome(List(2, 2)))
  }

  test("P06 - Is palindrome a palindrome, generic, odd-length list") {
    assert(isPalindrome(List(1, 2, 3, 2, 1)))
  }

  test("P06 - Is palindrome a non-palindrome, generic, odd-length list") {
    assert(!isPalindrome(List(1, 2, 3, 4, 5)))
  }

  test("P06 - Is palindrome a palindrome, generic, even-length list") {
    assert(isPalindrome(List(1, 2, 2, 1)))
  }

  test("P06 - Is palindrome a non-palindrome, generic, even-length list") {
    assert(!isPalindrome(List(1, 2, 3, 4)))
  }

}
