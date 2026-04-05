package core.basesyntax.strategy;

import core.basesyntax.db.Storage;

public class BalanceHandler implements OperationHandler {
    @Override
    public void handle(String fruit, int quantity) {
        if (quantity < 0) {
            throw new RuntimeException("Quantity cannot be negative");
        }
        Storage.add(fruit, quantity);
    }
}
