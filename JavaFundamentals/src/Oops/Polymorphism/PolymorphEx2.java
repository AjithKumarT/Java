package Oops.Polymorphism;

public class PolymorphEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		s.draw();
		s=new Circle();
		s.draw();
		s=new Rectangle();
		s.draw();

	}

}
class Shape{
	public void draw(){
		System.out.println("Shape");
	}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("Circle");
	}
}
class Rectangle extends Shape{
	public void draw(){
		System.out.println("Rectangle");
	}
}