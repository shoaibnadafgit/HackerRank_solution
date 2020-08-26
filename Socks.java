
import java.util.*;
public class Socks {
    static int count;

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the number of elements : \n");
	        int n = in.nextInt();
	        int arr[]=new int [n];
	        System.out.println("Enter the array :: \n");
	        for (int i =0;i<n;i++) {
	        	arr[i]=in.nextInt();
	        	
	        }
	        Arrays.sort(arr);
	        for(int i = 0;i<n;i++) {
	        System.out.println("Array : "+arr[i]);
	        }   
	        for (int i =0;i<n-1;i++) {
	        	
	        	if (arr[i]==(arr[i+1])) {
	        		System.out.println("  +++");
	        		count++;
	        		i++;
	        	
	        	}
	        
	        }
	    System.out.println("==============================");
	    	System.out.println("pairs : "+count);     
	 }
	 }
	