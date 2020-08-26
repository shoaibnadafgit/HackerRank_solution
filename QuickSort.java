package HackerRank_Sorting;
import java.lang.reflect.Array;
import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n =in.nextInt();
		int a[]=new int [n];
		for (int i =0;i<n;i++) {
			a[i]=in.nextInt();
		}
		
			
		quicksort(a,0,n-1);
		for(int i=0;i<n;i++) { 
	        System.out.println(a[i]);  
	    }  
	}

	private static void quicksort(int[] a, int left, int right) {
		if(left<right)
		{
			int pivot=partition(a,left,right);
			quicksort(a, left, pivot-1); 
            quicksort(a, pivot+1, right);	
		}
		
		
	}

	private static int partition(int[] a, int left, int right) {
		int pivot =a[right];
		int i=left-1;
		for(int j =left;j<right;j++) {
			
		if(a[j]<pivot) {
			i++;
			int tmp=a[i];
			a[i]=a[j];
			a[j]=tmp;
		}
		
		}
		int tmp=a[i+1];
		a[i+1]=a[right];
		a[right]=tmp;


		return i+1;
	}

}

