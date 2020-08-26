import java.util.*;
public class NewYearChaos {

	public static void main(String[] args) {
		
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		for (int t_i=0;t_i<t;t_i++) {
			int n =in.nextInt();
			int a[]=new int [n];
			for (int i =0;i<n;i++)
				a[i]=in.nextInt();
			in.close();
			int bribe=0;
			boolean chaos=false;
			for (int j=0;j<n;j++) {
				if (a[j]-(j+1)>2) {
					chaos=true;
				break;}
				else 
					for (int j1 = Math.max(0, a[j]-1-1); j1 < j; j1++)
		                if (a[j1] > a[j]) 
		                    bribe++;
			}
			if(chaos)
				System.out.println("Too chaotic");
			else
				System.out.println(bribe);
			
			
		}

	}

}
