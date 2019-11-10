import java.util.Scanner;

public class AddArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Args number "+args[0]);
		System.out.println("Enter input no. ");
		int n= s.nextInt();
		System.out.println("Entered number "+n);
		System.out.println("Addition "+(Integer.parseInt(args[0])+n));


	}

}
