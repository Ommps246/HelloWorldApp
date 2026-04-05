public class HelloWorld {
    public static void main(String[] args) {
        String names;

        // Check if command-line arguments were provided
        if (args.length > 0) {
            // Join all names with ", " using String.join()
            names = String.join(", ", args);
        } else {
            names = "World";  // Default value
        }

        // Display single personalized greeting with all names
        System.out.println("Hello, " + names + "!");
    }
}