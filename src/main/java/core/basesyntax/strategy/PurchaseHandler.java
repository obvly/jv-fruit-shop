package core.basesyntax.strategy;

import core.basesyntax.db.Storage;

public class PurchaseHandler implements OperationHandler {
    @Override
    public void handle(String fruit, int quantity) {
        if (quantity < 0) {
            throw new RuntimeException("Quantity cannot be negative");
        }
        Integer current = Storage.get(fruit);
        int currentQty = (current == null) ? 0 : current;
        if (currentQty < quantity) {
            throw new RuntimeException("Not enough fruits in storage");
        }
        Storage.add(fruit, currentQty - quantity);
    }
}
