import helpers.ArrayUtil
import sorting.MergeSort

object Playground {

  def main(args: Array[String]): Unit = {
    val array         = ArrayUtil.create(10);
    val originalArray = array.clone()
    try {
      val sortedArray = MergeSort.sort(Array(14, 7, 3, 12, 9, 11, 6, 2))
      println(originalArray.mkString(","))
      println(sortedArray.mkString(","));
    } catch {
      case e: Exception => println(e.getMessage)
    }
  }
}
