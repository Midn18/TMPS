package lab2.proxy;

public class TestApp {
    public static void main(String[] args) {
        Authenticate authenticate = new ProxyAuthenticate();
        authenticate.login("admin", "admin123");
        authenticate.login("admin", "admin1234");
    }
}
