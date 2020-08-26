import java.util.Scanner;

public class BirthdayCakeCandle {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int arr[]=new int [n];
		int count =0;
		int high=0;
		for (int i =0;i<n;i++) {
			arr[i]=in.nextInt();
			if(arr[i]>high)
				high=arr[i];
		}
		for (int i=0;i<n;i++) {
			
		if (arr[i]==high) {
			count ++;
		}
		}
		System.out.println(count);
		in.close();

	}

}
