import java.util.Scanner;

public class AppleOreange {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int s=in.nextInt();
		int t=in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
		int m=in.nextInt();
		int n=in.nextInt();
		int apple[]=new int [m];
		int orange[]=new int [n];
		int applecount=0;
		int orangecount=0;
		for (int i =0;i<m;i++) 
		{
			apple[i]=in.nextInt();
			if(a+apple[i] >= s && a+apple[i] <= t)
			applecount++;
		}

		for (int i =0;i<n;i++) 
		{
			orange[i]=in.nextInt();
			if(b+orange[i] >= s && b+orange[i] <= t)
			orangecount++;
		}
		System.out.println(applecount);
		System.out.println(orangecount);
in.close();

	}

}
