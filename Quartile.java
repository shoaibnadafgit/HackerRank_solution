import java.util.Arrays;
import java.util.Scanner;
public class Quartile {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n =in.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(median(arr, 0, n / 2 - 1));
	    System.out.println(median(arr, 0, n - 1));
	    if (n % 2 == 0) {
	        System.out.println(median(arr, n / 2, n - 1));
	    } else {
	        System.out.println(median(arr, n / 2 + 1, n - 1));
	    }

	    in.close();
	}

	private static int median(int[] arr, int start, int end) {
	    int length = end - start + 1;
	    int median = 0;
	    if (length % 2 != 0) {
	        median = arr[start + length / 2];
	    } else {
	        median = (arr[start + length / 2 - 1] + arr[start + length / 2]) / 2;
	    }
	    return median;
	}
}
	
	
	
	
//		double median=0;
//		double sum=0;
//		for (int i=0;i<n;i++) {
//			sum +=arr[i];
//		}
//		double m1=0;
//		double m2=0;
//		double m1Q=0;
//		double m2Q=0;
//		median=sum/n;
//		System.out.println(n/2);
//		if(n%2!=0)
//		{	for (int i =0;i<n/2;i++) {
//			m1+=arr[i];
//		
//		}
//		m1Q=m1/(n/2);
//		for (int i=(n/2+1);i<=n-1;i++) {
//			m2+=arr[i];
//			
//		}		m2Q=m2/(n-1);
//	}
//		else {
//			for (int i =0;i<n/2;i++) {
//				m1+=arr[i];
//			//	m1Q=m1/i;
//			}
//			m1Q=m1/(n/2);
//			for (int i=(n/2);i<=n-1;i++) {
//				m2+=arr[i];
//			
//			}
//			m2Q=m2/(n-1);
//			
//		}
//		
//		System.out.println(m1+" :: "+m2);
//		System.out.println(m1Q+" :: "+m2Q);
//		
//		System.out.println(median);
//		
//
//	}
//
//}
