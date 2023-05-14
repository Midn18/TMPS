package lab3.state;

import lab3.state.carStates.MovingState;
import lab3.state.carStates.StoppedState;
import lab3.state.carStates.TurningState;
import lab3.state.context.Semaphore;
import lab3.state.context.Vehicle;
import lab3.state.sempahoreStates.GreenLightState;
import lab3.state.sempahoreStates.RedLightState;
import lab3.state.sempahoreStates.YellowLightState;

public class DrivingVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Semaphore semaphore = new Semaphore();

        semaphore.handle();
        vehicle.handle();
        vehicle.setState(new MovingState());

        semaphore.setState(new YellowLightState());
        semaphore.handle();
        semaphore.setState(new GreenLightState());
        semaphore.handle();
        vehicle.handle();
        vehicle.setState(new TurningState());
        vehicle.handle();

        semaphore.setState(new RedLightState());
        semaphore.handle();
        vehicle.setState(new StoppedState());
        vehicle.handle();
    }
}
