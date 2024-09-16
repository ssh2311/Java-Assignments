interface I4 {
    public int factorial(int n);
}

public class L4 {
    public static void main(String[] args) {
        I4 factCalc = (n) -> f(n);

        System.out.println(factCalc.factorial(5));
    }

    private static int f(int n) {
        if (n == 0) {
            return 1;
        }
        return n * f(n - 1);
    }
}
