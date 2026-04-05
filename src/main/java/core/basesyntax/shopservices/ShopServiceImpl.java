package core.basesyntax.shopservices;

import core.basesyntax.OperationHandler;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.OperationStrategy; // Импортируй свою стратегию
import java.util.List;

public class ShopServiceImpl implements ShopService {
    private final OperationStrategy strategy;

    // Конструктор: говорим, что для работы нам ОБЯЗАТЕЛЬНО нужна стратегия
    public ShopServiceImpl(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void process(List<FruitTransaction> transactions) {
        for (FruitTransaction transaction : transactions) {
            // Теперь поле strategy доступно
            OperationHandler handler = strategy.get(transaction.getOperation());
            handler.handle(transaction.getFruit(), transaction.getQuantity());
        }
    }
}
