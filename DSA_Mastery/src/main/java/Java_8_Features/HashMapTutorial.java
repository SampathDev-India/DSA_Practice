package Java_8_Features;

import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {
	 private Map<String, Integer> map = new HashMap<>();

	    public void putValue(String key, Integer value) {
	        map.put(key, value);
	    }

	    public Integer getValue(String key) {
	        return map.get(key);
	    }

	    public int getSize() {
	        return map.size();
	    }

}
