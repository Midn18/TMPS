package lab4;

import lab4.musicPlayer.MusicPlayer;
import lab4.ui.ConsoleUI;

public class MusicPlayerApp {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer(new ConsoleUI());
        musicPlayer.run();
    }
}
