interface I1 {
    public double calpower(int x, int y);
}

public class L1 {

    public static void main(String[] args) {
        I1 cal = (a, b) -> {
            return Math.pow(a, b);
        };

        System.out.println(cal.calpower(4, 2));
    }
}