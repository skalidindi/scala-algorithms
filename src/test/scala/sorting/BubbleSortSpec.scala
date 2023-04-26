package sorting

import helpers.ArrayUtil
import org.scalatest.flatspec.AnyFlatSpec

class BubbleSortSpec extends AnyFlatSpec {

  "A Bubble Sort" should "return a sorted version of an array passed to it" in {
    val arr = ArrayUtil.create(100)
    assert(BubbleSort.sort(arr) === arr.sorted)
  }

}
