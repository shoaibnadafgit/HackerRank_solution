import java.util.Arrays;
import java.util.Scanner;

public class Migrate_birds {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		int n =in.nextInt();
		int arr[]=new int [5];//(1to5) type of birds are allowed only 
		for (int i =0;i<n;i++){
			//arr[i]=in.nextInt();
			switch(in.nextInt()) {
			case 1:arr[0]++;break;
			case 2:arr[1]++;break;
			case 3:arr[2]++;break;
			case 4:arr[3]++;break;
			case 5:arr[4]++;break;}
			
		}
		int highest_no = 0;
		int Answer_index = 0;
		
		for (int i = 0;i<arr.length;i++){
			if(arr[i]>highest_no) {//1>0,2>1...
				highest_no = arr[i]; //1,2... 
				Answer_index = i+1;}//0+1... 
//Answer.index = i+1 : we are storing the value 1 at 0 th location
//					   2 at 1 st loc as it is..see the switch case statement
				
		}
		System.out.println(Answer_index);
	
	}}
