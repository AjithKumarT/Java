package LanguageBasics;

public class CommandLineProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length>0){
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		System.out.println("Sum "+(a+b));
		System.out.println("string: welcome "+args[2]);
		}
		else{
			System.out.println("no args");
		}
		

	}

}
