// Example of using StringBuilder in Java

public class StringBuilder_Example {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append strings
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");

        // Convert to String and print
        System.out.println(sb.toString());
    }
}