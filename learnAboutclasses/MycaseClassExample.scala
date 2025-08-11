package learnAboutclasses

case class Stationary(id:Int,name:String)

object MycaseClassExample {

  def main(args: Array[String]): Unit = {

    var stationary =Stationary(100,"Pencil")
    println("Id : "+stationary.id)
    //stationary.id =200;
   // val st2 = stationary.copy()
    val st2= stationary.copy(id=200,"Pencil")
    println(st2.id)
    val cmp = stationary == st2
    println(cmp)


  }

}
