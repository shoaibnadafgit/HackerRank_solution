import java.util.*;
public class Staircase {

	public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
	int n =in.nextInt();
	String s="#";
	  for(int i=0 ; i<n ;i++){
          for(int j = 0; j <= n-i-2; j++){
              System.out.print(" ");
          }
          for(int j = n-i-1 ; j< n; j++){
              System.out.print(s);
          }
          System.out.println();
      }
	
	}

}
/*
 * 5
    #
    ##
    ###
    ####
    #####

 * 	for (int i =1;i<=n;i++) {
		for (int j=1;j<=n-1;j++) {
			System.out.print(" ");
			}
		for(int k=1;k<=i;k++) {
			System.out.print(s);
			}
			System.out.println();
			
		}
	
	}

}

 * 
 * */
 