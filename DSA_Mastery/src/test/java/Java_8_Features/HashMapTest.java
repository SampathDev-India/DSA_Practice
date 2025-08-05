package Java_8_Features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HashMapTest {
	 @Test
	    public void testPutAndGetValue() {
	        HashMapTutorial mapTutorial = new HashMapTutorial();
	        mapTutorial.putValue("apple", 10);
	        Integer value = mapTutorial.getValue("apple");
	        assertEquals(10, value);
	    }

	    @Test
	    public void testGetSize() {
	        HashMapTutorial mapTutorial = new HashMapTutorial();
	        assertEquals(0, mapTutorial.getSize());
	        mapTutorial.putValue("banana", 5);
	        assertEquals(1, mapTutorial.getSize());
	    }

}
