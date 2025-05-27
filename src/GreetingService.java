public class GreetingService {
    private final Greeter greeterTool;

    public GreetingService(Greeter chosenGreeterTool) {
        this.greeterTool = chosenGreeterTool;
        System.out.println("GreetingService hired and given a " + greeterTool.getClass().getSimpleName());
    }

    public void sendGreeting(String name) {
        String message = this.greeterTool.greet(name);
        System.out.println("Service says: " + message);
    }
//        CasualGreeter greeter = new CasualGreeter();
//        String message = greeter.greet(name);
//        System.out.println("Service says: " + message)
}
