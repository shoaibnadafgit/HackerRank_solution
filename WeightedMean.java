import java.util.*;

public class WeightedMean {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		int[]arr=new int [n];
		int []wt=new int [n];
		for (int i =0;i<n;i++) {
		arr[i]=scn.nextInt();
	}
		double wtsum=0.0;
		for (int i =0;i<n;i++) {
			wt[i]=scn.nextInt();
			wtsum+=wt[i];
		}
		double wtmean=0.0;
		for (int i=0;i<n;i++) {
			wtmean+=arr[i]*wt[i];
		}
		wtmean=wtmean/wtsum;
		System.out.printf("%.1f",wtmean);		
}

}

/*
 * 
 * */
 