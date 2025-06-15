package SearchingPattern;

/**
 * to search starting to till end that the reason this is linearSearch
 * assignment - min , max , find starts with s and count, four digit number sum  
 */
public class LinearSearch {

	// check the value is present in the array return the index
	public int find(int[] arr, int val) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				System.out.println("Value matching possition : "+i);
				return i;
			}
		}
		
		return -1;
	}
	
public boolean contains(int[] arr, int val) {		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				System.out.println("Value matching possition : "+i);
				return true;
			}
		}		
		return false;
	}
}
