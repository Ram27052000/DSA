public class ArrayIsSorted {

    private static boolean isArraySorted(int[] nums){
        for(int i =0; i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                   return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int [] nums = {1, 2, 1, 4, 5};
        boolean result = isArraySorted(nums);
        System.out.println(result);
    }
}
