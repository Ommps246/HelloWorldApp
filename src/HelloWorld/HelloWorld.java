public class HelloWorld {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();

        // Check if no arguments provided
        if (args.length == 0) {
            nameBuilder.append("World");
        } else {
            // Enhanced for loop: append ALL names + ", " (including last one)
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", " using substring() - last 2 characters
            if (nameBuilder.length() > 2) {
                nameBuilder.delete(nameBuilder.length() - 2, nameBuilder.length());
                // OR: nameBuilder.substring(0, nameBuilder.length() - 2);
            }
        }

        // Display single personalized greeting
        System.out.println("Hello, " + nameBuilder + "!");
    }
}