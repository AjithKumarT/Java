package Oops.InheritencePrograms;

public class SuperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         C c=new C();
         c=new C(10);
	}

}
class A{
	A(){
		System.out.println("A");
	}
	A(int a){
		System.out.println("A args "+a);
	}
}
class B extends A{
	B(){
		System.out.println("B");
	}
	B(int a){
		this("ajith");
		System.out.println("B arg "+a);
	}
	B(String s){
		System.out.println("B string "+s);
	}
}
class C extends B{
	C(){
		System.out.println("C");
	}
	C(int a){
		super(100);
		System.out.println("C arg "+a);
	}
}