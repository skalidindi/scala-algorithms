package sorting

import helpers.ArrayUtil
import org.scalatest.flatspec.AnyFlatSpec

class SelectionSortSpec extends AnyFlatSpec {
  "A Selection Sort" should "return a sorted version of an array passed to it" in {
    val arr = ArrayUtil.create(100)
    assert(SelectionSort.sort(arr) === arr.sorted)
  }
}
