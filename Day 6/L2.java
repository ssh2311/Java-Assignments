interface I2 {
    public String formatString(String s);
}

public class L2 {
    public static void main(String[] args) {
        I2 formatter = (s) -> String.join(" ", s.split(""));
        System.out.println(formatter.formatString("CG"));
    }
}
