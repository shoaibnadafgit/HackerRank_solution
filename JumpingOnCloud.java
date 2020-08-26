import java.util.Scanner;

public class JumpingOnCloud {
	private static int jump(int arr[]) {
		int i =0;
		int num_jump=0;
		while(i<arr.length-1) {
		if (i+2==arr.length || arr[i+2]==1) {
			i++;
			num_jump++;
		}
		else {
			i+=2;
			num_jump++;
		}
	}return num_jump;
		}

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int arr[]=new int [n];
		//reading values 
		for (int i =0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		in.close();
//		int result=jump(arr);
		System.out.println(jump(arr));
		System.out.println(arr.length);
		//we cant use in array like arr.length() .we cant invoke length method 
		
	}

}
