package Java_8_Features;

import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {
		public static void main(String[] args) {
			
			Map<String, Integer> map = new HashMap<>();			 
			 map.put("one",1);
			 map.put("two",2);
			 map.put("three",3);
			 
			 System.out.println("Print map all Keys : "+map.keySet());
			 System.out.println("Print map all values : "+map.values());

		} 
}
