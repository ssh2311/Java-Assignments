interface I2 {
    public void formatString(String s);
}

class StringFormatter {
    public StringFormatter(String s) {
        String result = String.join(" ", s.split(""));
        System.out.println(result);
    }
}

public class M2 {
    public static void main(String[] args) {
        I2 formatter = StringFormatter::new;
        formatter.formatString("CG");
    }
}
