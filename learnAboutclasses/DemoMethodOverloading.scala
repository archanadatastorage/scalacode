package learnAboutclasses

class Calculator
{
  def add(x:Int, y:Int):Int={
    x+y
  }

  def add(x:Double,y:Double)=
    {
      x+y
    }
    def add(x:Int,y:Int,z:Int):Int=
      {
        x+y+z
      }

}
object DemoMethodOverloading {
  def main(args: Array[String]): Unit = {
    var cal1 = new  Calculator()
    println(cal1.add(2,3))
    println(cal1.add(1,2,3))
    println(cal1.add(2.3,3.4))
  }
}
