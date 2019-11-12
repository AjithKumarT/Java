import java.util.Scanner;

public class AscendingString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char a=s.next().charAt(0);
		char b=s.next().charAt(0);
		System.out.println("lesser is "+(a<b?a:b));
		
	}
}
