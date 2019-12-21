package Oops;

public class Constructor_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b= new Box();
		System.out.println(b.volume(10,10,10));
		System.out.println(Calculator.powerInt(10, 2));
		System.out.println(Calculator.powerDouble(10.10, 2.00));

	}

}
class Box{
	int volume;
   public int volume(int width, int height, int depth){
		volume=width*height*depth;
		return volume;
	}
}
