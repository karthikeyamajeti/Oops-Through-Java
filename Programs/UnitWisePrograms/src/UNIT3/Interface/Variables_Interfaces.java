interface left
{
	int i=10;
}
interface right
{
	int i=100;
}
class Variables_Interfaces implements left,right
{
	public static void main(String args[])
	{
 		System.out.println(left.i);//10 will be printed
		System.out.println(right.i);//100 will be printed*/
	}
}
