class ArrayEx5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // Call the method and pass the array as an argument
        printArray(numbers);
        // Modify the array in another method
        doubleArrayValues(numbers);
        // Print the modified array
        System.out.println("Array after modification:");
        printArray(numbers);
    }
    // Method to print each element of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // Method to double each element in an array
    public static void doubleArrayValues(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] *= 2;  // Double the value of each element
        }
    }
}