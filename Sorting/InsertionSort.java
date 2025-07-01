public class InsertionSort {

    private static int[] insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int key= arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {7, 8, 9 , 4, 5, 6};
        int [] result = insertionSort(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }
}


//1st iteration
//i=1 ; 1<6
//key=arr[i] arr[0] 7
//j=0
//0>=0 && arr[0] > arr[i]