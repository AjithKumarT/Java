package LanguageBasics;

import java.util.Scanner;

public class ArrayPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]= {1,3,5,7,9};
		int b[]=new int[5];
		int d[]=a;
		System.arraycopy(a, 0, b, 0, a.length);
		for(int c:b){
			System.out.print(c);
		}
		System.out.println();
		for(int e:d){
			System.out.print(e);
		}
		System.out.println();
		// two dimensional array
		int two[][]= new int[3][];
		two[0]=new int[1];
		two[1]=new int[2];
		two[2]=new int[3];
		
		for(int i=0; i<two.length;i++){
			for(int j=0;j<two[i].length;j++){
				System.out.println("Enter no. ");
				two[i][j]=s.nextInt();
			}
		}
		for(int i=0; i<two.length;i++){
			for(int j=0;j<two[i].length;j++){
               System.out.print(two[i][j]);
			}
			System.out.println();
		}	

	}

}
