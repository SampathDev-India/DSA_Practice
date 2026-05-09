package TwoPointerPattern;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3};

        System.out.println("Printing the elements given Array");
        for(int i=0; i<nums.length;i++){
            System.out.println(nums[i]);
        }

        int i=0;
        for(int j =1; j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        i =i+1;
        System.out.println("Distinct elements : "+i);

        System.out.println("Check the elements : ");
        for(int k=0; k<nums.length;k++){
            System.out.println(nums[k]);
        }
    }
}
