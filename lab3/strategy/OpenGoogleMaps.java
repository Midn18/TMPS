package lab3.strategy;

public class OpenGoogleMaps {
    private final MapsStrategy mapsStrategy;

    public OpenGoogleMaps(MapsStrategy mapsStrategy) {
        this.mapsStrategy = mapsStrategy;
    }

    public void openMap() {
        mapsStrategy.openMap();
    }
}
