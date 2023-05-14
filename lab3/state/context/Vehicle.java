package lab3.state.context;

import lab3.state.carStates.StoppedState;
import lab3.state.interfaces.VehicleState;

public class Vehicle {
    private VehicleState state;

    public Vehicle() {
        state = new StoppedState();
    }

    public void setState(VehicleState state) {
        this.state = state;
    }

    public void handle() {
        state.handle();
    }
}
