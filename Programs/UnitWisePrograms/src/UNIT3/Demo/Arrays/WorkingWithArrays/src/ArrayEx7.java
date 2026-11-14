class ArrayEx7 {
    public static void print(int[] a){ 
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	public static void main(String[] args) { 
        	int[] a = new int[]{1, 2, 3, 4, 5};
        	System.out.println("Array values prior to resize: ");
        	print(a);
        	a=new int[]{4,4,4,4,4, 4,4,4,4,4,4,4,4,4,4};
        	System.out.println("Array values after resize: ");
        	print(a);
    }
}