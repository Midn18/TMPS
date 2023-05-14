package lab3.command;

import lab3.command.commandTypes.Command;

public class StoreManager {
    private Command orderBrakesCommand;
    private Command orderTiresCommand;

    public void setOrderBrakesCommand(Command orderBrakesCommand) {
        this.orderBrakesCommand = orderBrakesCommand;
    }

    public void setOrderTiresCommand(Command orderTiresCommand) {
        this.orderTiresCommand = orderTiresCommand;
    }

    public void orderBrakes() {
        orderBrakesCommand.execute();
    }

    public void orderTires() {
        orderTiresCommand.execute();
    }
}
