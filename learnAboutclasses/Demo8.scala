package learnAboutclasses

class parent
{
  def this(a:String)
    {
      this()
      println(a)
    }
}

class child extends parent
{
  def this(x:String,y:Int){
    this()

       println(y)

  }
}

object Demo8 {

}
