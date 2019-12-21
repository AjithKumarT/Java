package LanguageBasics;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={9,3,10,2,5,5};
		int d[]=a;
		Arrays.sort(a);
		int c=0;
		for(int b:a){
			c+=b;
			System.out.print(b+" ");
		}
System.out.println("sum is "+c);
System.out.println("min no. "+a[0]);
System.out.println("max is "+a[a.length-1]);

	//conventional method sort
System.out.println("conventional method");
int max=0;
   for(int i=0;i<d.length;i++){
	   for(int j=i+1; j<d.length;j++){
		   if(d[i]>d[j]){
			   int temp=d[j];
			   d[j]=d[i];
			   d[i]=temp;
		   }
	   }
   }
   for(int b:a){
	   System.out.print(b+" ");
   }
   // 2d array sort
   System.out.println("2d array");
   int a1[][]={{1,2,5},
		       {2,5,6},
		       {3,1,5},
		       {2,6,10}};
   //sort by column 2 in ascending
   int k=1;
for(int i=0; i<a1.length;i++){
	for(int j=i+1; j<a1.length;j++){
		   if(k==1&& a1[i][k]>a1[j][k]){
			   System.out.println("no. i is "+i+" index & j is "+j+" index "+a1[i][k]+" & "+a1[j][k]);
			   for(int m=0;m<a1[i].length;m++){
				   int temp=a1[i][m];
				   a1[i][m]=a1[j][m];
				   a1[j][m]=temp;
			   }
			   
		   }
	}
}
   System.out.println();
   for(int i=0;i<a1.length;i++){
	   for(int j=0;j<a1[i].length;j++){
		   System.out.print(a1[i][j]+" ");
	   }
	   System.out.println();
   }
   
   System.out.println("Using Arrays.sort for 2d ");
   Arrays.sort(a1, new Comparator<int[]>() {
	   
	@Override
	public int compare(int[] o1, int[] o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1[1], o2[1]);
	}
});
   for(int i=0;i<a1.length;i++){
	   for(int j=0;j<a1[i].length;j++){
		   System.out.print(a1[i][j]+" ");
	   }
	   System.out.println();
   }


	}
}
