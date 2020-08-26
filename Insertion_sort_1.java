import java.util.Scanner;

public class Insertion_sort_1 {

	static void insertionSort1(int n, int[] arr) 
    {
        int a=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<a)
            {
                arr[i+1]=a;
                print(arr);
                break;
            }
            else
            {
                arr[i+1]=arr[i];
                print(arr);
                if(i==0)
                {
                    arr[i]=a;
                    print(arr);
                }          
            }
            
        }
    }
    static void print(int a[])
    {
        for(int i:a)
        System.out.print(i+" ");
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		int n =in.nextInt();
		int a []=new int [n];
		
		for (int i = 0;i <n ;i++) {
			a[i]=in.nextInt();
		}
		insertionSort1(n, a);
		
	}

}
