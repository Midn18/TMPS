package lab4.ui;

import java.util.Scanner;

public class ConsoleUI implements UI{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void showMenu() {
        System.out.println("Music Player");
        System.out.println("1. Play");
        System.out.println("2. Pause/Resume");
        System.out.println("3. Previous");
        System.out.println("4. Next");
        System.out.println("5. Stop");
        System.out.println("6. Exit");
    }

    @Override
    public void showNowPlaying(String songName) {
        System.out.println("Now playing: " + songName);
    }

    @Override
    public void showErrorMessage(String message) {
        System.out.println("Error: " + message);
    }

    @Override
    public String getUserInput() {
        System.out.print("Enter choice: ");
        return scanner.nextLine();
    }
}
