 class Dog   {
  }
class UseofObjectClass{
	    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog();

        System.out.println("Class Name: " + dog.getClass() ); //dog.getClass().getName() 
        System.out.println("Hash Code: " + dog.hashCode()); 
        System.out.println("String Representation: " + dog.toString());  

         }
}