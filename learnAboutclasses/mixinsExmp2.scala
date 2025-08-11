package learnAboutclasses

trait  One{
  println("One trait")
  def oneMethod()
}

trait  Two
{
  println("Two trait")
  def  twoMethod()
}

  class AnotherWithTrait
{
  println("AnotherWithTrait class")
  def  classMethod()={println("AnotherWithTrait")}
}

class WorkWithTraits extends AnotherWithTrait with Two with One{
  override def oneMethod(): Unit = {
    println("one")
  }

  override def twoMethod(): Unit = {println("Two")}
}
/*class WorkWithTraits extends One with Two
{
  override def oneMethod(): Unit = {
    println("one")
  }

  override def twoMethod(): Unit = {println("Two")}
}*/



object mixinsExmp2 {
  def main(args: Array[String]): Unit = {
    var workWithTraits = new WorkWithTraits()
    //workWithTraits.oneMethod()
    //workWithTraits.twoMethod()
    //workWithTraits.classMethod()
  }

}
