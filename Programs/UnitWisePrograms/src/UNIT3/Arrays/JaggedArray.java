class JaggedArray {
    public static void main(String[] args) {
        // Initialize a jagged array with 3 rows
        int[][] ja = new int[3][];
        // Define varying lengths for each row
        ja[0] = new int[]{1,2};  // First row with 2 columns
        ja[1] = new int[]{1,2,3,4};  // Second row with 4 columns
        ja[2] = new int[]{1,2,3};  // Third row with 3 columns
       
        // Display the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < ja.length; i++) {
            for (int j = 0; j < ja[i].length; j++) {
                System.out.print(ja[i][j] + " ");
            }
            System.out.println();
        }
    }
}