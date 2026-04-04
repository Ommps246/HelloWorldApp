public class HelloWorld{
    public static void main(String[] args) {
        String name;

        // Check if command-line argument was provided
        if (args.length > 0) {
            name = args[0];  // Use provided name
        } else {
            name = "World";  // Use default value
        }

        // Display personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}