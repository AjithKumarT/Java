package LanguageBasics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter RGB color code ");
		String c=s.next();
		switch(Character.toUpperCase(c.charAt(0))){
		case 'R':
			System.out.println("Red");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		default:
			System.out.println("Invalid color code");
		
		}

	}

}
