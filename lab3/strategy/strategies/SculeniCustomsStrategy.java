package lab3.strategy.strategies;

import lab3.strategy.MapsStrategy;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class SculeniCustomsStrategy implements MapsStrategy {
    @Override
    public void openMap() {
        String URL = "https://goo.gl/maps/aeuxaQD3A5FPJ2wb9";
        try {
            Desktop.getDesktop().browse(new URI(URL));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
