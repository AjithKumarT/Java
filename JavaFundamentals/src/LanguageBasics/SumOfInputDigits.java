package LanguageBasics;

import java.util.Scanner;

public class SumOfInputDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number ");
		int n=s.nextInt();
		int n1=n;
		int sum=0;
		int sum1=0;
		while(n>0){
			int r=n%10;
			sum= sum*10+r;
		    sum1=sum1+r;
			n=n/10;
			
		}
		System.out.println("reverse of given number is "+sum);
		System.out.println("sum "+sum1);
		System.out.println("sum of individual digit "+n1%9);
		
		//String Reverse
		StringBuilder str= new StringBuilder();
		System.out.println("Enter String ");
		String str1= s.next();
		str.append(str1);
		str=str.reverse();
		System.out.println("Reversed "+str);

	}

}
