import helpers.ArrayUtil
import sorting.MergeSort

object Playground {

  def main(args: Array[String]): Unit = {
    val array         = ArrayUtil.create(10);
    val originalArray = array.clone()
    try {
      val sortedArray = MergeSort.sort(null)
      println(originalArray.mkString(","))
      println(sortedArray.mkString(","));
    } catch {
      case e: Exception => println(e.getMessage)
    }
  }
}
