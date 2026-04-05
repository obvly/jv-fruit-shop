package core.basesyntax.handler;

import core.basesyntax.OperationHandler;
import core.basesyntax.dao.Storage;

public class BalanceHandler implements OperationHandler {
    @Override
    public void handle(String fruit, int quantity) {
        Storage.map.put(fruit, quantity);
    }
}
