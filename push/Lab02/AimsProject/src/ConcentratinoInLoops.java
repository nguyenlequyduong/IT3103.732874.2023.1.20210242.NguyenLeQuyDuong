import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        // Create a Random object with seed value 123
        Random r = new Random(123);

        // Record the start time
        long start = System.currentTimeMillis();

        // Using string concatenation in a loop
        String s = "";
        for (int i = 0; i < 65536; i++)
            s += r.nextInt(2);

        // Print the time taken for string concatenation
        System.out.println(System.currentTimeMillis() - start); // This prints roughly 4500.

        // Re-initialize the Random object with the same seed value for fair comparison
        r = new Random(123);

        // Record the start time again
        start = System.currentTimeMillis();

        // Using StringBuilder to concatenate strings in a loop
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++)
            sb.append(r.nextInt(2));

        // Convert StringBuilder to String
        s = sb.toString();

        // Print the time taken for StringBuilder
        System.out.println(System.currentTimeMillis() - start); // This prints 5.
    }
}
