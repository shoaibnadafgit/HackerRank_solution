import java.util.Scanner;

public class MaximumStreak {
static int head;
static int tails;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String []ss=new String[n];
		for (int i =0;i<n;i++) {
			ss=new String[i];
			for(int l =0;l<n;l++){
				if ( ss[l]==(ss[l+1])) {
					head++;
				}
//				else if (s.equals("T")&&s.equals(s+i)) {
//					tails++;
//				}
				}
		}
		
		
		System.out.println(head+" "+tails);

	}

}
