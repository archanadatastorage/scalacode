package interoperatability;

public class UseGreetingsFromScala {
    public static void main(String[] args) {

        //scala concreate class
        Greetings g = new Greetings();
        System.out.println(g.displayHi("Java users"));

        // companion class in scala
        System.out.println(Greetings$.MODULE$.msg());
    }
}
