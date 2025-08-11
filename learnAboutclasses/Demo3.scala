package learnAboutclasses

class Person
{
  var fname:String = _
  var lname:String = _

    def this(firstname:String){
      this()
      this.fname =firstname
    }
 def this(fname:String,lname:String){
   this(fname)
   this.lname=lname
 }
}

object Demo3 {
  def main(args: Array[String]): Unit = {
    var p1 = new Person()
    println((p1.fname))
    var p2 = new Person("Ram")
    println(p2.fname)

    var p3 = new Person("Ravan","Kumar")
    println(p3.fname+ "   "+p3.lname)
  }

}
