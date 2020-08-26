import java.util.*;
public class CountingValleysUsingString {

	public static void main(String[] args) {
//		int total=0;
//		int count=0;
//		
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter the number of steps :\n");
//		int n=in.nextInt();
//		String s=null;
//		in.nextLine();
//		s=in.nextLine();
//		Character c1=new Character('U');
//		Character c2=new Character('D');
//		
//		for (int i =0;i<s.length();i++) {
//			char c=s.charAt(i); //this line converts String to Char we called as Auto-boxing 
//			if (c1.equals(c)) {
//				count++;}
//			else if (c2.equals(c)) {
//				count--;
//				if (count==-1) {
//					total++;
//				}
//			}
//			
//		}
//	System.out.println("Total hike : "+total);
		
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int counter = 0;
	        int base = 0;
	        int total=0;
	       // String str = null;
	        in.nextLine();
	       String str = in.nextLine();
	        Character c1 = new Character('U');
	        Character c2 = new Character('D');
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	    
	            if (c1.equals(c)) {
	                counter++;
	            } else if (c2.equals(c)) {
	                counter--;
	                if (counter == -1) {
	                    total++;
	                }
	            }
	        }
	        System.out.print("Base :"+base);
	}

}
