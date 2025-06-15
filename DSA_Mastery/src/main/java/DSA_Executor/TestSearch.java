package DSA.program;

import SearchingPattern.LinearSearch;

public class TestSearch {
	public static void main(String[] args) {
		System.out.println("Searching ...");
		
		int[] arr = {1,2,3,4,5,7};
		LinearSearch ls = new LinearSearch();
		ls.find(arr,7);
		if(5>7) {
			System.out.println("True");
		}else
			System.out.println("false");

	}

}
