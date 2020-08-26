import java.util.Scanner;

public class Insertion_sort1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n =in.nextInt();
		int a []=new int [n];
		
		for (int i = 0;i <n ;i++) {
			a[i]=in.nextInt();
		}
		
		//insertion sort
		
		int temp,j;
		for (int i =0;i<n;i++) 
		{
			temp =a[i];
			j=i;
			//increment insertion sort
			
			for (;(j>0 && a[j-1]>temp);j--) 
			//decrement insetion sort 
		    //for (;(j>0 && a[j-1]<temp);j--)
			{
				a[j]=a[j-1];
				System.out.print(a[j]+" ");
				
			}
			
			a[j]=temp;
			
		}
		
		for (int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	
	}

}
