package sorting

import helpers.ArrayUtil
import org.scalatest.flatspec.AnyFlatSpec

class InsertionSortSpec extends AnyFlatSpec {
  "An Insertion Sort" should "return a sorted version of an array passed to it" in {
    val arr = ArrayUtil.create(100)
    assert(InsertionSort.sort(arr) === arr.sorted)
  }
}
