package interoperatability

class Greetings{
  def displayHi(name:String):String ={
    s"Hi $name from scala"
  }
}


object Greetings {
def msg ():String = "This is a message from scala companion class"
}
