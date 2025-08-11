package learnAboutclasses

class Polygon{
  protected  var name ="Type of Polygon"
 def area:Double=0.0    // abstarct method
  def myshow={println("this is parent")}}

object WorkOnPolygon {
  def main(args: Array[String]): Unit = {
   // var poly = new Polygon()
//prnArea(poly)

  var rectangle = new Rectangle(20,30)
  println(rectangle.area)
  prnArea(rectangle)
    rectangle.recshow()
rectangle.myshow
    var triangle = new Triangle(5,10)
    println(triangle.area)
    prnArea(triangle)
  }

  def prnArea(p:Polygon): Unit =
  {
    println(p.area)
  }
}
