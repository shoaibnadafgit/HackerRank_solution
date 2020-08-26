

//inputs X = 10 ,N = 2 ,X = 100 ,N = 2,X = 100 ,N = 3
//output 1,3,1
public class PowerSum {

	public static void main(String[] args) {
		int X = 100;
		int N = 3;
		int Num =1;
		int result =Powersum(X,N,Num);
		System.out.println(result);


	}

	private static int Powersum(int x, int power, int num) {
		int variable=(int)Math.pow(num, power);
		if(variable < x)
			return Powersum(x, power, num+1) +Powersum(x-variable, power, num+1);
		
		if(x == variable)
			return 1;
		else
			return 0;
		
	}

}
