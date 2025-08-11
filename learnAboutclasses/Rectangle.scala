package learnAboutclasses

class Rectangle(var length:Double, var width:Double) extends  Polygon {

 override def area :Double = length * width
  def recshow()={

    println(name)
    println("This is rectangle")
  println(" Length : "+ this.length + "  Width  :  "+ this.width)}
  println("area :  "+ super.area)
}
