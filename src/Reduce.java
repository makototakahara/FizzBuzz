public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int n = 0;
        while (i > 0) {
            boolean even = i % 2 == 0;
            boolean odd = i % 2 == 1;

            if (even) {
                i = i / 2;
                n += 1;
            }
            if (odd) {
                i -= 1;
                n += 1;
            }
        }
        System.out.println(n);
    }
}

