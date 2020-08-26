
import java.util.*;
public class MeanMedianMode {
	
	 public static void main(String[] args) {
	       double mean=0;
	       double median=0;
	   	   double mode=0;
	       double sum=0;
	       Scanner s=new Scanner (System.in);
	       int n=s.nextInt();
	       double arr[]=new double[n];
	       for (int i=0;i<n;i++){
	           arr[i]=s.nextDouble();
	       }
	       //mean
	       for (int i =0;i<n;i++){
	           sum +=arr[i];
	       }
	       mean=sum/n;
	       //or we can use Arrays.sort(arr); too
	       //assending order logic
	       for (int i=0;i<n;i++){
	           for(int j=0;j<n-1;j++){
	               if (arr[j]>arr[j+1]){
	                   double t=arr[j];
	                   arr[j]=arr[j+1];
	                   arr[j+1]=t;
	               }
	           }
	       }
	       //median
	       if(n%2!=0){
	           median=arr[n/2];
	       }
	       else {
	    	   median=((arr[n/2]+arr[(n/2)-1])/2);
	       }
	       //mode
	       int max=0;
	       int count=0;
	       for (int i=0;i<n;i++){
	           for(int j=0;j<n-1;j++){
	       if(arr[i]==arr[j]){
	           count++;
	           if(count>max){
	               max=count;
	               mode=arr[j];
	           }
	       		}
	           }
	           count=0;
	           }
	           System.out.println(mean);
	            System.out.println(median);
	             System.out.println(mode);
	 s.close();   
	 }
	}
	
	
	
	

//static void MMM(double []arr,int n) {
//	Arrays.sort(arr);
//	double sum=0;
//	double mean=0;
//	for (int i =0;i<n;i++) {
//	sum +=arr[i];
//	}
//	System.out.println(">>>"+sum);
//	
//	//1
//	 mean=sum/n;
//	double median=0;
//	//2
//	if(n%2==0){
//	 median=arr[n/2];
//	System.out.println("median :"+median);
//	}
//	else {
//
//		System.out.println("median even : "+(arr[(n/2)]+arr[(n/2)+1])/2);
//	}
//	double mode=0;
//	//3 mode
//	int count=0;
//	int maxcount=0;
//	for (int i =0;i<n ;i++) {
//		for (int j =0;j<n-1 ;j++) {
//			if (arr[i]==arr[j]) {
//				count++;
//				if(count>maxcount) {
//					maxcount=count;
//					mode =arr[i];
//				}
//			
//			}
//			count=0;
//			
//		}
//		System.out.println(mean);
//		System.out.println(median);
//		System.out.println(mode);
//	}
//}
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		
//		int n =s.nextInt();
//		double [] arr=new double [n];
//		for (int i =0;i<n ;i++) {
//			arr[i]=s.nextDouble();
//		}
//		for (int i =0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
//		MMM(arr,n);
//		
//
//	}
//
//}
