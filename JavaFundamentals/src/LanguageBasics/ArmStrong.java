package LanguageBasics;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=n;
		int arm=0;
		while(n>0){
			int r=n%10;
			arm+=Math.pow(r, 3);
			n=n/10;
		}
		if(arm==n1){
			System.out.println("Given no "+n1 +" is Armstrong no.");
		}
		else{
			System.out.println("Not Armstrong");
		}

	}

}
