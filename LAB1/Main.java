package LAB1;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("CLEI");
        System.out.println(singleton.value);
    }
}
