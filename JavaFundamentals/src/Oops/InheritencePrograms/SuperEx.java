package Oops.InheritencePrograms;

public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child c=new Child(10);
		Child c=new Child(10,"ajith");
		c=new Child("Hi","Ajith");

	}

}
class Parent{
	int n;
	String s;
	Parent(){
		System.out.println("Parent ");
	}
	Parent(int n, String s){
		 this.n=n;
		 this.s=s;
		System.out.println("Parent constructor arg value is "+n +" and " +s);
	}
}
class Child extends Parent {

	Child(int i) {
       //invokes Parent()
	 }
	 Child(int i, String n){//needs parent class default constructor otherwise call it with super() 
		 System.out.println("child 2nd Constructor"); 
	 }
	 Child(String s, String s1){
		 this(s,s1,"hello");
	 }
	 Child(String s, String s1, String s3){
		 System.out.println("values are "+s+" "+s1+" "+s3);
	 }
	
}