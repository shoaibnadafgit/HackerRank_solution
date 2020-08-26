import java.util.Scanner;
//input 148 3 , 9875,123 3
// output 3,8,9
public class RecursiveDigitSum {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
	        String n = in.nextLine();//9875
	        int k = in.nextInt();
	        int result = SuperDigit(n,k);
	        System.out.println(result);
	       
	    
	        in.close();

	}

	private static int SuperDigit(String n, int k) {
		int sum =0;
		for (int i =0;i<n.length();i++) {
			sum = sum +Integer.parseInt( n.charAt(i)+"");//9+8+7+5 //29
		}
		sum = SuperSigleDigit(sum *k); //concatination //29*4 //116 
		return sum ;
		
		
		
	}

	private static int SuperSigleDigit(int n) {
		
		if(n<10) {
			return n;}
		else 
		{ //in this calculate sum of single digit logic 
			int num = 0 ;
			while (n>0) {
			num += n%10;
			n = n/10;} //1+1+6 = 8
			return SuperSigleDigit(num);
		}
		
		
	}

}
