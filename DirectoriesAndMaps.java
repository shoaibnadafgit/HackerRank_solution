import java.util.HashMap;
import java.util.Scanner;

public class DirectoriesAndMaps {

	public static void main(String[] args) {
		HashMap<String, Integer> h1=new HashMap<String,Integer>();
		Scanner in=new Scanner (System.in);
		int n =in.nextInt();
		
		for (int i =0 ;i <n ;i++) {
		String a=in.next();
		Integer b=in.nextInt();
		h1.put(a,b);
		}
		while(in.hasNext()) {
		String s=in.next();
		if(h1.get(s)!=null)
			System.out.println(s + "=" + h1.get(s) );
		else 
			System.out.println("not found ");
		}

	}

}
