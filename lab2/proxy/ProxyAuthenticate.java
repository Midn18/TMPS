package lab2.proxy;

public class ProxyAuthenticate implements Authenticate {

    private AuthenticateImpl authenticateImpl;

    public ProxyAuthenticate() {
        authenticateImpl = new AuthenticateImpl();
    }

    @Override
    public void login(String username, String password) {
        if (validateLogin(username, password)) {
            authenticateImpl.login(username, password);
        } else {
            System.out.println("Login failed. Invalid username or password");
        }
    }

    private boolean validateLogin(String username, String password) {
        return (username.equals("admin") && password.equals("admin123"));
    }
}
