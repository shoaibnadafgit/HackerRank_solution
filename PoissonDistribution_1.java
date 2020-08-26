import java.util.Scanner;

public class PoissonDistribution_1 {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		double lmda=in.nextDouble();
		int k=in.nextInt();
		System.out.printf("%.3f",poissonDis(lmda,k));

	}

	private static double poissonDis(double lmda, int k) {
		
		return (Math.pow(lmda, k)*Math.pow(Math.E,-1*lmda))/factorial(k);
	}

	private static int factorial(int k) {
		int result =1;
		if (k<0)
			return 0;
		while(k>0) {
			result *=k--;
		}
		return result;
	}

}
