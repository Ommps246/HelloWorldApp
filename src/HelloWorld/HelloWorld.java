public class HelloWorld{
    public static void main(String[] args) {
        String names;

        // Check if arguments provided, use String.join() magic!
        if (args.length == 0) {
            names = "World";
        } else {
            // ONE LINE: joins ALL args with ", " - NO trailing comma!
            names = String.join(", ", args);
        }

        // Single greeting
        System.out.println("Hello, " + names + "!");
    }
}