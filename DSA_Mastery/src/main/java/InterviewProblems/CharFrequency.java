package InterviewProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {
	public static void main(String[] args) {
	
		String inputData = "sampath";
		
		// 1. Using HashMap with for Loop 
		charFrequncyUsingHashMap(inputData);
		
		// 2. Using Stream with groupingBy 
		charFrequncyUsingStream(inputData);
		
		
	}
	
	static void charFrequncyUsingHashMap(String input) {
		System.out.println("1. Using HashMap with for Loop");
		Map<Character ,Integer> map = new HashMap<>();
		
		for(Character c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
		System.out.println(map);
		
	}
	
	static void charFrequncyUsingStream(String input) {
		System.out.println("2. Using Stream with groupingBy ");
		
		 Map<Character, Long> freqMap = input.chars()   // IntStream of characters
		            .mapToObj(c -> (char) c)                   // convert int to char
		            .collect(Collectors.groupingBy(
		                c -> c, Collectors.counting()          // group and count
		            ));

		        System.out.println("Stream way: " + freqMap);		
		
	}
}
