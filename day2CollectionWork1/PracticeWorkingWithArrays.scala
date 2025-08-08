package day2CollectionWork

object PracticeWorkingWithArrays {

  def main(args: Array[String]): Unit = {

    var ar = Array(2,3,67,1,23,3,7)
   // for(i<-0 to ar.length)
     // println(i)

    //ar.foreach(f=>println(f))
    var courses = Array("scala","java","python")
   // courses.foreach(x=>println(x))
    //println(courses(0))

    val myarr = new Array[String](5)
    myarr(0) = "Rose"
    myarr(4) ="Jasmin"
  //  myarr(5)= "Sunflower"
    myarr.foreach(x=>println(x))
    println("no of elements :"+myarr.length)
   val newarr= myarr.drop(1)
    newarr.foreach(x=>println(x))
  }

}
