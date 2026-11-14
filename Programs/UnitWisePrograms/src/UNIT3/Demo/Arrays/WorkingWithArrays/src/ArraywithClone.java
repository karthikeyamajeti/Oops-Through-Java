//Maintains seperate copy to another object
public class ArraywithClone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
	            {10, 20},
	            {30, 40}
	        };

	        int[][] b = new int[a.length][];

	        for (int i = 0; i < a.length; i++) {
	            b[i] = a[i].clone();
	        }

	        b[0][0] = 100;

	        System.out.println("a[0][0] = " + a[0][0]);
	        System.out.println("b[0][0] = " + b[0][0]);
	}

}
