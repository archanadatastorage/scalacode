package learnAboutclasses

class Demo7
{
  def show={println("i am class")}
}

object Demo7 {
  def display={println("I am demo6")}
}
object Demo6 {
  def main(args: Array[String]): Unit = {
    var d1 = new Demo7()
    d1.show
    //d1.display
  }
}


