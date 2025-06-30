//1.Compare the adjacent elements
//2.Check if the number is greater
//3.if yes just swap it
//4.in this way larger element bubbles up to the last
//5. Don't forget to subtract the i in the inner loop which reduces the iterations for effiency
public class BubbleSort {

    private static int[] bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int [] arr = {5,2,4,1};
        int [] bubbleSort = bubbleSort(arr);
        for (int i : bubbleSort){
            System.out.println(i);
        }
    }
}
