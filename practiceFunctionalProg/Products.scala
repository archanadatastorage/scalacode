package practiceFunctionalProg

class Items(itemid:Int=10)
{
  def show()={
    println(itemid)
  }
}

object Items
{
  def apply(id :Int):Items =
    {
      var obj = new Items(id)
      return obj
    }
}

object Products {
  def main(args: Array[String]): Unit = {

var myobj = Items(20)
    myobj.show()

  }
}
