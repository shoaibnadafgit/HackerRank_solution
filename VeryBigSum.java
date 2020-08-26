
import java.util.*;
public class VeryBigSum {

	public static void main(String[] args) {
		long total=0;
		Scanner in =new Scanner (System.in);
		int n =in.nextInt(); //no of integers
		int arr[]=new int [n]; //for array 
		for (int i = 0;i<n;i++) {
			arr[i]=in.nextInt();
			total+=arr[i];
		}System.out.println(total);
	}

}
