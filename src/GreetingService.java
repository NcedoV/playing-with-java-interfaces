public class GreetingService {
    public void sendGreeting(String name) {
        CasualGreeter greeter = new CasualGreeter();
        String message = greeter.greet(name);
        System.out.println("Service says: " + message);
    }
}
