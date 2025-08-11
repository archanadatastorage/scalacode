package WorkWithException

object PractceExceptionCases {
  def main(args: Array[String]): Unit = {

  try {
    var res = 10 / 2

    println("Result  :  " + res)
    var ar = Array(1,2,3,4)
    println(ar(10))

  }
    catch {
   // case ex: Exception => println("cannot done")
      case ex :ArithmeticException => println("Work with denominator")
      case ex : ArrayIndexOutOfBoundsException => println("check the index")
    }
  finally
    {
      println("finally done")
    }
  }


}
