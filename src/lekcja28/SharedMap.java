package lekcja28;

import java.util.HashMap;
import java.util.Map;

public class SharedMap {
    Map<String, String> sharedMap;

    public SharedMap() {
        sharedMap = new HashMap<>();
    }

    public Map<String, String> getSharedMap() {
        return sharedMap;
    }
}
