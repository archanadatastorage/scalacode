package learnAboutclasses

//scala class
// var   : getter/setter
//val : getter
class Employees(private var id:Int,var  name:String)
{
def printid{println(id)}
}

object Demo2 {
  def main(args: Array[String]): Unit = {
var  emp1 = new Employees(100,"Ram");
    println("id :  " + emp1.printid +"\n Name :  "+emp1.name)
   // emp1.id=200
    emp1.name= "Sita"
    println("id :  " + emp1.printid +"\n Name :  "+emp1.name)
  }

}
