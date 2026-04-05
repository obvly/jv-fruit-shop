package core.basesyntax.service;

import core.basesyntax.dao.Storage;
import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {

    @Override
    public String getReport() {
        StringBuilder builder = new StringBuilder("fruit,quantity" + System.lineSeparator());

        for (Map.Entry<String, Integer> entry : Storage.map.entrySet()) {
            builder.append(entry.getKey())
                    .append(",")
                    .append(entry.getValue())
                    .append(System.lineSeparator());
        }

        return builder.toString();
    }
}
