class ArrayEx1{
	public static void main(String arg[])
	{
	 
		int a[][]={{1,2,3},{4,5,6}};
		// System.out.println(a);
		for(int [] y : a)
		{ 
			for(int i : y)
				System.out.print(i + " ");
			System.out.println();
		} 
	}
}