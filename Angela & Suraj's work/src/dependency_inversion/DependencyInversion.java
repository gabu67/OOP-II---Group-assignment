// Dependency Inversion Principle Example in Java
public class DependencyInversion {
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString(); // Change the code above.
    }
}