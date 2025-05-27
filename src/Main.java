public class Main {
    public static void main(String[] args) {
//        Greeter currentGreeter;
//        PolitePerson wellWisher = new PolitePerson();

        ZuluGreeter zuluGreeting = new ZuluGreeter();

        GreetingService greetingServer = new GreetingService(zuluGreeting);
        greetingServer.sendGreeting("Unami");


        CasualGreeter casualGreeting = new CasualGreeter();

        GreetingService casualGreetingServer = new GreetingService(casualGreeting);
        casualGreetingServer.sendGreeting("Simo");

//        wellWisher = new PolitePerson();
//        String helloMessage = wellWisher.greet("Ncedo");
//        String goodbyeMessage = wellWisher.sayGoodbye("Ncedo");
//        System.out.println(helloMessage);
//        System.out.println(goodbyeMessage);

//        PolitePerson greetUs = wellWisher;
//        System.out.println(greetUs.sayGoodbye("Amile"));
//        System.out.println(greetUs.greet("Ncedo"));

//        currentGreeter = new CasualGreeter();
//        String helloGuest1 = currentGreeter.greet("Ncedo");
//        System.out.println(helloGuest1);


//        currentGreeter = new FormalGreeter();
//        String helloGuest2 = currentGreeter.greet("Simon");
//        System.out.println(helloGuest2);
//
//        currentGreeter = new ZuluGreeter();
//        String helloGuest3 = currentGreeter.greet("Ncira");
//        System.out.println(helloGuest3);
    }
}