package lexer;

import java.util.Hashtable;

public class Identifier {
    private Hashtable<String, Integer> collection;
    public Identifier(String id, Integer value) {
        collection.put(id, value);
    }
    public Integer getValue(String id) {
        return collection.get(id);
    }
}
