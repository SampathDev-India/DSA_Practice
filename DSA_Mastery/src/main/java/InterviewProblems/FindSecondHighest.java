package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighest {
	public static void main(String[] args) {
		System.out.println("Program starts Here");
		
		List<Integer> numbers = Arrays.asList(1,5,2,7,9,3);
		System.out.println("List of Numbers : "+numbers);
		
		//approach 1 without comparator
		Optional<Integer> optionalNonComparator =Optional.of(numbers.stream()
														.distinct()
														.sorted((a,b) -> b - a ) //approach 1
														.skip(1)
														.findFirst()
														.orElse(-1)); 
		
		//approach 2 with comparator
		Optional<Integer> optional=numbers.stream()
										  .distinct()
										  .sorted(Comparator.reverseOrder() )
										  .skip(1)
										  .findFirst();

		Integer secondLargest = optional.get();
		
		System.out.println("Second Largest Element in the List : "+ secondLargest);
		
	}

}
 