package interoperatability

object MyScalaCode {
  def main(args: Array[String]): Unit = {
    MyJavaCode.sayHi("Scala user here ")

    val myJavaCode = new MyJavaCode()
    myJavaCode.show("India")
  }

}
