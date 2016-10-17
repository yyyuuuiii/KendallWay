/**
  * Created by Yuichi on 2016/10/17.
  */
class KendallWay(people: Double, time: Double){
  //平均到着率
  def averageArrivalRate() = people / time

  //平均サービス率
  def averageServiceRate() = people / time

  //待たされる確率
  def P() = averageArrivalRate / averageServiceRate

  //待たずに済む確率
  def P2() = 1 - P

  //待っている人の平均人数
  def L() = (P * P) / (1 - P)

  def W() = 1/(averageServiceRate - averageArrivalRate)

  def Wq() = W - (1 / averageServiceRate)
}
object Formal {
  def main(args: Array[String]): Unit = {
    val kent = new KendallWay(3.0, 4.0)
    println(kent.averageArrivalRate())
    println(kent.L())
    println(kent.P())
    println(kent.P2())
    println(kent.W())
    println(kent.Wq())
  }
}
