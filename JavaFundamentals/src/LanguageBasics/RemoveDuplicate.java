package LanguageBasics;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,20,30,10,0,40,20};
		int b[]= new int[a.length];
		int j=0;
		int flag=0;
        int cnt=0;
        int zc=0; //for zeros
		  for (int i=0; i < a.length; i++){
			  flag=0;
			  System.out.println("a[i] "+a[i]);
			  for(int k=0;k<b.length;k++){
				  if(a[i]==b[k]){
					  System.out.println("repeated "+a[i]);
					  if(a[i]!=0){
					  flag++;
					  }
					  else{
						  zc++;
						  if(zc<=1){
							  flag=0;
						  }
					  }
					 

				  }
			  }
			  if(flag==0){
				  b[j++]=a[i];
				  cnt++;
			  }
	        }
		  int c[]=new int[cnt];
		  for(int i=0;i<cnt;i++){
			  c[i]=b[i];
		  }
		  System.out.println("duplicate removed array is: ");
		  for(int i:c){
			  System.out.print(i+" ");
		  }

	}

}
