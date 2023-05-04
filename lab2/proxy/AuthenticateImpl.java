package lab2.proxy;

public class AuthenticateImpl implements Authenticate {

    @Override
    public void login(String username, String password) {
        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}
