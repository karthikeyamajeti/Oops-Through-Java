class A{
		interface Nested{
			int max(int x, int y);
		}
}
class MAX implements A.Nested{
	public int max(int x, int y){
		return x>y?x:y;
	}
}
class NestedInterface_Text{
	public static void main(String arg[]){
		MAX m=new MAX();
		System.out.println("Maximum Number:"+m.max(10,20));
	}
}