package learnAboutclasses
class Engine
{
  def start()={println("Engine started")}
}

class Car
{
  var eng1 = new Engine()         // composition
  def drive()={
    eng1.start()
    println("car is starting")
  }
}
object WorkingWithComposition {

  def main(args: Array[String]): Unit= {
    val mycar = new Car()
    mycar.drive()
  }

}
