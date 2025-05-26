import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Greeter currentGreeter;

        currentGreeter = new CasualGreeter();
        String helloGuest1 = currentGreeter.greet("Ncedo");
        System.out.println(helloGuest1);

        currentGreeter = new FormalGreeter();
        String helloGuest2 = currentGreeter.greet("Simon");
        System.out.println(helloGuest2);

        currentGreeter = new zuluGreeter();
        String helloGuest3 = currentGreeter.greet("Ncira");
        System.out.println(helloGuest3);
    }
}