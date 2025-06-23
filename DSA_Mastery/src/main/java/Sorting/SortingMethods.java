package Sorting;

import java.util.Arrays;

public class SortingMethods {
	/**
	 * Selection sort get the element one by one compare to other upcomming elements 
	 * @param arr
	 * @return
	 */
	public static int[] selectionSort(int[] arr) {		
		for(int i=0; i<arr.length-1;i++) {
			int min = arr[i];
			for(int j=i+1;j<arr.length;j++) {  // select one element compare upcomming elements 
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}				
			}
		}
		return arr;
	}
	
	/**
	 * bubble sort  get two element compare the elements (comparison n-1 pass times)
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort(int[] arr) {		
		for(int i=1; i<arr.length-1;i++) { // n-1 times this loop will execute 
			int min = arr[i];
			for(int j=0;j<arr.length -i;j++) {    // each time reduce the length like ---> arr.length -i
				if(arr[j+1]<arr[j]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}				
			}
		}
		return arr;
	}
	
	/**
	 * Insertion sort 
	 * @param arr
	 * @return
	 */
	public static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) { // why i =1 means we need two numbers to compare --> arr[0] >arr[1]
			for(int j=i;j>0;j--) {
				if(arr[j] <arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					
				}else
					break;
			}
		}
		return arr;
	}
	
	/**
	 * Merge sort (Divide and conquere aproach ) we are using recursion
	 * Recursion using call by value
	 * @param arr
	 * @return
	 */
	public static int[] mergeSort(int[] arr) {
		if(arr.length==1)
			return arr;
		int mid = arr.length/2;
		
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		

		return merge(left, right);
	}
	

	public static int[] merge(int[] left,int[] right) {
		int i=0, j=0,k=0;
		int[] join = new int[left.length+right.length];
		
		while(i<left.length && j<right.length) {
			if(left[i]< right[j])
				join[k++] = left[i++];
			else
				join[k++] = right[j++];			
		}
		while(i<left.length) {
			join[k++] = left[i++];
		}
		while(j<right.length) {
			join[k++] = right[j++];
		}
		
		return join;
	}
	
	
	/**
	 * Performing merge sort using recursion  (Its a stable sort)
	 * call by reference 
	 * @param arr
	 * @param start
	 * @param end
	 * @return 
	 */
	public static void mergeSortInPlace(int[] arr,int start,int end) {
		if(end-start ==1)
			return ;
		int mid = start+end/2;		
		
		mergeSortInPlace(arr, start, mid);
		mergeSortInPlace(arr, mid, end);	
		
		mergeInPlace(arr,start,mid,end);

	}	
	
	public static void mergeInPlace(int[] arr, int s ,int m, int e) {
		int i=s, j=e,k=0;
		int[] join = new int[e-s]; 
		
		while(i<m && j<e) {
			if(arr[i]< arr[j]) 
				join[k++] = arr[i++];
			else
				join[k++] = arr[j++];			
		}
		while(i<m) {
			join[k++] = arr[i++];
		}
		while(j<e) {
			join[k++] = arr[j++];
		}
		
		for(k=0;k<join.length;k++) {
			arr[s+k]= join[k];
		}
		
	}
	
	/**
	 * Quick sort
	 * @param arr
	 * @param low
	 * @param high
	 */
	public static void quickSort(int[] arr, int low, int high) {
		
		if(low >= high) 
			return;		
		
		int start = low;
		int end = high;
		int mid = (start+end)/2;
		int pivot = arr[mid];
		
		while(low<= end) {
			while(arr[start] < pivot)
				start++;
			while(arr[end] > pivot)
				end--;
			if(start <=end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}			
		}
		
		quickSort(arr,low ,end);
		quickSort(arr,start, high);
	}
}
