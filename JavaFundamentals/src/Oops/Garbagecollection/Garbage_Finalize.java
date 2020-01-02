package Oops.Garbagecollection;

public class Garbage_Finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rs= Runtime.getRuntime();
		System.out.println("Before "+rs.freeMemory());
		//rs.gc();
		Counter c1=new Counter();
		Counter c2=new Counter();
		c1=null;
		c2=null;
		rs.gc();
		System.out.println("After "+rs.freeMemory());
	}

protected void finalize(){
	Counter.count--;
	System.out.println("count is "+Counter.count);
}
}
class Counter{
	static int count;
	Counter(){
		++count;
		System.out.println("count is "+count);
	}
}