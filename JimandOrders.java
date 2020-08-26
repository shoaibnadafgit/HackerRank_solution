import java.util.*;
public class JimandOrders {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("....");
		int n=in.nextInt();

		int []t=new int[n];
		int []d=new int [n];
		int [][]sum=new int[2][n];
		for (int i=0;i<n;i++) {

			System.out.println("....");
			t[i]=in.nextInt();
			System.out.println("....");
			d[i]=in.nextInt();
			sum[0][i]=t[i]+d[i];
			sum[1][i]=i+1;
		}
		
		int key,j,pos;
		for(int i=0;i<n;i++) {
			key=sum[0][i];
			pos=sum[1][i];
			j=i-1;
			
			while( j>=0 && sum[0][j]>key) {
				sum[0][j+1]=sum[0][j];
				sum[1][j+1]=sum[1][j];
				j=j-1;
			}
			sum[0][j+1]=key;
			sum[1][j+1]=pos;
			
		}
		for (int i =0;i<n;i++) {
			System.out.println(sum[1][i]);
		}
		
	}

}
