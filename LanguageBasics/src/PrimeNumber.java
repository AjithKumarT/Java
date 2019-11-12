
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prime from 0 to 99
		for(int i=2; i<100; i++) {
			int flag=0;
			int m=i/2;
			for(int k=2; k<=m;k++) {
				if(i%k==0) {
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.println(i+" ");
				
			}
		}

	}

}
