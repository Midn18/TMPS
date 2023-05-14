package lab3.state.context;

import lab3.state.interfaces.SemaphoreState;
import lab3.state.semaphoreStates.RedLightState;

public class Semaphore {
    private SemaphoreState state;

    public Semaphore() {
        state = new RedLightState();
    }

    public void setState(SemaphoreState state) {
        this.state = state;
    }

    public void handle() {
        state.handle();
    }
}
