package core.basesyntax.strategy;

import core.basesyntax.db.Storage;

public class SupplyHandler implements OperationHandler {
    @Override
    public void handle(String fruit, int quantity) {
        if (quantity < 0) {
            throw new RuntimeException("Quantity cannot be negative");
        }
        Integer current = Storage.get(fruit);
        int currentQty = (current == null) ? 0 : current;
        Storage.add(fruit, currentQty + quantity);
    }
}
