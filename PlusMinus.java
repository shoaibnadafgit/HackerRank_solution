import java.util.*;
public class PlusMinus {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		int n=in.nextInt();
		double pos=0;
		double neg=0;
		double zero=0;
		int a[]=new int [n];
		for (int i =0;i<n;i++) {
			a[i]=in.nextInt();
		}
		
		for (int i =0;i<n;i++) {
			System.out.println(a[i]);
		}
		for (int i =0;i<n;i++) {
			if (a[i]>0)
				pos++;
			else if (a[i]<0)
				neg++;
			else 
				zero++;
		}
		System.out.println("possitive : "+pos);
		System.out.println("negative  : "+neg);
		System.out.println("zero : "+zero);
		double pos1=pos/n;
		double neg1=neg/n;
		double zero1=zero/n;
		 System.out.printf("%.6f\n",pos1);
	        System.out.printf("%.6f\n",neg1);
	        System.out.printf("%.6f\n",zero1);
		
		in.close();

	}

}
