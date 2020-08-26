import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubString_comparison {

	/*
	 *        String smallest = "";
        String largest = "";

        String[] list = new String[s.length() - k + 1];
        for (int i = 0; i <= s.length() - k; i++) {
            String str = s.substring(i, i+k);
            list[i] = str;
        }

        smallest = list[0];
        largest = list[0];
        for(int i = 1; i < list.length; i++) {
            if (list[i].compareTo(smallest) < 0) {
                smallest = list[i];
            }

            if (list[i].compareTo(largest) > 0){
                largest = list[i];
            }
        }

        return smallest + "\n" + largest;
    } 
	 */
	 
	 
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner scn=new Scanner (System.in);
		String S=scn.next();
		int number=scn.nextInt();
		//taken sorted set is because : we will get string directly in sorted manner
		SortedSet<String> sets=new TreeSet<String> ();
		
		for (int i =0;i<=S.length()-number ;i++)
			sets.add(S.substring(i,i+number));
		System.out.println(sets.first());
		System.out.println(sets.last());
	}

}

