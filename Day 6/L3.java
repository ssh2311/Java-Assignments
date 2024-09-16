interface I3 {
    public boolean authenticate(String username, String password);
}

public class L3 {
    public static void main(String[] args) {
        I3 auth = (username, password) -> {
            String validUsername = "user123";
            String validPassword = "pass123";
            return username.equals(validUsername) && password.equals(validPassword);
        };
        System.out.println(auth.authenticate("user123", "pass123"));
        System.out.println(auth.authenticate("user123", "pass1234"));
    }
}
