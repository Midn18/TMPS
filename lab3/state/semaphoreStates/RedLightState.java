package lab3.state.semaphoreStates;

import lab3.state.interfaces.SemaphoreState;

public class RedLightState implements SemaphoreState {
    public void handle() {
        System.out.println("Red light");
    }
}
