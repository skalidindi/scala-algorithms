package search

import helpers.ArrayUtil
import search.BinarySearch
import org.scalatest.flatspec.AnyFlatSpec

class BinarySearchSpec extends AnyFlatSpec {
  "A Binary Search" should "return a sorted version of an array passed to it" in {
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    assert(BinarySearch.search(arr, 4) === 3)
  }

  "A Binary Search" should "return -1 if no value is found" in {
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    assert(BinarySearch.search(arr, 22) === -1)
  }
}
