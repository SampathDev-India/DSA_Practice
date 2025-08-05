package Sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class SortingFirstAndLastNameTest {


    @Test
    public void testSortAsc() {
        SortingFirstAndLastName sorter = new SortingFirstAndLastName();
        List<Map<String, String>> result = sorter.sortAsc();

        assertEquals(5, result.size());

        // Verify the sorted order of FirstNames
        assertEquals("Akesh", result.get(0).get("FirstName"));
        assertEquals("Rahul", result.get(1).get("FirstName"));
        assertEquals("ronith", result.get(2).get("FirstName"));  // Lowercase but sorted by .toLowerCase()
        assertEquals("Sampath", result.get(3).get("FirstName"));
        assertEquals("sudhan", result.get(4).get("FirstName"));
    }

}
