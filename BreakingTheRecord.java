import java.util.Scanner;

public class BreakingTheRecord {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int no_game=in.nextInt();
		int score[]=new int [no_game];
		for (int i =0;i<no_game;i++) {
			score[i]=in.nextInt();
		}
		int max=score[0];
		int min=score[0];
		int maxcount=0;
		int mincount=0;
		for (int i=0;i<no_game;i++) {
			if(max<score[i]) {
				max=score[i];
				maxcount++;
			}
			if(min>score[i]) {
				min=score[i];
				mincount++;
			}
			
		}
	
//		System.out.println(max+ " "+(maxcount) );
//		System.out.println("++++++++++++");
//		System.out.println(min+ " "+(mincount) );
		System.out.println(maxcount + " "+ mincount);

	}

}
