import helpers.ArrayUtil
import sorting.InsertionSort

object Playground {

  def main(args: Array[String]): Unit = {
    val array         = ArrayUtil.create(10);
    val originalArray = array.clone()
    val sortedArray   = InsertionSort.sort(array)

    println(originalArray.mkString(","))
    println(sortedArray.mkString(","));
  }
}
