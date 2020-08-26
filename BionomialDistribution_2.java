import java.util.*;

public class BionomialDistribution_2 {
	private static double ncr(int n ,int r) {
		double ans =1;
		if (r>n/2)
			r=n-r;
		for (int i=1;i<=r;i++) {
			ans *=(n-r+i);
			ans /=i;
		}
		//System.out.println(ans);
		
		return ans;
	}
	private static double bio (int n ,int r,double p) {
	
	return (ncr(n,r)*Math.pow(p, r)*Math.pow(1-p,n-r));
}

	public static void main(String[] args) {
//	Scanner in=new Scanner (System.in);
//	double avg=in.nextDouble();
//	int n=in.nextInt();
//	double p=avg/100;
		double p=0.12;
		int n =10;
	//12 10System.out.println(p);
	double result =0;
	//no more than 2 rejects 
	for (int r=0;r<=2;r++) {
	result +=(bio(n,r,p));
	}
	System.out.printf("%.3f\n",result);
	//atleast 2 
	result =1-bio(n,0,p)-bio(n,1,p);
	System.out.printf("%.3f",result);
	}

}
