package InterviewProblems;
/**
 *  Seperate the digits and characters
 */
public class SeperateDigitsAndCharacters {
	public static void main(String[] args) {
		String inputData = "1a2b3c";
		System.out.println("Given Input String : "+inputData);
		StringBuilder digits = new StringBuilder();
		StringBuilder charaters = new StringBuilder();
		for(char c : inputData.toCharArray()) {
			if(Character.isDigit(c)) {
				digits.append(c);
			}else {
				charaters.append(c);
			}
			
		}
		
		System.out.println(digits+" "+charaters);
	}

}
