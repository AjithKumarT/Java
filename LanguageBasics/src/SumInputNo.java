
public class SumInputNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		int r=0;
		while(n>0) {
			int l=n%10;
			 r+=l;
			n=n/10;
		}
System.out.println(r);
	}

}
