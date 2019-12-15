package LanguageBasics;

public class Operators {
     static int c=100;
	public static void main(String[] args) {
		
		//SimpleAssingmentOperator
		int a=10;
		int b=20;
		c=++c;
		//accessing static variable 
		 System.out.println(c);
		 staticCall();
		
		// ArithmeticOperator
		System.out.println("a+b " +(a+b));
		System.out.println("a-b " +(a-b));
		System.out.println("a*b " +(a*b));
		System.out.println("a/b " +(a/b) +" & b/a " +(b/a));
		System.out.println("a%b " +(a%b));
		//UnaryOperator
		System.out.println("increment ++a " +(++a));
		System.out.println("decrement --b " +(--b));
		
		//RelationalOperator
		String s1="hello";
		String s2="World";
		String s3="hello";
		System.out.println("s1==s2 " +(s1==s2));
		System.out.println("s1==s3 " +(s1==s3));
		System.out.println("s1.equals(s2) " +s1.equals(s2));
		System.out.println("s1.equals(s3) " +s1.equals(s3));
		System.out.println("a<=b " +(a<=b));
		System.out.println("s1!=s2 " +(s1!=s2));
		System.out.println("!s1.equals(s3) " +(!s1.equals(s3)));
		
		//LogicalOperator
		System.out.println("a<=b && a>0" +(a<=b && a>0 ));
		System.out.println("a>=b || a>0" +(a<=b && a>0 ));
		
		//ShiftOperator
		int d=27;
		System.out.println("d<<2 " +(d<<2));  //leftshift ( d* 2^2)
		System.out.println("d<<<2 " +(d<<2));  //leftshift( <<< unsigned left shift not allowed)
		System.out.println("18>>3 " +(18>>3));  //rightshift (18/ 3^2)
		System.out.println("18>>>3 " +(18>>>3));  //unsignedrightshift
		
		//bitwiseOperator
		System.out.println("5&3 " +(5&3));  //bitwise&
		System.out.println("5|3 " +(5|3));  //bitwise|
		System.out.println("5^3 " +(5^3));  //bitwise^ (same bit 0, different bit 1)
		
		//boolean
		boolean chk= a>b;
		System.out.println("chk "+chk);
		

	}
	public static void staticCall(){
		
		System.out.println("instatic method " +c);
	}

}
