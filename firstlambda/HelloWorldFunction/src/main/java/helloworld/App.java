package helloworld;

/**
 * Handler for requests to Lambda function.
 */
public class App {
    public String hello(final String input) {
        return "Hello " + (input == null || input.isBlank() ? "Josue Lubaki" : input) + "!";
    }
}
