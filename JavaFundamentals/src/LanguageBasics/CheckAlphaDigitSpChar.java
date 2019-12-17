package LanguageBasics;

import java.util.Scanner;

public class CheckAlphaDigitSpChar {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ");
		String n= sc.nextLine();
		System.out.println(n);
		if(Character.isDigit(n.charAt(0))){
			System.out.println("digit");
		}
		else if(Character.isAlphabetic(n.charAt(0))){
			System.out.println("char");
		}
		else{
			System.out.println("sp char");
		}
		
		
	}

}
