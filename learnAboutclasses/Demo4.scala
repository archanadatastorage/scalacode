package learnAboutclasses

class Student(var id :Int,name:String)
{
  def this()
    {
      this(100,"Ram")
    }

  def this(name:String)
    {
      this(200,name)
    }
    def display: Unit ={
      println("Id :  " +this.id)
      println("Name :  " +this.name)
    }

}

object Demo4 {

  def main(args: Array[String]): Unit = {
    var s1 = new Student(300,"Laxman")
    s1.display
    var s2 = new Student()
    s2.display
    var s3 = new Student("Sia")
    s3.display
  }

}
