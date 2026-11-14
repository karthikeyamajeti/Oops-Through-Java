class ArrayEx1{
	public static void main(String arg[])
	{
	 
		int a[][]={
					{1,2,3},
					{4,5,6}
				};
			
		
		
		 for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	     }
		 
		 
		 /* 
		  	a.length → number of rows = 3
			a[i].length → number of columns in row i
			a[i][j] → element at row i, column j
		  */
		 for (int i = 0; i < a.length; i++) //a.length  number of rows
		 {
	            for (int j = 0; j < a[i].length; j++) //a[i].length → number of columns in row i
	            {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	     }
		 System.out.println("\n");
		
		
		 System.out.println("\n");
		 
		for(int [] y : a) //y represents one complete row
		{ 
			for(int i : y) //i represents each element in that row
				System.out.print(i + " ");
			System.out.println();
		} 
	}
}