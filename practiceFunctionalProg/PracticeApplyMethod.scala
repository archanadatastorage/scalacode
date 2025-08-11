package practiceFunctionalProg

object PracticeApplyMethod {
  def main(args: Array[String]): Unit = {
    var cal1 = new Calculate
    println("Result : " + cal1.apply(4))

    var res = cal1(68)          // apply
    println("Result :  "+res)

    println(cal1(2,3))
  }

}

class Calculate
{
var x:Int =100
  def apply(y:Int)= x+y

  def apply(a:Int,b:Int)= a+b
}
