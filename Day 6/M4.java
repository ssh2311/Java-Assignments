interface I4 {
    public void calculateFactorial(int n);
}

class FactorialCalculator {
    public FactorialCalculator(int n) {
        System.out.println(factorial(n));
    }

    private int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

public class M4 {
    public static void main(String[] args) {
        I4 factCalc = FactorialCalculator::new;
        factCalc.calculateFactorial(5);
    }
}
