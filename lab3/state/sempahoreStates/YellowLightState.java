package lab3.state.sempahoreStates;

import lab3.state.interfaces.SemaphoreState;

public class YellowLightState implements SemaphoreState {
    public void handle() {
        System.out.println("Yellow light");
    }
}