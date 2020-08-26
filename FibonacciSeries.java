import java.util.Scanner;

public class FibonacciSeries {

	

    public static int fibonacci(int n) {
        if(n < 2)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
 
//		Scanner in = new Scanner (System.in);
//		int n = in.nextInt();
//		int first = 0 ;
//		int second = 1;
//		System.out.print(first+" ");
//		for (int i =2 ; i<n ;++i) {
//			//fibonacci logic 
//			System.out.print(second+" ");
//			int sum = 0;
//			sum = first+second;
//			first = second ;
//			second = sum ;
			
			
		}

	}


