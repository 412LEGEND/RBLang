package lexer;

import java.util.Hashtable;

public class Identifier {
    public static Hashtable<String, Integer> collection = new Hashtable<>();
    public Identifier(String key, Integer value) {
        collection.put(key, value);
    }

    public static Integer getValue(String key) {
        return collection.get(key);
    }
}
