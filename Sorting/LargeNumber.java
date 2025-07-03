public class LargeNumber {

    public static void main(String[] args){
        int[] nums = {3,3,6,8};
        if(nums.length == 1){
            System.out.println(nums[0]);
            return;
        }
        int max = nums[0];
        for(int i=1; i<nums.length ;i++){

            if(max < nums[i]){
                max = nums[i];
            }
            System.out.println("max" +max);
        }

    }
}
