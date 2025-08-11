package learnAboutclasses

//getter/setter methods
class User
{
  println("I am user class")
 private var _age=0
  var name=""
  def age = _age        //getter
  def age_=(value:Int):Unit =_age =value    //setter
}

object Demo {
  def main(args: Array[String]): Unit = {
    var user1 = new User()
    println(user1.age)
    user1.age = 300
    println(user1.age)

      }

}
