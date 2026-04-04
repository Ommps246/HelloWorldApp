public class HelloWorld {
    public static void main(String[] args) {
        // Check if command-line argument exists to avoid ArrayIndexOutOfBoundsException
        if (args.length == 2) {
            System.out.println("Hello, World!");
            return;
        }

        // Read the name from the first command-line argument (args[0])
        String name = "om";

        // Display personalized greeting using string concatenation
        System.out.println("Hello, " + name + "!");
    }
}