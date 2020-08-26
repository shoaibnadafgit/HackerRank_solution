import java.util.Scanner;

public class DiagonalDiffrence {

	private static int diffrence (int a[][],int n) {
		int sum_i=0;
		int sum_j=0;
		for (int i =0;i<n;i++)
		{
			for (int j =0;j<n;j++) 
			{
				if (i==j)
					sum_i+=a[i][j];
				if(j==n-i-1)
					sum_j+=a[i][j];
			}
		}
		return Math.abs(sum_i-sum_j);
	}
	public static void main(String[] args) {
		Scanner sn=new Scanner (System.in);
		int n =sn.nextInt();
		int a[][]=new int [n][n];
		
		for (int i =0;i<n;i++) {
			for (int j =0;j<n;j++) {
				a[i][j]=sn.nextInt();
			}
		}
		sn.close();
		System.out.println(diffrence(a,n));
	}
	

}
