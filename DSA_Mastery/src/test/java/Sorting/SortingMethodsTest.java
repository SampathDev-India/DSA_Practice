package Sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SortingMethodsTest {
	

    @Test
    public void testSelectionSort() {
        int[] input = {5, 2, 9, 1, 3};
        int[] expected = {1, 2, 3, 5, 9};
        assertArrayEquals(expected, SortingMethods.selectionSort(input));
    }

    @Test
    public void testBubbleSort() {
        int[] input = {4, 2, 7, 1};
        int[] expected = {1, 2, 4, 7};
        assertArrayEquals(expected, SortingMethods.bubbleSort(input));
    }

    @Test
    public void testInsertionSort() {
        int[] input = {9, 3, 5, 1};
        int[] expected = {1, 3, 5, 9};
        assertArrayEquals(expected, SortingMethods.insertionSort(input));
    }

    @Test
    public void testMergeSort() {
        int[] input = {8, 4, 6, 2};
        int[] expected = {2, 4, 6, 8};
        assertArrayEquals(expected, SortingMethods.mergeSort(input));
    }

    @Test
    public void testMergeSortInPlace() {
        int[] input = {10, 7, 3, 1};
        int[] expected = {1, 3, 7, 10};
        SortingMethods.mergeSortInPlace(input, 0, input.length);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort() {
        int[] input = {9, 5, 2, 7, 1};
        int[] expected = {1, 2, 5, 7, 9};
        SortingMethods.quickSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

}
