import java.util.Scanner;
public class GeometricDistribution_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		double a=in.nextDouble();
		double b=in.nextDouble();
		double p=a/b;
		int x=in.nextInt();
		double q=1-p;
		System.out.printf("%.3f",1-Math.pow(1-p,x));
		System.out.println();
		System.out.printf("%.3f",1-Math.pow(q,x));

	}

}
