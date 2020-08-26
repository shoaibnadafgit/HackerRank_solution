import java.util.Scanner;

public class GreadingStudent {

	public static void main(String[] args) {
//		int a[]= {10,20,30,40};
//		//a[1]+=1;
//		System.out.println(a[1]+1);
		Scanner in=new Scanner (System.in);
		int n =in.nextInt();
		int number []=new int [n];
		for (int i=0 ; i<n;i++ ) {
			number[i]=in.nextInt();
			if (number[i]<38)
			{}
			else {
				if(((number[i]+1)%5)==0) {
					number[i]+=1;
				}
				else if ((number[i]+2)%5==0)
				{
					number[i]+=2;
				}
			}
			
			
		}
		in.close();
		//for each loop /enhanced for loop
		for (int i : number ) {
		System.out.println(i);	
		}
		
	
		

	}

}
