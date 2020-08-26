import java.util.Scanner;

public class BionomialDistribution_1 {
private static double ncr(int n , int r ) {
	int ans =1;
	//ncr
	if(r>n/2)
		r=n-r;
	 for (int i=1;i<=r;i++) {
		 ans *=(n-r+i);
		 ans/=i;
	 }
	 
	 
	 return ans; 
}
private static double bio (int n,int r,double p) {
	return (ncr(n,r)*Math.pow(p, r)*Math.pow(1-p, n-r));
}
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		double ratio1 =in.nextDouble();
		double ratio2 =in.nextDouble();
		//System.out.println(ratio1+" "+ratio2);
		double p =ratio1/(1+ratio1);
		double ans=0;
		int n =6;
		int r=3;
		for (int i=3;i<=n;i++) {
		ans+=(bio(n,i,p));
		}
//		double P=Math.pow(p,r);
//		double Q=Math.pow(1-p, n-r);
//		ans=ans*P*Q;
		System.out.printf("%.3f",ans);
//		if(r>n/2)
//			r=n-r;
//		 for (int i=0;i<r;i++) {
//			 ans *=(n-r+i);
//			 ans/=i;
//		 }
		

	}

}
