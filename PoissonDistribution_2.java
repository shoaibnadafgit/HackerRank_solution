import java.util.Scanner;

public class PoissonDistribution_2 {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		double A=in.nextDouble();
		double B=in.nextDouble();
		double dailycostA = 160 + 40*(A+(A*A));
		double dailycostB = 128 + 40*(B+(B*B));
		
		System.out.printf("%.3f%n",dailycostB);
		System.out.printf("%.3f%n",dailycostB);
				

	}

}
