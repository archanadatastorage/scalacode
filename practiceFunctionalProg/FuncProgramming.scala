package practiceFunctionalProg

object FuncProgramming {
  def  add(a:Int,b:Int):Int={
    return a+b
  }

  def multi(x:Int,y:Int):Int={return x*y}

  def calculate(num1:Int,num2:Int,f:(Int,Int) =>Int)=
    {
      f(num1,num2)
    }
  def main(args: Array[String]): Unit = {
    val obj = FuncProgramming
    println(" ADD : " + obj.add(2,3))
    print("Product :  "+obj.multi(4,5))

    println(" Result :  "+ calculate(4,8,add))
    println(" Result2 :  "+ calculate(8,90,multi))
    println("Result 3 : "+calculate(2,3,(x:Int,y:Int)=>x/y))

    var fun1 = (x:Int) =>{x+100}
    println(fun1)
    println(fun1(5))
  }
}
