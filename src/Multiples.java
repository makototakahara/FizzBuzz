public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int n = 0;
        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {
                n += 1;
            }
            i += 1;
        }
        System.out.println(n);
    }
}