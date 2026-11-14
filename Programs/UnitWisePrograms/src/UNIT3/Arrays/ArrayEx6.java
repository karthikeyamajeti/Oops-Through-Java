class ArrayEx6 {
    public static void main(String[] args) {  
		// Declare and initialize the first array
        int[] array1 = {1, 2, 3, 4, 5};
        // Assign array1 to array2 (this is reference assignment)
        int[] array2 = array1;
        
        array2[0] = 10; 
        array1[2] = 2000;
        print(array1);print(array2);
    }
    static void print(int[] a)
    {
        for (int num : a ) {
            System.out.print(num + " ");
        }  
        System.out.print("\n");
    }
}