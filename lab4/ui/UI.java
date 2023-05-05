package lab4.ui;

public interface UI {
    void showMenu();
    void showNowPlaying(String songName);
    void showErrorMessage(String message);
    String getUserInput();
}
