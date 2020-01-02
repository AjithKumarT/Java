package Oops.Polymorphism;

public class PolymorphEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.m1();

	}

}
class A{
	public void m1(){
		System.out.println("A");
	}
	
}
class B extends A{
	B(){
		System.out.println("AB");
	}
	public void m1(){//method overriding
		super.m1();// to call parent method first when overriding happen
		System.out.println("B");
	}
}