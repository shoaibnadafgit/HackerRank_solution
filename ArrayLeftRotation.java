import java.util.Scanner;

public class ArrayLeftRotation {
	public static int [] rotate(int []a,int n,int d) {
		int roA[]=new int [n];
		for (int oldindex =0;oldindex<n;oldindex++) {
			int newindex =(oldindex+n-d)%n;
			roA[newindex]=a[oldindex];
		}
		return roA;
		
	}
	

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int d=in.nextInt();
		int a[]=new int [n];
		for (int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int result[] =rotate(a,n,d);
		for (int i=0;i<n;i++) {
		System.out.printf("%d ",result[i]);
		}

	}

}
