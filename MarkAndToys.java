package HackerRank_Sorting;
import java.util.*;
public class MarkAndToys {
	static int maximumToys(int[] prices, int k) {

	     int count=0,sum=0;  
	     Arrays.sort(prices);  
	     for(int i=0;i<prices.length;i++)
	     {
	         if(sum <= k)
	         {
	             sum=sum+prices[i];
	             count++;
	         }


	     }
	     return count-1;
	     }

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n =in.nextInt();
		int k=in.nextInt();
		int a[]=new int [n];
		for (int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		//System.out.println(maximumToys(a, k));
		
		Arrays.sort(a);
		int toys=0;
		int ct=0;
		for(int i =0;i<n;i++) {
			if(k>=toys) {
			toys+=a[i];
			ct++;
			}
			
		}
		System.out.println(ct-1);
		

	}

}
