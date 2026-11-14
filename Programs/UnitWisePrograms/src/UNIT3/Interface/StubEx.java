interface Test2
{ 
      void show();    
      void show1();    
}
class Testing2 implements Test2 
{
   public void show()
   {
      System.out.println("show method of interface");
   } 
    public void show1() {    } 
} 
class StubEx
{
   public static void main(String[] args){
       Testing2 t = new Testing2();
       t.show();
	   
   } 
}