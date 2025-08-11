package WorkWithException

class MyError(msg:String, casue : Throwable=null) extends Throwable(msg,casue){
  override def toString: String = s"MyError : $msg"
}

object MyExceptioncase {
  def main(args: Array[String]): Unit = {

    var amount = -100
    try {
      if (amount < 0)
        // throw new ArithmeticException()
        throw new MyError("low balance")
      else
        println("pls transact")
    }
    catch {
     // case ex: ArithmeticException => println(ex)
      case ex : MyError => println(ex)
    }
  }

}
