import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;
import java.util.Locale;


public class Java_Currency_formatter {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		double payment=in.nextDouble();
		
		//creating locale instance(licaleIND) for temp use 
		Locale localeIND =new Locale ("en","IN");
		
		//number formating 
		
		NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat ind=NumberFormat.getCurrencyInstance(localeIND);
		NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		//printing 
		
		System.out.println("US:"+us.format(payment));
		System.out.println("India:"+ind.format(payment));
		System.out.println("China:"+china.format(payment));
		System.out.println("France:"+france.format(payment));
		
	}

}
