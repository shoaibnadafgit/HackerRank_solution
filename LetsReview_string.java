import java.util.*;

public class LetsReview_string {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		int test =in.nextInt();
		in.nextLine();
		
		
		for (int t=0;t<test;t++) {
		String str=in.next();
		String even ="",odd="";
		
		for (int i =0;i<str.length();i++) {
			
			if (i%2==0) 
				even+=str.substring(i,i+1);
			else 
				odd+=str.substring(i,i+1);

			
		}
		System.out.println(even+" "+odd);
	
		}
		
		
	}

}
