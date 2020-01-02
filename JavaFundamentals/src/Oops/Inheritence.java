package Oops;

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.m=10;
		a.n=20;
		a.show();// B show is called method overriding
		((B)a).a1=10;// Since instance variable belong to A class it cannot access B variables directly So casting is done
		a.show();// B show is called method overriding
		a.show1();

	}

}
class A{
	int m,n;
	private int l;
	public int getL() {
		return l;
	}
	public void show(){
		System.out.println("m+n in A "+(m+n));
	}
	public void show1(){
		B b= new B();
		System.out.println("In A show1()");
		b.m=1;
		b.n=1;
		b.a1=1;
		b.show();
	}
	public void setL(int l) {
		this.l = l;
	}
}
class B extends A{
	int a1;
	public void show(){
		System.out.println("a+m+n in B "+(a1+m+n));
		setL(10);
		System.out.println("l is "+getL());
	}
}