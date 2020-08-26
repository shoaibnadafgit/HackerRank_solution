import java.util.Scanner;

public class Divisible_sum_pairs {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n =in.nextInt();
		int k=in.nextInt();
		int a[]=new int [n];
		for (int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int  count =0;
		for(int i =0;i<n-1;i++) {
			//int sum=0;
			for (int j =i+1;j<n;j++) {
				int sum=0;
				sum=a[i]+a[j];
			if(sum%k==0)count++;
			}
		}
	System.out.println(count);
	}

}
