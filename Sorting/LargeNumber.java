public class LargeNumber {

    private static int largeNumber(int[] arr){
        if(arr.length == 1){
            return arr[0]; 
        }
        int max = arr[0];
        for(int i=1; i<arr.length ;i++){
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int [] arr = {1,2,3,15,5,6,7,8};
        int largeNumber = largeNumber(arr);
        System.out.println(largeNumber);
    }
}
