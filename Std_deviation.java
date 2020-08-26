import java.util.Scanner;

public class Std_deviation {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n =in.nextInt();
		double arr[]=new double [n];
		for (int i =0;i<n;i++) {
			arr[i]=in.nextDouble();
		}
		double mean =0;
		double sum=0;
		for (int i =0;i<n;i++) {
			sum+=arr[i];
		}
		mean =sum/n;
		//double arr1[]=new double[n];
		double sub=0;
		double arr1=0;
		//System.out.println("mean :"+mean);
		for (int i =0;i<n;i++) {
			sub=(arr[i]-mean)*(arr[i]-mean);
			//System.out.println("sub :"+sub);
			//arr1+=(sub*sub);
			arr1+=sub;
			
		}
		//System.out.println(arr1);
		System.out.printf("%.1f",Math.sqrt(arr1/n-1));
		
		

	}

}
