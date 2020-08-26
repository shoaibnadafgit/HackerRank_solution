import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n =in.nextInt();
		
		
		String ans;
		if((n % 2 == 1) || ((n % 2 == 0) && (n >=6 && n <= 20))) {
		    ans = "Weird";
		}
		else {
		    ans = "Not Weird";
		}
		System.out.println(ans);
//		if(n%2==1) {
//			
//			if(n<=2) {
//				if(n>=5)
//					System.out.println("Not Weird");
//			}
//			else if(n<=6) {
//				if(n>=20)
//					System.out.println("Weird");
//				}
//				else if (n>20) {
//					System.out.println("Not Weird");
//				}
//		}
//		else {
//			System.out.println("Weird");
//		}

	}

}
