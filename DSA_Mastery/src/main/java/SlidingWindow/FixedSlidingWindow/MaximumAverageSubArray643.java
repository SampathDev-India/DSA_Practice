package SlidingWindow.FixedSlidingWindow;

public class MaximumAverageSubArray643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        double maxAvg = findMaxAverage(nums, k);
        System.out.println("Maximum Average Subarray of size " + k + " is: " + maxAvg);
    }

    //find the
    public static double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            throw new IllegalArgumentException("Array length must be at least k");
        }

        double maxSum = 0;
        double currentSum = 0;

        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        // Slide the window over the array
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k]; // Add next element and remove the first element of the previous window
            maxSum = Math.max(maxSum, currentSum); // Update max sum if current sum is greater
        }

        return maxSum / k; // Return the maximum average
    }
}
