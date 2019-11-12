import java.util.Scanner;

public class CharOrDigitOrSpChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		char a= s.next().charAt(0);
		if(Character.isAlphabetic(a)) {
			System.out.println("alpha");
		}
		else if(Character.isDigit(a)) {
			System.out.println("digit");
		}
		else {
			System.out.println("special char");
		}
		

	}

}
