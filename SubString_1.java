import java.util.*;
public class SubString_1 {

	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		String s=scn.next();
		int start =scn.nextInt();
		int end =scn.nextInt();
		
		for (int i =start ;i<=end-1;i++)
		{
			System.out.print(s.charAt(i));
		}

	}

}
