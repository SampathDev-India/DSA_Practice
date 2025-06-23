package DSA_Executor;

import Sorting.SortingMethods;
import Sorting.SortingFirstAndLastName;

public class TestSorting {
	public static void main(String[] args) {
//		System.out.println("Test the sorting program using firstName and lastName");
//		SortingFirstAndLastName s = new SortingFirstAndLastName();		
//		s.sortAsc();
		
		System.out.println("Selection Sort Testing ");
		SortingMethods selSort = new SortingMethods();
		int[] arr = {2,3,12,53,6,95,25};
//		int[] sortedArr =selSort.selectionSort(arr);
//		int[] sortedArr =selSort.bubbleSort(arr);
//		int[] sortedArr =selSort.insertionSort(arr);		
//		int[] sortedArr =selSort.mergeSort(arr);	
//		SortingMethods.mergeSortInPlace(arr,0,arr.length);	
		selSort.quickSort(arr,0,arr.length-1);
		

		for(Integer i: arr) {
			System.out.println(" "+i);
		}
		
	}

}
