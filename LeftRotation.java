import java.util.*;
public class LeftRotation {

	public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
	int n=in.nextInt();
	int arr[]=new int [n];
	int d=in.nextInt();
	
	for (int i =0;i<n;i++) {
		arr[i]=in.nextInt();
	}
	int temp=0;
	for (int i =0;i<d;i++) {
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;

		
		
	}
	for (int i:arr) {
		System.out.println(i);
	}
	
	
	
	}

}
