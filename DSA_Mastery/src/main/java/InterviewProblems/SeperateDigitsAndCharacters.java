package InterviewProblems;

import java.util.stream.Collectors;

/**
 *  Seperate the digits and characters
 */
public class SeperateDigitsAndCharacters {
	public static void main(String[] args) {
		String inputData = "1a2b3c";
		System.out.println("Given Input String : "+inputData);
		
		//Approach 1 using for Loop 
		StringBuilder digits = new StringBuilder();
		StringBuilder charaters = new StringBuilder();
		
		for(char c : inputData.toCharArray()) {
			if(Character.isDigit(c)) {
				digits.append(c);
			}else {
				charaters.append(c);
			}
			
		}		
		System.out.println("Digits : "+digits+"\nCharacters : "+charaters);
		
		//Approach 2 using Stream	
//		Map<Boolean, List<Character>> charMap = inputData.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.partitioningBy(Character::isDigit));
//
//        System.out.println("Digits: " + charMap.get(true));
//        System.out.println("Non-digits: " + charMap.get(false));
	}

}
