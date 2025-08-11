package learnAboutclasses

import com.sun.corba.se.impl.orbutil.graph.Graph

import scala.collection.mutable.ArrayBuffer

class Graph
{

  class Member(val name:String)
  {
    val contact = new ArrayBuffer[Member]
  }

  private  val mem = new ArrayBuffer[Member]

  def join(name:String){
  val n = new Member(name)
  mem +=n
  }
}

object WorkingWirhInnerClass {
  def main(args: Array[String]): Unit = {
     val G1 = new Graph
     val G2 = new Graph
     val  G3 = G1.join("India")
    val G4 = G1.join("Pune")

  }

}
