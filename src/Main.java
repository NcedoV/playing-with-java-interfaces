public class Main {
    public static void main(String[] args) {
        var casualGreeting = new CasualGreeter();
        var formalGreeting = new FormalGreeter();

        String helloGuest1 = casualGreeting.greet("Ncedo");
        String helloGuest2 = formalGreeting.greet("Simon");

        System.out.println(helloGuest1);
        System.out.println(helloGuest2);
    }
}