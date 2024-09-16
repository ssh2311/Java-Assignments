interface I3 {
    public void authenticate(String username, String password);
}

class Authenticator {
    public Authenticator(String username, String password) {
        String validUsername = "user123";
        String validPassword = "pass123";
        boolean isAuthenticated = username.equals(validUsername) && password.equals(validPassword);
        System.out.println(isAuthenticated ? "Authentication Successful" : "Authentication Failed");
    }
}

public class M3 {
    public static void main(String[] args) {
        I3 auth = Authenticator::new; // Constructor reference
        auth.authenticate("user123", "pass123");
        auth.authenticate("user123", "pass1234");
    }
}
