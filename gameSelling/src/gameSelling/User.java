package gameSelling;

import java.util.HashMap;

public class User implements IValidate {
    private String userid;
    private String password;
    private static HashMap<String, String> users = new HashMap<>();

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addUser(String userid, String password) {
    	if (users.containsKey(userid)) {
    		// System.out.println("User with the same id is already added. Try with a different id.");
    		if(IsAuthenticated(userid, password)) {
    			System.out.println("User logged in successfully");
    		}
    		return;
    	}
        users.put(userid, password);
        System.out.println("User added");
    }

    @Override
    public boolean IsAuthenticated(String userid, String password) {
        return users.containsKey(userid) && users.get(userid).equals(password);
    }

    @Override
    public String toString() {
        return "User ID: " + userid;
    }
}
