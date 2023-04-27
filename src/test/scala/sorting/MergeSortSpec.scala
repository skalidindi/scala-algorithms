package sorting

import helpers.ArrayUtil
import org.scalatest.flatspec.AnyFlatSpec

class MergeSortSpec extends AnyFlatSpec {
  "A Merge Sort" should "return a sorted version of an array passed to it" in {
    val arr = ArrayUtil.create(100)
    assert(MergeSort.sort(arr) === arr.sorted)
  }
}
