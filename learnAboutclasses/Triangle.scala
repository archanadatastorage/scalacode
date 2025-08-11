package learnAboutclasses

class Triangle(var width : Double, var height:Double) extends Polygon {
  override def area: Double =( this.width*this.height)*.5
}
