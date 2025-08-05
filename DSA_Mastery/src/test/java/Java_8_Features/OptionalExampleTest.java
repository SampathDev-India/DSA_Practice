package Java_8_Features;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class OptionalExampleTest {
	 @Test
	    public void testGetUpperCaseWithNonNull() {
	        OptionalExample example = new OptionalExample();
	        Optional<String> result = example.getUpperCase("hello");
	        assertTrue(result.isPresent());
	        assertEquals("HELLO", result.get());
	    }

	    @Test
	    public void testGetUpperCaseWithNull() {
	        OptionalExample example = new OptionalExample();
	        Optional<String> result = example.getUpperCase(null);
	        assertFalse(result.isPresent());
	    }

	    @Test
	    public void testIsPresent() {
	        OptionalExample example = new OptionalExample();
	        assertTrue(example.isPresent("test"));
	        assertFalse(example.isPresent(null));
	    }

}
