package LanguageBasics;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prime no. from 1 to 100
		int c=0;
		for(int i=2; i<100; i++){
			int f=0;
			int m=i/2;
			for(int j=2; j<=m;j++){
				if(i%j==0){
					f=1;
					break;
				}
			}
			if(f==0){
				System.out.println(i);
				c++;
			}
		}
		System.out.println("count is "+c);

	}

}