package HackerRank_Sorting;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int array[]=new int [n];
		for (int i=0;i<array.length;i++) {
			array[i]=in.nextInt();
		}
		
		//int result =bubblesort(array);
		
System.out.println("Array is sorted in "+bubblesort(array)+" swaps.");
System.out.println("First Element: "+array[0]);
System.out.println("Last Element: "+array[n-1]);

	}

	private static int bubblesort(int[] array) {
		int n =array.length;
		int c =0;
		
		for (int i =0; i < n ;i++) {
			for (int j=0; j < n-1 ;j++) {
				
				if(array[j]>array[j+1]) {
					
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
						c++;
				}
			}
		
		}
		
		
		return c;
	}

}
