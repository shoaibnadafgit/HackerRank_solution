import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int a[]=new int [n];
		for (int i =0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int b[]=new int [n];
		int j=n;
		for (int i =0;i<n;i++) {
			
			b[j-1]=a[i];
			j=j-1;
		}
		for (int i =0;i<n;i++) {

			System.out.print(b[i]+" ");	
			}
		

	}

}
