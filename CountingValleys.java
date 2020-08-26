import java.util.Scanner ;
public class CountingValleys {
static int up;
static int down;
static int base;

//counting valleys using array 
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		System.out.println("Enter the number of steps :\n");
		int n=in.nextInt();
		String arr[]=new String [n];
		
		for (int i =0;i<n;i++) {
			arr[i]=in.next();
		}
		for (int i=0;i<n;i++) {
			System.out.println("Array of string : "+i+":"+arr[i]);
		}
		
		for (int i=0;i<n;i++) {
			if (arr[i].equals("U")) {
				up++;
			}
			else if (arr[i].equals("D")) {
				down++;
			}
		}
    if (up==down)
    	base++;
    else if (up>down)
    	base=up-down;
    else if (up<down) {
    	base=up-down;
    	}
System.out.println("Up :"+up+"\nDown :"+down);
System.out.println("output : "+base);
	}

}
