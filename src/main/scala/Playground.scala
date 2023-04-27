import helpers.ArrayUtil
import sorting.MergeSort

object Playground {

  def main(args: Array[String]): Unit = {
    val array         = ArrayUtil.create(10);
    val originalArray = array.clone()
    val sortedArray   = MergeSort.sort(array)

    println(originalArray.mkString(","))
    println(sortedArray.mkString(","));
  }
}
