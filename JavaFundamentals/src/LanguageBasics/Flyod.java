package LanguageBasics;

import java.util.Scanner;

public class Flyod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter no.");
		int n=s.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=1;j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
