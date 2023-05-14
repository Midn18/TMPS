package lab3.command.commandTypes;

import lab3.command.PartsStoreOptions;

public class OrderBrakesCommand implements Command {
    private PartsStoreOptions partsStoreOptions;

    public OrderBrakesCommand(PartsStoreOptions partsStoreOptions) {
        this.partsStoreOptions = partsStoreOptions;
    }

    public void execute() {
        partsStoreOptions.orderBrakes();
    }
}
