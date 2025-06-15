package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingFirstAndLastName {
	public void sortAsc() {
		List<Map<String, String>> l = new ArrayList<>();
		Map<String,String> map1 = new HashMap<>();
		
		map1.put("FirstName", "Sampath");
		map1.put("LastName", "Kumar");
		map1.put("EmpNumber", "1");
		
		Map<String,String> map2 = new HashMap<>();
		
		map2.put("FirstName", "Rahul");
		map2.put("LastName", "Raj");
		map2.put("EmpNumber", "2");
		Map<String,String> map3 = new HashMap<>();
		
		map3.put("FirstName", "Akesh");
		map3.put("LastName", "Anil");
		map3.put("EmpNumber", "3");
		Map<String,String> map4 = new HashMap<>();
		
		map4.put("FirstName", "ronith");
		map4.put("LastName", "sing");
		map4.put("EmpNumber", "4");
		Map<String,String> map5 = new HashMap<>();
		
		map5.put("FirstName", "sudhan");
		map5.put("LastName", "oo");
		map5.put("EmpNumber", "5");
		
		l.add(map1);
		l.add(map2);
		l.add(map3);
		l.add(map4);
		l.add(map5);
		

        // Sort the list by FirstName, then LastName
        l.sort(Comparator
                .comparing((Map<String, String> m) -> m.get("FirstName").toLowerCase()) // case-insensitive
                .thenComparing(m -> m.get("LastName").toLowerCase()));
        
        //if its a list of pojoModel         
//        Collections.sort( );

        // Print the sorted list
        for (Map<String,String> map : l) {
            System.out.println("EmpNumber: " + map.get("EmpNumber") +
                    ", FirstName: " + map.get("FirstName") +
                    ", LastName: " + map.get("LastName"));
        }
		

	}
	
}
