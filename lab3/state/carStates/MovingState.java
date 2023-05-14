package lab3.state.carStates;

import lab3.state.interfaces.VehicleState;

public class MovingState implements VehicleState {
    public void handle() {
        System.out.println("Vehicle is moving");
    }
}
