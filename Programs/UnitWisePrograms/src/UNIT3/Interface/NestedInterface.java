interface Test
{ 
   interface Yes   
   {
      void show();    
   }
   interface No 
   {
      void show();    
   }
}
class Testing implements Test 
{
  
} 
class NestedInterface
{
   public static void main(String[] args){
       Testing t = new Testing();
     //  t.show();
   } 
}







