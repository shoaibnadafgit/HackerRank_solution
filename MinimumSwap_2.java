import java.util.*;
public class MinimumSwap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		int n =in.nextInt();
		int a[]=new int [n];
		for (int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println(bubblesort(a,n));
	}

	private static int bubblesort(int[] arr, int n) {
		//int n = arr.length;
		int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1) continue;
            count++;
            int tmp = arr[i];
            arr[i] = arr[tmp-1];
            arr[tmp-1] = tmp;
            i--;
        }
        return count;
	}

}
