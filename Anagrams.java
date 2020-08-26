import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static int numberNeeded(String first, String second) {

	    int flength=first.length();
	    int slength=second.length();
	   //System.out.println("flength is"+flength);
	    //System.out.println("slength is"+slength);                 
	    char f[]=first.toCharArray();
	    char s[]=second.toCharArray();
	    int count=0;
	    int ans=0;
	    if(flength>slength)
	    {
	        for(int i=0;i<flength;i++)
	        {
	             for(int j=0;j<slength;j++)
	             {
	              if(f[i]==s[j])
	              {
	                  //s[j]=0;
	                  count++;
	                  //break;
	             }
	             }
	        }
	     // System.out.println("if part");
	      ans=flength-count; 
	    }
	    else if(flength<slength)
	    {
	        for(int i=0;i<flength;i++)
	        {
	             for(int j=0;j<slength;j++)
	             {
	              if(f[i]==s[j])
	              {

	                  s[j]=0;
	                  count++;

	               break;

	             }

	             }

	        }
	      //System.out.println("elseif part");
	      ans=(flength+slength)-(2*count); 

	    }
	    else
	    {
	        for(int i=0;i<flength;i++)
	        {
	            for(int j=0;j<slength;j++)
	            {
	                if(f[i]==s[j])
	                {
	                    count++;
	                    //f[i]=0;
	                    //s[j]=0;
	                    //break;
	                }
	            }
	        }
	       // System.out.println("else part");
	        ans=(flength-count)+(slength-count);
	    }

	    return ans;
	}
	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);

	    String a = in.next();

	    String b = in.next();

	    System.out.println(numberNeeded(a, b));

	}
}	
	
	/*
	public static int numberNeeded(String first, String second) {
			int[] lettercounts = new int[26];
			for(char c : first.toCharArray()){
				lettercounts[c-'a']++;
				//System.out.println(lettercounts[c-'a']++);
				
			}
			for(char c : second.toCharArray()){
				lettercounts[c-'a']--;
				
				//System.out.println(lettercounts[c-'a']--);
			}
			int result = 0;
			for(int i : lettercounts){
				result += Math.abs(i);
			}
			return result;
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String a = in.next();
			String b = in.next();

			System.out.println(numberNeeded(a, b));
		}
	}

*/
	
