package day2CollectionWork

object MyFirstCode {

  def matchTest(x:Int):String = x match {
    case 1=> "One"
    case 2 => "Two"
    case _ => "many"
  }
  def main(args: Array[String]): Unit = {
    var name="India"
    println("Name is "+name)
    println(matchTest(25))
  }

}
