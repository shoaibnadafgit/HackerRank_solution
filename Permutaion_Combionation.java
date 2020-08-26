import java.util.Scanner;
public class Permutaion_Combionation {
public static int ncr(int n ,int r) {

	int ans =1;
	if (r>n/2)
		r=n-r;
	for (int i =1;i<=r;i++) {
		ans *=(n-r+i);
		ans/=i;
	}
	
	return ans;
}
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the n :");
		int n =in.nextInt();
		System.out.println("Enter the r :");
		int r=in.nextInt();
		
		System.out.println(ncr(n,r));

	}

}
