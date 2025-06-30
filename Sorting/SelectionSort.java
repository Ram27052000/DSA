//Before getting into this remember to call a non static method inside an main you need
//to call an object or just make the method as static

//Selection Sort Algorithm
//1. Assume the first element index as minimum element index.
//2. Find the minIndex by comparing with the assumed.
//3. After finding the min element just make them swapped
//4. All the elements in the array will be sorted at the end

public class SelectionSort {

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 2, 1};
        int[] result = selectionSort(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
