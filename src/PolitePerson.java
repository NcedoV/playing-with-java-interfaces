public class PolitePerson implements Greeter, Farewell {

    @Override
    public String greet(String name) {
        return "Hello " + name + " nice to meet you.";
    }

    @Override
    public String sayGoodbye(String name) {
        return "We are wishing you all the best " + name + ".";
    }
}
