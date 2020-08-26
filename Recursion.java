import java.util.Scanner;

public class Recursion {
public static int fact(int  n ) {
	if (n<=1) 
		return 1;
	else 
		return n*fact(n-1);
}
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		int n =in.nextInt();
		
		System.out.println(fact(n));

	}

}
