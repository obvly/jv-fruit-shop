package core.basesyntax.handler;

import core.basesyntax.OperationHandler;
import core.basesyntax.dao.Storage;

public class ReturnHandler implements OperationHandler {
    @Override
    public void handle(String fruit, int quantity) {
        int currentQuantity = Storage.map.getOrDefault(fruit, 0);
        Storage.map.put(fruit, currentQuantity + quantity);
    }
}
