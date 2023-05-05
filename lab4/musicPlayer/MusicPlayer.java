package lab4.musicPlayer;

import lab4.ui.UI;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer implements MusicPlayerInterface {
    private List<String> songs;
    private int currentSongIndex = 0;
    private boolean isPlaying = false;
    private UI ui;
    private Clip clip;
    private long clipPosition = 0;

    public MusicPlayer(UI ui) {
        this.ui = ui;
        this.songs = new ArrayList<>();
        this.songs.add("src/lab4/music/Sade_-_Smooth_Operator.wav");
        this.songs.add("src/lab4/music/Sting-Englishman-In-New-York-.wav");
        this.songs.add("src/lab4/music/Modjo_-_Lady_Hear_Me_Tonight.wav");
    }

    @Override
    public void play() {
        if (songs.size() == 0) {
            ui.showErrorMessage("No songs to play");
            return;
        }

        if (clip != null) {
            clip.stop();
            clip.close();
        }

        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(songs.get(currentSongIndex)));
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            isPlaying = true;
            clip.start();
            ui.showNowPlaying(this.songs.get(this.currentSongIndex));
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            ui.showErrorMessage("Failed to open audio file: " + e.getMessage());
        }
    }

    @Override
    public void pause() {
        if (songs.size() == 0) {
            ui.showErrorMessage("No songs to pause");
            return;
        }

        if (clip != null) {
            if (clip.isRunning()) {
                clipPosition = clip.getMicrosecondPosition();
                clip.stop();
                isPlaying = false;
            } else {
                clip.setMicrosecondPosition(clipPosition);
                clip.start();
                isPlaying = true;
            }
        }

        ui.showNowPlaying(this.songs.get(this.currentSongIndex));
    }

    @Override
    public void previous() {
        if (songs.size() == 0) {
            ui.showErrorMessage("No songs to play");
            return;
        }

        if (clip != null) {
            clip.stop();
            clip.close();
            clipPosition = 0;
        }

        if (currentSongIndex == 0) {
            currentSongIndex = songs.size() - 1;
        } else {
            currentSongIndex--;
        }

        if (isPlaying) {
            play();
        } else {
            ui.showNowPlaying(this.songs.get(this.currentSongIndex));
        }
    }

    @Override
    public void next() {
        if (songs.size() == 0) {
            ui.showErrorMessage("No songs to play");
            return;
        }

        if (clip != null) {
            clip.stop();
            clip.close();
            clipPosition = 0;
        }

        if (currentSongIndex == songs.size() - 1) {
            currentSongIndex = 0;
        } else {
            currentSongIndex++;
        }

        if (isPlaying) {
            play();
        } else {
            ui.showNowPlaying(this.songs.get(this.currentSongIndex));
        }
    }

    @Override
    public void stop() {
        if (songs.size() == 0) {
            ui.showErrorMessage("No songs to stop");
            return;
        }

        isPlaying = false;
        currentSongIndex = 0;
        if (clip != null) {
            clip.stop();
            clip.close();
        }
        ui.showNowPlaying(this.songs.get(this.currentSongIndex));
    }

    @Override
    public void run() {
        String choice = "";
        while (!choice.equals("6")) {
            ui.showMenu();
            choice = ui.getUserInput();
            switch (choice) {
                case "1":
                    play();
                    break;
                case "2":
                    pause();
                    break;
                case "3":
                    previous();
                    break;
                case "4":
                    next();
                    break;
                case "5":
                    stop();
                    break;
                case "6":
                    break;
                default:
                    ui.showErrorMessage("Invalid choice");
            }
        }
    }
}
