import java.util.Arrays;
class Bubble_Sort {
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {  //no of passes
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1]) {
                   int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
                }
            }  
        }
    }
    public static void main(String[] args){
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Original array: "+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
     }
}