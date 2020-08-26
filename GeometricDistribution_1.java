import java.util.Scanner;;
public class GeometricDistribution_1 {
	
	private static double geo(int x,double p) {
		return (Math.pow(1-p,x-1)*Math.pow(p, 1)) ;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		double a=in.nextInt();
		double b=in.nextInt();
		int x=in.nextInt();
		
		System.out.printf("%.3f",geo(x,a/b));
		in.close();

	}

}
