package lab3.command.commandTypes;

import lab3.command.PartsStoreOptions;

public class OrderTiresCommand implements Command {
    private PartsStoreOptions partsStoreOptions;

    public OrderTiresCommand(PartsStoreOptions partsStoreOptions) {
        this.partsStoreOptions = partsStoreOptions;
    }

    public void execute() {
        partsStoreOptions.orderTires();
    }
}
