import java.util.Scanner;

public class MultipleOf3and5 {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);

		Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for(long i=0;i<t;i++){
            long n = sc.nextLong();
            long a=0, b=0, d=0;
            a=(n-1)%3;
            a=n-1-a;
            a=a/3;
            b=(n-1)%5;
            b=n-1-b;
            b=b/5;
            d=(n-1)%15;
            d=n-1-d;
            d=d/15;
            long c= 3*a*(a+1)/2 + 5*b*(b+1)/2 - 15*d*(d+1)/2;
            System.out.println(c);
        }
		
		
		
	}}
		//		int n=in.nextInt();
//	
//		int []arr=new int [n];
//		int []a=new int [n];
//		for (int i =0;i<n;i++) {
//			
//		arr[i]=in.nextInt();
//		if ((arr[i]%3)==0) {
//			a[i]=arr[i];
//		}
//
//		else if(arr[i]%5==0) {
//			a[i]=arr[i];
//		}
//		}
//		
//		int sum=0;
//for (int i =0;i<n;i++) {
//	sum+=a[i];
//}
//System.out.println(sum);
//
//		in.close();
//
//	}
//
//}
