class Student{  
	 @Override
	 public String toString(){//overriding the toString() method  
		 
		return "PVPSIT" ;  
	}  
}
class UseofToString_Annotation {
	 public static void main(String args[]){  
		Student s1=new Student();
		System.out.println(s1);//by default compiler writes - s2.toString()  
	 }  
}  
 