import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String in= s.next();
		StringBuilder r= new StringBuilder();
		r.append(in);
		r=r.reverse();
		System.out.println("reversed "+r);

		//digits
		int in1= s.nextInt();
		StringBuilder r1= new StringBuilder();
		r1.append(in1);
		r1=r1.reverse();
		System.out.println("reversed "+r1);
	}

}
