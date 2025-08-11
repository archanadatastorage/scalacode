package learnAboutclasses

trait FirstTrait
{
  def prnRoll(Num : Int)={println(Num)}
  def show()
}

 abstract class Firstclass{
  def  firstmethod(name : String)={println("name : "+name)}
   def abcase()
}

class ImplementTrait extends Firstclass  {
  def show() ={println("a methos")}
  override def abcase()={println("India")}

}


object UseingTraits {
  def main(args: Array[String]): Unit = {
    var t1 = new  ImplementTrait() with FirstTrait
    t1.show()
    t1.prnRoll(4)
  }

}
