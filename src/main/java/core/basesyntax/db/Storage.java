package core.basesyntax.db;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private static final Map<String, Integer> fruits = new HashMap<>();

    public static void add(String fruit, int quantity) {
        fruits.put(fruit, quantity);
    }

    public static Integer get(String fruit) {
        return fruits.get(fruit);
    }

    public static Map<String, Integer> getAll() {
        return new HashMap<>(fruits);
    }
}
