package practiceFunctionalProg

object TracersCode {
  def  add(a:Int,b:Int):Int={
    return a+b
  }

  def main(args: Array[String]): Unit = {
    val L1 = List(2,3,56,-10,2)

    //L1.foreach(x=>println(x))
    L1.foreach(println)
    L1.foreach(println(_))

    //------------- add 100-------------  map

   // var L2 = L1.map(num => num+100)
    //var L2 = L1.map(num => add(num,100))
    var L2 = L1.map(_+100)
    print(" L1 ----")
    L1.foreach(x=>print(x+"  ,"))
    print(" \n L2 ----- ")
    L2.foreach(x=>print(x+"  ,"))
    //------------ String

    var names = List("Ram","Sia","Laxman","Ravan")
    var uname = names.map(_.toUpperCase())
    print("\n UpperCase ----")
    uname.foreach(x=>print(x+"  ,"))

    var pairs = names.map(x=>(x.toUpperCase(),x.length))
    print(" \n Pairs ----")
    pairs.foreach(x=>print(x+"  ,"))

    //-----Even---
    var even = L1.filter(_%2==0)
    print(" \nEven  ----")
    even.foreach(x=>print(x+"  ,"))

    var four = names.filter(_.length>4)
    print(" \n >4 chars ----")
    four.foreach(x=>print(x+"  ,"))

    //--- list +udf => returns lists

    var L6 = L1.map(g(_))
    print("\n list with udf ----")
    L6.foreach(x=>print(x+"  ,"))

    //--- list +udf => returns number
    var L7 = L1.flatMap(x=>g(x))
    print("\n list with udf ----")
    L7.foreach(x=>print(x+"  ,"))


    var lines = List ("I've never seen a purple cow.",
    "I never hope to see one;",
    "But I can tell you, anyhow",
   " I'd rather see than be one.")
    var words = lines.flatMap(x => x.split(" "))
    print("\n Words ----")
    words.foreach(x=>print(x+"  ,"))
  }

  def g(x:Int)={ List(x-1,x,x+1)}
}
