package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSecondHighest {
	public static void main(String[] args) {
		System.out.println("Program starts Here");
		
		List<Integer> numbers = Arrays.asList(1,5,2,7,9,3);
		System.out.println("List of Numbers : "+numbers);
		
		Optional<Integer> optional=numbers.stream().distinct().sorted((a,b) -> b - a ).skip(1).findFirst();
		Integer secondLargest = optional.get();
		
		System.out.println("Second Largest Element in the List : "+ secondLargest);
		
	}

}
 