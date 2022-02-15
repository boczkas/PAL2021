package lekcja31;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SharedMap {
    Map<String, Integer> sharedMap;

    public SharedMap() {
        sharedMap = new ConcurrentHashMap<>();
    }

    public Map<String, Integer> getSharedMap() {
        return sharedMap;
    }
}
