package lab1.abstractFactory.animals.wild;

import lab1.abstractFactory.Animal;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Wolf implements Animal {
    @Override
    public void animalSound() {
        try {
            File file = new File("src/LAB1/abstractFactory/sounds/wild/wolf.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getType() {
        return "Wild";
    }
}
